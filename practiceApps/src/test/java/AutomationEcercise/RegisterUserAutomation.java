package AutomationEcercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import BaseClassUtility.BaseClass;
import ObjectRepositoryUtility.HomePage;
import ObjectRepositoryUtility.LoginPage;
import ObjectRepositoryUtility.SignUpPage;
import ObjectRepositoryUtility.VerificationPage;
import genericUtility.Excelutility;
import genericUtility.FileUtility;

public class RegisterUserAutomation extends BaseClass {
	@Test
	public void registerUser() throws Throwable {
		String Name=eLib.getDataFromExcel("Register", 1, 1) + jLib.randomNum();
		String Email=eLib.getDataFromExcel("Register", 1, 2)+jLib.randomNum();
		String Password=eLib.getDataFromExcel("Register", 1, 3);
		String FirstName=eLib.getDataFromExcel("Register", 1, 4);
		String LastName=eLib.getDataFromExcel("Register", 1, 5);
		String Company=eLib.getDataFromExcel("Register", 1, 6);
		String Address=eLib.getDataFromExcel("Register", 1, 7);
		String State=eLib.getDataFromExcel("Register", 1, 8);
		String City=eLib.getDataFromExcel("Register", 1, 9);
		String Zipcode=eLib.getDataFromExcel("Register", 1, 10);
		String MobNumber=eLib.getDataFromExcel("Register", 1, 11);
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
		SignUpPage signup=new SignUpPage(driver);
		String data2=signup.getEnteracntInfotext().getText();
		System.out.println(data2);
		String expe2="ENTER ACCOUNT INFORMATION";
		Assert.assertEquals(data2, expe2);
		signup.getGenderRadioBtn().click();
		signup.getPasswordTF().sendKeys(Password);
		WebElement days = signup.getDaysDropDown();
		Select s=new Select(days);
		s.selectByValue("4");
		WebElement month = signup.getMonthsDropDown();
		Select s1=new Select(month);
		s1.selectByVisibleText("March");
		WebElement year = signup.getYears();
		Select s2=new Select(year);
		s2.selectByVisibleText("1996");
		signup.getNewsletterCheckBox().click();
		signup.getSpecialOfferCheckBox().click();
		signup.getFirstNameTF().sendKeys(FirstName);
		signup.getLastNameTF().sendKeys(LastName);
		signup.getCompanyTF().sendKeys(Company);
		signup.getAddressTF().sendKeys(Address);
		WebElement country = signup.getCountyDropDown();
		Select s3=new Select(country);
		s3.selectByVisibleText("India");
		signup.getStateTF().sendKeys(State);
		signup.getCityTF().sendKeys(City);
		signup.getZipcodeTF().sendKeys(Zipcode);
		signup.getMobNumberTF().sendKeys(MobNumber);
		signup.getCreateAccountBtn().click();
		VerificationPage vp=new VerificationPage(driver);
		String message = vp.getAccountCreatedtext().getText() ;
		System.out.println(message);
		String messageExpct="ACCOUNT CREATED!";
		Assert.assertEquals(message, messageExpct);
		vp.getContinueBtn().click();
		vp.getDeleteAccountLink().click();
		String acntdlte = vp.getAccountDeletedText().getText();
		System.out.println(acntdlte);
		String xpctacntdlte="ACCOUNT DELETED!";
		Assert.assertEquals(acntdlte, xpctacntdlte);
		vp.getContinuebtn2().click();
		
		
		
		
		
		
	}

}
