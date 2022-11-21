package OrangeHRMpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class loginpage {
	//login
	@FindBy(id= "txtUsername")
	WebElement uid_element;
	@FindBy(id = "txtPassword")
	WebElement pwd_element;
	@FindBy(id = "btnLogin")
	WebElement login_element;
	@FindBy(linkText = "Admin")
	WebElement Admin_element;
	
	
	
	


//logout	
	@FindBy(partialLinkText = "Welcome" )
	WebElement welcome_link;
	@FindBy(linkText = "Logout")
	WebElement logout_link;
	
	
	
	
	
	//LOGIN CREDENTIALS
	public void login(String uid,String pwd)
	{
		
		uid_element.sendKeys(uid);
		pwd_element.sendKeys(pwd);
		login_element.click();
	}
	
	//ADMIN MODULE DISPLAY
	public boolean isAdminmoduledisplayed()
	{
	if(Admin_element.isDisplayed())
	{
		return true;
	}else {
		return false;
	}}
	
	
	
		
	//LOGOUT
	public void logout()
	{
		welcome_link.click();
		logout_link.click();
	}
	
	
	
	
	}
	
	
	


