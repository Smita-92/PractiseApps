package Practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Amazon {
	@Test
	public void testcase1() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.amazon.in/");
		//JavascriptExecutor js=(JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
//		Thread.sleep(1000);
//		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
//		Thread.sleep(1000);
//		js.executeScript("window.scrollBy(0,100)");
		Actions a=new Actions(driver);
		Thread.sleep(1000);
		WebElement element = driver.findElement(By.xpath("//h2[text()='See personalized recommendations']"));
		a.scrollToElement(element).perform();
	} 
	
	@Test
	public void testcase2() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.myntra.com/");
		Thread.sleep(1000);
		WebElement ele = driver.findElement(By.xpath(" //a[text()=' ONLINE SHOPPING '] "));
		JavascriptExecutor js=(JavascriptExecutor) driver;
	    js.executeScript("arguments[0].scrollIntoView(true);", ele);
	    js.executeScript("window.open()");
	   // ele.click();
		driver.quit();
	}
	

}
