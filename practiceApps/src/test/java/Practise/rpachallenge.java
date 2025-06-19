package Practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class rpachallenge {
	@Test
	public void tc1() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://rpachallenge.com/");
		driver.findElement(By.xpath("//label[text()='Last Name']"));
		driver.findElement(By.xpath("//div[@class='row']/descendant::label[text()='Last Name']"));
		//driver.findElements(By.xpath("//div[@class='jss118 jss121']/div"));
		
	}

}
