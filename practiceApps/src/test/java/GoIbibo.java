import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class GoIbibo {
	@Test
	public void sample() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.goibibo.com/");
		driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
		driver.findElement(By.xpath("//span[text()='From']")).click();
		driver.switchTo().activeElement().sendKeys("Banglore", Keys.ENTER);
		driver.findElement(By.xpath("//p[text()='Bengaluru International Airport']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Odisha");
		driver.findElement(By.xpath("//p[text()='Biju Patnaik International Airport']")).click();
		driver.findElement(By.xpath("//span[@class='sc-12foipm-8 eXKWBG fswDownArrow']")).click();
		String Month = "March 2025";
		int Date = 15;
		driver.findElement(By.xpath("(//div[@class='DayPicker-Month']/descendant::div[text()='" + Month
				+ "'])/ancestor::div[@class='DayPicker-Month']/descendant::div[@class='DayPicker-Day']/p[text()='"
				+ Date + "']")).click();

		driver.findElement(By.xpath("//span[@class='sc-12foipm-8 eXKWBG fswDownArrow fswDownArrowTraveller']")).click();
		driver.findElement(By.xpath("//p[text()='Children']")).click();
		driver.findElement(By.xpath(
				"//p[text()='Children']/parent::div[@class='sc-12foipm-47 pZQPB']/descendant::span[@class='sc-12foipm-51 kZvHQU']/following-sibling::span[@class='sc-12foipm-51 kZvHQU']"))
				.click();
		driver.findElement(By.xpath("//span[text()='SEARCH FLIGHTS']")).click();

	}
}
