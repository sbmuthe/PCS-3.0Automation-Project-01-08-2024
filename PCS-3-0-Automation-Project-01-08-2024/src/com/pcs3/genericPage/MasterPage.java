package com.pcs3.genericPage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

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
		
		if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\com.pcs.drivers\\msedgedriver.exe");
			driver = new ChromeDriver();
		}
		
		else if (prop.getProperty("browser").equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\src\\com.pcs.drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			
		}else {
			System.out.println("Open IE browser");
		}

	}
}