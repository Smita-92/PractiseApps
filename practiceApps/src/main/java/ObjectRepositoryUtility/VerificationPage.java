package ObjectRepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerificationPage {
	WebDriver driver;
	public VerificationPage(WebDriver driver) 
	{
		this.driver=driver;
		 PageFactory.initElements(driver,this);
}
	@FindBy(xpath="//h2[@data-qa='account-created']")
	private WebElement AccountCreatedtext;
	@FindBy(xpath="//a[@data-qa='continue-button']")
	private WebElement ContinueBtn;
	@FindBy(xpath="//i[@class='fa fa-trash-o']")
	private WebElement DeleteAccountLink;
	@FindBy(xpath="//h2[@data-qa='account-deleted']")
	private WebElement accountDeletedText;
	@FindBy(xpath="//a[@data-qa='continue-button']")
	private WebElement Continuebtn2;
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getAccountCreatedtext() {
		return AccountCreatedtext;
	}
	public WebElement getContinueBtn() {
		return ContinueBtn;
	}
	public WebElement getDeleteAccountLink() {
		return DeleteAccountLink;
	}
	public WebElement getAccountDeletedText() {
		return accountDeletedText;
	}
	public WebElement getContinuebtn2() {
		return Continuebtn2;
	}
	
	
	

}
