package step_definitions;

import org.junit.Assert;
import common_factory.driver_factory;
import common_pages.Login_Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	
	private Login_Page login= new Login_Page(driver_factory.getDriver());;
	String Title;
	String Alert;
	

@Given("Enter DS Algo Home portal")
public void enter_ds_algo_home_portal() {
	
	driver_factory.getDriver().get("https://dsportalapp.herokuapp.com/home");
	
    
}

@When("^Click (.+) Get Started buttons$")
public void click_data_structures_introduction_get_started_buttons(String Names) {
	login.Getstartedbutton(Names);
    
}


@Then("{string} message displayed")
public void message_displayed(String string) {
	
	Alert=login.alert_msg();
	Assert.assertTrue(Alert.equalsIgnoreCase(string));
}



@When("Click Signin link")
public void click_link() {
    login.Signin_link();
}

@When("Enter user name as {string}")
public void enter_user_name(String string) {
	login.username(string);
	
    
}
@When("Enter password as {string}")
public void enter_password(String string) {
	
	login.password(string);
    
}

@When("Click Login button")
public void click_Login_button() throws InterruptedException {
    login.login_button();
}

@Then("^(.+) page should open$")
public void page_should_displayed(String page_name) {
	String Actual=login.pagetitle();
	System.out.println("Expected: "+page_name+"Actual : "+Actual);
	Assert.assertTrue(page_name.equalsIgnoreCase(Actual));

}

}
