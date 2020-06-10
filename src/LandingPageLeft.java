import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class LandingPageLeft {
	static WebDriver driver;
	ExtentReports report;
	ExtentTest Test;

	@BeforeClass
	public void Pathsetup() {
		report = new ExtentReports("C:\\Users\\manoj\\Desktop\\New folder\\Report\\Vaibhav\\LandPageReport.html");

	}
	
	@BeforeMethod
	public void landPage() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\manoj\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://nexus.partner2simplify.com.au/");
		driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("tjain");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[1]/form/div[3]/div/div/span/button"))
		.click();

		Thread.sleep(15000);

		

	}
	
	
	@Test (priority=1)
	public void LeftMenubar() throws InterruptedException 
	{
		Actions ActTab=new Actions(driver);
		WebElement actTaab= driver.findElement(By.xpath("//*[@id=\"root\"]/section/section/aside/div/div/ul/li/ul/li[2]/a"));
		ActTab.doubleClick(actTaab).build().perform();
		Thread.sleep(7000);
			
	}
	
	@Test (priority=2)
	public void Allactivities() throws InterruptedException
	{
		Actions ActTab1=new Actions (driver);
		WebElement DDallact = driver.findElement(By.xpath("//*[@id=\"root\"]/section/section/aside/div/div/ul/li/ul/li[3]/a"));
		ActTab1.doubleClick(DDallact).build().perform();
		Thread.sleep(7000);
			
		
	}
	
	@Test (priority =3)
	public void catalogue() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\"root\"]/section/section/aside/div/div/ul/li/ul/li[4]/a")).click();
		Thread.sleep(7000);
		
	}
	
	@Test (priority =4)
	public void priceworkflow() throws InterruptedException 
	{
		driver.findElement(By.xpath("//*[@id=\"root\"]/section/section/aside/div/div/ul/li/ul/li[5]/a")).click();
		Thread.sleep(7000);
	}
	
	@Test (priority =5)
	public void logout() 
	{
		driver.findElement(By.xpath("//*[@id=\"root\"]/section/section/aside/div/div/ul/li/ul/li[6]/div")).click();
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("/html/body/div[10]/div/div[2]/div/div[2]/div[3]/button[2]")).click();
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	
	@AfterMethod
	public void closeweb() 
	{
		driver.close();
		
	}

}
