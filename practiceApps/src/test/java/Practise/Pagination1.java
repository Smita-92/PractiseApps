package Practise;



	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.NoSuchElementException;

	import java.time.Duration;
	import java.util.List;

	public class Pagination1 {

	    public static void main(String[] args) throws InterruptedException {
	        WebDriver driver = new ChromeDriver();
	            driver.manage().window().maximize();
	            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	            driver.get("https://testautomationpractice.blogspot.com/");
	            boolean found = false;
	            String expectedproductname="Laptop";
	            List<WebElement> pageNumbers = driver.findElements(By.xpath("//ul[@class='pagination']/li/a"));
	            int totalPages = pageNumbers.size();
	            for (int i = 0; i < totalPages; i++) {
	                pageNumbers.get(i).click();
	                Thread.sleep(2000);
	                List<WebElement> products = driver.findElements(By.xpath("//table[@id='productTable']/tbody/tr/td[2]"));
	                for (WebElement product : products) {
	                    String name = product.getText();
	                    if (expectedproductname.equals(name)) {
	                        System.out.println("Product found: " + name + " on page " + (i + 1));
	                        found = true;
	                        break;
	                    }
	                }

	                if (found) {
	                    break;
	                }
	            }
	            driver.quit();
	        }
	    	    
	    }
	

