package firstpk;

//import java.util.Locale.LanguageRange;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import org.apache.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.log4testng.Logger;

public class Base_class  {

	public static final Logger log= Logger.getLogger(Base_class.class.getName());
	
	
	
	public WebDriver d;
	
	public String url="https://www.vaf.mindzglobal.com/"; 
	
	public String browser="Firefox";
	
	
	public void init()
	{
		base(browser);
		
		get_url(url);
	}		
	
	public void base(String browser)
	{
		
		if(browser.equalsIgnoreCase("Firefox"))
		{
		
			System.setProperty("WebDriver.gecko.driver", "E:\\selenium testing\\geckodriver-v0.21.0-win64\\geckodriver.exe\\");
		
		
			d=new FirefoxDriver();
		}
		/*else
		 if	(browser.equalsIgnoreCase("chrome"))
			{
			 System.setProperty("WebDriver.chrome.driver","D:\\file backup\\Testing folder\\Drivers\\chromedriver_win32 (1).zip\\");
			 
			 d=new ChromeDriver();
			}*/
			
	}
		public void get_url(String url)
		{
			
		d.get(url);
		
		d.manage().window().maximize();
		
		d.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}

	}


