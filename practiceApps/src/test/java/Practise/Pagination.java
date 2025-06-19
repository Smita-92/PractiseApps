package Practise;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Pagination {
 @Test
 public void sample() {
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 driver.get("https://testautomationpractice.blogspot.com/");
	 //String name="Router";
	 boolean flag=false;
	WebElement webtable = driver.findElement(By.id("productTable"));
	 Actions a=new Actions(driver);
	 a.scrollToElement(webtable).perform();
	 while(flag==false) {
	List<WebElement> prdname = driver.findElements(By.xpath("//table[@id='productTable']/tbody/tr/td[2]"));
	for(WebElement n:prdname) {
		String nm = n.getText();
		if(nm.equals("Router")) {
			System.out.println(nm);
			flag=true;

			}}
		if(flag==false) {
			 driver.findElement(By.xpath("//ul[@class='pagination']/li")).click();

		
	
 }}
	 }}

