package Practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class google {
	@Test
	public  void practise() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).click();
		List<WebElement> elements = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
		for(int i=0;i<elements.size();i++) {
			System.out.println(elements.get(0).getText());
			break;
		}
	}

}
