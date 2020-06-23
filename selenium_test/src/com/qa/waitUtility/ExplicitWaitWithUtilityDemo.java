package com.qa.waitUtility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExplicitWaitWithUtilityDemo {
	private WebDriver driver;
	private String baseUrl;
	WaitTypes wt;

	@BeforeTest
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\navin\\Downloads\\selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		baseUrl = "https://letskodeit.teachable.com/pages/practice";
		wt = new WaitTypes(driver);

		// Maximize the browser's window
		driver.manage().window().maximize();
	}
	
	@Test()
	public void test() throws Exception {
		driver.get(baseUrl);
		WebElement loginLink = driver.findElement(By.linkText("Login"));
		loginLink.click();
		
		WebElement emailField = wt.waitForElement(By.id("user_email"), 3);
		emailField.sendKeys("test");
		
		//driver.findElement(By.id("user_email")).sendKeys("test");
	}

	@AfterTest
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}
}
