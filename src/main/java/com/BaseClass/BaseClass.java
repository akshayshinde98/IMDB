package com.BaseClass;

import java.security.PublicKey;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	protected WebDriver driver;
     public void ChromeLaunch()
     {
    	 System.setProperty("webdriver.chrome.driver", "B:\\eclipseworkspace\\IMDB\\SoftFiles\\chromedriver_win32 (1)\\chromedriver.exe");
    	 driver = new ChromeDriver();
    	 driver.get("https://www.imdb.com/title/tt9389998/");
     }
}
