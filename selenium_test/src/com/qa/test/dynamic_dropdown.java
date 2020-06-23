package com.qa.test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamic_dropdown {

	public static void main(String[] args) throws InterruptedException {
	
		
		String baseUrl ="http://www.goibibo.com/";
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\navin\\Downloads\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseUrl);
		
		
		
		String partialText = "Del";
		String textToSelect = "Delhi, India(DEL)";
		
		WebElement textField = driver.findElement(By.id("gosuggest_inputSrc"));
		textField.sendKeys(partialText);
		
		WebElement ulElement = driver.findElement(By.id("react-autosuggest-1"));
		
		String innerHTML = ulElement.getAttribute("innerHTML");
		System.out.println(innerHTML);
		
		List<WebElement> liElements = ulElement.findElements(By.tagName("li"));
		Thread.sleep(3000);
		
		for (WebElement element : liElements) {
			//System.out.println(element.getText());
			if (element.getText().contains(textToSelect)) {
				System.out.println("Selected: " + element.getText());
				element.click();
				break;
			}
		}
		
		
		
		
		

	}

}
