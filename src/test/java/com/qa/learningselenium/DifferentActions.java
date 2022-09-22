package com.qa.learningselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DifferentActions {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\littl\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://webdriveruniversity.com/Actions/index.html");
		
		Actions actions = new Actions(driver);
		
//		WebElement draggable = driver.findElement(By.id("draggable"));
//		WebElement droppable = driver.findElement(By.xpath("//div[@id='droppable']/p"));
//		String initialColor = droppable.getCssValue("background-color");
//		
//		actions.dragAndDrop(draggable, droppable).build().perform();
//		
//		String newText = droppable.getText();
//		String newColor = droppable.getCssValue("background-color");
//		
//		if(newText.equals("Dropped!") && initialColor != newColor) {
//			System.out.println("Test Passed");
//		} else {
//			System.out.println("Test Failed");
//		}
		
//		WebElement doubleClick = driver.findElement(By.id("double-click"));
//		String initialColour = doubleClick.getCssValue("background-color");
//		actions.doubleClick(doubleClick).build().perform();
//		String newColour = doubleClick.getCssValue("background-color");
//		
//		if(initialColour != newColour) {
//			System.out.println("Test Passed");
//		} else {
//				System.out.println("Test Failed");
//		}
		
		WebElement clickBox = driver.findElement(By.id("click-box"));
		String initialColour = clickBox.getCssValue("background-color");
		
		actions.clickAndHold(clickBox).build().perform();
		String newColour = clickBox.getCssValue("background-color");
		String newText = clickBox.getText();
		actions.release(clickBox).build().perform();
		String releaseText = clickBox.getText();
		
		if(newText.equals("Well done! keep holding that click now.....") && newText != releaseText && initialColour != newColour) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");
		}
		
//		List<WebElement> hoverButtons = driver.findElements(By.className("dropbtn"));
//		
//		for(WebElement btn : hoverButtons) {
//			actions.moveToElement(btn).build().perform();
//		}

	}

}
