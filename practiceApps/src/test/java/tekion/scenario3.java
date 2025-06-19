package tekion;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class scenario3 {
	@Test 
	public void testcase1() throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		String country="Holy See";
	
		driver.get("https://www.worldometers.info/world-population/");	
		WebElement category = driver.findElement(By.xpath("//h2[contains(.,'How many people have ever li')]"));
	Actions a=new Actions(driver);
	a.scrollToElement(category).perform();
	for(;;) {
		try {
	 driver.findElement(By.xpath("//a[text()='"+country+"']")).click();
     break;
	}catch (Exception e) {
		WebElement nextbtn = driver.findElement(By.xpath("//button[text()='›']"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",nextbtn);
	}
	} 
	driver.quit();

}}
