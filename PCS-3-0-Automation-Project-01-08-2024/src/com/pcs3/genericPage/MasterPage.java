package com.pcs3.genericPage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class MasterPage {

	public static WebDriver driver;
	public Properties prop;
	public Properties lp;

	public Properties td;

	// Constructor
	public MasterPage() throws Exception {

		// Configuration Properties File Reading
		FileInputStream conf = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\com\\pcs\\repository\\configuration.properties");
		prop = new Properties();
		prop.load(conf);

		// Locator Properties file reading

		FileInputStream lp = new FileInputStream(System.getProperty("user.dir") + "\\src\\com\\pcs\\repository\\locators.properties");
		prop = new Properties();
		prop.load(lp);
//Reading testdata file
		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\com\\pcs\\repository\\testdata.properties");
		prop = new Properties();
		prop.load(fs);

	}
}