package com.practise;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GridPractise {

	@Test
	public void test() throws MalformedURLException
	{
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setPlatform(Platform.WINDOWS);
		cap.setBrowserName("chrome");
		URL url=new URL("http://192.168.51.167:4444/wd/hub");
		WebDriver driver=new RemoteWebDriver(url,cap);
		driver.get("https://google.com");
	}
}
 