package com.practise;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.List;
import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EmbededWebPageFrames {

	public static void main(String[] args) throws AWTException, InterruptedException {
		  
		  WebDriverManager.chromedriver().setup();
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		  
		 driver.get("file:///C:/Users/Deepak/OneDrive/Desktop/Page1.html");
		 
		 driver.findElement(By.id("t1")).sendKeys("a");
		 
		 driver.switchTo().frame(0);
		 
		 driver.findElement(By.id("t2")).sendKeys("b");
		 
		 driver.switchTo().parentFrame();
		 
		 driver.findElement(By.id("t1")).sendKeys("c");
		 
		 WebElement ele = driver.findElement(By.id("f1"));
		 
	 driver.switchTo().frame(ele);
		 
		 driver.findElement(By.id("t2")).sendKeys("d");
		 
		 driver.switchTo().parentFrame();
		 
		 driver.findElement(By.id("t1")).sendKeys("e");
		 
		 WebElement ele2 = driver.findElement(By.xpath("//iframe"));
		 
		 driver.switchTo().frame(ele2);
		 driver.findElement(By.id("t2")).sendKeys("f");
		 
	}

}
