package basepage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {
	
	public static Properties prop;
	public static WebDriver driver;
	
	
	public BasePage() throws IOException
	{
	
	prop = new Properties();
	FileInputStream fin = new FileInputStream("E:\\GmailTest\\src\\main\\java\\config.properties");
	prop.load(fin);
	}
	
	
	
	public static void initialization() 
	{
		
		
	
		if(prop.getProperty("browser").equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\main\\resources\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(prop.getProperty("URL"));
		driver.manage().window().maximize();
		
		}
	

}
