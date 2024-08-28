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
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

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
		
		if(prop.getProperty("browser").equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "\\src\\com.pcs.drivers\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		
		else if (prop.getProperty("browser").equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\src\\com.pcs.drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			
		}else {
			System.out.println("Open chrome browser");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(prop.getProperty("URL "));
		

	}
	public void click(String xpathkey){
		  
		driver.findElement(By.xpath(lp.getProperty(xpathkey))).click();
	}
	public void enterData(String xpathkey, String testdata) {
		driver.findElement(By.xpath(lp.getProperty(xpathkey))).sendKeys(td.getProperty(testdata));
	}
	
	public void clearData(String xpathkey) {
		driver.findElement(By.xpath(lp.getProperty(xpathkey))).clear();
	}
	
	public void moveToElement(String xpathkey) {
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath(lp.getProperty(xpathkey)))).build().perform();
	}
	//Click List of Element
	
	public void clickListElement(String xpathkey, String testdata) {
		List<WebElement> radios = driver.findElements(By.xpath(lp.getProperty(xpathkey)));
		for(int i = 0; i<radios.size(); i++) {
			if (radios.get(i).getText().equalsIgnoreCase(td.getProperty(testdata)));{
				radios.get(i).click();
			}
		}
	}
}