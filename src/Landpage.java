import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Landpage
{
	static WebDriver driver;
	ExtentReports report;
	ExtentTest Test;

@org.testng.annotations.Test
	public void loginandTab()
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\manoj\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://nexus.partner2simplify.com.au/");
	driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("tjain");
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password");
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[1]/form/div[3]/div/div/span/button"))
	.click();

	try {
		Thread.sleep(15000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Actions ActTab=new Actions(driver);
	WebElement actTaab= driver.findElement(By.xpath("//*[@id=\"root\"]/section/section/aside/div/div/ul/li/ul/li[2]/a"));
	ActTab.doubleClick(actTaab).build().perform();
	try {
		Thread.sleep(8000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div[1]/button/i/svg/path")).click();
	
	//Actions ActTab1=new Actions (driver);
	//WebElement DDallact = driver.findElement(By.xpath("//*[@id=\"root\"]/section/section/aside/div/div/ul/li/ul/li[3]/a"));
	//ActTab1.doubleClick(DDallact).build().perform();
	
	
	

	
	
}
	

}
