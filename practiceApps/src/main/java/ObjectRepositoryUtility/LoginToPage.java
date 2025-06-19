package ObjectRepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginToPage {
	WebDriver driver;
	public LoginToPage(WebDriver driver) 
	{
		this.driver=driver;
		 PageFactory.initElements(driver,this);
}
	@FindBy(xpath  = "//div[@class='login-form']/h2")
	private WebElement LoginToAccountText;
	public WebElement getLoginToAccountText() {
		return LoginToAccountText;
	}
	@FindBy(xpath = "//input[@data-qa='login-email']")
	private WebElement EmailAdressTF;
	@FindBy(xpath  = "//input[@data-qa='login-password']")
	private WebElement PasswordText;
	@FindBy(xpath = "//button[@data-qa='login-button']")
	private WebElement LoginBtn;
	@FindBy(xpath = "//a[contains(.,'Logged in as')]/b")
	private WebElement LogedinAsText;
	@FindBy(xpath = "//p[text()='Your email or password is incorrect!']")
	private WebElement incorrectpasswororemailtext;
	
	public WebElement getLogedinAsText() {
		return LogedinAsText;
	}

	public WebElement getEmailAdressTF() {
		return EmailAdressTF;
	}
	public WebElement getPasswordText() {
		return PasswordText;
	}
	public WebElement getLoginBtn() {
		return LoginBtn;
	}
	
	public WebElement getIncorrectpasswororemailtext() {
		return incorrectpasswororemailtext;
	}

	public void logintoApp(String email,String Pssword) {
		EmailAdressTF.sendKeys(email);
		PasswordText.sendKeys(Pssword);
		LoginBtn.click();
		
	}
	
	

}
