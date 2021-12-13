package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.CheckOutPage;

public class CheckOutPageTest extends Baseclass {

	@Test
	@Parameters({"Email","Password"})
	public void CheckOut(String Emailval,String Passwordval) {
		
		CheckOutPage Order = new CheckOutPage();
		Order.CheckOut(Emailval, Passwordval);
		
		
	}

}