package stepdefinition;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import basepage.BasePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LoginPage;
import pages.Util;

public class StepDefinition extends BasePage {
	
	LoginPage loginpage;
	
	
	
	
	
	public StepDefinition() throws IOException {
		super();
		
		
	}

	

	
	@Given("^I have launched Gmail$")
	public void i_have_launched_Gmail() throws IOException 
       {
		initialization();
       }

	@When("^I enter username and password and I click login button$")
	public void i_enter_username_and_password_and_I_click_login_button() throws InterruptedException, IOException  {
		
		loginpage = new LoginPage();
		
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		
		
		
		
	    
	}

	

	@Then("^I should be in the gmail inbox$")
	public void i_should_be_in_the_gmail_inbox() throws InterruptedException  {

		Thread.sleep(3000);
		loginpage.verifyInbox();
     
	    
	}


}
