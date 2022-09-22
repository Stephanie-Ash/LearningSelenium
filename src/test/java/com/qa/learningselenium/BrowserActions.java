package com.qa.learningselenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserActions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\littl\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://webdriveruniversity.com/Popup-Alerts/index.html");
		
		driver.manage().window().maximize();
		
//		driver.findElement(By.id("button4")).click();
//		
//		Alert alert = driver.switchTo().alert();
//		System.out.println(alert.getText());
//		alert.accept();
//		alert.dismiss();
		
//		driver.findElement(By.id("button2")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[@data-dismiss='modal']")).click();
		
//		driver.quit(); closes all windows
//		driver.close(); closes current window
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5l));
		
		driver.findElement(By.id("button3")).click();
		
		WebElement someResult = new WebDriverWait(driver, Duration.ofSeconds(5l))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[contains(text(),'CLICK ME!')]")));
		
		driver.findElement(By.xpath("//p[contains(text(),'CLICK ME!')]")).click();
		
		
		

	}

}
