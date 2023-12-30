package BaseClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClassForEtsyPropertyFile {

	public WebDriver driver;
	public static FileInputStream fis;
	public static Properties p;
	
	
	@BeforeClass
	public void OpenBrowser() throws IOException {
		Reporter.log("Open The Browser...",true);
		fis=new FileInputStream("./Data./etsy.txt");
		p=new Properties();
		p.load(fis);
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		String url = p.getProperty("URL");
		driver.get(url);
	}
	
	@AfterClass
	public void CloseBrowser() throws InterruptedException {
		Reporter.log("Close The Browser...",true);
		Thread.sleep(2000);
		driver.close();
	}

}
