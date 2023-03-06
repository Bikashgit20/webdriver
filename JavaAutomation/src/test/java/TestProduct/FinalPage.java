package TestProduct;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BasePage;

import pageobject.OpeningPage;
import pageobject.ProductPage;
import pageobject.TestStore;

public class FinalPage extends BasePage
{
	//private WebDriver driver;
	
	public FinalPage(WebDriver driver) throws IOException {
		super();
		
	}
	
	@BeforeTest
	public void setup() throws IOException
	{
		driver=getDriver();
		driver.get(getUrl());
	}
	

/*	@AfterTest
	public void tearDown()
	{
		driver.close();
		driver=null;
	}*/

	
	@Test
	public void selectProduct() throws IOException
	{
		OpeningPage page=new OpeningPage();
		page.openbutton().click();
		
		/*TestStore test=new TestStore(driver);
		test.chooseProduct();
		
		ProductPage product=new ProductPage(driver);
		product.getProductDetails();*/
		
		
		
		
	}

}
