package com.pcs.pages;

import javax.swing.text.PlainDocument;

import org.openqa.selenium.By;

import com.pcs3.genericPage.CommonFunctions;
import com.pcs3.genericPage.MasterPage;

public class LoginPage extends CommonFunctions{

	public LoginPage() throws Exception {
		super();
		
	}
	
	//click user ID
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
	
	
}
