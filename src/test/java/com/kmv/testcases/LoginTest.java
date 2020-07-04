package com.kmv.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest {
	WebDriver driver;
	
	@BeforeSuite
	public void setup() {
		
		driver = new ChromeDriver();
	}
	
	@Test
	public void doLogin() {
		
		driver.get("https://www.monsterindia.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[contains(text(),'Jobseeker Login')]")).click();
		driver.findElement(By.cssSelector("#signInName")).sendKeys("vkms2299@gmail.com");
		driver.findElement(By.cssSelector("#password")).sendKeys("monsterdais2299");
		System.out.println("Title of the web page is "+driver.getTitle());
		
	}
	
	@AfterSuite
	public void tearDown() {
		driver.quit();
	}

}
