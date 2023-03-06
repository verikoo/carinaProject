package com.qaprosoft.carina.albumtest;

import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;

import mytest.HomeScreen;
import mytest.LoginScreen;

public class LinkedinTest extends AbstractTest{
	WebDriver webDriver;
	@Test()
	@MethodOwner(owner = "Veriko Lomadze")
//	public void TestDriver() {
//		System.setProperty(DOUBLE_OBJ_STR, DEFAULT)
//	}
	public void linkedinTest() {
		HomeScreen homeScreen = new HomeScreen(getDriver());
		homeScreen.open();
		LoginScreen loginScreen = homeScreen.clickSignInA();
		assertTrue(loginScreen.isLoginButtonPresent(), "Login Buttoon Is Not Present");
		loginScreen.fillUserName("example@gmail.com");
		loginScreen.fillUserPassworde("password");
		loginScreen.clickLogintBtn();
		assertTrue(loginScreen.isLoginButtonPresent(), "Login Buttoon Is Not Present");
	}
	

}
