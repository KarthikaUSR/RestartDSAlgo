package common_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Graph_Page {
	
	private WebDriver driver;
	//Locate
		By Getstart_graph=By.xpath("//a[@href='graph']");

		By Graphlink= By.linkText("Graph");
		By GraphRepresentation= By.linkText("Graph Representations");
		By Tryherelink= By.linkText("Try here>>>");
		By text_editor=By.xpath("//form[@id='answer_form']/div/div/div/textarea");
		By console=By.xpath("//div[@class='code-area']/div/pre");
		By run_button=By.xpath("//button[@onclick='runit()']");
		
		By texteditor_clr=By.xpath("//div[@class='CodeMirror-code']/div/pre/span");
		By PQ_graphlink= By.xpath("//a[@href='/graph/practice']");
		//constructor
		public Graph_Page(WebDriver driver){
			this.driver=driver;
			
		}
		//pageactions
		public void clickgraphlinks(String strings) {
			String string=strings;
			if(string.equalsIgnoreCase("Graph"))
			{
				driver.findElement(Graphlink).click();
				
			}
			
			else if(string.equalsIgnoreCase("Graph Representations"))
			{
				driver.findElement(GraphRepresentation).click();
				
			}
			else
			{
				System.out.println("Other name:" +string);
			}

			
		  
		}
		public void PracticeQuestion_link(String string) {
			
			driver.findElement(PQ_graphlink).click();
			System.out.println("Pressing "+string);

		}

}
