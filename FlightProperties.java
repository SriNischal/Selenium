package com.atmecs.orangrhr;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class FlightProperties {

	public String readPropertiesFile(String elements) throws FileNotFoundException {
		Properties prop=new Properties();
		
			FileInputStream input=new FileInputStream("C:\\Users\\Srinischal.Thiparani\\eclipse-workspace\\Redbus\\flight.properties");
			try {
			prop.load(input);
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	
	String data =prop.getProperty(elements);
	return data;
	
	}

	
}


