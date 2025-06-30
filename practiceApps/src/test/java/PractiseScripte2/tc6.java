package PractiseScripte2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class tc6 {
@Test
public void sample1() {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.manappuram.com/gold-loan-calculator");
	JavascriptExecutor js=(JavascriptExecutor)  driver;
	js.executeScript("window.scrollBy(0,1500)");
	driver.findElement(By.xpath("//input[@id='edit-username']")).sendKeys("debasmita",Keys.ENTER);
	driver.findElement(By.id("edit-phone-number")).sendKeys("9456738809",Keys.ENTER);
	driver.findElement(By.id("edit-email"));
	driver.findElement(By.id("edit-city"));
	driver.findElement(By.id("edit-gold-weight"));
	
	
}
}
