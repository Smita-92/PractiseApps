package Practise;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import excelutility.excelutility;

public class PractiseAmazon {
	@Test
	public void testcase1() throws IOException, Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in/");
		//driver.findElement(By.xpath("//button[text()='Continue shopping']")).click();
		int rowindex=0;
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobile",Keys.ENTER);
		boolean flag=true;
		while(flag) {
		for(int i=0;i<4;i++) {
			
			List<WebElement> products = driver.findElements(By.xpath("//h2[@class='a-size-medium a-spacing-none a-color-base a-text-normal']"));
			for(WebElement prod:products) {
				System.out.println(prod.getText()+ " "+"PRODUCT NAMES");
				String prdname=prod.getText();
				excelutility excel=new excelutility();
				excel.setDataIntoExcel("Sheet5", 0, 0,prdname);
				flag=false;
			
			}
			
			if(flag)
			{
				driver.findElement(By.xpath("//a[text()='Next']")).click();
			}}}
		driver.quit();

		}
		
		
	}


