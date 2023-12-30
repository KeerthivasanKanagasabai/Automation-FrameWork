package practice_2;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

import BaseClass.BaseClassForLumaPropertyFile;

public class Hybrid_for_Luma extends BaseClassForLumaPropertyFile {

	@Test(priority = 1)
	public void TestCase_001() {
		Reporter.log("TestCase-1 is Pass", true);
	}

	@Test(priority = 2)
	public void TestCase_002() {
		String title = driver.getTitle();
		Reporter.log("Title is---> " + title, true);
		Reporter.log("TestCase-2 is Pass", true);
	}

	@Test(priority = 3)
	public void TestCase_003() {
		pom_class_for_luma p = new pom_class_for_luma();
		PageFactory.initElements(driver, p);
		p.TestCase_003();
		String title = driver.getTitle();
		Reporter.log("Title is---> " + title, true);
		Reporter.log("Testcase-3 is pass", true);
	}

	@Test(priority = 4)
	public void TestCase_004() {
		pom_class_for_luma p = new pom_class_for_luma();
		PageFactory.initElements(driver, p);
		p.TestCase_004();
		Reporter.log("TestCase-4 is Pass", true);
	}

	@Test(priority = 5)
	public void TestCase_005() {
		pom_class_for_luma p = new pom_class_for_luma();
		PageFactory.initElements(driver, p);
		p.TestCase_005();
		Reporter.log("TestCase-5 is Pass", true);
	}

	@Test(priority = 6)
	public void TestCase_006() {
		pom_class_for_luma p = new pom_class_for_luma();
		PageFactory.initElements(driver, p);
		p.TestCase_006();
		Reporter.log("TestCase-6 is Pass", true);
	}

	@Test(priority = 7)
	public void TestCase_007() {
		pom_class_for_luma p = new pom_class_for_luma();
		PageFactory.initElements(driver, p);
		p.TestCase_007();
		Reporter.log("TestCase-7 is Pass", true);
	}

	@Test(priority = 8)
	public void TestCase_008() {
		pom_class_for_luma p = new pom_class_for_luma();
		PageFactory.initElements(driver, p);
		p.TestCase_008();
		Reporter.log("TestCase-8 is Pass", true);
	}

	@Test(priority = 9)
	public void TestCase_009() throws InterruptedException {
		pom_class_for_luma p = new pom_class_for_luma();
		PageFactory.initElements(driver, p);
		p.TestCase_009();
		Reporter.log("TestCase-9 is Pass", true);
	}

	@Test(priority = 10)
	public void TestCase_010() {
		pom_class_for_luma p = new pom_class_for_luma();
		PageFactory.initElements(driver, p);
		p.TestCase_010();
		Reporter.log("TestCase-10 is Pass", true);
	}

	@Test(priority = 11)
	public void TestCase_011() {
		pom_class_for_luma p = new pom_class_for_luma();
		PageFactory.initElements(driver, p);
		p.TestCase_011();
		Reporter.log("TestCase-11 is Pass", true);
	}

	@Test(priority = 12)
	public void TestCase_012() {
		pom_class_for_luma p = new pom_class_for_luma();
		PageFactory.initElements(driver, p);
		p.TestCase_012();
		Reporter.log("TestCase-12 is Pass", true);
	}

	@Test(priority = 13)
	public void TestCase_013() {
		pom_class_for_luma p = new pom_class_for_luma();
		PageFactory.initElements(driver, p);
		p.TestCase_013();
		Reporter.log("TestCase-13 is Pass", true);
	}

	@Test(priority = 14)
	public void TestCase_014() throws InterruptedException {
		pom_class_for_luma p = new pom_class_for_luma();
		PageFactory.initElements(driver, p);
		p.TestCase_014();
		Reporter.log("TestCase-14 is Pass", true);
	}

	@Test(priority = 15)
	public void TestCase_015() throws InterruptedException {
		pom_class_for_luma p = new pom_class_for_luma();
		PageFactory.initElements(driver, p);
		p.TestCase_015();
		Reporter.log("TestCase-15 is Pass", true);
	}

	@Test(priority = 16)
	public void TestCase_016() throws InterruptedException {
		pom_class_for_luma p = new pom_class_for_luma();
		PageFactory.initElements(driver, p);
		p.TestCase_016();
		Reporter.log("TestCase-16 is Pass", true);
	}

