package step_definitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Assert;

import common_factory.driver_factory;
import common_pages.Array_Page;
import common_pages.Login_Page;
import common_utility.ExcelReader;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Array {
	
	private Array_Page Arraypage=new Array_Page(driver_factory.getDriver());
	private Login_Page login=new Login_Page(driver_factory.getDriver());
	@Given("Do Login")
	public void do_login(DataTable dataTable) {
		List<Map<String,String>> credentials=dataTable.asMaps();
		String username=credentials.get(0).get("username_a");
		String password=credentials.get(0).get("password_a");
		// need to create separate method in Array_pages_S2 class for do login or creATE referene for Array_pages  
		Arraypage.dologin(username, password);
	    
	}

	@When("Click on Getstarted button on {string} widget")
	public void click_on_button_in_array(String string) {
		login.Getstartedbutton(string);
	   
	}
	@Then("{string} page should be open")
	public void page_should_displayed(String page_name) {
		
		String Actual=login.pagetitle();
		System.out.println("Expected: "+page_name+"Actual : "+Actual);
		Assert.assertTrue(page_name.equalsIgnoreCase(Actual));

	}
	
	

	@When("^Click (.+) array links$")
	public void click_on_array_links(String S) {
		Arraypage.click_arrayspage(S);
	}
	
	

	@When("Click {string} button")
	public void click_button(String string) {
		Arraypage.try_button(string);
	   	    
	}

	

	@When("^Type Sample (.+) and click run button$")
	public void type_sample_print_and_click_run_button(String string) {
		Arraypage.sendcode(string);
		Arraypage.runbutton();
	}

	@Then("^(.+) should displayed")
	public void hello_should_displayed(String string) {
		Arraypage.result(string);
	   	    
	}

	@When("Clear Editor Box")
	public void clear_editor_box() {
		Arraypage.cleartxtbox();
		
	   	    
	}
	@When("Type Javacode {string}")
	public void Type_Javacode(String string) {
		
		Arraypage.sendcode(string);
	   	    
	}

	@When("click run button")
	public void click_run_button() {
		Arraypage.runbutton();  
	}

	@Then("Alert should displayed with ok button")
	public void alert_should_displayed_as_with_ok_button() {
		Arraypage.alert();
	   	    
	}

	@When("click browser right arrow to go back")
	public void click_browser_right_arrow_to_go_back() {
	   	    Arraypage.browserback();
	   	    
	}
	/*@Then("^(.+) page should displayed$")
	public void pagetitle_should_displayed(String page_name) {
		String Actual=login.pagetitle();
		System.out.println("Expected: "+page_name+"Actual : "+Actual);
		Assert.assertTrue(page_name.equalsIgnoreCase(Actual));
		
	   	    
	}*/
	
//DONE FIRST SCENARIO
	@When("Click on {string} link")
	public void click_AIP_links(String S) {
		Arraypage.click_arrayspage(S);
	   	    
	}

	@When("Click on {string} link in Array")
	public void click_on_PQ_in_array(String string) {
		Arraypage.PracticeQuestion_link(string);
	   	    
	}

	@When("^click (.+) practical questions link$")
	public void click_practical_questions_link(String S) {
		Arraypage.click_All_PQ(S);
	   	    
	}

	

	@When("Click Submit button")
	public void click_submit_button() {
		Arraypage.submitbutton();
	   	    
	}

	@Then("{string} message displayed in console")
	public void message_displayed_in_console(String string) {
		Arraypage.result(string);
	   	    
	}

	@When("Click Run and Submit button")
	public void click_run_and_submit_button() {
		Arraypage.runbutton();
		Arraypage.submitbutton();
	   	    
	}
//second done
	@When("^Type valid code for question in editor box (.+)$")
    public void Type_valid_code(String Sheet_Name)throws InvalidFormatException, IOException{
		Arraypage.cleartxtbox();
		ExcelReader reader = new ExcelReader();
		String code = reader.readExcelSheet_validcode(Sheet_Name);
		Arraypage.sendcode_ValidorInvalid(code,Sheet_Name);
	}
	@When("^Type invalid code for question in editor box (.+)$")
    public void Type_invalid_code(String Sheet_Name)throws InvalidFormatException, IOException{
		Arraypage.cleartxtbox();
		ExcelReader reader = new ExcelReader();
		String code = reader.readExcelSheet_invalidcode(Sheet_Name);
		Arraypage.sendcode_ValidorInvalid(code,Sheet_Name);
	}
	


}
