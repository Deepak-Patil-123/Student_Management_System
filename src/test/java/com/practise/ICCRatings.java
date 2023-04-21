package com.practise;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ICCRatings {

	public static void main(String [] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String team="England";
		driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/t20i");
		
		List<WebElement> teamName = driver.findElements(By.xpath("//table//tbody//tr/td[2]"));
		boolean flag=false;
		for(int i=0; i<teamName.size(); i++)
		{
			String text1 = teamName.get(i).getText();
			if(text1.equals(team))
			{
				System.out.println("team is present!");
				flag=true;
				break;
			}
		}
		if(!flag)
			System.out.println("team is not present!");
	
	
			ArrayList<String> list=new ArrayList<>();
		List<WebElement> teams = driver.findElements(By.xpath("//table//tbody//tr/td[2]"));
		
		for(WebElement teamname:teams)
		{
			  String text2 = teamname.getText();
			  list.add(text2);
		}
	
		for(String myTeam:list)
		{
			String rating1="//span[text()='"+myTeam+"']/../following-sibling::td[3]";
			 String rating = driver.findElement(By.xpath(rating1)).getText();
			 System.out.println(myTeam+"====>"+rating);
		}
		
	}
}
