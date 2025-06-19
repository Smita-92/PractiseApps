package Bookmyshow;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Testcase2 {
	@Test
	public void testscase() throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://in.bookmyshow.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Bengaluru']")).click();
		Thread.sleep(1000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement search = driver.findElement(By.xpath("//span[text()='Search for Movies, Events, Plays, Sports and Activities']"));
		js.executeScript("arguments[0].click();", search);
//		WebElement input = driver.findElement(By.xpath("//input[@type='text']"));
//		js.executeScript("arguments[0].value='Ace';", input);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Ace",Keys.ENTER);
		//driver.findElement(By.xpath("//div[@class='sc-qswwm9-5 kMTVke']/descendant::div[@class='sc-qswwm9-8 fNtHgG']/descendant::div[@class='sc-1vmod7e-2 ixpVNC']")).click();
		
	}	

}
