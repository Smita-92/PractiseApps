package Agoda;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class sample {
@Test
public void Sample1() {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
	driver.get("https://www.agoda.com/");
	WebElement searchtext = driver.findElement(By.xpath("//input[@type='text']"));
	searchtext.sendKeys("hyderabad");
	List<WebElement> options = driver.findElements(By.xpath("//li[@class='Suggestion__categoryName_container Suggestion__showHotelImageWrapper']"));
	for(WebElement o:options) {
		System.out.println(o.getText());
	}
	driver.quit();
}
}
