package com.pcs3.genericPage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CommonFunctions extends MasterPage {

	public CommonFunctions() throws Exception {
		super();
		
	}
	
	public void click(String xpathkey) {

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
	
	public void clickDoc(String xpathkey) {
		driver.findElement(By.xpath(lp.getProperty(xpathkey))).click();
	}
	
	public void clickSearch(String xpathkey) {
		driver.findElement(By.xpath(lp.getProperty(xpathkey))).click();
	}
	
	
	// Click List of Element

	public void clickListElement(String xpathkey, String testdata) {
		List<WebElement> radios = driver.findElements(By.xpath(lp.getProperty(xpathkey)));
		for (int i = 0; i < radios.size(); i++) {
			if (radios.get(i).getText().equalsIgnoreCase(td.getProperty(testdata)))
				;
			{
				radios.get(i).click();
			}
		}

	}
}