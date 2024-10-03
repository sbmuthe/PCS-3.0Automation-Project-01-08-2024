package com.pcs3.genericPage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class MasterPage {

	public static WebDriver driver;
	public Properties prop;
	public Properties lp;
	public Properties td;

	// Constructor
	public MasterPage() throws Exception {

		// Configuration Properties File Reading
		FileInputStream cp = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\com\\pcs\\respository\\configuration.properties");
		prop = new Properties();
		prop.load(cp);

		// Locator Properties file reading

		FileInputStream lc = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\com\\pcs\\respository\\locators.properties");
		lp = new Properties();
		lp.load(lc);
//Reading testdata file
		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\com\\pcs\\respository\\testdata.properties");
		td = new Properties();
		td.load(fs);

		if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\src\\com.pcs.drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		else if (prop.getProperty("browser").equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver",
					System.getProperty("user.dir") + "\\src\\com.pcs.drivers\\msedgedriver.exe");
			driver = new EdgeDriver();

		} else {
			System.out.println("Open IE browser");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(prop.getProperty("URL"));

	}

	

	
}