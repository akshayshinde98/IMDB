package com.PomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v101.systeminfo.model.VideoDecodeAcceleratorCapability;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.BaseClassWIki;

public class WIKI
{
@FindBy(xpath="(//li)[12]")  private WebElement relesedate;
@FindBy(xpath="//td[text()='India']") private  WebElement country;	
	
public WIKI(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public String Getrelesedate()
{
	String actdate = relesedate.getText();
	return actdate;
}

public String GetCountry()
{
	
	String actcountry = country.getText();
	return actcountry;
}

}

