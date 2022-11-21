package OrangeHRMpages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Userreg {
	@FindBy(linkText = "Admin")
	WebElement admin_link;

	@FindBy(name = "btnAdd")
	WebElement btnadd_link;
	@FindBy(id = "systemUser_userType")
	WebElement userrole_link;
	@FindBy(id = "systemUser_employeeName_empName")
	WebElement empnmae_link;
	@FindBy(id = "systemUser_userName")
	WebElement username_link;
	@FindBy(id = "systemUser_password")
	WebElement pswd_link;
	@FindBy(id = "systemUser_confirmPassword")
	WebElement cnfrmpwd_link;
	@FindBy(id= "btnSave")
	WebElement save_link;
	
	

			
	
	


      
 public void adduser(String role,String empnmae,String username,String password) throws InterruptedException {
	
	admin_link.click();
	
   
	btnadd_link.click();
	
	
	Select sel = new Select(userrole_link);
	sel.selectByVisibleText(role);
	
	empnmae_link.sendKeys(empnmae);
	username_link.sendKeys(username);
	pswd_link.sendKeys(password);
	cnfrmpwd_link.sendKeys(password);
	Thread.sleep(5000);
	
	
	save_link.click();
	
	
	
	
	
	
	
       }





}