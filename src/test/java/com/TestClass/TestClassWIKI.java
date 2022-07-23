package com.TestClass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.BaseClass.BaseClassWIki;
import com.PomClass.IMDB;
import com.PomClass.WIKI;
import com.UtilityClass.UtilityIMDB;
import com.UtilityClass.UtilityWiki;

public class TestClassWIKI extends BaseClassWIki {

	WIKI wi;
	
	@BeforeMethod
	public  void BrowserLaunch() {
		
         ChromeLaunch();
		
		wi=new WIKI(driver);

		
	}
	
	@Test
	public void ExtractMovieData() throws EncryptedDocumentException, IOException
	{
		
		String ActText=wi.Getrelesedate();
		String ExpText=UtilityWiki.Testdata();

	Assert.assertEquals(ActText, ExpText);
		

		
		String ActCountry=wi.GetCountry();
		String ExpText1 = UtilityWiki.Testdata1();
	
		Assert.assertEquals(ActCountry, ExpText1);
		
		
		
		
	}
	
	public void BrowserClose()
	{
		driver.quit();
	}
	
	
}
