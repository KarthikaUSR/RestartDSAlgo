package common_factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class driver_factory {
	
	public WebDriver driver;
	public static ThreadLocal<WebDriver> tldriver=new ThreadLocal<>();
	public WebDriver init_driver(String Browser_name)
	{
		System.out.println("Browser value is: "+Browser_name);
		if(Browser_name.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			tldriver.set(new ChromeDriver());
		}
		else if(Browser_name.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			tldriver.set(new FirefoxDriver());
		}
		else if(Browser_name.equalsIgnoreCase("safari"))
		{			
			tldriver.set(new SafariDriver());					
		}
		else
		{
			System.out.println("Please pass correct browser value: "+Browser_name);
		}
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		return getDriver();
	}
	
	public static WebDriver getDriver() {
		
		return tldriver.get();
	}
	
	
	

}
