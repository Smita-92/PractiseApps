package tekion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class scenario7 {
	@Test
	public void testcase() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bcci.tv/international/men/rankings/test");
		String country = "Australia";
		String rating = "";

		driver.findElement(By.xpath("//li[@id='imw-international-men']/a[text()='Rankings']")).click();
		driver.findElement(By.xpath("//button[text()='Test']")).click();
		driver.findElement(By.xpath("//a[@class='team-tab pn_tab team-tab-1--  active']")).click();
		String firstcountry = driver.findElement(By.xpath(
				"//div[@class='team-ranking-wrapper']/descendant::div[@class='d-flex rank-number']/descendant::span"))
				.getText();
		System.out.println(firstcountry);
		if (firstcountry.equalsIgnoreCase(country)) {
			String firstrank = driver.findElement(By.xpath(
					"//div[@class='team-ranking-wrapper']/descendant::table[@class='table table-bordered mb-0']/descendant::td[3]"))
					.getText();
			System.out.println(firstrank);
		} else
			rating = driver.findElement(By.xpath("//table[@class='table']/descendant::tr[*]/td/h6[text()='" + country
					+ "']/parent::td/following-sibling::td[4]")).getText();
		System.out.println(rating);
		driver.quit();

	}
}
