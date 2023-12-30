package practice_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class p2 {

	@Test
	public void tc() throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/");
		driver.findElement(By.xpath("(//li[@class='authorization-link'])[1]")).click();
		WebElement em = driver.findElement(By.xpath("//input[@id='email']"));
		em.sendKeys("d47783602@gmail.com");
		WebElement pass = driver.findElement(By.xpath("(//input[@id='pass'])[1]"));
		pass.sendKeys("Demoaccount@30");
		driver.findElement(By.xpath("//button[@class='action login primary']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[@class='level-top ui-corner-all'])[3]")).click();
		driver.findElement(By.xpath("(//li[@class='item'])[3]")).click();
		driver.findElement(By.xpath("(//a[@class='product-item-link'])[7]")).click();
		
		driver.findElement(By.xpath("//a[@id='tab-label-description-title']")).click();
		String d = driver.findElement(By.xpath("//div[@id='description']")).getText();
		Reporter.log("Details---> "+d,true);
		
		driver.findElement(By.xpath("//a[@id='tab-label-additional-title']")).click();
		WebElement details = driver.findElement(By.xpath("//div[@id='additional']"));
		String text = details.getText();
		Reporter.log("More Information--> "+text,true);
		

		// driver.close();

	}
}

/**
 * kenobi trail jacket present in jacket sub module present in men module code
 * driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[4]/div[2]/div[2]/div/ul[1]/li[2]/a")).click();
 * Thread.sleep(2000);
 * 
 * driver.findElement(By.xpath("(//a[@class='product-item-link'])[9]")).click();
 * Thread.sleep(2000); driver.findElement(By.xpath("(//div[@class='swatch-option
 * text'])[2]")).click();
 * driver.findElement(By.xpath("(//div[@class='swatch-option
 * color'])[1]")).click(); WebElement qty =
 * driver.findElement(By.xpath("//input[@id='qty']")); qty.clear();
 * qty.sendKeys("2"); Thread.sleep(2000);
 * driver.findElement(By.xpath("//button[@title='Add to Cart']")).click();
 * Thread.sleep(2000); driver.findElement(By.xpath("//a[@class='action
 * showcart']")).click(); Thread.sleep(2000);
 * 
 * WebElement price =
 * driver.findElement(By.xpath("(//span[@class='price'])[2]")); String p =
 * price.getText(); System.out.println("Before Adding Quantity---> "+p);
 * Thread.sleep(2000);
 * 
 * WebElement pric =
 * driver.findElement(By.xpath("(//span[@class='price'])[1]")); String p1 =
 * pric.getText(); System.out.println("After Adding Quantity---> "+p1);
 * 
 * Thread.sleep(2000); driver.findElement(By.xpath("//a[@class='action
 * viewcart']")).click();
 * 
 * Thread.sleep(2000); driver.findElement(By.xpath("(//a[@title='Remove
 * item'])[2]")).click();
 * 
 * Thread.sleep(2000); driver.findElement(By.xpath("//a[.='here']")).click();
 */

/**
 * Strike Endurance Tee in Tees
 * driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[4]/div[2]/div[2]/div/ul[1]/li[3]/a")).click();
 * Thread.sleep(2000); System.out.println(driver.getTitle());
 * Thread.sleep(2000);
 * driver.findElement(By.xpath("(//a[@class='product-item-link'])[1]")).click();
 * Thread.sleep(2000); driver.findElement(By.xpath("(//div[@class='swatch-option
 * text'])[1]")).click();
 * driver.findElement(By.xpath("(//div[@class='swatch-option
 * color'])[3]")).click();
 * 
 * WebElement qty = driver.findElement(By.xpath("//input[@id='qty']"));
 * qty.clear(); qty.sendKeys("2"); Thread.sleep(2000);
 * driver.findElement(By.xpath("//button[@title='Add to Cart']")).click();
 * Thread.sleep(3000); driver.findElement(By.xpath("//a[@class='action
 * showcart']")).click(); Thread.sleep(2000);
 * 
 * WebElement price =
 * driver.findElement(By.xpath("(//span[@class='price'])[2]")); String p =
 * price.getText(); System.out.println("Before Adding Quantity---> "+p);
 * Thread.sleep(2000);
 * 
 * WebElement pric =
 * driver.findElement(By.xpath("(//span[@class='price'])[1]")); String p1 =
 * pric.getText(); System.out.println("After Adding Quantity---> "+p1);
 * 
 * Thread.sleep(2000); driver.findElement(By.xpath("//a[@class='action
 * viewcart']")).click(); Thread.sleep(2000);
 * driver.findElement(By.xpath("(//button[@class='action primary
 * checkout'])[2]")).click();
 */