	@Test(priority = 17)
	public void TestCase_017() throws InterruptedException {
		pom_class_for_luma p = new pom_class_for_luma();
		PageFactory.initElements(driver, p);
		p.TestCase_017();
		String title = driver.getTitle();
		Reporter.log("Title is---> " + title, true);
		Reporter.log("TestCase-17 is Pass", true);
	}

	@Test(priority = 18)
	public void TestCase_018() throws InterruptedException {
		pom_class_for_luma p = new pom_class_for_luma();
		PageFactory.initElements(driver, p);
		p.TestCase_018();
		Reporter.log("Login Successfull...", true);
		Reporter.log("TestCase-18 is Pass", true);
	}

	@Test(priority = 19)
	public void TestCase_019() throws InterruptedException {
		pom_class_for_luma p = new pom_class_for_luma();
		PageFactory.initElements(driver, p);
		p.TestCase_019();
		Reporter.log("Login is Not Successfull...", true);
		Reporter.log("Error Message is Displayed...", true);
		Reporter.log("TestCase-19 is Pass", true);
	}

	@Test(priority = 20)
	public void TestCase_020() throws InterruptedException {
		pom_class_for_luma p = new pom_class_for_luma();
		PageFactory.initElements(driver, p);
		p.TestCase_020();
		Reporter.log("Login is Not Successfull...", true);
		Reporter.log("Error Message is Displayed...", true);
		Reporter.log("TestCase-20 is Pass", true);
	}

	@Test(priority = 21)
	public void TestCase_021() throws InterruptedException {
		pom_class_for_luma p = new pom_class_for_luma();
		PageFactory.initElements(driver, p);
		p.TestCase_021();
		Reporter.log("Login is Not Successfull...", true);
		Reporter.log("Error Message is Displayed...", true);
		Reporter.log("TestCase-21 is Pass", true);
	}

	@Test(priority = 22)
	public void TestCase_022() throws InterruptedException {
		pom_class_for_luma p = new pom_class_for_luma();
		PageFactory.initElements(driver, p);
		p.TestCase_022();
		Reporter.log("Login is Not Successfull...", true);
		Reporter.log("Error Message is Displayed...", true);
		Reporter.log("TestCase-22 is Pass", true);
	}

	@Test(priority = 23)
	public void TestCase_023() throws InterruptedException {
		pom_class_for_luma p = new pom_class_for_luma();
		PageFactory.initElements(driver, p);
		p.TestCase_023();
		Reporter.log("Login is Not Successfull...", true);
		Reporter.log("Error Message is Displayed...", true);
		Reporter.log("TestCase-23 is Pass", true);
	}

	@Test(priority = 24)
	public void TestCase_024() throws InterruptedException {
		pom_class_for_luma p = new pom_class_for_luma();
		PageFactory.initElements(driver, p);
		p.TestCase_024();
		Reporter.log("Login is Not Successfull...", true);
		Reporter.log("Error Message is Displayed...", true);
		Reporter.log("TestCase-24 is Pass", true);
	}

	@Test(priority = 25)
	public void TestCase_025() throws InterruptedException {
		pom_class_for_luma p = new pom_class_for_luma();
		PageFactory.initElements(driver, p);
		p.TestCase_025();
		Reporter.log("Login is Not Successfull...", true);
		Reporter.log("Error Message is Displayed...", true);
		Reporter.log("TestCase-25 is Pass", true);
	}

	@Test(priority = 26)
	public void TestCase_026() throws InterruptedException {
		pom_class_for_luma p = new pom_class_for_luma();
		PageFactory.initElements(driver, p);
		p.TestCase_026();
		Reporter.log("Login is Not Successfull...", true);
		Reporter.log("Error Message is Displayed...", true);
		Reporter.log("TestCase-26 is Pass", true);
	}

	@Test(priority = 27)
	public void TestCase_027() throws InterruptedException {
		pom_class_for_luma p = new pom_class_for_luma();
		PageFactory.initElements(driver, p);
		p.TestCase_027();
		Reporter.log("TestCase-27 is Pass", true);
	}

