package Practise;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.apache.http.HttpConnection;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class pagination2 {	
	@Test
	public void sample1() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://testautomationpractice.blogspot.com/");
		String expectedproductname = "Router";
		WebElement paginationTable = driver.findElement(By.xpath("//table[@id='productTable']"));
		Actions a=new Actions(driver);
		a.moveToElement(paginationTable).perform();
		for(;;) {
			try
			{
				Thread.sleep(1000);
			WebElement price = driver.findElement(By.xpath("//td[text()='"+expectedproductname+"']/parent::tr/td[3]"));
			System.out.println("Price : " + price.getText()+expectedproductname);
			driver.findElement(By.xpath("//td[text()='"+expectedproductname+"']/parent::tr/td[4]")).click();
			break;	
			}
				catch (Exception e)
			{
					 driver.findElement(By.xpath("//ul[@class='pagination']/li/a")).click();
					 break;
				}
	}
}
	@Test
	public void sample2() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://testautomationpractice.blogspot.com/");
		List<WebElement> allLinks = driver.findElements(By.tagName("src"));
		for(WebElement link:allLinks ) {
			String ln = link.getAttribute("img");
			try {
				URL url=new URL(ln);
				HttpURLConnection httpconn=(HttpURLConnection) url.openConnection();
				int statuscode = httpconn.getResponseCode();
				if(statuscode>400) {
					System.out.println(ln+"=======>"+statuscode);
					
				}
			}
			catch (Exception e) {
				
			}
		}
		driver.quit();
		
	}	
}