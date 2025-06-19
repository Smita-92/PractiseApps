package Practise;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testcase1 {
	@Test
	public void testcase() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.phptravels.net/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Flights']")).click();
		driver.findElement(By.xpath("//input[@class='form-control ct ff']")).sendKeys("BLR");
		WebElement from = driver.findElement(By.xpath("//input[@class='form-control ct ff']"));
		String afrom=from.getText();
		driver.findElement(By.xpath("//input[@class='form-control ct px-md-3 ft']")).sendKeys("COS");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='flights-search']")).click();
		driver.findElement(By.xpath("//input[@id='oneway_flights_2']")).click();
		WebElement eve = driver.findElement(By.xpath("//input[@id='departure-evening']"));
		Actions act = new Actions(driver);
		act.scrollToElement(eve).perform();
		eve.click();
		List<WebElement> eles = driver.findElements(By.xpath("//div[@class='row p-3 pb-2']"));
		List<WebElement> name = driver
				.findElements(By.xpath("//div[@class='text-start mb-3 mb-md-0 col-md-4 overflow-hidden lh-20']"));
		for (WebElement ele : eles) {
			System.out.println(ele.getText());

		}
		List<WebElement> names = driver.findElements(By.xpath("//div[@class='row p-3 pb-2']"));
		for(WebElement n:names) {
			System.out.println("NAMES ="+"  "+n.getText());
			
		}
		WebElement text = driver.findElement(By.xpath("//small[@ng-show='total > 0']"));
		String actual = text.getText().trim();
		System.out.println("HEADER : "+" "+actual);
		String expected = "7  Flights Found  ";
		//Assert.assertTrue(actual.contains(expected));
		driver.quit();

	}

}
