package Practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Myntra1 {
@Test
public void sample() throws Exception {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.myntra.com/");
	String brand;
	String price = null;
	WebElement firstprod;
	driver.findElement(By.className("desktop-searchBar")).sendKeys("shoes",Keys.ENTER);
	try {
		firstprod = driver.findElement(By.xpath("//ul[@class='results-base']/li"));
		brand = firstprod.findElement(By.className("product-productMetaInfo")).getText();
	
		try {
			price = firstprod.findElement(By.className("product-discountedPrice")).getText();
		}
		 catch (Exception e) {
			String price2 = firstprod.findElement(By.className("product-price")).getText();
		 }
			System.out.println(brand+"brand : "+price+"price : ");
		
	}	
catch (Exception e) {
	System.out.println("Product is not found");
}	
}}
