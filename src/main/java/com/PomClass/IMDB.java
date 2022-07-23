package com.PomClass;

import javax.management.loading.PrivateClassLoader;
import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IMDB {
	@FindBy (xpath="(//a[contains(@class,\"ipc-metadata-list-item__li\")])[24]") private WebElement getDate;
	@FindBy(xpath="(//a[contains(@class,\"ipc-metadata-list-item__li\")])[25]") private WebElement getcountry;
	
	public IMDB(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	public String ReleaseDate()
	{
      String  actdatetext=getDate.getText();	
		return actdatetext;
	}	
	
	public String CountryOrigin()
	{
		String actcountrytext= getcountry.getText();
		return actcountrytext;
	}
}
	