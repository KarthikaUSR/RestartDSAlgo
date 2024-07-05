package common_pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


public class Array_Page {
	
	private WebDriver driver;
	By Getstart_Array=By.xpath("//a[@href='array']");
	//links in array page
	By Array_AIP=By.linkText("Arrays in Python");
	By Array_AUL=By.linkText("Arrays Using List");
	By Array_BOL=By.linkText("Basic Operations in Lists");
	By Array_AOA=By.linkText("Applications of Array");
	//Practrice_Question pages	
	By PQ_Link=By.xpath("//a[@href='/array/practice'] ");
	By Array_PQ1=By.xpath("//a[@href='/question/1']");//Search the array
	By Array_PQ2=By.xpath("//a[@href='/question/2']");//Max Consecutive Ones
	By Array_PQ3=By.xpath("//a[@href='/question/3']");//Find Numbers with Even Number of Digits
	By Array_PQ4=By.xpath("//a[@href='/question/4']");//Squares of  a Sorted Array	
	//Try Editor
	By try_Editor=By.linkText("Try here>>>");
	//program page
	By text_editor=By.xpath("//form[@id='answer_form']/div/div/div/textarea");
	By console=By.xpath("//div[@class='code-area']/div/pre");
	By run_button=By.xpath("//button[@onclick='runit()']");
	By submit_button=By.xpath("//input[@value='Submit']");
	By texteditor_clr=By.xpath("//div[@class='CodeMirror-code']/div/pre/span");	
	
	By code_clr=By.xpath("//*[@id=\"answer_form\"]/div/div/div[1]/textarea");
	By cursor=By.xpath("//div[@class='CodeMirror-cursor']");
	@FindBy(xpath="//div[@class='CodeMirror-code']/div/pre/span") WebElement texteditor_clr_tab;
	//Login elements
	By Signin_link=By.xpath("//a[@href='/login']");
	By user_name=By.id("id_username");
	By pass_word=By.id("id_password");
	By Login_button=By.xpath("//input[@value='Login']");
	By userNameDisp=By.xpath("//ul/a[2]");
	By Alertmsg=By.xpath("//div[@role='alert']");
	

