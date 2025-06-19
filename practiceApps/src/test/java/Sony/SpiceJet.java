package Sony;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SpiceJet {
	@Test
	public void test1() throws InterruptedException {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("//div[text()='round trip']")).click();
		driver.findElement(By.xpath("//div[text()='From']/ancestor::div[@data-testid='to-testID-origin']/descendant::input")).sendKeys("Beng");
		driver.findElement(By.xpath("//div[text()='To']/ancestor::div[@data-testid='to-testID-destination']/descendant::input")).sendKeys("del");
		driver.findElement(By.xpath("//div[@data-testid='undefined-month-March-2025']/descendant::div[text()='7']")).click();
		driver.findElement(By.xpath("//div[@data-testid='undefined-month-April-2025']/descendant::div[text()='11']")).click();
		driver.findElement(By.xpath("//div[contains(@class,'css-1dbjc4n r-1awozwy r-z2wwpe r-1')]")).click();
		WebElement text1 = driver.findElement(By.xpath("//div[@class='css-76zvg2 r-homxoj r-1hfyk0a']"));
		String text=text1.getText();
		System.out.println(text);
		String RoundTrip="Bengaluru to Delhi";
		String DepartDate="Fri, 07 Mar 2025";
		String ReturnDate="Fri, 11 Apr 2025";
		Assert.assertTrue(text.contains(RoundTrip));
		Assert.assertTrue(text.contains(DepartDate));
		Assert.assertTrue(text.contains(ReturnDate));
		List<WebElement> allprice = driver.findElements(By.xpath("//div[@id='list-results-section-0']/descendant::div[@class='css-1dbjc4n r-1awozwy r-1sgu7fw r-1ljd8xs r-1phboty r-1777fci r-e9bn0q' and not(contains(.,'N/A'))]"));
		for(WebElement price:allprice) {
			System.out.println(price.getText());
		}
		
	}

}

