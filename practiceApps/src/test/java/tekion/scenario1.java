package tekion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class scenario1 {
	@Test
	public void Sample1() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.cricbuzz.com/");
		String name="Travis Head";
		driver.findElement(By.xpath("//a[text()='Rankings']")).click();
		driver.findElement(By.xpath("//a[text()='ODI']")).click();
		WebElement rating = driver.findElement(By.xpath("//div[@class='cb-col cb-col-100 cb-padding-left0']/descendant::a[text()='"+name+"']/ancestor::div[@class='cb-col cb-col-100 cb-font-14 cb-lst-itm text-center']/descendant::div[@class='cb-col cb-col-17 cb-rank-tbl pull-right']"));
		//WebElement rating = driver.findElement(By.xpath("//a[text()='"+name+"']/ancestor::div[@class='cb-col cb-col-100 cb-font-14 cb-lst-itm text-center']/descendant::div[@class='cb-col cb-col-17 cb-rank-tbl pull-right']"));
		WebElement country=driver.findElement(By.xpath("//div[@class='cb-col cb-col-100 cb-padding-left0']/descendant::div[@class='cb-col cb-col-100 cb-font-14 cb-lst-itm text-center']/descendant::a[text()='"+name+"']/following-sibling::div"));
		//WebElement country = driver.findElement(By.xpath("//a[text()='"+name+"']/parent::div[contains(@class,'c')]/child::div[contains(@class,'cb-')]"));
		System.out.println(name +" : "+rating.getText()+" : "+country.getText());
		driver.quit();
		
	}

}
