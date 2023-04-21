package com.practise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintOnlYDuplicateOptionsInListBox {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("file:///C:/Users/Deepak/OneDrive/Desktop/Hotel.html");
		
		
		
		WebElement mtrbox = driver.findElement(By.id("mtr"));
		
		Select s=new Select(mtrbox);
		
		List<WebElement> allselectopt = s.getOptions();
		System.out.println(allselectopt.size());
		
		ArrayList<String> al=new ArrayList<>();
		for(int i=0; i<allselectopt.size(); i++)
		{
			String text = allselectopt.get(i).getText();
			al.add(text);
		}
		
		HashSet<String> set=new HashSet<>();
		for(String value:al)
		{
			if(set.add(value)==false)
				System.out.println(value);
		}
		driver.close();
	}

}
