package Flipkart;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Testcase {
	@Test
	public void Testcase1() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement Fashion = driver.findElement(By.xpath("//span[text()='Fashion']"));
		Actions act=new Actions(driver);
		act.moveToElement(Fashion).perform();
		WebElement Footwear = driver.findElement(By.xpath("//a[text()='Women Footwear']"));
		act.moveToElement(Footwear).perform();
		WebElement womenflats = driver.findElement(By.xpath("//a[text()='Women Flats']"));
		womenflats.click();
		List<WebElement> allproducts = driver.findElements(By.xpath("//a[@title='Women Flats Sandal']"));
		int count=0;
		for(WebElement product:allproducts) {
			count++;
			System.out.println(product.getText()+" : "+count);
			
		}
		driver.findElement(By.linkText("//a[text()='Women Flats Sandal']")).click();
		
//		for( ; ; ) {
//			try {
//				
//		
//		//driver.findElement(By.xpath("//img[contains(@src,'https://rukminim2.flixcart.com/image/612/612/xif0q/sandal/r/m/d/8-vy-050-8-')]/ancestor::div[@class='_1sdMkc LFEi7Z']/descendant::a[@title='Women Flats Sandal']")).click();
//			break;
//			}catch(Exception e) {
//				WebElement nextBtn = driver.findElement(By.xpath("//span[text()='Next']"));
//				act.scrollToElement(nextBtn).perform();
//				nextBtn.click();
//				
//			}
//		
//		
//		}
		
		////img[contains(@src,'https://rukminim2.flixcart.com/image/612/612/xif0q/sandal/r/m/d/8-vy-050-8-')]/ancestor::div[@class='_1sdMkc LFEi7Z']/descendant::div[@class='syl9yP']
//		Set<String> allwind = driver.getWindowHandles();
//		String url = driver.getCurrentUrl();
//		for(String w:allwind) {
//			driver.switchTo().window(w);
//			if(driver.getCurrentUrl().contains(url)) {
//				break;
//			}
//		}
//		WebElement price = driver.findElement(By.xpath("//span[@class='VU-ZEz']/ancestor::div[@class='cPHDOP col-12-12']/descendant::div[@class='Nx9bqj CxhGGd']"));
//		System.out.println(price.getText());
//		driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ In9uk2']")).click();
		
	}	
		
	}


