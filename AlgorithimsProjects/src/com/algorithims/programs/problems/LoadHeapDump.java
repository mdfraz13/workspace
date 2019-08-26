package com.algorithims.programs.problems;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;


public class LoadHeapDump {
	 public static void main(String[] args)
	  {
	    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	    
	    String heapDumpFileName = args[0];
	    String loadData = args[1];
	    String memLeak = args[2];
	    String antiPattern = args[3];
	    String loadHeapZipParentDir = args[4];
	    String isAgentHostUnixString = args[5];
	    String heapId = args[6];
	    String is_loaded = args[7];
	    boolean isAgentHostUnix = Boolean.parseBoolean(isAgentHostUnixString);
	    
	    String loadHeapDirectory = loadHeapZipParentDir + File.separator + "loadheap";
	    System.out.println(loadHeapDirectory);
	    
	    Runtime r = Runtime.getRuntime();
	    
	    String tempScript = "";
	    LoadHeapDump self = new LoadHeapDump();
	    String newline = "";
	    try
	    {
	      Process loadHeap;
	      if (isAgentHostUnix)
	      {
	        tempScript = "./loadheap.sh -s";
	        newline = "\n";
	        System.out.println(loadHeapDirectory + File.separator + tempScript);
	        loadHeap = r.exec(loadHeapDirectory + File.separator + tempScript, null, new File(loadHeapDirectory));
	        
	        OutputStream out = loadHeap.getOutputStream();
	        
	        out.write((heapDumpFileName + newline).getBytes());
	        out.flush();
	        out.write((loadData + newline).getBytes());
	        out.flush();
	        out.write((memLeak + newline).getBytes());
	        out.flush();
	        out.write((antiPattern + newline).getBytes());
	        out.flush();
	        out.write((heapId + newline).getBytes());
	        out.flush();
	        out.write((is_loaded + newline).getBytes());
	        out.flush();
	        out.write((in.readLine().trim() + newline).getBytes());
	        out.flush();
	        out.write((in.readLine().trim() + newline).getBytes());
	        out.flush();
	        out.write((in.readLine().trim() + newline).getBytes());
	        out.flush();
	        out.write((in.readLine().trim() + newline).getBytes());
	        out.flush();
	        out.write((in.readLine().trim() + newline).getBytes());
	        out.flush();
	        out.close();
	      }
	      else
	      {
	        String dbconnect = "\"" + in.readLine().trim() + "\"";
	        String user = in.readLine().trim();
	        String password = in.readLine().trim();
	        tempScript = "loadheap.bat";
	        newline = "\r\n";
	        loadHeap = r.exec(new String[] { loadHeapDirectory + File.separator + tempScript, "-s", heapDumpFileName, loadData, memLeak, antiPattern, dbconnect, user, password }, null, new File(loadHeapDirectory));
	      }
	      System.out.println("Running temp script\n");
	      self.writeProcessOutput(loadHeap);
	      int exitVal = loadHeap.waitFor();
	      if (exitVal != 0) {
	        failJob("Unable to run temp script");
	      }
	    }
	    catch (FileNotFoundException fnfe)
	    {
	      failJob("FileNotFoundException occured during load heap process" + fnfe.toString());
	    }
	    catch (IOException ioe)
	    {
	      failJob("IOException occured during load heap process" + ioe.toString());
	    }
	    catch (InterruptedException ie)
	    {
	      failJob("InterruptedException occured during load heap process" + ie.toString());
	    }
	    catch (SecurityException se)
	    {
	      failJob("SecurityException occured during load heap process" + se.toString());
	    }
	    catch (Exception ex)
	    {
	      failJob("Exception occured during load heap process" + ex.toString());
	    }
	  }
	  
	  public static void failJob(String s)
	  {
	    System.out.println("JVMD Heap Snapshot & Load Job failed::" + s);
	    System.out.flush();
	    System.exit(-1);
	  }
	  
	  public void writeProcessOutput(Process process)
	    throws Exception
	  {
	    StreamWriter outputWriter = new StreamWriter(process.getInputStream(), "OUTPUT");
	    
	    StreamWriter errorWriter = new StreamWriter(process.getErrorStream(), "ERROR");
	    
	    errorWriter.start();
	    outputWriter.start();
	  }
}
class StreamWriter
extends Thread
{
InputStream is;
String type;

StreamWriter(InputStream is, String type)
{
  this.is = is;
  this.type = type;
}

public void run()
{
  try
  {
    InputStreamReader isr = new InputStreamReader(this.is);
    BufferedReader br = new BufferedReader(isr);
    String line = null;
    while ((line = br.readLine()) != null) {
      if (!line.equals("stty: standard input: Invalid argument")) {
        System.out.println(this.type + " >>> " + line);
      }
    }
  }
  catch (IOException ioe)
  {
    System.out.println("IOException occured during StreamWriter" + ioe.toString());
  }
}
}
