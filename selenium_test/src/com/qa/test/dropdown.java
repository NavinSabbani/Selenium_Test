package com.qa.test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {

		String baseUrl ="file:///C:/Users/navin/Downloads/sample_site.html";
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\navin\\Downloads\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseUrl);
		
		WebElement dropdown = driver.findElement(By.xpath("//*[@name='Browsers']"));
		
		Select s = new Select(dropdown);
		s.selectByVisibleText("IE");
		Thread.sleep(5000);
		System.out.println(dropdown.getText());
		 List <WebElement> values = s.getOptions();
		 for (int i = 0 ; i < values.size() ; i++) {
			 System.out.println(values.get(i).getText());
		 }
		
		
		driver.quit();
		
		

	}

}
