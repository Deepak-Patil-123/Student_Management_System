package com.practise;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGannotationImplementation {

	
	WebDriver driver;
	@BeforeClass
	public void openBrowser()
	{
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("open browser!");
		driver.get("https://demo.actitime.com/");
		
	}
	
	@AfterClass
	public void closeBrowser()
	{
		System.out.println("close browser!");
		driver.close();
	}
	
	@BeforeMethod()
	public void login()
	{
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		System.out.println("login");
	}

	@AfterMethod
	public void logout() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(By.id("logoutLink")).click();
		System.out.println("log out");
	}
	
	@Test
	public void test1() throws IOException
	{
	   TakesScreenshot ts=(TakesScreenshot)driver;
	    File src = ts.getScreenshotAs(OutputType.FILE);
	    File dest=new File("./Screenshot/ss.png");
	    FileUtils.copyFile(src, dest);
	}
}
