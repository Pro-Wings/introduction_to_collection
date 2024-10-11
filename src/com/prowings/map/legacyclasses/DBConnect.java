package com.prowings.map.legacyclasses;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnect {
	
	public static void main(String[] args) throws SQLException, IOException {
		
//		String dburl = "alksjdlaskjdlsakdjsalkdj";
//		String dbUname = "abhijit123";
//		String dbPwd = "abhi@123#";

		Properties dbProps = new Properties();
		
		FileInputStream input = new FileInputStream("myapp.properties");
		dbProps.load(input);
		
		String dburl = dbProps.getProperty("url");
		String dbUname = dbProps.getProperty("username");
		String dbPwd = dbProps.getProperty("password");
		
		Connection con = DriverManager.getConnection(dburl, dbUname, dbPwd);
		
		
		
	}
	

}
