package firstpk;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Verify_login extends Base_class {
	
	Home_page home=new Home_page(d);
	
	
	@BeforeTest
	public void m()
	{
		init();
		
    }
	@Test
	public void login_to_App()
	{
		home.login1("ram","4321");
		
	}
	@AfterTest
	public void tear_down()
	{
		d.close();
	}
	}


