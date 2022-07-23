package com.BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClassWIki {

	
	
	protected WebDriver driver;
    public void ChromeLaunch()
    {
   	 System.setProperty("webdriver.chrome.driver", "B:\\eclipseworkspace\\IMDB\\SoftFiles\\chromedriver_win32 (1)\\chromedriver.exe");
   	 driver = new ChromeDriver();
   	 driver.get("https://en.wikipedia.org/wiki/Pushpa:_The_Rise");
    }
	
}
