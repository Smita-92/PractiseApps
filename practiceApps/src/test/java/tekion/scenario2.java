package tekion;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class scenario2 {
	@Test
	public void sample() throws InterruptedException {

		String pname = "Rogelio ROMERO TORRES";
		String category = "Men's Light Heavy (75-81kg)";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.olympics.com/en/olympic-games/tokyo-2020");
		driver.findElement(By.xpath("//button[text()='Yes, I am happy']")).click();
		driver.findElement(By.xpath("//section[@class='sc-8d11ae9-0 eHfjfg']/descendant::a[text()='Results']")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 1300)");
		driver.findElement(
				By.xpath("//section[@class='sc-8eb57e66-0 cBsjBO past-olympic-games']/descendant::p[text()='Boxing']"))
				.click();

		driver.findElement(By.xpath("//button[@data-cy='event-select']")).click();
		driver.findElement(
				By.xpath("//div[@data-cy='inline-wizard-events']/descendant::p[contains(.,\"" + category + "\")]"))
				.click();
		driver.findElement(By.xpath("//span[text()='Go']")).click();
		WebElement countryname = driver
				.findElement(By.xpath("//div[@data-cy='table-content']/descendant::div/h3[text()='" + pname
						+ "']/ancestor::div[@class='sc-4ffa8ad5-11 sc-62f3057c-0 dLpUAr ivOwjn']/descendant::span[@class='sc-3431cf63-1 dhvwRN']"));
		System.out.println(countryname.getText() + " " + pname);
        driver.quit();
	}

}
