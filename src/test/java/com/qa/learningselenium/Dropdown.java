package com.qa.learningselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\littl\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		
		WebElement progLangDropdown = driver.findElement(By.id("dropdowm-menu-1"));
		Select lang = new Select(progLangDropdown);
		lang.selectByIndex(0);
		
		WebElement progIdeDropdown = driver.findElement(By.id("dropdowm-menu-2"));
		Select ide = new Select(progIdeDropdown);
		ide.selectByValue("maven");
		
		WebElement progScriptDropdown = driver.findElement(By.id("dropdowm-menu-3"));
		Select script = new Select(progScriptDropdown);
		script.selectByVisibleText("JQuery");

	}

}