/*
 * Atomic Endurance Running product in Tees driver.findElement(By.xpath(
 * "//*[@id=\"maincontent\"]/div[4]/div[2]/div[2]/div/ul[1]/li[3]/a")).click();
 * Thread.sleep(2000); System.out.println(driver.getTitle());
 * Thread.sleep(2000);
 * driver.findElement(By.xpath("(//a[@class='product-item-link'])[9]")).click();
 * Thread.sleep(2000);
 * driver.findElement(By.xpath("(//div[@class='swatch-option text'])[1]")).click
 * (); driver.findElement(By.xpath("(//div[@class='swatch-option color'])[3]")).
 * click();
 * 
 * WebElement qty = driver.findElement(By.xpath("//input[@id='qty']"));
 * qty.clear(); qty.sendKeys("2"); Thread.sleep(2000);
 * driver.findElement(By.xpath("//button[@title='Add to Cart']")).click();
 * Thread.sleep(3000);
 * driver.findElement(By.xpath("//a[@class='action showcart']")).click();
 * Thread.sleep(2000);
 * 
 * WebElement price =
 * driver.findElement(By.xpath("(//span[@class='price'])[2]")); String p =
 * price.getText(); System.out.println("Before Adding Quantity---> "+p);
 * Thread.sleep(2000);
 * 
 * WebElement pric =
 * driver.findElement(By.xpath("(//span[@class='price'])[1]")); String p1 =
 * pric.getText(); System.out.println("After Adding Quantity---> "+p1);
 * 
 * Thread.sleep(2000);
 * driver.findElement(By.xpath("//a[@class='action viewcart']")).click();
 * Thread.sleep(2000);
 * 
 * Thread.sleep(2000);
 * driver.findElement(By.xpath("(//a[@title='Remove item'])[2]")).click();
 * 
 * Thread.sleep(2000); driver.findElement(By.xpath("//a[.='here']")).click();
 */

/*
 * Argus All weather product in Tanks driver.findElement(By.xpath(
 * "//*[@id=\"maincontent\"]/div[4]/div[2]/div[2]/div/ul[1]/li[4]/a")).click();
 * Thread.sleep(2000); System.out.println(driver.getTitle());
 * Thread.sleep(2000);
 * driver.findElement(By.xpath("(//a[@class='product-item-link'])[6]")).click();
 * Thread.sleep(2000);
 * driver.findElement(By.xpath("(//div[@class='swatch-option text'])[1]")).click
 * ();
 * driver.findElement(By.xpath("//div[@class='swatch-option color']")).click();
 * 
 * WebElement qty = driver.findElement(By.xpath("//input[@id='qty']"));
 * qty.clear(); qty.sendKeys("2"); Thread.sleep(2000);
 * driver.findElement(By.xpath("//button[@title='Add to Cart']")).click();
 * Thread.sleep(3000);
 * driver.findElement(By.xpath("//a[@class='action showcart']")).click();
 * Thread.sleep(2000);
 * 
 * WebElement price =
 * driver.findElement(By.xpath("(//span[@class='price'])[2]")); String p =
 * price.getText(); System.out.println("Before Adding Quantity---> "+p);
 * Thread.sleep(2000);
 * 
 * WebElement pric =
 * driver.findElement(By.xpath("(//span[@class='price'])[1]")); String p1 =
 * pric.getText(); System.out.println("After Adding Quantity---> "+p1);
 * 
 * Thread.sleep(2000);
 * driver.findElement(By.xpath("//a[@class='action viewcart']")).click();
 * Thread.sleep(2000);
 * 
 * driver.findElement(By.xpath("(//button[@class='action primary checkout'])[2]"
 * )).click();
 */

