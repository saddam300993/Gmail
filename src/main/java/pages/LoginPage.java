package pages;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basepage.BasePage;

public class LoginPage extends BasePage{
	
	
	@FindBy(xpath="//input[@type='email']")
	WebElement username;
	
	@FindBy(xpath="//span[text()='Next']")
	WebElement uname_next;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement password;
	
	@FindBy(xpath="//span[text()='Next']")
    WebElement pass_next;
	
	@FindBy(xpath="//a[@title='Inbox']")
	WebElement inbox;
	
	
	public LoginPage() throws IOException
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void login(String uname, String pass) throws InterruptedException
	{
		username.sendKeys(uname);
		uname_next.click();
		Thread.sleep(3000);
		password.sendKeys(pass);
		pass_next.click();
		
		
	}
	
	public void verifyInbox()
	{
        String actual_title = driver.findElement(By.xpath("//a[@title='Inbox']")).getText();
        String expected_title = "Inbox";
               
		
		Assert.assertEquals(actual_title, expected_title);
	}

}
