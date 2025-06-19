package ObjectRepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
	WebDriver driver;
	public SignUpPage(WebDriver driver) 
	{
		this.driver=driver;
		 PageFactory.initElements(driver,this);
}
	@FindBy(xpath = "//b[text()='Enter Account Information']")
	private WebElement EnteracntInfotext;
	@FindBy(id ="id_gender2" )
	private WebElement GenderRadioBtn;
	@FindBy(name =  "name" )
	private WebElement nameTF;
	@FindBy(xpath = "//input[@type='password']")
	private WebElement PasswordTF;
	@FindBy(id = "days")
	private WebElement DaysDropDown;
	@FindBy(xpath  = "//select[@data-qa='months']")
	private WebElement MonthsDropDown;
	public WebElement getYears() {
		return years;
	}
	@FindBy(id="years")
	private WebElement years;
	
	@FindBy(xpath = "//input[@id='newsletter']" )
	private WebElement NewsletterCheckBox;
	@FindBy(xpath = "//input[@name='optin']")
	private WebElement SpecialOfferCheckBox;
	@FindBy(xpath="//input[@data-qa='first_name']")
	private WebElement FirstNameTF;
	@FindBy(xpath="//input[@data-qa='last_name']")
	private WebElement LastNameTF;
	@FindBy(xpath="//input[@data-qa='company']")
	private WebElement CompanyTF;
	@FindBy(xpath="//input[@data-qa='address']")
	private WebElement AddressTF;
	@FindBy(xpath="//select[@id='country']")
	private WebElement CountyDropDown;
	@FindBy(xpath="//input[@data-qa='state']")
	private WebElement StateTF;
	@FindBy(xpath="//input[@data-qa='city']")
	private WebElement CityTF;
	@FindBy(xpath="//input[@data-qa='zipcode']")
	private WebElement ZipcodeTF;
	@FindBy(xpath="//input[@data-qa='mobile_number']")
	private WebElement MobNumberTF;
	@FindBy(xpath="//button[@data-qa='create-account']")
	private WebElement CreateAccountBtn;
	@FindBy(xpath="//h2[@data-qa='account-created']")
	private WebElement CreateAccounText;
	@FindBy(xpath = "//a[@href='/logout']")
	private WebElement LogoutLink;
	public WebElement getLogoutLink() {
		return LogoutLink;
	}
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getEnteracntInfotext() {
		return EnteracntInfotext;
	}
	public WebElement getGenderRadioBtn() {
		return GenderRadioBtn;
	}
	public WebElement getNameTF() {
		return nameTF;
	}
	public WebElement getPasswordTF() {
		return PasswordTF;
	}
	public WebElement getDaysDropDown() {
		return DaysDropDown;
	}
	public WebElement getMonthsDropDown() {
		return MonthsDropDown;
	}
	public WebElement getNewsletterCheckBox() {
		return NewsletterCheckBox;
	}
	public WebElement getSpecialOfferCheckBox() {
		return SpecialOfferCheckBox;
	}
	public WebElement getFirstNameTF() {
		return FirstNameTF;
	}
	public WebElement getLastNameTF() {
		return LastNameTF;
	}
	public WebElement getCompanyTF() {
		return CompanyTF;
	}
	public WebElement getAddressTF() {
		return AddressTF;
	}
	public WebElement getCountyDropDown() {
		return CountyDropDown;
	}
	public WebElement getStateTF() {
		return StateTF;
	}
	public WebElement getCityTF() {
		return CityTF;
	}
	public WebElement getZipcodeTF() {
		return ZipcodeTF;
	}
	public WebElement getMobNumberTF() {
		return MobNumberTF;
	}
	public WebElement getCreateAccountBtn() {
		return CreateAccountBtn;
	}
	public WebElement getCreateAccounText() {
		return CreateAccounText;
	}
	
	

}
