package apphooks;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import common_factory.driver_factory;
import common_utility.configReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class ApplicationHooks {
	private WebDriver driver;
	private configReader C_Reader;
	private driver_factory D_Factory;
	Properties Prop;
	
	@Before(order=0)
	public void get_property()
	{
		C_Reader=new configReader();
		Prop=C_Reader.init_prop();
	}
	@Before(order=1)
	public void browserlaunch()
	{
		String Browser_Name=Prop.getProperty("browser");
		System.out.println("Current Application Browser is: "+Browser_Name);
		D_Factory =new driver_factory();
		driver=D_Factory.init_driver(Browser_Name);
		
	}
	@After(order=0)
	public void quitbrowser()
	{
		driver.quit();
	}
	
	

}
