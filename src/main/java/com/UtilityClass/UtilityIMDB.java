package com.UtilityClass;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UtilityIMDB 
{
	static FileInputStream file;
	static Workbook wbf;
	public static String Testdata() throws EncryptedDocumentException, IOException
	
	{
		
        file =new FileInputStream("B:\\eclipseworkspace\\IMDB\\TestData\\TestData.xlsx");
		wbf = WorkbookFactory.create(file);
		String ExpText = wbf.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		
		return ExpText;
			
	}
	
	public static String Testdata1() throws EncryptedDocumentException, IOException
	
	{
		
        file =new FileInputStream("B:\\eclipseworkspace\\IMDB\\TestData\\TestData.xlsx");
		wbf = WorkbookFactory.create(file);
		String ExpText1 = wbf.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		
		return ExpText1;
			
	}
	
	
	
	

}