/*
 * Tristan Endurance Tank in Tanks Module
 * driver.findElement(By.xpath("(//a[@class='product-item-link'])[11]")).click()
 * ; Thread.sleep(2000);
 * driver.findElement(By.xpath("(//div[@class='swatch-option text'])[1]")).click
 * (); driver.findElement(By.xpath("(//div[@class='swatch-option color'])[3]")).
 * click();
 * 
 * WebElement qty = driver.findElement(By.xpath("//input[@id='qty']"));
 * qty.clear(); qty.sendKeys("2"); Thread.sleep(2000);
 * driver.findElement(By.xpath("//button[@title='Add to Cart']")).click();
 * Thread.sleep(5000);
 * driver.findElement(By.xpath("//a[@class='action showcart']")).click();
 * Thread.sleep(2000);
 * 
 * WebElement price =
 * driver.findElement(By.xpath("(//span[@class='price'])[2]")); String p =
 * price.getText(); System.out.println("Before Adding Quantity---> "+p);
 * Thread.sleep(2000);
 * 
 * WebElement pric =
 * driver.findElement(By.xpath("(//span[@class='price'])[1]")); String p1 =
 * pric.getText(); System.out.println("After Adding Quantity---> "+p1);
 * 
 * Thread.sleep(2000);
 * driver.findElement(By.xpath("//a[@class='action viewcart']")).click();
 * Thread.sleep(2000);
 * 
 * driver.findElement(By.xpath("(//a[@title='Remove item'])[2]")).click();
 * 
 * Thread.sleep(2000); driver.findElement(By.xpath("//a[.='here']")).click();
 */

/*
 * Caesar Warm_Up Pant in Pants Module
 * driver.findElement(By.xpath("(//a[@class='product-item-link'])[12]")).click()
 * ; Thread.sleep(2000);
 * driver.findElement(By.xpath("(//div[@class='swatch-option text'])[3]")).click
 * (); driver.findElement(By.xpath("(//div[@class='swatch-option color'])[2]")).
 * click();
 * 
 * WebElement qty = driver.findElement(By.xpath("//input[@id='qty']"));
 * qty.clear(); qty.sendKeys("2"); Thread.sleep(2000);
 * driver.findElement(By.xpath("//button[@title='Add to Cart']")).click();
 * Thread.sleep(5000);
 * driver.findElement(By.xpath("//a[@class='action showcart']")).click();
 * Thread.sleep(2000);
 * 
 * WebElement price =
 * driver.findElement(By.xpath("(//span[@class='price'])[2]")); String p =
 * price.getText(); System.out.println("Before Adding Quantity---> "+p);
 * Thread.sleep(2000);
 * 
 * WebElement pric =
 * driver.findElement(By.xpath("(//span[@class='price'])[1]")); String p1 =
 * pric.getText(); System.out.println("After Adding Quantity---> "+p1);
 * 
 * Thread.sleep(2000);
 * driver.findElement(By.xpath("//a[@class='action viewcart']")).click();
 * Thread.sleep(2000);
 * 
 * driver.findElement(By.xpath("(//a[@title='Remove item'])[2]")).click();
 * 
 * Thread.sleep(2000); driver.findElement(By.xpath("//a[.='here']")).click();
 */

/*
 * Torque Power Short in Shorts module driver.findElement(By.xpath(
 * "//*[@id=\"maincontent\"]/div[4]/div[2]/div[2]/div/ul[2]/li[2]/a")).click();
 * Thread.sleep(2000); System.out.println(driver.getTitle());
 * Thread.sleep(2000);
 * driver.findElement(By.xpath("(//a[@class='product-item-link'])[9]")).click();
 * Thread.sleep(2000);
 * driver.findElement(By.xpath("(//div[@class='swatch-option text'])[3]")).click
 * (); driver.findElement(By.xpath("(//div[@class='swatch-option color'])[1]")).
 * click();
 * 
 * WebElement qty = driver.findElement(By.xpath("//input[@id='qty']"));
 * qty.clear(); qty.sendKeys("2"); Thread.sleep(2000);
 * driver.findElement(By.xpath("//button[@title='Add to Cart']")).click();
 * Thread.sleep(5000);
 * driver.findElement(By.xpath("//a[@class='action showcart']")).click();
 * Thread.sleep(2000);
 * 
 * WebElement price =
 * driver.findElement(By.xpath("(//span[@class='price'])[2]")); String p =
 * price.getText(); System.out.println("Before Adding Quantity---> "+p);
 * Thread.sleep(2000);
 * 
 * WebElement pric =
 * driver.findElement(By.xpath("(//span[@class='price'])[1]")); String p1 =
 * pric.getText(); System.out.println("After Adding Quantity---> "+p1);
 * 
 * Thread.sleep(2000);
 * driver.findElement(By.xpath("//a[@class='action viewcart']")).click();
 * Thread.sleep(2000);
 * 
 * //driver.findElement(By.
 * xpath("(//button[@class='action primary checkout'])[2]")).click();
 * 
 * 
 * driver.findElement(By.xpath("(//a[@title='Remove item'])[2]")).click();
 * 
 * Thread.sleep(2000); driver.findElement(By.xpath("//a[.='here']")).click();
 */

