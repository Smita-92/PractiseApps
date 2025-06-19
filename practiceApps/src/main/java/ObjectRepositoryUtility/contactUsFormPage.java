package ObjectRepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class contactUsFormPage {
	WebDriver driver;
	public void contactUsForm() {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//input[@data-qa='name']")
	private WebElement nameTextField;
	
	@FindBy(xpath = "//input[@data-qa='email']")
	private WebElement emailTextField;
	
	@FindBy(xpath = "//input[@data-qa='subject']")
	private WebElement SubjectTextField;
	
	@FindBy(xpath ="//textarea[@data-qa='message']") 
    private WebElement messagedTextField;
	
	@FindBy(xpath = "//input[@type='file']")
	private WebElement ChooseFileBtn;
	
	@FindBy(xpath = "//input[@data-qa='submit-button']")
	private WebElement SubmitBtn;
	public WebElement getNameTextField() {
		return nameTextField;
	}

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getSubjectTextField() {
		return SubjectTextField;
	}

	public WebElement getMessagedTextField() {
		return messagedTextField;
	}

	public WebElement getChooseFileBtn() {
		return ChooseFileBtn;
	}

	public WebElement getSubmitBtn() {
		return SubmitBtn;
	}
	
	
	

}
