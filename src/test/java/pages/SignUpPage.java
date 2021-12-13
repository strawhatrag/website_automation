package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentTest;

import test.Baseclass;

public class SignUpPage {
	WebDriver driver = Baseclass.driver;
	ExtentTest test = Baseclass.test;

	//=============================Elements======================================
	@FindBy(linkText="Login/Signup")
	WebElement SignUpBtn;
	
	@FindBy(linkText="Not a member? Signup")
	WebElement SignUpLink;
	
	@FindBy(css="input[name*='email_id']")
	WebElement Email;
	
	@FindBy(css="input[name*='pwd']")
	WebElement Password;
	
	@FindBy(css="input[name*='pwd2']")
	WebElement Confirm;
	
	@FindBy(css="input[name*='fname']")
	WebElement Firstname;
	
	@FindBy(css="input[name*='lname']")
	WebElement Lastname;
	
	@FindBy(css="input[name*='age']")
	WebElement Age;
	
	@FindBy(css="input[name*='address']")
	WebElement Address;
	
	@FindBy(css="button")
	WebElement SignUpBtnLast;
	
	public SignUpPage() {
		PageFactory.initElements(driver, this);
	}

	//======================================Methods===============================
	public void signup(String Emailval,String Passwordval,String FirstNameval,String LastNameval,String Ageval,String Addressval) throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(SignUpBtn));
		
		SignUpBtn.click();
		SignUpLink.click();
		
		Email.sendKeys(Emailval);
		Password.sendKeys(Passwordval);
		Confirm.sendKeys(Passwordval);
		Firstname.sendKeys(FirstNameval);
		Lastname.sendKeys(LastNameval);
		Age.sendKeys(Ageval);
		Address.sendKeys(Addressval);
		
		Thread.sleep(2000);
		SignUpBtnLast.click();

	}

}