package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Practise {
	@Test
	public void sample() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		String week="Tuesday";
		driver.findElement(By.xpath("//label[text()='"+week+"']")).click();
		
		
	}

}
