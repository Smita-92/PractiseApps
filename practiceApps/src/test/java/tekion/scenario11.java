package tekion;

import java.awt.Window;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import org.testng.annotations.Test;

public class scenario11 {
	@Test

	public void testcase1() throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://www.worldometers.info/world-population/#growthrate");

		List<WebElement> data = driver.findElements(By.xpath(
				"//*[name()='g' and @clip-path='url(https://www.worldometers.info/world-population/#_ABSTRACT_RENDERER_ID_6)']//*[name()='rect']"));
		for (WebElement ele : data) {
			Actions act = new Actions(driver);
			act.moveToElement(ele).perform();
			WebElement data1 = driver
					.findElement(By.xpath("//*[name()='g' and @class='google-visualization-tooltip']"));
			System.out.println(data1.getText());
		}
	}

}
