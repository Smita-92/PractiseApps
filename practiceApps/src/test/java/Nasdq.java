import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Nasdq {
	@Test
	public void practise(){
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.nasdaq.com/market-activity/economic-calendar");
		SearchContext getshadowhost = driver.findElement(By.xpath("//div[@class='jupiter22-economic-calendar__table']/nsdq-table-accordion")).getShadowRoot();
		List<WebElement> tablerow = getshadowhost.findElements(By.cssSelector("[role='row']"));
		for(WebElement row:tablerow) {
			String string="";
			 List<WebElement> cells = row.findElements(By.cssSelector("[role='cell']"));
			for(int i=0;i<cells.size();i++) {
				if(i==1 || i==2) {
					String celldata=cells.get(i).getText();
					string=string+"  : "+celldata;
					
				}
			}
			System.out.println(string);
		}		
	}

}