	//constructor
	public Array_Page(WebDriver driver)
	{
		this.driver=driver;
	}
	//page action
	public void dologin(String U,String P)
	{
		driver.findElement(Signin_link).click();
		driver.findElement(user_name).sendKeys(U);
		driver.findElement(pass_word).sendKeys(P);
		driver.findElement(Login_button).click();
	
	}
	public void click_arrayspage(String strings) {
		String string=strings;
		if(string.equalsIgnoreCase("Arrays in Python"))
		{
			driver.findElement(Array_AIP).click();
			
		}
		else if(string.equalsIgnoreCase("Arrays Using List"))
		{
			driver.findElement(Array_AUL).click();
			
		}
		else if(string.equalsIgnoreCase("Basic Operations in Lists"))
		{
			driver.findElement(Array_BOL).click();
			
		}
		else if(string.equalsIgnoreCase("Applications of Array"))
		{
			driver.findElement(Array_AOA).click();
			
		}
		else
		{
			System.out.println("Other name:" +string);
		}
	  
	}
    public void try_button(String string) {
		
		driver.findElement(try_Editor).click();
		System.out.println("Pressing "+string);

	}
    public void sendcode(String S) {
		
		driver.findElement(text_editor).sendKeys(S);

	}
    public void runbutton() {
   	   driver.findElement(run_button).click();
   	}
    public void result(String S) {
		
		String result=driver.findElement(console).getText();
		
		System.out.println(result);
		
		if(result.equalsIgnoreCase(S))
		{
			System.out.println("Program executed succesfully");
		}
		else
		{
			System.out.println("Program Failed");
		}		

	}
    public void cleartxtbox() {
		
		Actions actions = new Actions(driver);
		WebElement clrtxt=driver.findElement(texteditor_clr);
		actions.click(clrtxt).sendKeys(Keys.END).keyDown(Keys.SHIFT).sendKeys(Keys.HOME).keyUp(Keys.SHIFT).sendKeys(Keys.BACK_SPACE).perform();
	}
    public void alert() {
		
		Alert A=driver.switchTo().alert();
		A.accept();

	}
    public void browserback() {
		driver.navigate().back();
	}
    public void PracticeQuestion_link(String string) {
		
		driver.findElement(PQ_Link).click();
		System.out.println("Pressing "+string);

	}
    public void click_All_PQ(String PQ_names) {
		String string=PQ_names;
		
		if(string.equalsIgnoreCase("Search the array"))
		{
			driver.findElement(Array_PQ1).click();
			System.out.println(string);
		}
		else if(string.equalsIgnoreCase("Max Consecutive Ones"))
		{
			driver.findElement(Array_PQ2).click();
			System.out.println(string);
		}
		else if(string.equalsIgnoreCase("Find Numbers with Even Number of Digits"))
		{
			driver.findElement(Array_PQ3).click();
			System.out.println(string);
		}
		else if(string.equalsIgnoreCase("Squares of  a Sorted Array"))
		{
			driver.findElement(Array_PQ4).click();
			System.out.println(string);
		}
	
		else
		{
			System.out.println("Other name:" +string);
		}
	  
	}
    public void submitbutton() {
    	
   	  driver.findElement(submit_button).click();
   	
   	}
    public void sendcode_ValidorInvalid(String codeline,String prog_Name){
		WebElement editorbox=driver.findElement(text_editor);
		String pro_Name=prog_Name;
		System.out.println("Entered program name is :"+pro_Name);
		if(pro_Name.equalsIgnoreCase("Searchthearray"))
		{
			editorbox.sendKeys(codeline);
		}
		else if (pro_Name.equalsIgnoreCase("MaxConsecutiveOnes"))
		{
			editorbox.sendKeys(codeline);
			TextIndentation_MCO(driver);
			
		}
		else if (pro_Name.equalsIgnoreCase("FindNumbersEvenNumberDigits"))
		{
			editorbox.sendKeys(codeline);
			TextIndentation_FED_SSA(driver);
			
		}
		else if (pro_Name.equalsIgnoreCase("SquaresSortedArray"))
		{
			editorbox.sendKeys(codeline);
			TextIndentation_FED_SSA(driver);
			
		}
		else 
		{
			System.out.println("Enter valid program name");
			
		}
		
		
		
	}
    public void TextIndentation_MCO(WebDriver driver){
		 Actions action = new Actions(driver);
		 
		 WebElement clrtxt_1=driver.findElement(texteditor_clr);
		 action.moveToElement(clrtxt_1).keyDown(Keys.COMMAND).sendKeys(Keys.ARROW_LEFT).keyUp(Keys.COMMAND).perform();
		 
	     action.keyDown(Keys.SHIFT).sendKeys(Keys.TAB).keyUp(Keys.SHIFT).perform();
		 action.keyDown(Keys.COMMAND).sendKeys(Keys.BACK_SPACE).keyUp(Keys.COMMAND).perform();//it delete the content in the front of cursor
		 
		 action.sendKeys(Keys.SPACE).sendKeys(Keys.SPACE).perform();
		 
		 action.sendKeys(Keys.ARROW_UP).sendKeys(Keys.DELETE).sendKeys(Keys.DELETE).perform();
		 action.sendKeys(Keys.ARROW_UP).sendKeys(Keys.ARROW_LEFT).sendKeys(Keys.ARROW_LEFT).sendKeys(Keys.DELETE).sendKeys(Keys.DELETE).perform();
		 
		 action.sendKeys(Keys.ARROW_UP).sendKeys(Keys.HOME).perform();
		 action.sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE).perform();//it delete the content in the front of cursor


			 
			 }
    public void TextIndentation_FED_SSA(WebDriver driver) {
		 Actions action = new Actions(driver);
		 
		 WebElement clrtxt_1=driver.findElement(texteditor_clr);
		 action.moveToElement(clrtxt_1).keyDown(Keys.COMMAND).sendKeys(Keys.ARROW_LEFT).keyUp(Keys.COMMAND).perform();
		 
	     action.keyDown(Keys.SHIFT).sendKeys(Keys.TAB).keyUp(Keys.SHIFT).perform();
		 action.keyDown(Keys.COMMAND).sendKeys(Keys.BACK_SPACE).keyUp(Keys.COMMAND).perform();//it delete the content in the front of cursor
		 action.sendKeys(Keys.SPACE).sendKeys(Keys.SPACE).perform();
		 
		 
			 
			 }
   
}
