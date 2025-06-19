import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class shadowroot_open {
@Test 
public void openshadowroot() {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demoapps.qspiders.com/ui/shadow/closed?sublist=1");
	driver.findElement(By.xpath("//h1[text()='Login']")).click();
	Actions act=new Actions(driver);
	act.sendKeys(Keys.TAB).perform();
	act.sendKeys("debasmita").perform();
	act.sendKeys(Keys.TAB).perform();
	act.sendKeys("debasmita").perform();
	driver.findElement(By.xpath("//button[text()='Login']")).click();
	driver.quit();
	
}

@Test
public void closeshadowroot() {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demoapps.qspiders.com/ui/shadow/closed?sublist=0");
	
}
}
