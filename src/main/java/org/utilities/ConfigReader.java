package org.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	/*
	 * public static void main (String[]args) { ConfigReader obj = new
	 * ConfigReader(); obj. init_Prop(); obj. getTestData("browser"); }
	 */
	
	
	public  Properties init_Prop() {//cucumber_Arbitration/src/test/resources/Configuration/Config.properties
		try {
			FileInputStream fis = new FileInputStream ("./src/test/resources/Configuration/Config.properties" );
			Properties prop = new Properties();
			//System.out.println("prop"+prop);
			prop.load(fis);
			System.out.println("prop"+prop);
			return prop ;
		//	"D:\QA shubh (software)\Automation\cucumber_Arbitration\src\test\resources\Configuration\Config.properties"
		}catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	public  String getTestData (String key) {
		try {
			FileInputStream fis = new FileInputStream ("./src/test/resources/Configuration/Config.properties");


			Properties prop = new Properties();
			   prop.load(fis);
			System.out.println("prop "+prop.getProperty(key));
			return prop.getProperty(key);
		}catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
