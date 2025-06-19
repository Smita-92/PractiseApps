package AutomationEcercise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import BaseClassUtility.BaseClass;
import ObjectRepositoryUtility.HomePage;
import ObjectRepositoryUtility.LoginPage;
import ObjectRepositoryUtility.LoginToPage;
import ObjectRepositoryUtility.SignUpPage;

public class registeUserWithExistingEmailTest extends BaseClass{
	
@Test
	public void registeUserWithExistingEmail() throws Throwable {
	String Name=eLib.getDataFromExcel("Register", 1, 1) + jLib.randomNum();
	String Email=eLib.getDataFromExcel("Register", 3, 2);
	HomePage hm=new HomePage(driver);
	String result = hm.getHomeLink().getText();
	System.out.println(result);
	String expcted="Home";
	Assert.assertEquals(result, expcted);
	hm.getLoginLink().click();
	LoginPage lp=new LoginPage(driver);
	String Actual = lp.getNewUserText().getText();
	String epctddata="New User Signup!";
	Assert.assertEquals(Actual, epctddata);
	System.out.println(Actual);
	lp.LogintoApp(Name, Email);
	String Actual1 = lp.getEmailLreadyExistText().getText();
	String excpct="Email Address already exist!";
	Assert.assertEquals(Actual1, excpct);
	System.out.println(Actual1);

}}
