package Practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Scenario1 {
	@Test
	public void Sample1() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.cricbuzz.com/");
		String name="Shubman Gill";
		driver.findElement(By.xpath("//a[text()='Rankings']")).click();
		driver.findElement(By.xpath("//a[text()='ODI']")).click();
		WebElement rating = driver.findElement(By.xpath("//a[text()='"+name+"']/ancestor::div[@class='cb-col cb-col-100 cb-font-14 cb-lst-itm text-center']/descendant::div[@class='cb-col cb-col-17 cb-rank-tbl pull-right']"));
		System.out.println(rating.getText());
		driver.quit();
	}

}
