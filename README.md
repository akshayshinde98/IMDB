
# TestVegrant

Validating the movie information in which validate the Release Date & Country of Origin




## Running Tests

To run tests, run the following command

```bash
  1. Create the project & by using the Maven create the folder structure.

  2. In the maven pom.xml file add the dependencies what we have requried.

  3. After that right the program for validating the Release Date & Country of Origin for the movie Pushpa: the Rise.

  4. Here we check on the IMDB & Also on the wikipedia.


   
   This code import the `TestClassIMDB` TestClass

  ```java
  public void ExtractMovieData() throws EncryptedDocumentException, IOException
	{
		
		String ActText=id.ReleaseDate();
	  String	ExpText=UtilityIMDB.Testdata();
	Assert.assertEquals(ActText, ExpText);
		

		
		String ActCountry=id.CountryOrigin();
		String ExpText1 = UtilityIMDB.Testdata1();
		Assert.assertEquals(ActCountry, ExpText1);
   

  ```

  This code import the `TestClassWIK` TestClass

  ```java
  public void ExtractMovieData() throws EncryptedDocumentException, IOException
	{
		
		String ActText=wi.Getrelesedate();
		String ExpText=UtilityWiki.Testdata();

	Assert.assertEquals(ActText, ExpText);
		

		
		String ActCountry=wi.GetCountry();
		String ExpText1 = UtilityWiki.Testdata1();
	
		Assert.assertEquals(ActCountry, ExpText1);


```



