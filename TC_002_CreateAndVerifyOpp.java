package testcases;

import org.testng.annotations.Test;

import baseclass.ProjectSpecificMethod;
import pages.LoginPage;

public class TC_002_CreateAndVerifyOpp extends ProjectSpecificMethod {

	@Test
	public void createOpp() throws InterruptedException  {
		LoginPage login1 = new LoginPage(driver);
		login1.enterUserName().enterPassword().clickLoginButton().clickToggleButton();
	}

}
