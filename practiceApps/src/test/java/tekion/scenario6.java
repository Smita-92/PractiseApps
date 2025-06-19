package tekion;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class scenario6 {
	@Test
	public void testcase() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String sports="Artistic Swimming";
		String gender="Women";
		driver.get("https://www.bbc.com/sport/olympics/paris-2024/medals");
		driver.findElement(By.xpath("//span[text()='Medal results']")).click();
		driver.findElement(By.xpath("//select[@id='discipline-selector']")).click();
        WebElement game1 = driver.findElement(By.xpath("//select[@id='discipline-selector']/option[@value='"+sports+"']"));
        game1.click();
		//driver.findElement(By.xpath("//select[@id='event-selector']")).click();
		List<WebElement> teamname = driver.findElements(By.xpath("//td[contains(@class,'ssrcss-hqk70a-St')]/descendant::div[contains(@class,'ssrcss-1xzbu')]/preceding-sibling::div"));
		//driver.quit();
		List<WebElement> countryname = driver.findElements(By.xpath("//td[contains(@class,'ssrcss-hqk70a-St')]/descendant::div[contains(@class,'ssrcss-1xzbu')]"));
		for(WebElement name:countryname) {
			System.out.println(name.getText());
			
		}
	}

}
