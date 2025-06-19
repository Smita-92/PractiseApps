package Practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testautomation {
	@Test
	public void testcase() {
		        WebDriver driver = new ChromeDriver();
		        driver.manage().window().maximize();
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		        // Step 1: Open the practice site
		        driver.get("https://testautomationpractice.blogspot.com/");

		        // Step 2: Select specific days (Monday, Wednesday, Friday)
		        String[] daysToSelect = {"Monday", "Wednesday", "Friday"};

		        for (String day : daysToSelect) {
		            try {
		                WebElement checkbox = driver.findElement(By.xpath("//label[text()='" + day + "']/preceding-sibling::input[@type='checkbox']"));
		            	//WebElement checkbox = driver.findElement(By.xpath("//label[text()='"+day+"']/parent::div[@class='form-group']/descendant::input[@class='form-check-input']"));
		                if (!checkbox.isSelected()) {
		                    checkbox.click();
		                    System.out.println(day + " checkbox clicked");
		                }
		            } catch (Exception e) {
		                System.out.println("Could not click on " + day + ": " + e.getMessage());
		            }
		        }

		        
		       driver.quit();
		        }
	}


