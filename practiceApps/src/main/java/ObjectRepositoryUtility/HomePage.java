package ObjectRepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	public HomePage(WebDriver driver) 
	{
		this.driver=driver;
		 PageFactory.initElements(driver,this);
}
	@FindBy(xpath="//a[text()=' Home']")
	private WebElement HomeLink;
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getHomeLink() {
		return HomeLink;
	}
	
	@FindBy(xpath = "//a[contains(.,'Signup / Login')]")
	private WebElement LoginLink;
	public WebElement getLoginLink() {
		return LoginLink;
	}

}
