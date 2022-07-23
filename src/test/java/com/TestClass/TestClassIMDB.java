package com.TestClass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.BaseClass.BaseClass;
import com.PomClass.IMDB;

import com.UtilityClass.UtilityIMDB;



public class TestClassIMDB extends BaseClass
{

	IMDB id;
	
	@BeforeMethod
	public  void BrowserLaunch() {
		
		ChromeLaunch();
		
		id=new IMDB(driver);

		
	}
	
	@Test
	public void ExtractMovieData() throws EncryptedDocumentException, IOException
	{
		
		String ActText=id.ReleaseDate();
	  String	ExpText=UtilityIMDB.Testdata();
	Assert.assertEquals(ActText, ExpText);
		

		
		String ActCountry=id.CountryOrigin();
		String ExpText1 = UtilityIMDB.Testdata1();
		Assert.assertEquals(ActCountry, ExpText1);
		
		
		
		
	}
	
	public void BrowserClose()
	{
		driver.quit();
	}


}
