package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasePage 
{
	public static WebDriver driver;
	private String url;
	private Properties prop;
	public BasePage() throws IOException
	{
		prop=new Properties();
		
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir") +"src\\main\\java\\resources\\config.properties");
		prop.load(fis);
		
	}
	public WebDriver getDriver()
	{
		
		System.out.println("entering getdriver method");
		
		if(prop.getProperty("browser").equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Bikash\\selenium practice\\JavaAutomation\\drivers\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(prop.getProperty("browser").equals("firefox"))
		{
			System.setProperty("webdriver.gecho.driver", "./drivers/gechodriver.exe");
			driver=new FirefoxDriver();
		}
		else
		{
			System.setProperty("webdriver.edge.driver", "./drivers/edgedriver.exe");
			driver=new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//	return driver;
		return driver;
		
		
	}
	public String getUrl() throws IOException
	{
		url=prop.getProperty("url");
		return url;
	}
	public void TakeScreenshot(WebDriver driver) throws IOException
	{
		File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destfile=new File("D:\\Bikash\\selenium practice\\JavaAutomation\\Screenshot\\" + ".png");
		FileUtils.copyFile(srcfile, destfile);
	}
	
}
