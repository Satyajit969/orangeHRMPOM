package POMsample;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import OrangeHRMpages.Userreg;
import OrangeHRMpages.loginpage;
import Utils.AppUtils;

public class usercgk extends AppUtils {
	
@Test
public void checkuserreg() throws InterruptedException
{
	loginpage lp = PageFactory.initElements(driver, loginpage.class);
	lp.login("Admin", "Qedge123!@#");
	Userreg  us = PageFactory.initElements(driver, Userreg.class);
	us.adduser("ESS","niimssssss Demo", "niimssssss12345", "Qedge123!@#");
	Thread.sleep(5000);
}

}
