package OrangeHRMpages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Addemployee {
	@FindBy(linkText ="PIM" )
	WebElement PIM_eleElement;
	@FindBy(linkText = "Add Employee")
	WebElement Addemp_link;
	@FindBy(id="firstName")
	WebElement fname_link;
	@FindBy(id = "lastName")
	WebElement lname_link;
	@FindBy(id = "btnSave")
	WebElement save_link;
	@FindBy(linkText = "Admin")
	WebElement empdspld_link;
	
	public void addemployee(String fname,String lnmae)
	{
		PIM_eleElement.click();
		Addemp_link.click();
		fname_link.sendKeys(fname);
		lname_link.sendKeys(lnmae);
		save_link.click();
	}
		

}
