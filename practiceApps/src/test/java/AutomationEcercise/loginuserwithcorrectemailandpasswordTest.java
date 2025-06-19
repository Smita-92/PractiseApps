package AutomationEcercise;

import org.testng.Assert;
import org.testng.annotations.Test;

import BaseClassUtility.BaseClass;
import ObjectRepositoryUtility.HomePage;
import ObjectRepositoryUtility.LoginPage;
import ObjectRepositoryUtility.LoginToPage;
import ObjectRepositoryUtility.VerificationPage;

public class loginuserwithcorrectemailandpasswordTest extends BaseClass {
	@Test
	public void loginuserwithcorrectemailandpassword() throws Throwable {
		String Email=eLib.getDataFromExcel("Register", 2, 2);
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
		String Actual = login.getLogedinAsText().getText();
		String Expected2=Name;
		Assert.assertEquals(Actual,Expected2);
		System.out.println(Actual);
		VerificationPage vp=new VerificationPage(driver);
		vp.getDeleteAccountLink().click();
		String acntdlte = vp.getAccountDeletedText().getText();
		System.out.println(acntdlte);
		String xpctacntdlte="ACCOUNT DELETED!";
		Assert.assertEquals(acntdlte, xpctacntdlte);
		
		
		
	}

}
