package tekion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Scenario8 {
	@Test
	public void testcase() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bcci.tv/international/men/rankings/test");
		String country = "Australia";
		String ele = "";

		driver.findElement(By.xpath("//li[@id='imw-international-men']/a[text()='Rankings']")).click();
		driver.findElement(By.xpath("//button[text()='Test']")).click();
		driver.findElement(By.xpath("//button[@data-format='t20']")).click();
		String cname = driver
				.findElement(By.xpath(
						"//div[@class='team-ranking-wrapper']/descendant::div[@class='d-flex rank-number']/span"))
				.getText();

		if (cname.equalsIgnoreCase(country)) {
			System.out.println(cname);
			String crating = driver.findElement(By.xpath(
					"//div[@class='team-ranking-wrapper']/descendant::td/span[text()='Rating']/following-sibling::p"))
					.getText();
			System.out.println(crating);
		} else

			ele = driver.findElement(By.xpath("//table[@class='table']/descendant::tr[*]/td/h6[text()='" + country
					+ "']/parent::td/following-sibling::td[4]")).getText();
		System.out.println(ele + " " + country);
		driver.quit();
	}

}
