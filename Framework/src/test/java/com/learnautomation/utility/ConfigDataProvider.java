package com.learnautomation.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigDataProvider {
	Properties prop;
public ConfigDataProvider()
{
	
	File src=new File("./Config/config.properties");
	try {
		FileInputStream fis=new FileInputStream(src);
		prop=new Properties();
		prop.load(fis);
	} 
	catch (Exception e) {
		// TODO Auto-generated catch block
		System.out.println("Unable to load properties file"+e.getMessage());
	}
}
public String getDataFromConfig(String KeyToSearch)
{
	return prop.getProperty(KeyToSearch);
}
public String getDataBrowser()
{
	return prop.getProperty("Browser");
}
public String getDataQaURL()
{
	return prop.getProperty("qaURL");
}
}
