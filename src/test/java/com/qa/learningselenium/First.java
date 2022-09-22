package com.qa.learningselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\littl\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://uitestingplayground.com/");
		
//		String pageTitle = driver.findElement(By.id("title")).getText();
//		System.out.println("Page title is: " + pageTitle);
//		
//		driver.findElement(By.linkText("Sample App")).click();
//		WebElement username = driver.findElement(By.xpath("//input[@name='UserName']"));
//		username.sendKeys("TestUser");
//		WebElement password = driver.findElement(By.name("Password"));
//		password.sendKeys("pwd");
//		WebElement login = driver.findElement(By.id("login"));
//		login.click();
//		
//		WebElement welcomeText = driver.findElement(By.id("loginstatus"));
//		
//		if(welcomeText.getText().equals("Welcome, TestUser!")) {
//			System.out.println("Successfully logged in");
//		} else {
//			System.out.println("Failed user login");
//		}
		
		driver.findElement(By.linkText("Click")).click();
		WebElement button = driver.findElement(By.id("badButton"));
		
		System.out.println("Before clicking: " + button.getCssValue("background-color"));
		button.click();
		Thread.sleep(2000);
		System.out.println("After clicking: " + button.getCssValue("background-color"));

	}

}
