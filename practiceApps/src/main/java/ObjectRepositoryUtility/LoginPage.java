package ObjectRepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver) 
	{
		this.driver=driver;
		 PageFactory.initElements(driver,this);
}
	@FindBy(xpath = "//h2[text()='New User Signup!']")
	private WebElement NewUserText;
	@FindBy(name = "name")
	private WebElement NameTF;
	@FindBy(xpath = "//input[@name='email' and @data-qa='signup-email']")
	private WebElement emailTF;
	@FindBy(xpath = "//button[text()='Signup']")

	private WebElement LoginBtn;
	
	@FindBy(xpath = "//p[text()='Email Address already exist!']") 
	private WebElement EmailLreadyExistText;
	
	
	public WebElement getEmailLreadyExistText() {
		return EmailLreadyExistText;
	}
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getNewUserText() {
		return NewUserText;
	}
	public WebElement getNameTF() {
		return NameTF;
	}
	public WebElement getEmailTF() {
		return emailTF;
	}
	public WebElement getLoginBtn() {
		return LoginBtn;
	}
	public void LogintoApp(String name,String email) {
		NameTF.sendKeys(name);
		emailTF.sendKeys(email);
		LoginBtn.click();
	}
	
	

}
