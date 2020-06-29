package com.testing.propertyUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;

/**
 * 
 * @author Sam
 *
 */
public class PropertiesUtility {
	static Properties prop = new Properties();

	public static String getLocator(String locatorName) {
		String locator ="";
		try {

			//FileInputStream fis = new FileInputStream(
			//"F:\\classjava\\flipkartKDD\\src\\main\\resources\\objectRepository.properties");
			FileInputStream fis = new FileInputStream(
			"G:\\GitHub Project\\flipkartKDD\\src\\main\\resources\\objectRepository.properties");
			
			prop.load(fis);
			locator = (String)prop.getProperty(locatorName);
		} catch (FileNotFoundException e) {
			System.out.println("Object repository not found");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("File not found");
			e.printStackTrace();
		}
	//*	System.out.println("locator: "+locator);
		return locator;
	}
	public static String[] getLocatorValue(String locatorName) {
		//*System.out.println("locator name: "+locatorName);
		return getLocator(locatorName).split("##");
	
	}
	
	
	
	
}
