package com.algorithims.programs.problems;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.
                getConnection("jdbc:oracle:thin:@blr2223355.idc.oracle.com:15044:se132pg"
                    ,"SYSMAN","sysman");
            Statement stmt = con.createStatement();
            System.out.println("Created DB Connection....");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            
        }
	}

}
