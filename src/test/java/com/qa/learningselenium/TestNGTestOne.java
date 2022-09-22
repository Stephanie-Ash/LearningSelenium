package com.qa.learningselenium;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGTestOne {
	
	@BeforeSuite
	public void makeDbConnection() {
		System.out.println("Make DB connection in BeforeSuite");
	}
	
	@BeforeTest
	public void openBrowser() {
		System.out.println("Open browser in BeforeTest");
	}
	
	@BeforeMethod
	public void printTestName() {
		System.out.println("Print test name in BeforeMethod");
	}
	
	@Test(priority = 1, groups = "functional")
	public void addComputerTest() {
		Assert.fail();
		System.out.println("Add computer test");
	}
	
	@Test(priority = 3, dependsOnMethods = "addComputerTest")
	public void editComputerTest() {
		System.out.println("Edit computer test");
	}
	
	@Test(priority = 2, groups = "functional")
	public void searchComputerTest() {
		System.out.println("Search computer test");
	}
	
	@Test(priority = 4 , dependsOnMethods = "addComputerTest")
	public void deleteComputerTest() {
		System.out.println("Delete computer test");
	}
	
	@AfterMethod
	public void captureScreenshot() {
		System.out.println("Capture screenshot in AfterMethod");
	}
	
	@AfterTest
	public void quitBrowser() {
		System.out.println("Quit browser in AfterTest");
	}
	
	@AfterSuite
	public void closeDbConnection() {
		System.out.println("Close DB connection in AfterSuite");
	}

}
