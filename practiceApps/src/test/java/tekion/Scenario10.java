package tekion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Scenario10 {
	@Test
	public void tc1() {
		String sport="Archery";
		String game = "Beijing 2022";
		String category = "Men's Light Heavy (75-81kg)";

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.olympics.com/en/olympic-games/tokyo-2020");
		driver.findElement(By.xpath("//button[text()='Yes, I am happy']")).click();
		driver.findElement(By.xpath("//section[@class='sc-8d11ae9-0 eHfjfg']/descendant::a[text()='Results']")).click();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 1300)");
        driver.findElement(By.xpath("//section[@class='sc-8eb57e66-0 cBsjBO past-olympic-games']/descendant::p[text()='Boxing']")).click();
        driver.findElement(By.xpath("//button[@data-cy='game-select']")).click();
        driver.findElement(By.xpath("//div[@data-cy='game-list-wrapper']/button/child::p[text()='"+game+"']")).click();
        driver.findElement(By.xpath("//button[@data-cy='discipline-select']")).click();
        driver.findElement(By.xpath("//section[@data-cy='disciplines-list']/button/p[text()='"+sport+"']")).click();
        driver.findElement(By.xpath("//button[@data-cy='event-select']")).click();
		driver.findElement(By.xpath(
				"//div[@data-cy='inline-wizard-events']/descendant::p[contains(.,\""+category+"\")]"))
				.click();
		driver.findElement(By.xpath("//span[text()='Go']")).click();


	}

}
