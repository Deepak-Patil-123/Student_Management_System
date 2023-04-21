package com.practise;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintAllTheBrokenLinks {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.com/");
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		
		int count=allLinks.size();
		
		System.out.println(count);
		
		List<String> listurl=new ArrayList<>();
		List<String> brokenUrl=new ArrayList<>();
		
		for(int i=0; i<count; i++)
		{
			listurl.add(allLinks.get(i).getAttribute("href"));
			
		}
		
		
		for(String u:listurl)
		{
			try {
				URL url=new URL(u);
				URLConnection urlcon=url.openConnection();
				HttpURLConnection httpurlcon=(HttpURLConnection)urlcon;
				int statuscode = httpurlcon.getResponseCode();
				String msg=httpurlcon.getResponseMessage();
				
				if(statuscode!=200)
				{
					brokenUrl.add(u);
				}
			}
				catch(Exception e)
				{
					brokenUrl.add(u);
				}
			}
		
		driver.close();
	}

}
