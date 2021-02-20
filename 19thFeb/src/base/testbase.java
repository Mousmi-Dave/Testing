package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import exception.BroswerNotCompatibleException;

public class testbase {
	public static WebDriver driver;
	Actions action;
	Properties prop;

	public testbase() {
		prop=new Properties();//creating instance
		try
		{
			prop.load(new FileInputStream("config//config.properties"));
			String browser=prop.getProperty("browser");
			if(browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "driver//chromedriver.exe");
				driver=new ChromeDriver();
				
			}
			else if(browser.equalsIgnoreCase("ff"))
			{
				System.setProperty("webdriver.gecko.driver", "driver//geckodriver.exe");
				driver= new FirefoxDriver();
			}
			else
			{
				throw new BroswerNotCompatibleException ("Application doesnot suport this browser");
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		catch(BroswerNotCompatibleException e)
		{
			e.printStackTrace();
		}
	}
	public void init()
	{
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

}
