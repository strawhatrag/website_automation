package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentTest;

import test.Baseclass;

public class CheckOutPage {
	WebDriver driver = Baseclass.driver;
	ExtentTest test = Baseclass.test;
	
	//=============================Elements======================================
	@FindBy(linkText="Home")
	WebElement Home;
	
	@FindBy(linkText="Login/Signup")
	WebElement SignBtn;
	
	@FindBy(css="input[name*='email_id']")
	WebElement Email;
	
	@FindBy(css="input[name*='pwd']")
	WebElement Password;
	
	@FindBy(css="button")
	WebElement LoginFinal;
	
	@FindBy(css="h3")
	WebElement Header;
	
	@FindBy(css="a[href*='cartadditem?id=1']")
	WebElement Item1;

	@FindBy(css="a[href*='cartadditem?id=2']")
	WebElement Item2;
	
	@FindBy(linkText="Checkout Now")
	WebElement CheckOut;
	
	@FindBy(linkText="Pay via secure Payment Gateway")
	WebElement PayNow;
	
	@FindBy(linkText="Click to complete checkout")
	WebElement CompleteNow;
	
	public CheckOutPage() {
		PageFactory.initElements(driver, this);
	}

	//======================================Methods===============================
	public void CheckOut(String Emailval,String Passwordval){

		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(Home));
		
		SignBtn.click();
		Email.sendKeys(Emailval);
		Password.sendKeys(Passwordval);
		LoginFinal.click();
		Home.click();
		Item1.click();
		Home.click();
		Item2.click();
		CheckOut.click();
		PayNow.click();
		CompleteNow.click();
	}
}
