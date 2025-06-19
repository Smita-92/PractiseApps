package tekion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class scenario4 {
	
	@Test
public void testcase1(){
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://www.cricbuzz.com/");
			String name="Noman Ali";
			driver.findElement(By.xpath("//a[text()='Rankings']")).click();
			driver.findElement(By.xpath("//a[text()='ODI']")).click();
			driver.findElement(By.xpath("//a[@title='Bowler Rankings']")).click();
			WebElement rating = driver.findElement(By.xpath("//a[text()='"+name+"']/ancestor::div[contains(@class,'cb-col cb-col-100 cb-f')]/descendant::div[contains(@class,'cb-col cb-col-17')]"));
			WebElement country = driver.findElement(By.xpath("//a[text()='"+name+"']/ancestor::div[contains(@class,'cb-col cb-col-100 cb-f')]/descendant::div[@class='cb-font-12 text-gray']"));
			System.out.println(rating.getText()+" "+country.getText()+" "+name);
			driver.quit();

}
}