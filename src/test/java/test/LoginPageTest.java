package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;




import pages.LoginPage;

public class LoginPageTest extends Baseclass {
	
	@Test
	@Parameters({"Email", "Password"})
	public void Login(String EmailVal, String PasswordVal) {
		
		LoginPage login = new LoginPage();
		login.Login(EmailVal,PasswordVal);
		login.validate();
		
	}
}