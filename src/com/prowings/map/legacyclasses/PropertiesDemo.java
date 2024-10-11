package com.prowings.map.legacyclasses;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
	
	public static void main(String[] args) throws IOException {
		
		Properties props = new Properties();
		FileInputStream input = new FileInputStream("myapp.properties");
		props.load(input);
		
		System.out.println(props);
		
	}

}
