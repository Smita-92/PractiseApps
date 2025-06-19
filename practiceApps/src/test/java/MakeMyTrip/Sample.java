package MakeMyTrip;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sample {
	@Test
	public void testcase() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//span[@data-cy='closeModal']")).click();
		driver.findElement(By.xpath("//span[@class='chNavIcon appendBottom2 chSprite chBuses inactive']")).click();
		driver.findElement(By.xpath("//label[@for='fromCity']")).click();
		driver.findElement(By.xpath("//label[@for='fromCity']")).sendKeys("Banglore");
		driver.findElement(By.xpath("//span[text()='Bangalore, Karnataka']")).click();
		//driver.findElement(By.xpath("//label[@for='toCity']")).click();
		//driver.findElement(By.xpath("//label[@for='toCity']")).sendKeys("Manglore");
		//driver.findElement(By.xpath("//span[text()='Mangaluru (Mangalore), Karnataka']")).click();
        SimpleDateFormat format1=new SimpleDateFormat("yyyy-MMM-dd");
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_MONTH,5);
        String[] reqdate = format1.format(cal.getTime()).split(",");
		System.out.println(cal);
		driver.findElement(By.xpath("//input[@id='travelDate']")).click();
		driver.findElement(By.xpath("//div[text()='March 2025']/ancestor::div[@class='DayPicker-Month']/descendant::div[text()='14a']"));
		driver.findElement(By.xpath("//button[text()='Search']")).click();
		driver.findElement(By.xpath("//span[text()='AC']")).click();
		driver.findElement(By.xpath("//span[text()='Sleeper']")).click();
		
		
	}

}
