package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.SignUpPage;

public class SignUpPageTest extends Baseclass {

	
	@Parameters({"Email","Password","FirstName","LastName","Age","Address"})
	@Test
	public void signupTest(String Emailval,String Passwordval,String FirstNameval,String LastNameval,String Ageval,String Addressval){
		
		SignUpPage Signup = new SignUpPage();
		Signup.signup(Emailval, Passwordval, FirstNameval, LastNameval, Ageval, Addressval);
		
		
		
	}
}