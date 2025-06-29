package com.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileHandling {
	public static String getURL(String urlKey) {
		String baseDir=System.getProperty("user.dir");
		FileInputStream file=null;
		try {
			file=new FileInputStream(baseDir+"/src/test/resources/allUrls.properties");
		} catch (FileNotFoundException e) {
			
		}
		Properties p=new Properties();
		try {
			p.load(file);
		} catch (IOException e) {

		}
		String urlValue=p.getProperty(urlKey);
		return urlValue;
	}
}
