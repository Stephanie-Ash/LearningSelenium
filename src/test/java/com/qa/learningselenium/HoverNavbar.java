package com.qa.learningselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverNavbar {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\littl\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.worldatlas.com/");
		
		Actions actions = new Actions(driver);
		WebElement continents = driver.findElement(By.xpath("//label[@class='nav_category_parent nav_menu_item'][@for='nav_check_continents']"));
		
		actions.moveToElement(continents).build().perform();
		WebElement country = driver.findElement(By.xpath("//a[contains(text(),'Europe')]"));
		country.click();

	}

}
