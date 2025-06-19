package Practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import groovyjarjarantlr4.v4.codegen.model.Action;

public class Flipkart {
	@Test
	public void Sample() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//span[text()='Electronics']")).click();
		Actions act=new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("//a[@title='Mobiles']"));
		act.moveToElement(ele).click();
		System.out.println(ele.getText());
//		String ele2 = driver.findElement(By.xpath("//a[@title='Mobiles']")).getText();
//		System.out.println(ele2);
	}

}
