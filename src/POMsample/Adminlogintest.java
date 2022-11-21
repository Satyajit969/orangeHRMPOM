package POMsample;



import org.openqa.selenium.support.PageFactory;

import org.testng.Assert;
import org.testng.annotations.Test;

import OrangeHRMpages.Addemployee;

import OrangeHRMpages.loginpage;
import Utils.AppUtils;

public class Adminlogintest extends AppUtils{
	
	@Test
	public void checkadminlogin()
	{
		loginpage lp = PageFactory.initElements(driver, loginpage.class);
		lp.login("Admin", "Qedge123!@#");
		boolean res1 = lp.isAdminmoduledisplayed();
		Assert.assertTrue(res1);
	}	
		
		
		
		
	    @Test
		public  void checkempreg()
		{
			Addemployee emp = PageFactory.initElements(driver, Addemployee.class);
			emp.addemployee("niimssssss", "Demo");
	
	}
}