/*
 * Summit Watch in Watches Module
 * driver.findElement(By.xpath("//span[.='Gear']")).click(); Thread.sleep(5000);
 * driver.findElement(By.xpath(
 * "//*[@id=\"maincontent\"]/div[4]/div[2]/div[2]/div/ul/li[3]/a")).click();
 * Thread.sleep(2000); System.out.println(driver.getTitle());
 * Thread.sleep(2000);
 * driver.findElement(By.xpath("(//a[@class='product-item-link'])[7]")).click();
 * Thread.sleep(2000); WebElement qty =
 * driver.findElement(By.xpath("//input[@id='qty']")); qty.clear();
 * qty.sendKeys("2"); Thread.sleep(2000);
 * driver.findElement(By.xpath("//button[@title='Add to Cart']")).click();
 * Thread.sleep(5000);
 * driver.findElement(By.xpath("//a[@class='action showcart']")).click();
 * Thread.sleep(2000);
 * 
 * WebElement price =
 * driver.findElement(By.xpath("(//span[@class='price'])[2]")); String p =
 * price.getText(); System.out.println("Before Adding Quantity---> "+p);
 * Thread.sleep(2000);
 * 
 * WebElement pric =
 * driver.findElement(By.xpath("(//span[@class='price'])[1]")); String p1 =
 * pric.getText(); System.out.println("After Adding Quantity---> "+p1);
 * 
 * Thread.sleep(2000);
 * driver.findElement(By.xpath("//a[@class='action viewcart']")).click();
 * Thread.sleep(2000);
 * 
 * //driver.findElement(By.
 * xpath("(//button[@class='action primary checkout'])[2]")).click();
 * 
 * 
 * driver.findElement(By.xpath("(//a[@title='Remove item'])[2]")).click();
 * 
 * Thread.sleep(2000); driver.findElement(By.xpath("//a[.='here']")).click();
 */

/*
 * sign out
 * 
 * driver.findElement(By.xpath("(//span[@class='customer-name'])[1]")).click();
 * 
 * Thread.sleep(2000);
 * driver.findElement(By.xpath("(//a[.='My Account'])[1]")).click();
 * Thread.sleep(2000);
 * 
 * String acc =
 * driver.findElement(By.xpath("//li[@class='nav item current']")).getText();
 * int k=1; System.out.println(k + ") "+acc); List<WebElement> text =
 * driver.findElements(By.xpath("//li[@class='nav item']"));
 * 
 * int count = text.size();
 * 
 * for (int i = 0,j=2; i <count; i++) { if (i==3 || i==7 || i==9 || i==10 ||
 * i==11) { } else {
 * 
 * String name = text.get(i).getText(); System.out.println(j++ +") "+name); } }
 * 
 * 
 * 
 * driver.navigate().back(); Thread.sleep(2000);
 * driver.findElement(By.xpath("(//span[@class='customer-name'])[1]")).click();
 * Thread.sleep(2000); driver.findElement(By.xpath(
 * "/html/body/div[2]/header/div[1]/div/ul/li[2]/div/ul/li[2]/a")).click();
 * Thread.sleep(2000); driver.navigate().back(); Thread.sleep(2000);
 * driver.findElement(By.xpath("(//span[@class='customer-name'])[1]")).click();
 * Thread.sleep(2000); driver.findElement(By.xpath(
 * "/html/body/div[2]/header/div[1]/div/ul/li[2]/div/ul/li[3]/a")).click();
 * 
 */
