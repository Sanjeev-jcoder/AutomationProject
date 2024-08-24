package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class seleniumBrowserLaunchProgramme{
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("youtube");
		driver.findElement(By.id("q")).sendKeys(Keys.RETURN);
		driver.findElement(By.name("btnk")).click();
	}
	
}