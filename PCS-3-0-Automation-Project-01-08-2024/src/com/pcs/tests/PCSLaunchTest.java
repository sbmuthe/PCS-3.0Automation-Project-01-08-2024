package com.pcs.tests;

import org.testng.annotations.Test;

import com.pcs.pages.PCSLaunch;

public class PCSLaunchTest {
	
	@Test
	public void pcsLandingTest() throws Exception {
		PCSLaunch pl = new PCSLaunch();
		
		pl.clickUID();
		pl.enterUserID();
		pl.clickPassword();
		pl.enterPassword();
		pl.clickLoginButton();
		pl.clickDocOption();
		pl.clickSearch();
		pl.switchandclick();
		pl.clickInfoCard();
		
	}
}
