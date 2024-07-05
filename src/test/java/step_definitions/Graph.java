package step_definitions;

import common_factory.driver_factory;
import common_pages.Array_Page;
import common_pages.Graph_Page;

import io.cucumber.java.en.When;

public class Graph {
	
	private Graph_Page GP=new Graph_Page(driver_factory.getDriver());
	@When("^Click (.+) graph links$")
	public void click_on_array_links(String S) {
		GP.clickgraphlinks(S);
	}
	@When("Click on {string} link in graph")
	public void click_on_PQ_in_array(String string) {
		GP.PracticeQuestion_link(string);
	   	    
	}
	

}
