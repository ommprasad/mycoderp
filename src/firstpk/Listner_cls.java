package firstpk;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listner_cls extends Base_class implements ITestListener{

	@Override
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult arg0) {
		if(!arg0.isSuccess())
		{
			try {
			Calendar cal=Calendar.getInstance();
			
			SimpleDateFormat format= new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
			
			String method_name=arg0.getName();
			
			TakesScreenshot tk=(TakesScreenshot)d;
			
			File src=tk.getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(src, new File("E:\\root\\abcd\\Screensort.png"));
			}
			catch(Exception e)
			{
				e.getMessage();
			}
			
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

}
