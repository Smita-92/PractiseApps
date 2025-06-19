package tekion;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class scenario5 {
	@Test
	public void testcase() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String country="India";
		String field="Food & Agriculture";
		driver.get("https://www.worldometers.info/food-agriculture/india-food-agriculture/");
		driver.findElement(By.xpath("//button[@id='header-nav-more-trigger']")).click();
		driver.findElement(By.xpath("//div[@id='header-nav-more']/descendant::a[text()='"+field+"']")).click();
		driver.findElement(By.xpath("//a[text()='"+country+"']")).click();
		//driver.findElement(By.xpath("//*[name()='g']//*[name()='path' and @class='highcharts-halo highcharts-color-undefined']"));
		WebElement name = driver.findElement(By.xpath("//div[@class='flex flex-col gap-2 mb-2 w-full']/child::div[contains(text(),' people')]/child::strong"));
		System.out.println(name.getText());
		List<WebElement> datas = driver.findElements(By.xpath("(//*[name()='g' and @class='highcharts-markers highcharts-series-0 highcharts-spline-series highcharts-tracker'])[1]/*"));
		for(WebElement data:datas) {
			Actions a=new Actions(driver);
			a.moveToElement(data).perform();
		WebElement text = driver.findElement(By.xpath("//*[name()='g' and @class='highcharts-label highcharts-tooltip highcharts-color-undefined']"));
		System.out.println(text.getText());
		//driver.quit();
	

}}}
