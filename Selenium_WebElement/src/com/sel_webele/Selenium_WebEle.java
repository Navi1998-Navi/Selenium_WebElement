package com.sel_webele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_WebEle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "H:\\Selenium\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.flipkart.com/");
		WebElement user = d.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")); // Key press of Ctrl+2+ L will get web element
		user.sendKeys("7339425610");
		WebElement pass = d.findElement(By.xpath("//input[@type=\"password\"]")); 
		pass.sendKeys("7339425610");		
		WebElement press = d.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button")); 
		press.click();
}
}
