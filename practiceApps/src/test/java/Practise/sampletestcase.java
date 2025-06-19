package Practise;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class sampletestcase {
	@Test
	public void testcase() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.myntra.com/");
		driver.findElement(By.className("desktop-searchBar")).sendKeys("poco mobiles",Keys.ENTER);
		for(;;) {
		try {
		WebElement nextbtn = driver.findElement(By.xpath("//li[text()='Next']"));
		  List<WebElement> total = driver.findElements(By.className("product-productMetaInfo"));
		  
		  for (WebElement ele:total) {
			if(nextbtn.isDisplayed() && nextbtn.isEnabled()) {
				nextbtn.click();
					String name = ele.getText();
					System.out.println(name);
				
			}else {
				break;
			}}}
		catch (Exception e) {		
		}
		
		driver.quit();
	
		}
}}
