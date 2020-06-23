package com.qa.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitwait {

	public static void main(String[] args) {
		
String baseUrl ="http://letskodeit.teachable.com/pages/practice";
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\navin\\Downloads\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseUrl);
	
		
		WebElement loginLink = driver.findElement(By.linkText("Login"));
		loginLink.click();
		WebDriverWait wait = new WebDriverWait(driver, 3);
		WebElement emailField = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.id("hcaptcha_submit")));
		//emailField.sendKeys("test");
		
		//driver.findElement(By.id("user_email")).sendKeys("test");
		
		
		
		
		

	}

}
