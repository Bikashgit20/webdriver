package pageobject;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BasePage;

public class OpeningPage extends BasePage
{
	public WebDriver driver;
	
	@FindBy(xpath="//a[@href='index.html']")
	private WebElement homepage;
	
	@FindBy(xpath="//a[@href='accordion.html']")
	private WebElement accordion;
	
	@FindBy(xpath="//a[@href='actions.html']")
	private WebElement actions;
	
	@FindBy(xpath="//a[@href='browserTabs.html']")
	private WebElement browsertab;
	
	@FindBy(xpath="//a[@href='buttons.html']")
	private WebElement buttons;
	
	@FindBy(xpath="//a[@href='calculator.html']")
	private WebElement calculator;
	
	@FindBy(xpath="//a[@href='datepicker.html']")
	private WebElement datepicker;
	
	@FindBy(xpath="//a[@href='dropdown.html']")
	private WebElement dropdown;
	
	@FindBy(xpath="//a[@href='fileupload.html']")
	private WebElement fileupload;
	
	@FindBy(xpath="//a[@href='hiddenElements.html']")
	private WebElement hiddenelement;
	
	@FindBy(xpath="//a[@href='iframes.html']")
	private WebElement iframe;
	
	@FindBy(xpath="//a[@href='loader.html']")
	private WebElement loader;
	
	@FindBy(xpath="//a[@href='http://teststore.automationtesting.co.uk/']")
	private WebElement teststore;
	
	
	/*public OpeningPage(WebDriver driver)
	{
		driver=this.driver;
		PageFactory.initElements(driver, this);
	}*/
	public OpeningPage() throws IOException
	{
		super();
	}
	public WebElement openbutton() throws IOException
	{
		this.driver=getDriver();
		return buttons;
	}
	
	/*public void openbuttons()
	{
		buttons.click();
	}
	
	public void getTestStore()
	{
		teststore.click();
		System.out.println(driver.getTitle());
	}*/
	
	
	
	
	

}
