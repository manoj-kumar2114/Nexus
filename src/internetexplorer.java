import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class internetexplorer 
{
	static WebDriver driver;

ExtentReports report;
ExtentTest Test;
	
	@org.testng.annotations.Test
	public void lauchexplorer()
	{
		System.setProperty("webdriver.ie.driver",
			"C:\\Users\\manoj\\Desktop\\New folder\\Internet Explorer\\IEDriverServer_Win32_3.150.1\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.get("http://nexus.partner2simplify.com.au/");
		driver.close();
		
	    
		
	}
}

