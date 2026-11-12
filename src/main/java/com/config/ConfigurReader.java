package com.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurReader {

	public static Properties p;

	public ConfigurReader() throws IOException {
		File f = new File("C:\\Users\\balas\\eclipse-workspace\\AdaCucumber8AM\\Configur.properties");

		FileInputStream fis = new FileInputStream(f);

		p = new Properties();
		p.load(fis);

	}

	public String getUrl() {

		String refurl = p.getProperty("url");
		return refurl;
	}
	
	public String getUser() {
		String user = p.getProperty("user");
		return user;
	}
	
	public String getPass() {
		String pass = p.getProperty("pass");
		return pass;
	}

}
