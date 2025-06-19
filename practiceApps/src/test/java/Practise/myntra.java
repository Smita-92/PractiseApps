package Practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class myntra {
	@Test
	public void myntra() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.myntra.com/");
		driver.findElement(By.className("desktop-searchBar")).sendKeys("shoes",Keys.ENTER);
		WebElement html = driver.findElement(By.tagName("html"));

				//# Scroll down the page by sending the PAGE_DOWN key
				JavascriptExecutor js=(JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

				//# Wait for a few seconds to observe the scroll action
		

				//# Optionally, you can scroll up by sending the PAGE_UP key
				//html.sendKeys(Keys.PAGE_UP);
		//driver.quit();
		WebElement ele = driver.findElement(By.xpath("//h3[text()='The Souled Store']/parent::div[@class='product-productMetaInfo']/descendant::span[text()='2799'  and text()='Rs. ']"));				
	System.out.println(ele.getText());
	}

}
