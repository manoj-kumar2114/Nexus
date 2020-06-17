import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Authentication {
	static WebDriver driver;
	ExtentReports report;
	ExtentTest Test;

	@BeforeClass
	public void setpat() {
		report = new ExtentReports("C:\\Users\\manoj\\Desktop\\New folder\\Report\\Vaibhav\\Report.html");

	}

	@BeforeMethod
	public void LaunchURL() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\manoj\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://nexus.partner2simplify.com.au/");

		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@org.testng.annotations.Test(priority = 1)
	public void invalidcredentials() {
		Test = report.startTest("Login with invalid credentials");
		driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("tjain");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("pass");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[1]/form/div[3]/div/div/span/button"))
				.click();
		Test.log(LogStatus.FAIL, "Invalid User Name and Password");
		report.endTest(Test);

		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@org.testng.annotations.Test(priority = 2)
	public void Authentication() {
		Test = report.startTest("Login with Valid Credentials ");
		driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("tjain");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[1]/form/div[3]/div/div/span/button"))
				.click();
		Test.log(LogStatus.PASS, "Log in Sucessfull");
		report.endTest(Test);

		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	

	@AfterMethod
	public void close() {
		driver.close();

	}

	@AfterClass
	public void extentreportend() {
		report.flush();

	}

}
