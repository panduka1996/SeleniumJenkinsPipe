package tests;

import org.testng.annotations.Test;

import pages.BaseClass;
import pages.LoginPage;

public class MyTest extends BaseClass{
	
	@Test(priority = 1,description="Login to the system")
	public void Test1(){
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsername("Admin");
		loginPage.enterPassword("admin123");
		loginPage.enterLoginBtn();
		
	}
	
	public String RandomEmailGenerator() {

		String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvxyz";
		StringBuilder sb = new StringBuilder(10);

		for (int i = 0; i < 10; i++) {
			int index = (int) (AlphaNumericString.length() * Math.random());

			sb.append(AlphaNumericString.charAt(index));
		}

		sb.append("@gmail.com");		
		return sb.toString();

	}
	
}
