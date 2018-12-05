package com.dezzy.differentiator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Main {
	
	public static void main(String[] args) {
		String equation = "(d/dx)(1/x+3x)";
		
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		//options.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.symbolab.com/solver/first-derivative-calculator");
		
		WebElement inputBox = driver.findElement(By.className("block empty"));
		inputBox.sendKeys(equation);
	}
	
}
