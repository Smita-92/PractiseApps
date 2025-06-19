package Practise;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class flipkart1  {
	// TODO Auto-generated constructor stub
@Test
public void sample() {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//span[text()='Fashion']")).click();
	Actions a=new Actions(driver);
	WebElement ele1 = driver.findElement(By.linkText("Women Ethnic"));
	a.moveToElement(ele1).perform();
	driver.findElement(By.linkText("Women Sarees")).click();
	List<WebElement> eles = driver.findElements(By.xpath("//a[@class='x6h4az']"));
	int index=eles.size();
	for(int i=0;i<1;i++) {
		WebElement ele = eles.get(i);
	    System.out.println("FIRST PRODUCT"+ele.getText());
		String name = ele.findElement(By.xpath("//div[@class='ZHvV68']")).getText();
		System.out.println("NAME"+name+i);
		}
	driver.quit();
}

}
