package testcases;

import org.testng.annotations.Test;

import baseclass.ProjectSpecificMethod;
import pages.LoginPage;

public class TC_001_Login extends ProjectSpecificMethod {

	@Test
	public void login() throws InterruptedException  {

		LoginPage login = new LoginPage(driver);
		login.enterUserName().enterPassword().clickLoginButton().clickToggleButton();

	}

}
