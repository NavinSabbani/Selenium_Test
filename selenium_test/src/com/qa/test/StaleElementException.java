package com.qa.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementException {

	public static void main(String[] args) throws InterruptedException {
		
		
		
        String baseUrl ="http://letskodeit.teachable.com/pages/practice";
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\navin\\Downloads\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseUrl);
		
		driver.get(driver.getCurrentUrl());
		WebElement checkboxElement = driver.findElement(By.id("bmwcheck"));
		checkboxElement.click();
		
		Thread.sleep(5000);
		
		System.out.println(checkboxElement.isSelected());
		
		
		
		
		

	}

}
