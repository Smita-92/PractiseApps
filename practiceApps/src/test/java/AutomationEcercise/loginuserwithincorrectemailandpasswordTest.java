package AutomationEcercise;

import org.testng.Assert;
import org.testng.annotations.Test;

import BaseClassUtility.BaseClass;
import ObjectRepositoryUtility.HomePage;
import ObjectRepositoryUtility.LoginToPage;

public class loginuserwithincorrectemailandpasswordTest extends BaseClass
{
@Test
	public void loginuserwithcorrectemailandpassword() throws Throwable {
	String Email=eLib.getDataFromExcel("Register", 1, 2);
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
	String Actual = login.getIncorrectpasswororemailtext().getText();
	String Expected2="Your email or password is incorrect!";
	Assert.assertEquals(Actual,Expected2);
	System.out.println(Actual); 
	

}
}