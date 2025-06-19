package AutomationEcercise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Registeruser {
	@Test
	public void registeruser() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.get("http://automationexercise.com");
		Thread.sleep(1000);
		String result = driver.findElement(By.xpath("//a[text()=' Home']")).getText();
		System.out.println(result);
		String expcted="Home";
		Assert.assertEquals(result, expcted);
		driver.findElement(By.xpath("//a[text()=' Signup / Login']")).click();
		Thread.sleep(1000);
		String newusersignup = driver.findElement(By.xpath("//h2[text()='New User Signup!']")).getText();
		String actdata="New User Signup!";
		Assert.assertEquals(newusersignup, actdata);
		System.out.println(newusersignup);
		driver.findElement(By.name("name")).sendKeys("debasmita");
		driver.findElement(By.xpath("//input[@name='email' and @data-qa='signup-email']")).sendKeys("debasmita1215@gmail.com");
		driver.findElement(By.xpath("//button[text()='Signup']")).click();
		Thread.sleep(1000);
		String data2=driver.findElement(By.xpath("//b[text()='Enter Account Information']")).getText();
		System.out.println(data2);
		String expe2="ENTER ACCOUNT INFORMATION";
		Assert.assertEquals(data2, expe2);
		driver.findElement(By.id("id_gender2")).click();
		driver.findElement(By.name("name")).clear();
		driver.findElement(By.name("name")).sendKeys("debasmita");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("debasmita1234@gmail");
		WebElement days = driver.findElement(By.id("days"));
		Select s=new Select(days);
		s.selectByValue("4");
		WebElement month = driver.findElement(By.xpath("//select[@data-qa='months']"));
		Select s1=new Select(month);
		s1.selectByVisibleText("March");
		WebElement year = driver.findElement(By.id("years"));
		Select s2=new Select(year);
		s2.selectByVisibleText("1996");
		driver.findElement(By.xpath("//input[@id='newsletter']")).click();
		driver.findElement(By.xpath("//input[@name='optin']")).click();
		driver.findElement(By.xpath("//input[@data-qa='first_name']")).sendKeys("Debasmita");
		driver.findElement(By.xpath("//input[@data-qa='last_name']")).sendKeys("Behera");
		driver.findElement(By.xpath("//input[@data-qa='company']")).sendKeys("hddd");
		driver.findElement(By.xpath("//input[@data-qa='address']")).sendKeys("Banglore");
		WebElement country = driver.findElement(By.xpath("//select[@id='country']"));
		Select s3=new Select(country);
		s3.selectByVisibleText("India");
		driver.findElement(By.xpath("//input[@data-qa='state']")).sendKeys("Karnataka");
		driver.findElement(By.xpath("//input[@data-qa='city']")).sendKeys("Banglore");
		driver.findElement(By.xpath("//input[@data-qa='zipcode']")).sendKeys("76980");
		driver.findElement(By.xpath("//input[@data-qa='mobile_number']")).sendKeys("7978080846");
		driver.findElement(By.xpath("//button[@data-qa='create-account']")).click();
		String message = driver.findElement(By.xpath("//h2[@data-qa='account-created']")).getText();
		System.out.println(message);
		String messageExpct="ACCOUNT CREATED!";
		Assert.assertEquals(message, messageExpct);
		driver.findElement(By.xpath("//a[@data-qa='continue-button']")).click();
		driver.findElement(By.xpath("//i[@class='fa fa-trash-o']")).click();
		String acntdlte = driver.findElement(By.xpath("//h2[@data-qa='account-deleted']")).getText();
		System.out.println(acntdlte);
		String xpctacntdlte="ACCOUNT DELETED!";
		Assert.assertEquals(acntdlte, xpctacntdlte);
		driver.findElement(By.xpath("//a[@data-qa='continue-button']")).click();
		driver.quit();
		
	}

}
