package Practise;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Flipkart2 {
	@Test
	public void testcase2() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.className("Pke_EE")).sendKeys("iphone15",Keys.ENTER);
		List<WebElement> name = driver.findElements(By.xpath("//div[@class='yKfJKb row']"));
		List<WebElement> price = driver.findElements(By.xpath("//div[@class='cN1yYO']"));
	for(int i=0;i<Math.min(name.size(), price.size());i++) {
		System.out.println(name.get(i).getText()+"prodct name"+price.get(i).getText()+"| product price");
			
		}
		
	}

}
