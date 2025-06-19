package BaseClassUtility;

import java.io.IOException;
import java.sql.SQLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import ObjectRepositoryUtility.HomePage;
import ObjectRepositoryUtility.LoginPage;
import genericUtility.DataBaseUtility;
import genericUtility.Excelutility;
import genericUtility.FileUtility;
import genericUtility.JavaUtility;
import webdriverutility.UtilityClassObject;
import webdriverutility.webdriverutility;




public class BaseClass {

	public DataBaseUtility dbLib = new DataBaseUtility();
	public Excelutility eLib = new Excelutility();
	public FileUtility fLib = new FileUtility();
	public JavaUtility jLib = new JavaUtility();
	public webdriverutility wbLib = new webdriverutility();
	public static WebDriver sdriver = null;
	public WebDriver driver = null;
	public ExtentSparkReporter spark;
	public ExtentReports report;

	@BeforeSuite(groups = { "smokeTest", "regessionTest" })
	public void configBS() throws SQLException, IOException {
		System.out.println(" connect to DB");
		dbLib.getDBConnection();
	}

	@Parameters("BROWSER")
	@BeforeClass(groups = { "smokeTest", "regessionTest" })
	public void configBC() throws Throwable {// String browser
		System.out.println(" launch the browser");
		// String Browser=browser;
//		String BROWSER =fLib.getDataFromPropertiesFile("Browser");
		String BROWSER = System.getProperty("browser", fLib.getDataFromPropertyFile("Browser"));
		if (BROWSER.equals("edge")) {
			driver = new EdgeDriver();

		} else if (BROWSER.equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (BROWSER.equals("chrome")) {
			driver = new ChromeDriver();
		}
		sdriver = driver;
		UtilityClassObject.SetDriver(driver);
	}

	@BeforeMethod(groups = { "smokeTest", "regessionTest" })

	public void configBM() throws Throwable {
		System.out.println(" login");
//        String URL = fLib.getDataFromPropertiesFile("Url");
//		String USERNAME = fLib.getDataFromPropertiesFile("UserName");
//		String BROWSER =fLib.getDataFromPropertiesFile("Browser");
//        String PASSWORD = fLib.getDataFromPropertiesFile("Password");

		 
		String URL = System.getProperty("url", fLib.getDataFromPropertyFile("url"));
		driver.get(URL);
	}



	@AfterClass(groups = { "smokeTest", "regessionTest" })
	public void configAC() {
		System.out.println(" close the browser");
		//driver.quit();

	}

	@AfterSuite(groups = { "smokeTest", "regessionTest" })
	public void configAS() {
		try {
			dbLib.closeDBConnection();
			System.out.println(" Close DB,Report Backup....");

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
