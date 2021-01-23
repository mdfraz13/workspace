package com.java8.examples.learnserializable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializableClient {

	public static void main(String[] args) {
		LearnSerializable s = new LearnSerializable("10");
		FileOutputStream fout;
		try {
			fout = new FileOutputStream("E:\\address.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fout);
			oos.writeObject(s);
			oos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
