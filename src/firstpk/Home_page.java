package firstpk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home_page {

	
	WebDriver d;
	
	@FindBy(xpath="a[text()=' Login ']")
	WebElement login1;
	
	@FindBy(id="email")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement submit;
	
	@FindBy(id="Button1")
	WebElement Enterhall;
	
	
	
	//@FindBy(id=)
	
	public Home_page(WebDriver d)
	{
		this.d=d;
	}
	
	public void login1(String user_name1,String password1)
	{
		login1.click();
		
		username.clear();
		
		username.sendKeys(user_name1);

	    password.clear();
	    
	    password.sendKeys(password1);
	    
	    submit.click();
	}
	
	
	}

