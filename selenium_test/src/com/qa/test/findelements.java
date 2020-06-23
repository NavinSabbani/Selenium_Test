package com.qa.test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findelements {

	public static void main(String[] args) {
		
		//String baseUrl = "http://demo.guru99.com/test/newtours/";
		
		String baseUrl ="file:///C:/Users/navin/Downloads/sample_site.html";
			
		System.setProperty("webdriver.chrome.driver","C:\\Users\\navin\\Downloads\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseUrl);
		String innerText = driver.findElement(By
			.xpath("//table[@width=\"270\"]/tbody/tr[4]/td"))
			.getText(); 		
		System.out.println(innerText); 
		
		
		List <WebElement> count = driver.findElements(By.tagName("z"));
		System.out.println(count.size());
		
		for ( int i =0; i < count.size(); i++) {
			System.out.println(count.get(i).getAttribute("text"));
			System.out.println(count.get(i).getText());
			
		}
		
		
		driver.quit();

	}

}
