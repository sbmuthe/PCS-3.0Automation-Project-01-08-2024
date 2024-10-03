package com.pcs.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.pcs3.genericPage.CommonFunctions;

public class PCSLaunch extends CommonFunctions {
	public PCSLaunch() throws Exception {
		super();
	}
	
	public void clickUID() {
		click("UID");
	}
	
	public void enterUserID() {
		enterData("UID", "testData1");
	}
	
	public void clickPassword() {
		click("PWD");
	}
	public void enterPassword() {
		enterData("PWD", "testData2");
	}
	public void clickLoginButton() {
		click("LoginButton");
	}
	public void clickDocOption() {
		click("Doc");
	}
	public void clickSearch() {
		click("ClickSearch");
	}

	
	public void switchandclick() {
		int allframes = driver.findElements(By.tagName("iframe")).size();
		 System.out.println(allframes);
		 driver.switchTo().frame("bigFrame");
		 driver.findElement(By.xpath("//*[@id='simpleFirstText']")).sendKeys("EDM-0090");
		 driver.findElement(By.id("searchButton")).click();
		 
	}
	
	public void clickInfoCard() throws Exception {
		List<WebElement> wb = driver.findElements(By.tagName("iframe"));
		System.out.println("Total No of frames:" + wb.size());
		driver.switchTo().defaultContent();
		driver.switchTo().frame("myframe");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='infocard_EDM-0090_01']/span")).click();
	}
	
}
