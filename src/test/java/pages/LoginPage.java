package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


import com.relevantcodes.extentreports.ExtentTest;


import test.Baseclass;


public class LoginPage {
	
	WebDriver driver = Baseclass.driver;
	
	ExtentTest test = Baseclass.test;
	
	//=============================Elements======================================
	@FindBy(linkText="Login/Signup")
	WebElement SignUpBtn;
	
	@FindBy(css="input[name*='email_id']")
	WebElement Email;
	
	@FindBy(css="input[name*='pwd']")
	WebElement Password;
	
	@FindBy(css="button")
	WebElement LoginBtn;
	
	@FindBy(css="h3")
	WebElement Header;
	
	public LoginPage() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	//======================================Methods===============================
	public void Login(String EmailVal, String PasswordVal) {
		
			WebDriverWait wait = new WebDriverWait(driver,30);
			wait.until(ExpectedConditions.visibilityOf(SignUpBtn));
			
			SignUpBtn.click();
			Email.sendKeys(EmailVal);
			Password.sendKeys(PasswordVal);
			LoginBtn.click();
			
		}
	//==================================verify login============================
	public void validate() {
		String ExpText = "SPORTY SHOES - DASHBOARD";
		String ActualText = Header.getText();
		Assert.assertEquals(ActualText, ExpText);
		
	}
}