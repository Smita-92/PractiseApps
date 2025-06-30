package PractiseScripte2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ts2 {
	@Test
	public void sample1() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//span[@data-cy='closeModal']")).click();
		driver.findElement(By.xpath("//li[@data-cy='menu_Hotels']")).click();
		driver.findElement(By.xpath("//span[text()='City, Property name or Location']")).click();
		driver.findElement(By.xpath("//input[@title='Where do you want to stay?']")).click();
		driver.findElement(By.xpath("//span[text()='Goa']")).click();
		driver.findElement(By.id("checkin")).click();
		driver.findElement(By.xpath("//div[@class='DayPicker-Caption']/div[text()='June']/ancestor::div[@class='DayPicker-Month']/descendant::div[@aria-label='Fri Jun 27 2025']")).click();
		driver.findElement(By.id("checkout")).click();
		driver.findElement(By.xpath("//div[text()='July']/ancestor::div[@class='DayPicker-Month']/descendant::div[@aria-label='Thu Jul 03 2025']")).click();
        driver.findElement(By.id("guest")).click();
        driver.findElement(By.xpath("//p[text()='Room']/ancestor::div[@class='rmsGst__row']/descendant::div[@class='gstSlct']")).click();
        driver.findElement(By.xpath("//ul[@class='gstSlct__list']/li[text()='1']")).click();
        driver.findElement(By.xpath("//p[text()='Adults']/ancestor::div[@class='rmsGst__row']/descendant::div[@class='gstSlct']")).click();
        driver.findElement(By.xpath("//ul[@class='gstSlct__list']/li[text()='2']")).click();
        driver.findElement(By.xpath("//p[text()='Children']/ancestor::div[@class='rmsGst__row']/descendant::div[@class='gstSlct']")).click();

        driver.findElement(By.xpath("//ul[@class='gstSlct__list']/li[text()='1']")).click();
        driver.findElement(By.xpath("//p[text()='child']/ancestor::div[@class='slctRmGst__row']//div[@class='gstSlct']")).click();
        WebElement age = driver.findElement(By.xpath("(//ul[@class='gstSlct__list']/li[@data-cy='GuestSelect$$_323'])[14]"));
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", age);
        WebElement apply = driver.findElement(By.xpath("//button[@data-cy='RoomsGuestsNew_327']"));
        js.executeScript("arguments[0].click();", apply);
        driver.findElement(By.xpath("//button[text()='Search']")).click();
   
        List<WebElement> options = driver.findElements(By.xpath("//div[text()='Suggested For You']/parent::div[@class='filterRow ']/descendant::li"));
        for(WebElement option:options) {
        	System.out.println(option.getText());
        }

}
}