	@Test(priority = 28)
	public void TestCase_028() throws InterruptedException {
		pom_class_for_luma p = new pom_class_for_luma();
		PageFactory.initElements(driver, p);
		p.TestCase_028();
		Reporter.log("TestCase-28 is Pass", true);
	}

	@Test(priority = 29)
	public void TestCase_029() throws InterruptedException {
		pom_class_for_luma p = new pom_class_for_luma();
		PageFactory.initElements(driver, p);
		p.TestCase_029();
		Reporter.log("TestCase-29 is Pass", true);
	}

	@Test(priority = 30)
	public void TestCase_030() throws InterruptedException {
		pom_class_for_luma p = new pom_class_for_luma();
		PageFactory.initElements(driver, p);
		p.TestCase_030();
		Reporter.log("TestCase-30 is Pass", true);
	}

	@Test(priority = 31)
	public void TestCase_031() throws InterruptedException {
		pom_class_for_luma p = new pom_class_for_luma();
		PageFactory.initElements(driver, p);
		p.TestCase_031();
		String title = driver.getTitle();
		Reporter.log("Title is---> " + title, true);
		Reporter.log("TestCase-31 is Pass", true);
	}

	@Test(priority = 32)
	public void TestCase_032() throws InterruptedException {
		pom_class_for_luma p = new pom_class_for_luma();
		PageFactory.initElements(driver, p);
		p.TestCase_032();
		Reporter.log("TestCase-32 is Pass", true);
	}

	@Test(priority = 33)
	public void TestCase_033() throws InterruptedException {
		pom_class_for_luma p = new pom_class_for_luma();
		PageFactory.initElements(driver, p);
		p.TestCase_033();
		Reporter.log("TestCase-33 is Pass", true);
	}

	@Test(priority = 34)
	public void TestCase_034() throws InterruptedException {
		pom_class_for_luma p = new pom_class_for_luma();
		PageFactory.initElements(driver, p);
		p.TestCase_034();
		Reporter.log("TestCase-34 is Pass", true);
	}

	@Test(priority = 35)
	public void TestCase_035() throws InterruptedException {
		pom_class_for_luma p = new pom_class_for_luma();
		PageFactory.initElements(driver, p);
		p.TestCase_035();
		Reporter.log("TestCase-35 is Pass", true);
	}

	@Test(priority = 36)
	public void TestCase_036() throws InterruptedException {
		pom_class_for_luma p = new pom_class_for_luma();
		PageFactory.initElements(driver, p);
		p.TestCase_036();
		Reporter.log("TestCase-36 is Pass", true);
	}

	@Test(priority = 37)
	public void TestCase_037() throws InterruptedException {
		pom_class_for_luma p = new pom_class_for_luma();
		PageFactory.initElements(driver, p);
		p.TestCase_037();
		Reporter.log("TestCase-37 is Pass", true);
	}

	@Test(priority = 38)
	public void TestCase_038() throws InterruptedException {
		pom_class_for_luma p = new pom_class_for_luma();
		PageFactory.initElements(driver, p);
		p.TestCase_038();
		Reporter.log("TestCase-38 is Pass", true);
	}

