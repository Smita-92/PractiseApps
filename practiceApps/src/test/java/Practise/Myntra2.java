package Practise;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Myntra2 {
	@Test
	public void sample1() {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.myntra.com/");
		String brand;
		String price = null;
		WebElement firstprod;
		driver.findElement(By.className("desktop-searchBar")).sendKeys("shoes",Keys.ENTER);
		List<WebElement> products = driver.findElements(By.xpath("//ul[@class='results-base']/li")); 
		int size = products.size();
		// if (total >= 2) {
		//for (int i = total - 2; i < total; i++)
		for(int i=1;i<=2;i++) {
			try {
				WebElement prod = products.get(i);
				brand = prod.findElement(By.className("product-productMetaInfo")).getText();
				try 
				{
					price = prod.findElement(By.className("product-discountedPrice")).getText();
				}
				 catch (Exception e)
				{
					String price2 = prod.findElement(By.className("product-price")).getText(); 
				}
				System.out.println(brand+"brand : "+price+"price : ");
			}
				catch (Exception e)
				{
					System.out.println("products not found");
				}
			}
			
		System.out.println("not enough producys");
		driver.quit();
	}

}
