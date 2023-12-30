package BaseClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClassForLumaPropertyFile {
	public WebDriver driver;
	public FileInputStream fis;
	public Properties p;
	
	
	@BeforeMethod
	public void OpenBrowser() throws IOException {
		
		fis=new FileInputStream("./Data./luma.txt");
		p=new Properties();
		p.load(fis);
		driver=new ChromeDriver();
		Reporter.log("**************************************************************************",true);
		Reporter.log("Open The Browser...",true);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		String url = p.getProperty("URL");
		driver.get(url);
	}
	
	@AfterMethod
	public void CloseBrowser() throws InterruptedException {
		Reporter.log("Close The Browser...",true);
		Reporter.log("**************************************************************************",true);
		Thread.sleep(2000);
		driver.close();
	}
}