	@Test(priority = 39)
	public void TestCase_039() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,4000)");
		Thread.sleep(2000);
		pom_class_for_luma p = new pom_class_for_luma();
		PageFactory.initElements(driver, p);
		Thread.sleep(2000);
		p.TestCase_039();

		String title = driver.getTitle();
		Reporter.log("Title of the WebPage is---> " + title, true);
		Reporter.log("TestCase-39 is Pass", true);
	}

	@Test(priority = 40)
	public void TestCase_040() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,4000)");
		Thread.sleep(2000);
		pom_class_for_luma p = new pom_class_for_luma();
		PageFactory.initElements(driver, p);
		Thread.sleep(2000);
		p.TestCase_040();
		String title = driver.getTitle();
		Reporter.log("Title of the WebPage is---> " + title, true);
		Reporter.log("TestCase-40 is Pass", true);
	}

	@Test(priority = 41)
	public void TestCase_041() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,4000)");
		Thread.sleep(2000);
		pom_class_for_luma p = new pom_class_for_luma();
		PageFactory.initElements(driver, p);
		Thread.sleep(2000);
		p.TestCase_041();
		String title = driver.getTitle();
		Reporter.log("Title of the WebPage is---> " + title, true);
		Reporter.log("TestCase-41 is Pass", true);
	}

	@Test(priority = 42)
	public void TestCase_042() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,4000)");
		Thread.sleep(2000);
		pom_class_for_luma p = new pom_class_for_luma();
		PageFactory.initElements(driver, p);
		Thread.sleep(2000);
		p.TestCase_042();
		String title = driver.getTitle();
		Reporter.log("Title of the WebPage is---> " + title, true);
		Reporter.log("TestCase-42 is Pass", true);
	}

	@Test(priority = 43)
	public void TestCase_043() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,4000)");
		Thread.sleep(2000);
		pom_class_for_luma p = new pom_class_for_luma();
		PageFactory.initElements(driver, p);
		Thread.sleep(2000);
		p.TestCase_043();
		String title = driver.getTitle();
		Reporter.log("Title of the WebPage is---> " + title, true);
		Reporter.log("TestCase-43 is Pass", true);
	}

	@Test(priority = 44)
	public void TestCase_044() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,4000)");
		Thread.sleep(2000);
		pom_class_for_luma p = new pom_class_for_luma();
		PageFactory.initElements(driver, p);
		Thread.sleep(2000);
		p.TestCase_044();
		String title = driver.getTitle();
		Reporter.log("Title of the WebPage is---> " + title, true);
		Reporter.log("TestCase-44 is Pass", true);
	}

	@Test(priority = 45)
	public void TestCase_045() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,4000)");
		Thread.sleep(2000);
		pom_class_for_luma p = new pom_class_for_luma();
		PageFactory.initElements(driver, p);
		Thread.sleep(2000);
		p.TestCase_045();
		Reporter.log("TestCase-45 is Pass", true);
	}

	@Test(priority = 46)
	public void TestCase_046() {
		pom_class_for_luma p = new pom_class_for_luma();
		PageFactory.initElements(driver, p);
		p.TestCase_046();
		Reporter.log("TestCase-46 is Pass", true);
	}

	@Test(priority = 47)
	public void TestCase_047() throws InterruptedException {
		pom_class_for_luma p = new pom_class_for_luma();
		PageFactory.initElements(driver, p);
		p.TestCase_047();
		String title = driver.getTitle();
		Reporter.log("Title of the WebPage is---> " + title, true);
		Reporter.log("TestCase-47 is Pass", true);
	}

	@Test(priority = 48)
	public void TestCase_048() throws InterruptedException {
		pom_class_for_luma p = new pom_class_for_luma();
		PageFactory.initElements(driver, p);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		p.TestCase_048();
		Reporter.log("TestCase-48 is Pass", true);
	}

	/**
	 * delete the added product in the basket
	 * 
	 * @throws InterruptedException
	 */
	@Test(priority = 49)
	public void TestCase_049() throws InterruptedException {
		pom_class_for_luma p = new pom_class_for_luma();
		PageFactory.initElements(driver, p);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		p.TestCase_049();
		Reporter.log("TestCase-49 is Pass", true);
	}

	@Test(priority = 50)
	public void TestCase_050() throws InterruptedException {
		pom_class_for_luma p = new pom_class_for_luma();
		PageFactory.initElements(driver, p);
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		p.TestCase_050();
		Reporter.log("TestCase-50 is Pass", true);
	}

	@Test(priority = 51)
	public void TestCase_051() throws InterruptedException {
		pom_class_for_luma p = new pom_class_for_luma();
		PageFactory.initElements(driver, p);
		p.TestCase_051();
		Reporter.log("TestCase-51 is Pass", true);
	}

	/**
	 * delete the added product in the basket
	 * 
	 * @throws InterruptedException
	 */
	@Test(priority = 52)
	public void TestCase_052() throws InterruptedException {
		pom_class_for_luma p = new pom_class_for_luma();
		PageFactory.initElements(driver, p);
		p.TestCase_052();
		Reporter.log("TestCase-52 is Pass", true);
	}

	@Test(priority = 53)
	public void TestCase_053() throws InterruptedException {
		pom_class_for_luma p = new pom_class_for_luma();
		PageFactory.initElements(driver, p);
		p.TestCase_053();
		Reporter.log("TestCase-53 is Pass", true);
	}

	@Test(priority = 54)
	public void TestCase_054() throws InterruptedException {
		pom_class_for_luma p = new pom_class_for_luma();
		PageFactory.initElements(driver, p);
		p.TestCase_054();
		Reporter.log("TestCase-54 is Pass", true);
	}

	/**
	 * delete the added product in the basket
	 * 
	 * @throws InterruptedException
	 */
	@Test(priority = 55)
	public void TestCase_055() throws InterruptedException {
		pom_class_for_luma p = new pom_class_for_luma();
		PageFactory.initElements(driver, p);
		p.TestCase_055();
		Reporter.log("TestCase-55 is Pass", true);
	}

	@Test(priority = 56)
	public void TestCase_056() throws InterruptedException {
		pom_class_for_luma p = new pom_class_for_luma();
		PageFactory.initElements(driver, p);
		p.TestCase_056();
		Reporter.log("TestCase-56 is Pass", true);
	}

	@Test(priority = 57)
	public void TestCase_057() throws InterruptedException {
		pom_class_for_luma p = new pom_class_for_luma();
		PageFactory.initElements(driver, p);
		p.TestCase_057();
		Reporter.log("TestCase-57 is Pass", true);
	}

	/**
	 * delete the added product in the basket
	 * 
	 * @throws InterruptedException
	 */
	@Test(priority = 58)
	public void TestCase_058() throws InterruptedException {
		pom_class_for_luma p = new pom_class_for_luma();
		PageFactory.initElements(driver, p);
		p.TestCase_058();
		Reporter.log("TestCase-58 is Pass", true);
	}

	@Test(priority = 59)
	public void TestCase_059() throws InterruptedException {
		pom_class_for_luma p = new pom_class_for_luma();
		PageFactory.initElements(driver, p);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		p.TestCase_059();
		Reporter.log("TestCase-59 is Pass", true);
	}

	@Test(priority = 60)
	public void TestCase_060() throws InterruptedException {
		pom_class_for_luma p = new pom_class_for_luma();
		PageFactory.initElements(driver, p);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		p.TestCase_060();
		Reporter.log("TestCase-60 is Pass", true);
	}

	/**
	 * delete the added product in the basket
	 * 
	 * @throws InterruptedException
	 */
	@Test(priority = 61)
	public void TestCase_061() throws InterruptedException {
		pom_class_for_luma p = new pom_class_for_luma();
		PageFactory.initElements(driver, p);
		p.TestCase_061();
		Reporter.log("TestCase-61 is Pass", true);
	}

	@Test(priority = 62)
	public void TestCase_062() throws InterruptedException {
		pom_class_for_luma p = new pom_class_for_luma();
		PageFactory.initElements(driver, p);
		p.TestCase_062();
		Reporter.log("TestCase-62 is Pass", true);
	}

	@Test(priority = 63)
	public void TestCase_063() throws InterruptedException {
		pom_class_for_luma p = new pom_class_for_luma();
		PageFactory.initElements(driver, p);
		p.TestCase_063();
		Reporter.log("TestCase-63 is Pass", true);
	}

	/**
	 * delete the added product in the basket
	 * 
	 * @throws InterruptedException
	 */
	@Test(priority = 64)
	public void TestCase_064() throws InterruptedException {
		pom_class_for_luma p = new pom_class_for_luma();
		PageFactory.initElements(driver, p);
		p.TestCase_064();
		Reporter.log("TestCase-64 is Pass", true);
	}

	@Test(priority = 65)
	public void TestCase_065() throws InterruptedException {
		pom_class_for_luma p = new pom_class_for_luma();
		PageFactory.initElements(driver, p);
		p.TestCase_065();
		Reporter.log("TestCase-65 is Pass", true);
	}

	@Test(priority = 66)
	public void TestCase_066() throws InterruptedException {
		pom_class_for_luma p = new pom_class_for_luma();
		PageFactory.initElements(driver, p);
		p.TestCase_066();
		String title = driver.getTitle();
		Reporter.log("Title---> " + title, true);
		Reporter.log("TestCase-66 is Pass", true);
	}

	@Test(priority = 67)
	public void TestCase_067() throws InterruptedException {
		pom_class_for_luma p = new pom_class_for_luma();
		PageFactory.initElements(driver, p);
		p.TestCase_067();
		Reporter.log("TestCase-67 is Pass", true);
	}

	/**
	 * delete the added product in the basket
	 * 
	 * @throws InterruptedException
	 */
	@Test(priority = 68)
	public void TestCase_068() throws InterruptedException {
		pom_class_for_luma p = new pom_class_for_luma();
		PageFactory.initElements(driver, p);
		p.TestCase_068();
		Reporter.log("TestCase-68 is Pass", true);
	}

	@Test(priority = 69)
	public void TestCase_069() throws InterruptedException {
		pom_class_for_luma p = new pom_class_for_luma();
		PageFactory.initElements(driver, p);
		p.TestCase_069();
		Reporter.log("TestCase-69 is Pass", true);
	}

	@Test(priority = 70)
	public void TestCase_070() throws InterruptedException {
		pom_class_for_luma p = new pom_class_for_luma();
		PageFactory.initElements(driver, p);
		p.TestCase_070();
		Reporter.log("TestCase-70 is Pass", true);
	}

	/**
	 * delete the added product in the basket
	 * 
	 * @throws InterruptedException
	 */
	@Test(priority = 71)
	public void TestCase_071() throws InterruptedException {
		pom_class_for_luma p = new pom_class_for_luma();
		PageFactory.initElements(driver, p);
		p.TestCase_071();
		Reporter.log("TestCase-71 is Pass", true);
	}

	@Test(priority = 72)
	public void TestCase_072() throws InterruptedException {
		pom_class_for_luma p = new pom_class_for_luma();
		PageFactory.initElements(driver, p);
		p.TestCase_072();
		Reporter.log("TestCase-72 is Pass", true);
	}

	@Test(priority = 73)
	public void TestCase_073() throws InterruptedException {
		pom_class_for_luma p = new pom_class_for_luma();
		PageFactory.initElements(driver, p);
		p.TestCase_073();
		Reporter.log("TestCase-73 is Pass", true);
	}

	/**
	 * delete the added product in the basket
	 * 
	 * @throws InterruptedException
	 */
	@Test(priority = 74)
	public void TestCase_074() throws InterruptedException {
		pom_class_for_luma p = new pom_class_for_luma();
		PageFactory.initElements(driver, p);
		p.TestCase_074();
		Reporter.log("TestCase-74 is Pass", true);
	}

	@Test(priority = 75)
	public void TestCase_075() throws InterruptedException {
		pom_class_for_luma p = new pom_class_for_luma();
		PageFactory.initElements(driver, p);
		p.TestCase_075();
		Reporter.log("TestCase-75 is Pass", true);
	}

	@Test(priority = 76)
	public void TestCase_076() throws InterruptedException {
		pom_class_for_luma p = new pom_class_for_luma();
		PageFactory.initElements(driver, p);
		p.TestCase_076();
		Reporter.log("TestCase-76 is Pass", true);
	}

	@Test(priority = 77)
	public void TestCase_077() throws InterruptedException {
		pom_class_for_luma p = new pom_class_for_luma();
		PageFactory.initElements(driver, p);
		Reporter.log("\n\tMy Account Information", true);
		p.TestCase_077();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,500);");
		Reporter.log("\nTestCase-77 is Pass", true);
	}

	@Test(priority = 78)
	public void TestCase_078() throws InterruptedException {
		pom_class_for_luma p = new pom_class_for_luma();
		PageFactory.initElements(driver, p);
		p.TestCase_078();
		Reporter.log("TestCase-78 is Pass", true);
	}

	@Test(priority = 79)
	public void TestCase_079() throws InterruptedException {
		pom_class_for_luma p = new pom_class_for_luma();
		PageFactory.initElements(driver, p);
		p.TestCase_079();
		Reporter.log("TestCase-79 is Pass", true);
	}

	@Test(priority = 80)
	public void TestCase_080() throws InterruptedException {
		pom_class_for_luma p = new pom_class_for_luma();
		PageFactory.initElements(driver, p);
		p.TestCase_080();
		Reporter.log("TestCase-80 is Pass", true);
	}

}
