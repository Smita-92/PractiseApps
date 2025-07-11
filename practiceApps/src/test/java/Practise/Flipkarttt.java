package Practise;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Flipkarttt {
	@Test
	public void sample() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		 String url = driver.getCurrentUrl();
		driver.findElement(By.xpath("//span[text()='Electronics']")).click();
		WebElement ele = driver.findElement(By.xpath("//a[text()='Electronics GST Store']"));
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
		ele.click();
		driver.findElement(By.xpath("//span[text()='Electronics']")).click();
		WebElement ele2 = driver.findElement(By.xpath("//a[text()='Realme']"));
		act.moveToElement(ele2).perform();
		ele2.click();
		WebElement name = driver.findElement(By.xpath("//div[text()='realme C61 (Safari Green, 128 GB)']"));
		name.click();
		WebElement price = driver.findElement(By.xpath("//div[text()='realme C61 (Safari Green, 128 GB)']/ancestor::div[@class='yKfJKb row']/descendant::div[@class='Nx9bqj _4b5DiR']"));
		System.out.println(price.getText()+" : "+name.getText());
		String actualname=name.getText();
	    Assert.assertTrue(actualname.contains("realme C61"));
	    Set<String> allids = driver.getWindowHandles();
	    for(String id:allids) {
	    	driver.switchTo().window(id);
	    	if(driver.getCurrentUrl().contains(url));
	    	break;	
	    }
		Thread.sleep(8000);
		driver.quit();
		
		
	}

}
