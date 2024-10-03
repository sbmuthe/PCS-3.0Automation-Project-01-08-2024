package com.pcs.tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.pcs.pages.LoginPage;
import com.pcs3.genericPage.MasterPage;

public class LoginTest {
	
	@Test
	public void loginTest() throws Exception {
		LoginPage si = new LoginPage();
		si.clickUID();
		si.enterUserID();
		si.clickPassword();
		si.enterPassword();
		si.clickLoginButton();
		si.clickDocOption();
		si.clickSearch();
		
	}
	
	
	
}
