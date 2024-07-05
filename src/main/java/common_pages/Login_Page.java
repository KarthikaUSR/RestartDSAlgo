package common_pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_Page {
	
 private WebDriver driver;
	
	By Getstart_DSintro=By.xpath("//a[@href='data-structures-introduction']");
	By Getstart_Array=By.xpath("//a[@href='array']");
	By Getstart_Graph=By.xpath("//a[@href='graph']");
	By Signin_link=By.xpath("//a[@href='/login']");
	By user_name=By.id("id_username");
	By pass_word=By.id("id_password");
	By Login_button=By.xpath("//input[@value='Login']");
	By userNameDisp=By.xpath("//ul/a[2]");
	By Alertmsg=By.xpath("//div[@role='alert']");
	
	public Login_Page(WebDriver driver)
	{
		this.driver=driver;
	}
	//page title
	public String pagetitle()
	{
	
		return driver.getTitle();
	}
	public void Getstartedbutton(String Name)
	{
		if(Name.equalsIgnoreCase("Data Structures-Introduction"))
		{
			driver.findElement(Getstart_DSintro).click();
			
		}
		else if(Name.equalsIgnoreCase("Array"))
		{
			driver.findElement(Getstart_Array).click();
			
		}
		else if(Name.equalsIgnoreCase("Graph"))
		{
			driver.findElement(Getstart_Graph).click();
		}
		else
		{
			System.out.println("Other name:" +Name);
		}
			
		
	}
	
	
	
	public void Signin_link()
	{
		driver.findElement(Signin_link).click();
		
	}
	public void username(String U)
	{
		driver.findElement(user_name).sendKeys(U);
	}
	public void password(String P)
	{
		driver.findElement(pass_word).sendKeys(P);
	}
	public void login_button() throws InterruptedException
	{
		driver.findElement(Login_button).click();
		Thread.sleep(2000);
		String username=driver.findElement(userNameDisp).getText();
		System.out.println("User Loggin as : "+username);
	}
	public String alert_msg()
	{
		String S=driver.findElement(Alertmsg).getText();
		return S;
	}
	
}
