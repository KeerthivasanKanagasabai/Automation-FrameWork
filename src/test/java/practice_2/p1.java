package practice_2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class p1 {
	
	@Test
	public void tc_01() throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://magento.softwaretestingboard.com/");
//		driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[3]/a")).click();
//		driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys("Demo");
//		driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys("Account");
//		driver.findElement(By.xpath("//*[@id=\"email_address\"]")).sendKeys("d47783602@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Demoaccount@30");
//		driver.findElement(By.xpath("//*[@id=\"password-confirmation\"]")).sendKeys("Demoaccount@30");
//		driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div/div[1]/button")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/a")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("d47783602@gmail.com");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//*[@id=\"pass\"])[1]")).sendKeys("Demoaccount@30");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//*[@id=\"send2\"])[1]")).click();
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("(//button[@class='action switch'])[1]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/div/ul/li[3]")).click();
//		Thread.sleep(2000);
//		driver.close();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.findElement(By.xpath("(//a[@class='level-top ui-corner-all'])[3]")).click();
		driver.findElement(By.xpath("(//li[@class='item'])[3]")).click();
		driver.findElement(By.xpath("(//a[@class='product-item-link'])[7]")).click();
		driver.findElement(By.xpath("(//div[@class='swatch-option text'])[3]")).click();
		driver.findElement(By.xpath("(//div[@class='swatch-option color'])[1]")).click();
		driver.findElement(By.xpath("//button[@class='action primary tocart']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@class='action showcart']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='action viewcart']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@class='action primary checkout'])[2]")).click();
		
		
	}

}
