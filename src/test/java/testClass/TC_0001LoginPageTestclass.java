package testClass;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.LoginPageObjects;


public class TC_0001LoginPageTestclass extends BaseClass {

	@Test
	public void LoginPageTest() throws IOException, InterruptedException {

		System.out.println("************started TC_0001LoginPageTestclass***********");
		pageObjects.LoginPageObjects lp = new LoginPageObjects(driver);
		lp.setuserNameAndPassword("rohithghosh@email.com", "604a49d8f44cd6de4d263820d1fd8685");
		log.info("Entered username and password");
		log.info("Clicking on login button");
		//lp.logout();
		log.info("Logged out successfully");

	System.out.println("************completed TC_0001LoginPageTestclass***********");
	}

}
