package AutomationEcercise;

import org.testng.Assert;
import org.testng.annotations.Test;

import BaseClassUtility.BaseClass;
import ObjectRepositoryUtility.HomePage;
import ObjectRepositoryUtility.LoginPage;
import ObjectRepositoryUtility.LoginToPage;
import ObjectRepositoryUtility.SignUpPage;

public class logoutUser extends BaseClass {
	@Test
	public void logout() throws Throwable {
	String Email=eLib.getDataFromExcel("Register", 3, 2);
	String Password=eLib.getDataFromExcel("Register", 1, 3);
	String Name=eLib.getDataFromExcel("Register", 1, 1);
	HomePage hm=new HomePage(driver);
	String result = hm.getHomeLink().getText();
	System.out.println(result);
	String expcted="Home";
	Assert.assertEquals(result, expcted);
	hm.getLoginLink().click();
	LoginToPage login=new LoginToPage(driver);
   String Actual1 = login.getLoginToAccountText().getText();
    String Expected="Login to your account";
    Assert.assertEquals(Actual1, Expected);
    System.out.println(Actual1);
	login.logintoApp(Email, Password);
	SignUpPage signup=new SignUpPage(driver);
	signup.getLogoutLink().click();
	LoginPage lp=new LoginPage(driver);
	String Actual = lp.getNewUserText().getText();
	String epctddata="New User Signup!";
	Assert.assertEquals(Actual, epctddata);
	System.out.println(Actual);

}
}