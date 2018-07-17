package firstpk;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Methodss {

	
	WebDriver d;
	
	
	public void wait_cls()
	{
		WebDriverWait wait=new WebDriverWait(d,30);
		
	}
	public void tear_down() throws Exception
	{
		Thread.sleep(2000);
		d.close();
	}
	
	public void Screen_sort() throws Exception
	{
		TakesScreenshot tk=(TakesScreenshot)d;
		
	   File	sc=tk.getScreenshotAs(OutputType.FILE);
	   
	   FileUtils.copyFile(sc, new File("E:\\root\\abcd\\Screensort"));
	   
	}
	public void listner()
	{
		
			   
			   
		
		
		
	}
}
