package com.practise;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PriceIphone {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button)[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("iphone 14"+Keys.ENTER);
		
		Thread.sleep(3000);
		
		List<WebElement> pricelist = driver.findElements(By.xpath("//div[contains(text(),'iPhone 14')]/ancestor::div[@class='_3pLy-c row']/div[2]//div[@class='_30jeq3 _1_WHN1']"));
		Thread.sleep(3000);
		int count = pricelist.size();
		System.out.println(count);
		int count1=0;
		for(int i=0; i<count; i++)
		{
			
			 String format = pricelist.get(i).getText();
			String format1 = format.substring(1);
			String format2 = format1.replace(",","");
			
			
			int price=Integer.parseInt(format2);
			if(price>80000)
			{
				count1++;
				System.out.println(price);
			}
		}
		
		System.out.println(count1);
		
		Thread.sleep(2000);
		driver.close();
		
		}

}
