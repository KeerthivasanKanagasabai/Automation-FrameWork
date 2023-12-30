package practice_2;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

public class pom_class_for_luma {

	/**
	 * Declaring the values for the modules
	 */

	/**
	 * Sign in Module
	 */
	@FindBy(xpath = "(//a[.='Create an Account'])[1]")
	private WebElement Create_An_Account_In_HomePage;

	@FindBy(xpath = "//*[@id=\"firstname\"]")
	private WebElement First_Name;

	@FindBy(xpath = "//*[@id=\"lastname\"]")
	private WebElement Last_Name;

	@FindBy(xpath = "//*[@id=\"email_address\"]")
	private WebElement Email_Address_In_SignIn_Page;

	@FindBy(xpath = "//*[@id=\"password\"]")
	private WebElement Password_In_SignIn_Page;

	@FindBy(xpath = "//*[@id=\"password-confirmation\"]")
	private WebElement Confirm_Password_In_SignIn_Page;

	@FindBy(xpath = "//button[@class='action submit primary']")
	private WebElement Create_An_Account_In_SignIn_Page;

	@FindBy(xpath = "(//legend[@class='legend'])[1]")
	private WebElement Personal_Information;

	@FindBy(xpath = "(//legend[@class='legend'])[2]")
	private WebElement Sign_In_Information;

	@FindBy(xpath = "//div[@id='password-strength-meter']")
	private WebElement Password_Strength;

	/**
	 * Login Module
	 */
	@FindBy(xpath = "(//li[@class='authorization-link'])[1]")
	private WebElement Sign_In_Button_In_Home_Page;

	@FindBy(xpath = "//input[@id='email']")
	private WebElement Email_In_Login_Page;

	@FindBy(xpath = "(//input[@id='pass'])[1]")
	private WebElement Password_In_Login_Page;

	@FindBy(xpath = "//button[@class='action login primary']")
	private WebElement Login_Button;

	@FindBy(xpath = "//a[@class='action remind']")
	private WebElement Forgot_Your_Password;

	@FindBy(xpath = "//input[@id='email_address']")
	private WebElement Email_In_Forgot_Your_Password;

	@FindBy(xpath = "//button[@class='action submit primary']")
	private WebElement Reset_My_Password;

	@FindBy(xpath = "//a[@class='action create primary']")
	private WebElement Create_An_Account_In_Login_Page;

	@FindBy(xpath = "(//strong[@id='block-customer-login-heading'])[1]")
	private WebElement Registered_Customer_In_Login_Page;

	@FindBy(xpath = "(//strong[@id='block-new-customer-heading'])[1]")
	private WebElement New_Customer_In_Login_Page;

	/**
	 * Home Page Module
	 */

	@FindBy(xpath = "//a[@class='logo']")
	private WebElement Logo;

	@FindBy(xpath = "//input[@name='q']")
	private WebElement Search_TextBox_In_Home_Page;

	@FindBy(xpath = "//li[@role='option']//span[@class='qs-option-name']")
	private List<WebElement> Men_Search_Box_In_Home_Page;

	@FindBy(xpath = "//h2[@class='title']")
	private WebElement HotSellers_In_Home_Page;

	@FindBy(xpath = "//a[.='Write for us']")
	private WebElement Write_For_Us_In_Home_Page;

	@FindBy(xpath = "//a[.='Subscribe to our mailing list']")
	private WebElement Subscribe_To_Our_Mailing_List_In_Home_Page;

	@FindBy(xpath = "//a[.='Contact us']")
	private WebElement Contact_Us_In_Home_Page;

	@FindBy(xpath = "//a[.='Search Terms']")
	private WebElement Search_Terms_In_Home_Page;

	@FindBy(xpath = "//a[.='Privacy and Cookie Policy']")
	private WebElement Privacy_And_Cookie_Policy_In_Home_Page;

	@FindBy(xpath = "//a[.='Advanced Search']")
	private WebElement Advanced_Search_In_Home_Page;

	@FindBy(xpath = "//small[@class='copyright']")
	private WebElement Copy_Right_In_Home_Page;

	/**
	 * Men Module
	 */

	@FindBy(xpath = "(//a[@class='level-top ui-corner-all'])[3]")
	private WebElement Men;

	/**
	 * Hoodies and Sweatshirts sub module
	 */
	@FindBy(xpath = "(//li[@class='item'])[3]")
	private WebElement Hoodies_And_Sweatshirts_In_Men_Module;

	/**
	 * Hero Hoodie Product
	 */
	@FindBy(xpath = "(//a[@class='product-item-link'])[7]")
	private WebElement Hero_Hoodie;

	@FindBy(xpath = "(//div[@class='swatch-option text'])[3]")
	private WebElement Hero_Hoodie_Size;

	@FindBy(xpath = "(//div[@class='swatch-option color'])[1]")
	private WebElement Hero_Hoodie_Color;

	@FindBy(xpath = "//button[@class='action primary tocart']")
	private WebElement Add_To_Cart_In_Hero_Hoodie;

	@FindBy(xpath = "//a[@class='action showcart']")
	private WebElement Basket_Icon_In_Hero_Hoodie;

	@FindBy(xpath = "//a[@class='action viewcart']")
	private WebElement View_And_Edit_Cart_In_Hero_Hoodie;

	@FindBy(xpath = "(//button[@class='action primary checkout'])[2]")
	private WebElement Proceed_To_CheckOut_In_Basket_Icon_In_Hero_Hoodie;

	@FindBy(xpath = "//a[@class='action delete']")
	private WebElement Bin_Button_In_Hero_Hoodie;

	@FindBy(xpath = "//button[@class='action-primary action-accept']")
	private WebElement Ok_Button_In_Hero_Hoodie;
	
	@FindBy(xpath = "//a[@id='tab-label-description-title']")
	private WebElement Details_Button_In_Products;
	
	@FindBy(xpath = "//div[@id='description']")
	private WebElement Description_About_The_Product;
	
	@FindBy(xpath = "//a[@id='tab-label-additional-title']")
	private WebElement More_Information_About_Products;
	
	@FindBy(xpath = "//div[@id='additional']")
	private WebElement Details_About_The_Products;

	/**
	 * Chaz Kangeroo Hoodie Product
	 */
	@FindBy(xpath = "(//a[@title='Next'])[2]")
	private WebElement Next_Button_In_Hoodies_And_Sweatshirts_In_Men_Module;

	@FindBy(xpath = "//a[@class='product-item-link']")
	private WebElement Chaz_Kangeroo_Hoodie;

	@FindBy(xpath = "(//div[@class='swatch-option text'])[3]")
	private WebElement Chaz_Kangeroo_Size;

	@FindBy(xpath = "(//div[@class='swatch-option color'])[1]")
	private WebElement Chaz_Kangeroo_Color;

	@FindBy(xpath = "//button[@title='Add to Cart']")
	private WebElement Add_To_Cart_In_Chaz_Kangeroo;

	@FindBy(xpath = "//a[@class='action showcart']")
	private WebElement Basket_Icon_In_Chaz_Kangeroo;

	@FindBy(xpath = "//a[@class='action viewcart']")
	private WebElement View_And_Edit_Cart_In_Chaz_Kangeroo;

	@FindBy(xpath = "(//a[@title='Remove item'])[2]")
	private WebElement Delete_Icon_In_Chaz_Kangeroo;

	@FindBy(xpath = "//a[.='here']")
	private WebElement Click_Here_Link_In_Chaz_Kangeroo;

	/**
	 * Jackets Sub module present in men module
	 */

	@FindBy(xpath = "//*[@id=\"maincontent\"]/div[4]/div[2]/div[2]/div/ul[1]/li[2]/a")
	private WebElement Jackets_In_Men_Module;

	/**
	 * Jupiter All Weather Trainer product in Jackets Sub Module
	 */

	@FindBy(xpath = "(//a[@class='product-item-link'])[3]")
	private WebElement Jupiter_All_Weather_Trainer_In_Jackets;

	@FindBy(xpath = "(//div[@class='swatch-option text'])[2]")
	private WebElement Jupiter_All_Weather_Trainer_Size;

	@FindBy(xpath = "(//div[@class='swatch-option color'])[1]")
	private WebElement Jupiter_All_Weather_Trainer_Color;

	@FindBy(xpath = "//input[@id='qty']")
	private WebElement Jupiter_All_Weather_Trainer_Quantity;

	@FindBy(xpath = "//button[@title='Add to Cart']")
	private WebElement Add_To_Cart_In_Jupiter_All_Weather_Trainer;

	@FindBy(xpath = "//a[@class='action showcart']")
	private WebElement Basket_Icon_In_Jupiter_All_Weather_Trainer;

	@FindBy(xpath = "(//span[@class='price'])[2]")
	private WebElement Price_Before_Adding_Quantity_In_Basket_Icon_In_Jupiter_All_Weather_Trainer;

	@FindBy(xpath = "(//span[@class='price'])[1]")
	private WebElement Price_After_Adding_Quantity_In_Basket_Icon_In_Jupiter_All_Weather_Trainer;

	@FindBy(xpath = "//a[@class='action viewcart']")
	private WebElement View_And_Edit_Cart_In_Jupiter_All_Weather_Trainer;

	@FindBy(xpath = "(//button[@class='action primary checkout'])[2]")
	private WebElement Proceed_To_CheckOut_In_Basket_Icon_In_Jupiter_All_Weather_Trainer;

	/**
	 * Kenobi Trail Jacket product in Jackets sub module
	 */

	@FindBy(xpath = "(//a[@class='product-item-link'])[9]")
	private WebElement Kenobi_Trail_Jacket_In_Jackets;

	@FindBy(xpath = "(//div[@class='swatch-option text'])[2]")
	private WebElement Kenobi_Trail_Jacket_Size;

	@FindBy(xpath = "(//div[@class='swatch-option color'])[1]")
	private WebElement Kenobi_Trail_Jacket_Color;

	@FindBy(xpath = "//input[@id='qty']")
	private WebElement Kenobi_Trail_Jacket_Quantity;

	@FindBy(xpath = "//button[@title='Add to Cart']")
	private WebElement Add_To_Cart_In_Kenobi_Trail_Jacket;

	@FindBy(xpath = "//a[@class='action showcart']")
	private WebElement Basket_Icon_In_Kenobi_Trail_Jacket;

	@FindBy(xpath = "(//span[@class='price'])[2]")
	private WebElement Price_Before_Adding_Quantity_In_Basket_Icon_In_Kenobi_Trail_Jacket;

	@FindBy(xpath = "(//span[@class='price'])[1]")
	private WebElement Price_After_Adding_Quantity_In_Basket_Icon_In_Kenobi_Trail_Jacket;

	@FindBy(xpath = "//a[@class='action viewcart']")
	private WebElement View_And_Edit_Cart_In_Kenobi_Trail_Jacket;

	@FindBy(xpath = "(//a[@title='Remove item'])[2]")
	private WebElement Delet_Icon_In_Kenobi_Trail_Jacket;

	@FindBy(xpath = "//a[.='here']")
	private WebElement Click_Here_Link_In_Kenobi_Trail_Jacket;

	/**
	 * Tees Sub module present in Men Module
	 */

	@FindBy(xpath = "//*[@id=\"maincontent\"]/div[4]/div[2]/div[2]/div/ul[1]/li[3]/a")
	private WebElement Tees;

	/**
	 * Strike Endurance Tee product in Tees module
	 */
	@FindBy(xpath = "(//a[@class='product-item-link'])[1]")
	private WebElement Strike_Endurance_Tee_In_Tees;

	@FindBy(xpath = "(//div[@class='swatch-option text'])[1]")
	private WebElement Strike_Endurance_Tee_Size;

	@FindBy(xpath = "(//div[@class='swatch-option color'])[3]")
	private WebElement Strike_Endurance_Tee_Color;

	@FindBy(xpath = "//input[@id='qty']")
	private WebElement Strike_Endurance_Tee_Quantity;

	@FindBy(xpath = "//button[@title='Add to Cart']")
	private WebElement Add_To_Cart_In_Strike_Endurance_Tee;

	@FindBy(xpath = "//a[@class='action showcart']")
	private WebElement Basket_Icon_In_Strike_Endurance_Tee;

	@FindBy(xpath = "(//span[@class='price'])[2]")
	private WebElement Price_Before_Adding_Quantity_In_Basket_Icon_In_Strike_Endurance_Tee;

	@FindBy(xpath = "(//span[@class='price'])[1]")
	private WebElement Price_After_Adding_Quantity_In_Basket_Icon_In_Strike_Endurance_Tee;

	@FindBy(xpath = "//a[@class='action viewcart']")
	private WebElement View_And_Edit_Cart_In_Strike_Endurance_Tee;

	@FindBy(xpath = "(//button[@class='action primary checkout'])[2]")
	private WebElement Proceed_To_CheckOut_In_Basket_Icon_In_Strike_Endurance_Tee;

	/**
	 * Atomic Endurance Running Product in Tees Module
	 */
	@FindBy(xpath = "(//a[@class='product-item-link'])[9]")
	private WebElement Atomic_Endurance_Running_In_Tees;

	@FindBy(xpath = "(//div[@class='swatch-option text'])[1]")
	private WebElement Atomic_Endurance_Running_Size;

	@FindBy(xpath = "(//div[@class='swatch-option color'])[3]")
	private WebElement Atomic_Endurance_Running_Color;

	@FindBy(xpath = "//input[@id='qty']")
	private WebElement Atomic_Endurance_Running_Quantity;

	@FindBy(xpath = "//button[@title='Add to Cart']")
	private WebElement Add_To_Cart_In_Atomic_Endurance_Running;

	@FindBy(xpath = "//a[@class='action showcart']")
	private WebElement Basket_Icon_In_Atomic_Endurance_Running;

	@FindBy(xpath = "(//span[@class='price'])[2]")
	private WebElement Price_Before_Adding_Quantity_In_Basket_Icon_In_Atomic_Endurance_Running;

	@FindBy(xpath = "(//span[@class='price'])[1]")
	private WebElement Price_After_Adding_Quantity_In_Basket_Icon_In_Atomic_Endurance_Running;

	@FindBy(xpath = "//a[@class='action viewcart']")
	private WebElement View_And_Edit_Cart_In_Atomic_Endurance_Running;

	@FindBy(xpath = "(//a[@title='Remove item'])[2]")
	private WebElement Delet_Icon_In_Atomic_Endurance_Running;

	@FindBy(xpath = "//a[.='here']")
	private WebElement Click_Here_Link_In_Atomic_Endurance_Running;

	/**
	 * Tanks Sub module present in Men Module
	 */

	@FindBy(xpath = "//*[@id=\"maincontent\"]/div[4]/div[2]/div[2]/div/ul[1]/li[4]/a")
	private WebElement Tanks;

	/**
	 * Argus All Weather product in Tanks module
	 */
	@FindBy(xpath = "(//a[@class='product-item-link'])[6]")
	private WebElement Argus_All_Weather_In_Tanks;

	@FindBy(xpath = "(//div[@class='swatch-option text'])[2]")
	private WebElement Argus_All_Weather_Size;

	@FindBy(xpath = "//div[@class='swatch-option color']")
	private WebElement Argus_All_Weather_Color;

	@FindBy(xpath = "//input[@id='qty']")
	private WebElement Argus_All_Weather_Quantity;

	@FindBy(xpath = "//button[@title='Add to Cart']")
	private WebElement Add_To_Cart_In_Argus_All_Weather;

	@FindBy(xpath = "//a[@class='action showcart']")
	private WebElement Basket_Icon_In_Argus_All_Weather;

	@FindBy(xpath = "(//span[@class='price'])[2]")
	private WebElement Price_Before_Adding_Quantity_In_Basket_Icon_In_Argus_All_Weather;

	@FindBy(xpath = "(//span[@class='price'])[1]")
	private WebElement Price_After_Adding_Quantity_In_Basket_Icon_In_Argus_All_Weather;

	@FindBy(xpath = "//a[@class='action viewcart']")
	private WebElement View_And_Edit_Cart_In_Argus_All_Weather;

	@FindBy(xpath = "(//button[@class='action primary checkout'])[2]")
	private WebElement Proceed_To_CheckOut_In_Basket_Icon_In_Argus_All_Weather;

	/**
	 * Tristan Endurance Tank Product in Tanks Module
	 */
	@FindBy(xpath = "(//a[@class='product-item-link'])[11]")
	private WebElement Tristan_Endurance_Tank_In_Tanks;

	@FindBy(xpath = "(//div[@class='swatch-option text'])[1]")
	private WebElement Tristan_Endurance_Tank_Size;

	@FindBy(xpath = "(//div[@class='swatch-option color'])[3]")
	private WebElement Tristan_Endurance_Tank_Color;

	@FindBy(xpath = "//input[@id='qty']")
	private WebElement Tristan_Endurance_Tank_Quantity;

	@FindBy(xpath = "//button[@title='Add to Cart']")
	private WebElement Add_To_Cart_In_Tristan_Endurance_Tank;

	@FindBy(xpath = "//a[@class='action showcart']")
	private WebElement Basket_Icon_In_Tristan_Endurnce_Tank;

	@FindBy(xpath = "(//span[@class='price'])[2]")
	private WebElement Price_Before_Adding_Quantity_In_Basket_Icon_In_Tristan_Endurance_Tank;

	@FindBy(xpath = "(//span[@class='price'])[1]")
	private WebElement Price_After_Adding_Quantity_In_Basket_Icon_In_Tristan_Endurance_Tank;

	@FindBy(xpath = "//a[@class='action viewcart']")
	private WebElement View_And_Edit_Cart_In_Tristan_Endurance_Tank;

	@FindBy(xpath = "(//a[@title='Remove item'])[2]")
	private WebElement Delet_Icon_In_Tristan_Endurance_Tank;

	@FindBy(xpath = "//a[.='here']")
	private WebElement Click_Here_Link_In_Tristan_Endurance_Tank;

	/**
	 * Pants Sub module in Men Module
	 */

	@FindBy(xpath = "//*[@id=\"maincontent\"]/div[4]/div[2]/div[2]/div/ul[2]/li[1]/a")
	private WebElement Pants;

	/**
	 * Aether Gym Pant product in Pants module
	 */
	@FindBy(xpath = "(//a[@class='product-item-link'])[2]")
	private WebElement Aether_Gym_Pant_In_Pants;

	@FindBy(xpath = "(//div[@class='swatch-option text'])[3]")
	private WebElement Aether_Gym_Pant_Size;

	@FindBy(xpath = "(//div[@class='swatch-option color'])[2]")
	private WebElement Aether_Gym_Pant_Color;

	@FindBy(xpath = "//input[@id='qty']")
	private WebElement Aether_Gym_Pant_Quantity;

	@FindBy(xpath = "//button[@title='Add to Cart']")
	private WebElement Add_To_Cart_In_Aether_Gym_Pant;

	@FindBy(xpath = "//a[@class='action showcart']")
	private WebElement Basket_Icon_In_Aether_Gym_Pant;

	@FindBy(xpath = "(//span[@class='price'])[2]")
	private WebElement Price_Before_Adding_Quantity_In_Basket_Icon_In_Aether_Gym_Pant;

	@FindBy(xpath = "(//span[@class='price'])[1]")
	private WebElement Price_After_Adding_Quantity_In_Basket_Icon_In_Aether_Gym_Pant;

	@FindBy(xpath = "//a[@class='action viewcart']")
	private WebElement View_And_Edit_Cart_In_Aether_Gym_Pant;

	@FindBy(xpath = "(//button[@class='action primary checkout'])[2]")
	private WebElement Proceed_To_CheckOut_In_Basket_Icon_In_Aether_Gym_Pant;

	/**
	 * Caesar Warm-Up Pant Product in Pants Module
	 */
	@FindBy(xpath = "(//a[@class='product-item-link'])[12]")
	private WebElement Caesar_Warm_Up_Pant_In_Pants;

	@FindBy(xpath = "(//div[@class='swatch-option text'])[3]")
	private WebElement Caesar_Warm_Up_Pant_Size;

	@FindBy(xpath = "(//div[@class='swatch-option color'])[2]")
	private WebElement Caesar_Warm_Up_Pant_Color;

	@FindBy(xpath = "//input[@id='qty']")
	private WebElement Caesar_Warm_Up_Pant_Quantity;

	@FindBy(xpath = "//button[@title='Add to Cart']")
	private WebElement Add_To_Cart_In_Caesar_Warm_Up_Pant;

	@FindBy(xpath = "//a[@class='action showcart']")
	private WebElement Basket_Icon_In_Caesar_Warm_Up_Pant;

	@FindBy(xpath = "(//span[@class='price'])[2]")
	private WebElement Price_Before_Adding_Quantity_In_Basket_Icon_In_Caesar_Warm_Up_Pant;

	@FindBy(xpath = "(//span[@class='price'])[1]")
	private WebElement Price_After_Adding_Quantity_In_Basket_Icon_In_Caesar_Warm_Up_Pant;

	@FindBy(xpath = "//a[@class='action viewcart']")
	private WebElement View_And_Edit_Cart_In_Caesar_Warm_Up_Pant;

	@FindBy(xpath = "(//a[@title='Remove item'])[2]")
	private WebElement Delet_Icon_In_Caesar_Warm_Up_Pant;

	@FindBy(xpath = "//a[.='here']")
	private WebElement Click_Here_Link_In_Caesar_Warm_Up_Pant;

	/**
	 * Shorts Sub module in Men Module
	 */

	@FindBy(xpath = "//*[@id=\"maincontent\"]/div[4]/div[2]/div[2]/div/ul[2]/li[2]/a")
	private WebElement Shorts;

	/**
	 * Sol Active Short product in Shorts module
	 */
	@FindBy(xpath = "(//a[@class='product-item-link'])[3]")
	private WebElement Sol_Active_short_In_Shorts;

	@FindBy(xpath = "(//div[@class='swatch-option text'])[3]")
	private WebElement Sol_Active_short_Size;

	@FindBy(xpath = "(//div[@class='swatch-option color'])[2]")
	private WebElement Sol_Active_Short_Color;

	@FindBy(xpath = "//input[@id='qty']")
	private WebElement Sol_Active_Short_Quantity;

	@FindBy(xpath = "//button[@title='Add to Cart']")
	private WebElement Add_To_Cart_In_Sol_Active_Short;

	@FindBy(xpath = "//a[@class='action showcart']")
	private WebElement Basket_Icon_In_Sol_Active_Short;

	@FindBy(xpath = "(//span[@class='price'])[2]")
	private WebElement Price_Before_Adding_Quantity_In_Basket_Icon_In_Sol_Active_Short;

	@FindBy(xpath = "(//span[@class='price'])[1]")
	private WebElement Price_After_Adding_Quantity_In_Basket_Icon_In_Sol_Active_Short;

	@FindBy(xpath = "//a[@class='action viewcart']")
	private WebElement View_And_Edit_Cart_In_Sol_Active_Short;

	@FindBy(xpath = "(//button[@class='action primary checkout'])[2]")
	private WebElement Proceed_To_CheckOut_In_Basket_Icon_In_Sol_Active_Short;

	/**
	 * Torque Power Short Product in Shorts Module
	 */
	@FindBy(xpath = "(//a[@class='product-item-link'])[9]")
	private WebElement Torque_Power_Short_In_Shorts;

	@FindBy(xpath = "(//div[@class='swatch-option text'])[3]")
	private WebElement Torque_Power_Short_Size;

	@FindBy(xpath = "(//div[@class='swatch-option color'])[1]")
	private WebElement Torque_Power_Short_Color;

	@FindBy(xpath = "//input[@id='qty']")
	private WebElement Torque_Power_Short_Quantity;

	@FindBy(xpath = "//button[@title='Add to Cart']")
	private WebElement Add_To_Cart_In_Torque_Power_Short;

	@FindBy(xpath = "//a[@class='action showcart']")
	private WebElement Basket_Icon_In_Torque_Power_Short;

	@FindBy(xpath = "(//span[@class='price'])[2]")
	private WebElement Price_Before_Adding_Quantity_In_Basket_Icon_In_Torque_Power_Short;

	@FindBy(xpath = "(//span[@class='price'])[1]")
	private WebElement Price_After_Adding_Quantity_In_Basket_Icon_In_Torque_Power_Short;

	@FindBy(xpath = "//a[@class='action viewcart']")
	private WebElement View_And_Edit_Cart_In_Torque_Power_Short;

	@FindBy(xpath = "(//a[@title='Remove item'])[2]")
	private WebElement Delet_Icon_In_Torque_Power_short;

	@FindBy(xpath = "//a[.='here']")
	private WebElement Click_Here_Link_In_Torque_Power_Short;

	/**
	 * Gear Module
	 */

	@FindBy(xpath = "//span[.='Gear']")
	private WebElement Gear;

	/**
	 * Bag in Gear module
	 */
	@FindBy(xpath = "//*[@id=\"maincontent\"]/div[4]/div[2]/div[2]/div/ul/li[1]/a")
	private WebElement Bags;

	/**
	 * Crown Summit BagPack product in Bags module
	 */
	@FindBy(xpath = "(//a[@class='product-item-link'])[12]")
	private WebElement Crown_Summit_BagPack_In_Bags;

	@FindBy(xpath = "//input[@id='qty']")
	private WebElement Crown_Summit_BagPack_Quantity;

	@FindBy(xpath = "//button[@title='Add to Cart']")
	private WebElement Add_To_Cart_In_Crown_Summit_BagPack;

	@FindBy(xpath = "//a[@class='action showcart']")
	private WebElement Basket_Icon_In_Crown_Summit_BagPack;

	@FindBy(xpath = "(//span[@class='price'])[2]")
	private WebElement Price_Before_Adding_Quantity_In_Basket_Icon_In_Crown_Summit_BagPack;

	@FindBy(xpath = "(//span[@class='price'])[1]")
	private WebElement Price_After_Adding_Quantity_In_Basket_Icon_In_Crown_Summit_BagPack;

	@FindBy(xpath = "//a[@class='action viewcart']")
	private WebElement View_And_Edit_Cart_In_Crown_Summit_BagPack;

	@FindBy(xpath = "(//button[@class='action primary checkout'])[2]")
	private WebElement Proceed_To_CheckOut_In_Basket_Icon_In_Crown_Summit_BagPack;

	/**
	 * Joust Duffle Bag Product in Bags Module
	 */

	@FindBy(xpath = "(//a[@title='Next'])[2]")
	private WebElement Next_Button_In_Bags_In_Gear_Module;

	@FindBy(xpath = "(//a[@class='product-item-link'])[2]")
	private WebElement Joust_Duffle_Bag_In_Bags;

	@FindBy(xpath = "//input[@id='qty']")
	private WebElement Joust_Duffle_Bag_Quantity;

	@FindBy(xpath = "//button[@title='Add to Cart']")
	private WebElement Add_To_Cart_In_Joust_Duffle_Bag;

	@FindBy(xpath = "//a[@class='action showcart']")
	private WebElement Basket_Icon_In_Joust_Duffle_Bag;

	@FindBy(xpath = "(//span[@class='price'])[2]")
	private WebElement Price_Before_Adding_Quantity_In_Basket_Icon_In_Joust_Duffle_Bag;

	@FindBy(xpath = "(//span[@class='price'])[1]")
	private WebElement Price_After_Adding_Quantity_In_Basket_Icon_In_Joust_Duffle_Bag;

	@FindBy(xpath = "//a[@class='action viewcart']")
	private WebElement View_And_Edit_Cart_In_Joust_Duffle_Bag;

	@FindBy(xpath = "(//a[@title='Remove item'])[2]")
	private WebElement Delet_Icon_In_Joust_Duffle_Bag;

	@FindBy(xpath = "//a[.='here']")
	private WebElement Click_Here_Link_In_Joust_Duffle_Bag;

	/**
	 * Fitness Equipment in Gear module
	 */
	@FindBy(xpath = "//*[@id=\"maincontent\"]/div[4]/div[2]/div[2]/div/ul/li[2]/a")
	private WebElement Fitness_Equipment;

	/**
	 * Zing Jump Rope product in Fitness Equipment module
	 */
	@FindBy(xpath = "(//a[@class='product-item-link'])[9]")
	private WebElement Zing_Jump_Rope_In_Fitness_Equipment;

	@FindBy(xpath = "//input[@id='qty']")
	private WebElement Zing_Jump_Rope_Quantity;

	@FindBy(xpath = "//button[@title='Add to Cart']")
	private WebElement Add_To_Cart_In_Zing_Jump_Rope;

	@FindBy(xpath = "//a[@class='action showcart']")
	private WebElement Basket_Icon_In_Zing_Jump_Rope;

	@FindBy(xpath = "(//span[@class='price'])[2]")
	private WebElement Price_Before_Adding_Quantity_In_Basket_Icon_In_Zing_Jump_Rope;

	@FindBy(xpath = "(//span[@class='price'])[1]")
	private WebElement Price_After_Adding_Quantity_In_Basket_Icon_In_Zing_Jump_Rope;

	@FindBy(xpath = "//a[@class='action viewcart']")
	private WebElement View_And_Edit_Cart_In_Zing_Jump_Rope;

	@FindBy(xpath = "(//button[@class='action primary checkout'])[2]")
	private WebElement Proceed_To_CheckOut_In_Basket_Icon_In_Zing_Jump_Rope;

	/**
	 * Affirm Water Bottle Product in Fitness Equipment Module
	 */

	@FindBy(xpath = "(//a[@class='product-item-link'])[11]")
	private WebElement Affirm_Water_Bottle_In_Fitness_Equipment;

	@FindBy(xpath = "//input[@id='qty']")
	private WebElement Affirm_Water_Bottle_Quantity;

	@FindBy(xpath = "//button[@title='Add to Cart']")
	private WebElement Add_To_Cart_In_Affirm_Water_Bottle;

	@FindBy(xpath = "//a[@class='action showcart']")
	private WebElement Basket_Icon_In_Affirm_Water_Bottle;

	@FindBy(xpath = "(//span[@class='price'])[2]")
	private WebElement Price_Before_Adding_Quantity_In_Basket_Icon_In_Affirm_Water_Bottle;

	@FindBy(xpath = "(//span[@class='price'])[1]")
	private WebElement Price_After_Adding_Quantity_In_Basket_Icon_In_Affirm_Water_Bottle;

	@FindBy(xpath = "//a[@class='action viewcart']")
	private WebElement View_And_Edit_Cart_In_Affirm_Water_Bottle;

	@FindBy(xpath = "(//a[@title='Remove item'])[2]")
	private WebElement Delet_Icon_In_Affirm_Water_Bottle;

	@FindBy(xpath = "//a[.='here']")
	private WebElement Click_Here_Link_In_Affirm_Water_Bottle;

	/**
	 * Watches in Gear module
	 */
	@FindBy(xpath = "//*[@id=\"maincontent\"]/div[4]/div[2]/div[2]/div/ul/li[3]/a")
	private WebElement Watches;

	/**
	 * Dash Digital Watch product in Watches module
	 */
	@FindBy(xpath = "(//a[@class='product-item-link'])[5]")
	private WebElement Dash_Digital_Watch_In_Watches;

	@FindBy(xpath = "//input[@id='qty']")
	private WebElement Dash_Digital_Watch_Quantity;

	@FindBy(xpath = "//button[@title='Add to Cart']")
	private WebElement Add_To_Cart_In_Dash_Digital_Watch;

	@FindBy(xpath = "//a[@class='action showcart']")
	private WebElement Basket_Icon_In_Dash_Digital_Watch;

	@FindBy(xpath = "(//span[@class='price'])[2]")
	private WebElement Price_Before_Adding_Quantity_In_Basket_Icon_In_Dash_Digital_Watch;

	@FindBy(xpath = "(//span[@class='price'])[1]")
	private WebElement Price_After_Adding_Quantity_In_Basket_Icon_In_Dash_Digital_Watch;

	@FindBy(xpath = "//a[@class='action viewcart']")
	private WebElement View_And_Edit_Cart_In_Dash_Digital_Watch;

	@FindBy(xpath = "(//button[@class='action primary checkout'])[2]")
	private WebElement Proceed_To_CheckOut_In_Basket_Icon_In_Dash_Digital_Watch;

	/**
	 * Summit Watch Product in Watches Module
	 */

	@FindBy(xpath = "(//a[@class='product-item-link'])[7]")
	private WebElement Summit_Watch_In_Watches;

	@FindBy(xpath = "//input[@id='qty']")
	private WebElement Summit_Watch_Quantity;

	@FindBy(xpath = "//button[@title='Add to Cart']")
	private WebElement Add_To_Cart_In_Summit_Watch;

	@FindBy(xpath = "//a[@class='action showcart']")
	private WebElement Basket_Icon_In_Summit_Watch;

	@FindBy(xpath = "(//span[@class='price'])[2]")
	private WebElement Price_Before_Adding_Quantity_In_Basket_Icon_In_Summit_Watch;

	@FindBy(xpath = "(//span[@class='price'])[1]")
	private WebElement Price_After_Adding_Quantity_In_Basket_Icon_In_Summit_Watch;

	@FindBy(xpath = "//a[@class='action viewcart']")
	private WebElement View_And_Edit_Cart_In_Summit_Watch;

	@FindBy(xpath = "(//a[@title='Remove item'])[2]")
	private WebElement Delet_Icon_In_Summit_Watch;

	@FindBy(xpath = "//a[.='here']")
	private WebElement Click_Here_Link_In_Summit_Watch;

	/**
	 * Welcome, DemoAccount
	 */

	@FindBy(xpath = "(//span[@class='customer-name'])[1]")
	private WebElement Demo_Account_Drop_Down;

	/**
	 * My Account Link in Demo Account Drop Down
	 */

	@FindBy(xpath = "(//a[.='My Account'])[1]")
	private WebElement My_Account;

	@FindBy(xpath = "//li[@class='nav item current']")
	private WebElement My_Account_Name;

	@FindBy(xpath = "//li[@class='nav item']")
	private List<WebElement> My_Account_List;

	@FindBy(xpath = "//div[@class='block block-dashboard-info']")
	private WebElement My_Account_Information;

	/**
	 * My Wish List in Demo Account Drop Down
	 */

	@FindBy(xpath = "/html/body/div[2]/header/div[1]/div/ul/li[2]/div/ul/li[2]/a")
	private WebElement My_Wish_List;

	@FindBy(xpath = "//div[@class='message info empty']")
	private WebElement My_Wish_List_Caution;

	/**
	 * Sign Out in Demo Account Drop Down
	 */

	@FindBy(xpath = "/html/body/div[2]/header/div[1]/div/ul/li[2]/div/ul/li[3]/a")
	private WebElement Sign_Out;

	/**
	 * Top Content in Home Page
	 */
	@FindBy(xpath = "//div[@class='content']")
	private WebElement Top_Content_In_Home_Page;

	/*
	 * =============================================================================
	 * ==========================================
	 */

	/**
	 * Initialization for the values
	 */

	public void TestCase_003() {
		Create_An_Account_In_HomePage.click();
	}

	public void TestCase_004() {
		Create_An_Account_In_HomePage.click();
		Reporter.log("Height of The First Name TextBox is---> " + First_Name.getSize().getHeight(), true);
		Reporter.log("Height of The Last Name TextBox is---> " + Last_Name.getSize().getHeight(), true);
	}

	public void TestCase_005() {
		Create_An_Account_In_HomePage.click();
		Reporter.log("Width of The First Name TextBox is---> " + First_Name.getSize().getWidth(), true);
		Reporter.log("Width of The Last Name TextBox is---> " + Last_Name.getSize().getWidth(), true);
	}

	public void TestCase_006() {
		Create_An_Account_In_HomePage.click();
		int fn = First_Name.getSize().getHeight();
		int ln = Last_Name.getSize().getHeight();
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(fn, ln);
		Reporter.log("First Name and Last Name TextBox Height is Equal---> " + fn + " = " + ln, true);
		int fn1 = First_Name.getSize().getWidth();
		int ln1 = Last_Name.getSize().getWidth();
		SoftAssert s = new SoftAssert();
		s.assertEquals(fn1, ln1);
		Reporter.log("First Name and Last Name TextBox Width is Equal---> " + fn1 + " = " + ln1, true);
		sa.assertAll();
	}

	public void TestCase_007() {
		Create_An_Account_In_HomePage.click();
		Reporter.log("Height of The Email TextBox is---> " + Email_Address_In_SignIn_Page.getSize().getHeight(), true);
		Reporter.log("Height of The Password TextBox is---> " + Password_In_SignIn_Page.getSize().getHeight(), true);
		Reporter.log("Height of The Confirm Password TextBox is---> "
				+ Confirm_Password_In_SignIn_Page.getSize().getHeight(), true);
	}

	public void TestCase_008() {
		Create_An_Account_In_HomePage.click();
		Reporter.log("Width of The Email TextBox is---> " + Email_Address_In_SignIn_Page.getSize().getWidth(), true);
		Reporter.log("Width of The Password TextBox is---> " + Password_In_SignIn_Page.getSize().getWidth(), true);
		Reporter.log(
				"Width of The Confirm Password TextBox is---> " + Confirm_Password_In_SignIn_Page.getSize().getWidth(),
				true);
	}

	public void TestCase_009() throws InterruptedException {
		Create_An_Account_In_HomePage.click();
		First_Name.sendKeys("Demo");
		Last_Name.sendKeys("Account");
		Email_Address_In_SignIn_Page.sendKeys("d47783602@gmail.com");
		Password_In_SignIn_Page.sendKeys("Demoaccount@30");
		Confirm_Password_In_SignIn_Page.sendKeys("Demoaccount@30");
		// Create_An_Account_In_SignIn_Page.click();
	}

	public void TestCase_010() {
		Create_An_Account_In_HomePage.click();
		String pi = Personal_Information.getText();
		Reporter.log("Text is---> " + pi, true);
	}

	public void TestCase_011() {
		Create_An_Account_In_HomePage.click();
		String si = Sign_In_Information.getText();
		Reporter.log("Text is---> " + si, true);
	}

	public void TestCase_012() {
		Create_An_Account_In_HomePage.click();
		Password_In_SignIn_Page.sendKeys("");
		String ps = Password_Strength.getText();
		Reporter.log(ps, true);
	}

	public void TestCase_013() {
		Create_An_Account_In_HomePage.click();
		Password_In_SignIn_Page.sendKeys("D");
		String ps = Password_Strength.getText();
		Reporter.log(ps, true);
	}

	public void TestCase_014() throws InterruptedException {
		Create_An_Account_In_HomePage.click();
		Password_In_SignIn_Page.sendKeys("Qwerty@2");
		Thread.sleep(2000);
		String ps = Password_Strength.getText();
		Reporter.log(ps, true);
	}

	public void TestCase_015() throws InterruptedException {
		Create_An_Account_In_HomePage.click();
		Password_In_SignIn_Page.sendKeys("Qwerty@234a");
		Thread.sleep(2000);
		String ps = Password_Strength.getText();
		Reporter.log(ps, true);
	}

	public void TestCase_016() throws InterruptedException {
		Create_An_Account_In_HomePage.click();
		Password_In_SignIn_Page.sendKeys("Demoaccount@30");
		Thread.sleep(2000);
		String ps = Password_Strength.getText();
		Reporter.log(ps, true);
	}

	public void TestCase_017() throws InterruptedException {
		Thread.sleep(2000);
		Sign_In_Button_In_Home_Page.click();
	}

	public void TestCase_018() throws InterruptedException {
		Thread.sleep(2000);
		Sign_In_Button_In_Home_Page.click();
		Thread.sleep(2000);
		Email_In_Login_Page.sendKeys("d47783602@gmail.com");
		Thread.sleep(2000);
		Password_In_Login_Page.sendKeys("Demoaccount@30");
		Thread.sleep(2000);
		Login_Button.click();
	}

	public void TestCase_019() throws InterruptedException {
		Thread.sleep(2000);
		Sign_In_Button_In_Home_Page.click();
		Thread.sleep(2000);
		Email_In_Login_Page.sendKeys("d47783602@gmail.com");
		Thread.sleep(2000);
		Password_In_Login_Page.sendKeys("Demoaccount");
		Thread.sleep(2000);
		Login_Button.click();
	}

	public void TestCase_020() throws InterruptedException {
		Thread.sleep(2000);
		Sign_In_Button_In_Home_Page.click();
		Thread.sleep(2000);
		Email_In_Login_Page.sendKeys("d47783602@gmail");
		Thread.sleep(2000);
		Password_In_Login_Page.sendKeys("Demoaccount@30");
		Thread.sleep(2000);
		Login_Button.click();
	}

	public void TestCase_021() throws InterruptedException {
		Thread.sleep(2000);
		Sign_In_Button_In_Home_Page.click();
		Thread.sleep(2000);
		Email_In_Login_Page.sendKeys("d47783602@gmail");
		Thread.sleep(2000);
		Password_In_Login_Page.sendKeys("Demoaccount");
		Thread.sleep(2000);
		Login_Button.click();
	}

	public void TestCase_022() throws InterruptedException {
		Thread.sleep(2000);
		Sign_In_Button_In_Home_Page.click();
		Thread.sleep(2000);
		Email_In_Login_Page.sendKeys("");
		Thread.sleep(2000);
		Password_In_Login_Page.sendKeys("Demoaccount@30");
		Thread.sleep(2000);
		Login_Button.click();
	}

	public void TestCase_023() throws InterruptedException {
		Thread.sleep(2000);
		Sign_In_Button_In_Home_Page.click();
		Thread.sleep(2000);
		Email_In_Login_Page.sendKeys("d47783602@gmail.com");
		Thread.sleep(2000);
		Password_In_Login_Page.sendKeys("");
		Thread.sleep(2000);
		Login_Button.click();
	}

	public void TestCase_024() throws InterruptedException {
		Thread.sleep(2000);
		Sign_In_Button_In_Home_Page.click();
		Thread.sleep(2000);
		Email_In_Login_Page.sendKeys("");
		Thread.sleep(2000);
		Password_In_Login_Page.sendKeys("Demoaccount");
		Thread.sleep(2000);
		Login_Button.click();
	}

	public void TestCase_025() throws InterruptedException {
		Thread.sleep(2000);
		Sign_In_Button_In_Home_Page.click();
		Thread.sleep(2000);
		Email_In_Login_Page.sendKeys("d47783602@gmail");
		Thread.sleep(2000);
		Password_In_Login_Page.sendKeys("");
		Thread.sleep(2000);
		Login_Button.click();
	}

	public void TestCase_026() throws InterruptedException {
		Thread.sleep(2000);
		Sign_In_Button_In_Home_Page.click();
		Thread.sleep(2000);
		Email_In_Login_Page.sendKeys("");
		Thread.sleep(2000);
		Password_In_Login_Page.sendKeys("");
		Thread.sleep(2000);
		Login_Button.click();
	}

	public void TestCase_027() throws InterruptedException {
		Thread.sleep(2000);
		Sign_In_Button_In_Home_Page.click();
		Thread.sleep(2000);
		Reporter.log(
				"Height of The Email TextBox Present in Login Page is---> " + Email_In_Login_Page.getSize().getHeight(),
				true);
		Reporter.log("Height of The Password TextBox Present in Login Page is---> "
				+ Password_In_Login_Page.getSize().getHeight(), true);
	}

	public void TestCase_028() {
		Sign_In_Button_In_Home_Page.click();
		Reporter.log("Width of The First Name TextBox is---> " + Email_In_Login_Page.getSize().getWidth(), true);
		Reporter.log("Width of The Last Name TextBox Present in Login Page is---> "
				+ Password_In_Login_Page.getSize().getWidth(), true);
	}

	public void TestCase_029() {
		Sign_In_Button_In_Home_Page.click();
		int email = Email_In_Login_Page.getSize().getHeight();
		int pass = Password_In_Login_Page.getSize().getHeight();
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(email, pass);
		Reporter.log("Email and Password TextBox Present in Login page Height is Equal---> " + email + " = " + pass,
				true);
		int fn1 = Email_In_Login_Page.getSize().getWidth();
		int ln1 = Password_In_Login_Page.getSize().getWidth();
		SoftAssert s = new SoftAssert();
		s.assertEquals(fn1, ln1);
		Reporter.log("Email and Password TextBox Present in Login Page Width is Equal---> " + fn1 + " = " + ln1, true);
		sa.assertAll();
	}

	public void TestCase_030() {
		Sign_In_Button_In_Home_Page.click();
		int email = Email_In_Login_Page.getLocation().getX();
		int pass = Password_In_Login_Page.getLocation().getX();
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(email, pass);
		Reporter.log("X Axis of the Email and Pasword---> " + email + " = " + pass, true);
		sa.assertAll();
		int e = Email_In_Login_Page.getLocation().getY();
		int p = Email_In_Login_Page.getLocation().getY();
		SoftAssert s = new SoftAssert();
		s.assertEquals(e, p);
		Reporter.log("Y Axis of the Email and Password---> " + e + " = " + p, true);
		s.assertAll();
	}

	public void TestCase_031() throws InterruptedException {
		Sign_In_Button_In_Home_Page.click();
		Thread.sleep(2000);
		Forgot_Your_Password.click();
	}

	public void TestCase_032() throws InterruptedException {
		Sign_In_Button_In_Home_Page.click();
		Thread.sleep(2000);
		Forgot_Your_Password.click();
		Thread.sleep(2000);
		Email_In_Forgot_Your_Password.sendKeys("d47783602@gmail.com");
		Thread.sleep(2000);
		Reset_My_Password.click();
		Thread.sleep(2000);
	}

	public void TestCase_033() throws InterruptedException {
		Sign_In_Button_In_Home_Page.click();
		Thread.sleep(2000);
		String ff = Login_Button.getCssValue("font-family");
		String fw = Login_Button.getCssValue("font-weight");
		String b = Login_Button.getCssValue("border");
		String ba = Login_Button.getCssValue("background");
		Reporter.log("Font Family---> " + ff, true);
		Reporter.log("Font Weight---> " + fw, true);
		Reporter.log("Border---> " + b, true);
		Reporter.log("Background---> " + ba, true);
		Thread.sleep(2000);
	}

	public void TestCase_034() throws InterruptedException {
		Sign_In_Button_In_Home_Page.click();
		Thread.sleep(2000);
		Create_An_Account_In_Login_Page.click();
	}

	public void TestCase_035() throws InterruptedException {
		Sign_In_Button_In_Home_Page.click();
		Thread.sleep(2000);
		String rct = Registered_Customer_In_Login_Page.getText();
		Reporter.log("Text is---> " + rct, true);
		String nct = New_Customer_In_Login_Page.getText();
		Reporter.log("Text is---> " + nct, true);
		Reporter.log("************************************", true);
		String rcta = Registered_Customer_In_Login_Page.getTagName();
		Reporter.log("Tag Name is---> " + rcta, true);
		String ncta = New_Customer_In_Login_Page.getTagName();
		Reporter.log("Tag Name is---> " + ncta, true);
	}

	public void TestCase_036() {
		Reporter.log("Logo is Displayed---> " + Logo.isDisplayed(), true);
		Reporter.log("Logo is Enabled---> " + Logo.isEnabled(), true);
	}

	public void TestCase_037() throws InterruptedException {
		Search_TextBox_In_Home_Page.sendKeys("Men");
		Thread.sleep(2000);
		int count = Men_Search_Box_In_Home_Page.size();
		for (int i = 0, j = 1; i < count; i++) {
			String text = Men_Search_Box_In_Home_Page.get(i).getText();
			Reporter.log(j++ + ") " + "List of Drop Down For Men---> " + text, true);
		}
	}

	public void TestCase_038() throws InterruptedException {
		boolean isDisplay = HotSellers_In_Home_Page.isDisplayed();
		Reporter.log("Hot Sellers Text is Visible---> " + isDisplay, true);
		String text = HotSellers_In_Home_Page.getText();
		Reporter.log("Text is---> " + text, true);
	}

	public void TestCase_039() throws InterruptedException {
		Write_For_Us_In_Home_Page.click();
		Thread.sleep(2000);
	}

	public void TestCase_040() throws InterruptedException {
		Subscribe_To_Our_Mailing_List_In_Home_Page.click();
		Thread.sleep(2000);
	}

	public void TestCase_041() throws InterruptedException {
		Contact_Us_In_Home_Page.click();
		Thread.sleep(2000);
	}

	public void TestCase_042() throws InterruptedException {
		Search_Terms_In_Home_Page.click();
		Thread.sleep(2000);
	}

	public void TestCase_043() throws InterruptedException {
		Privacy_And_Cookie_Policy_In_Home_Page.click();
		Thread.sleep(2000);
	}

	public void TestCase_044() throws InterruptedException {
		Advanced_Search_In_Home_Page.click();
		Thread.sleep(2000);
	}

	public void TestCase_045() {
		String text = Copy_Right_In_Home_Page.getText();
		Reporter.log("Text is---> " + text, true);
	}

	public void TestCase_046() {
		Men.click();
		Reporter.log("Men Module is Displayed...", true);
	}

	public void TestCase_047() throws InterruptedException {
		Men.click();
		Thread.sleep(2000);
	}

	public void TestCase_048() throws InterruptedException {
		Sign_In_Button_In_Home_Page.click();
		Thread.sleep(2000);
		Email_In_Login_Page.sendKeys("d47783602@gmail.com");
		Thread.sleep(2000);
		Password_In_Login_Page.sendKeys("Demoaccount@30");
		Thread.sleep(2000);
		Login_Button.click();
		Thread.sleep(3000);
		Men.click();
		Thread.sleep(2000);
		Hoodies_And_Sweatshirts_In_Men_Module.click();
		Thread.sleep(2000);
		Hero_Hoodie.click();
		Thread.sleep(2000);
		Hero_Hoodie_Size.click();
		Thread.sleep(2000);
		Hero_Hoodie_Color.click();
		Thread.sleep(2000);
		Details_Button_In_Products.click();
		Thread.sleep(2000);
		String description = Description_About_The_Product.getText();
		Reporter.log("***********************************************",true);
		Reporter.log("Details of the Products---> "+description,true);
		More_Information_About_Products.click();
		Thread.sleep(2000);
		Reporter.log("***********************************************",true);
		String details = Details_About_The_Products.getText();
		Reporter.log("Details of the Products---> "+details,true);
		Reporter.log("***********************************************",true);
		Add_To_Cart_In_Hero_Hoodie.click();
		Thread.sleep(5000);
		Basket_Icon_In_Hero_Hoodie.click();
		Thread.sleep(2000);
		View_And_Edit_Cart_In_Hero_Hoodie.click();
		Thread.sleep(2000);
		Proceed_To_CheckOut_In_Basket_Icon_In_Hero_Hoodie.click();
		Thread.sleep(3000);
	}

	public void TestCase_049() throws InterruptedException {
		Sign_In_Button_In_Home_Page.click();
		Thread.sleep(2000);
		Email_In_Login_Page.sendKeys("d47783602@gmail.com");
		Thread.sleep(2000);
		Password_In_Login_Page.sendKeys("Demoaccount@30");
		Thread.sleep(2000);
		Login_Button.click();
		Thread.sleep(3000);
		Basket_Icon_In_Hero_Hoodie.click();
		Thread.sleep(2000);
		Bin_Button_In_Hero_Hoodie.click();
		Thread.sleep(2000);
		Ok_Button_In_Hero_Hoodie.click();
		Thread.sleep(5000);
	}

	public void TestCase_050() throws InterruptedException {
		Sign_In_Button_In_Home_Page.click();
		Thread.sleep(2000);
		Email_In_Login_Page.sendKeys("d47783602@gmail.com");
		Thread.sleep(2000);
		Password_In_Login_Page.sendKeys("Demoaccount@30");
		Thread.sleep(2000);
		Login_Button.click();
		Thread.sleep(3000);
		Men.click();
		Thread.sleep(2000);
		Hoodies_And_Sweatshirts_In_Men_Module.click();
		Thread.sleep(2000);
		Next_Button_In_Hoodies_And_Sweatshirts_In_Men_Module.click();
		Thread.sleep(2000);
		Chaz_Kangeroo_Hoodie.click();
		Thread.sleep(2000);
		Chaz_Kangeroo_Size.click();
		Thread.sleep(2000);
		Chaz_Kangeroo_Color.click();
		Thread.sleep(2000);
		Details_Button_In_Products.click();
		Thread.sleep(2000);
		String description = Description_About_The_Product.getText();
		Reporter.log("***********************************************",true);
		Reporter.log("Details of the Products---> "+description,true);
		More_Information_About_Products.click();
		Thread.sleep(2000);
		Reporter.log("***********************************************",true);
		String details = Details_About_The_Products.getText();
		Reporter.log("Details of the Products---> "+details,true);
		Reporter.log("***********************************************",true);
		Add_To_Cart_In_Chaz_Kangeroo.click();
		Thread.sleep(5000);
		Basket_Icon_In_Chaz_Kangeroo.click();
		Thread.sleep(3000);
		View_And_Edit_Cart_In_Chaz_Kangeroo.click();
		Thread.sleep(3000);
		Delete_Icon_In_Chaz_Kangeroo.click();
		Thread.sleep(2000);
		Click_Here_Link_In_Chaz_Kangeroo.click();
		Thread.sleep(5000);
		Demo_Account_Drop_Down.click();
		Thread.sleep(2000);
		Sign_Out.click();
		Thread.sleep(3000);
	}

	public void TestCase_051() throws InterruptedException {
		Sign_In_Button_In_Home_Page.click();
		Thread.sleep(2000);
		Email_In_Login_Page.sendKeys("d47783602@gmail.com");
		Thread.sleep(2000);
		Password_In_Login_Page.sendKeys("Demoaccount@30");
		Thread.sleep(2000);
		Login_Button.click();
		Thread.sleep(3000);
		Men.click();
		Thread.sleep(2000);
		Jackets_In_Men_Module.click();
		Thread.sleep(2000);
		Jupiter_All_Weather_Trainer_In_Jackets.click();
		Thread.sleep(2000);
		Jupiter_All_Weather_Trainer_Size.click();
		Thread.sleep(2000);
		Jupiter_All_Weather_Trainer_Color.click();
		Thread.sleep(2000);
		Jupiter_All_Weather_Trainer_Quantity.clear();
		Thread.sleep(2000);
		Jupiter_All_Weather_Trainer_Quantity.sendKeys("2");
		Thread.sleep(2000);
		Details_Button_In_Products.click();
		Thread.sleep(2000);
		String description = Description_About_The_Product.getText();
		Reporter.log("***********************************************",true);
		Reporter.log("Details of the Products---> "+description,true);
		More_Information_About_Products.click();
		Thread.sleep(2000);
		Reporter.log("***********************************************",true);
		String details = Details_About_The_Products.getText();
		Reporter.log("Details of the Products---> "+details,true);
		Reporter.log("***********************************************",true);
		Add_To_Cart_In_Jupiter_All_Weather_Trainer.click();
		Thread.sleep(5000);
		Basket_Icon_In_Jupiter_All_Weather_Trainer.click();
		Thread.sleep(2000);
		String Before_Price = Price_Before_Adding_Quantity_In_Basket_Icon_In_Jupiter_All_Weather_Trainer.getText();
		Reporter.log("Before Price---> " + Before_Price, true);
		Thread.sleep(2000);
		String After_Price = Price_After_Adding_Quantity_In_Basket_Icon_In_Jupiter_All_Weather_Trainer.getText();
		Reporter.log("After Price---> " + After_Price, true);
		Thread.sleep(2000);
		View_And_Edit_Cart_In_Jupiter_All_Weather_Trainer.click();
		Thread.sleep(2000);
		Proceed_To_CheckOut_In_Basket_Icon_In_Jupiter_All_Weather_Trainer.click();
		Thread.sleep(2000);
	}

	public void TestCase_052() throws InterruptedException {
		Sign_In_Button_In_Home_Page.click();
		Thread.sleep(2000);
		Email_In_Login_Page.sendKeys("d47783602@gmail.com");
		Thread.sleep(2000);
		Password_In_Login_Page.sendKeys("Demoaccount@30");
		Thread.sleep(2000);
		Login_Button.click();
		Thread.sleep(3000);
		Basket_Icon_In_Jupiter_All_Weather_Trainer.click();
		Thread.sleep(2000);
		Bin_Button_In_Hero_Hoodie.click();
		Thread.sleep(2000);
		Ok_Button_In_Hero_Hoodie.click();
		Thread.sleep(5000);
	}

	public void TestCase_053() throws InterruptedException {
		Sign_In_Button_In_Home_Page.click();
		Thread.sleep(2000);
		Email_In_Login_Page.sendKeys("d47783602@gmail.com");
		Thread.sleep(2000);
		Password_In_Login_Page.sendKeys("Demoaccount@30");
		Thread.sleep(2000);
		Login_Button.click();
		Thread.sleep(3000);
		Men.click();
		Thread.sleep(2000);
		Jackets_In_Men_Module.click();
		Thread.sleep(2000);
		Kenobi_Trail_Jacket_In_Jackets.click();
		Thread.sleep(2000);
		Kenobi_Trail_Jacket_Size.click();
		Kenobi_Trail_Jacket_Color.click();
		Kenobi_Trail_Jacket_Quantity.clear();
		Thread.sleep(2000);
		Kenobi_Trail_Jacket_Quantity.sendKeys("2");
		Details_Button_In_Products.click();
		Thread.sleep(2000);
		String description = Description_About_The_Product.getText();
		Reporter.log("***********************************************",true);
		Reporter.log("Details of the Products---> "+description,true);
		More_Information_About_Products.click();
		Thread.sleep(2000);
		Reporter.log("***********************************************",true);
		String details = Details_About_The_Products.getText();
		Reporter.log("Details of the Products---> "+details,true);
		Reporter.log("***********************************************",true);
		Add_To_Cart_In_Kenobi_Trail_Jacket.click();
		Thread.sleep(5000);
		Basket_Icon_In_Kenobi_Trail_Jacket.click();
		String Before_Price = Price_Before_Adding_Quantity_In_Basket_Icon_In_Kenobi_Trail_Jacket.getText();
		Reporter.log("Before Price---> " + Before_Price, true);
		Thread.sleep(2000);
		String After_Price = Price_After_Adding_Quantity_In_Basket_Icon_In_Kenobi_Trail_Jacket.getText();
		Reporter.log("After Price---> " + After_Price, true);
		View_And_Edit_Cart_In_Kenobi_Trail_Jacket.click();
		Thread.sleep(2000);
		Delet_Icon_In_Kenobi_Trail_Jacket.click();
		Thread.sleep(2000);
		Click_Here_Link_In_Kenobi_Trail_Jacket.click();
		Thread.sleep(5000);
		Demo_Account_Drop_Down.click();
		Thread.sleep(2000);
		Sign_Out.click();
		Thread.sleep(3000);
	}

	public void TestCase_054() throws InterruptedException {
		Sign_In_Button_In_Home_Page.click();
		Thread.sleep(2000);
		Email_In_Login_Page.sendKeys("d47783602@gmail.com");
		Thread.sleep(2000);
		Password_In_Login_Page.sendKeys("Demoaccount@30");
		Thread.sleep(2000);
		Login_Button.click();
		Thread.sleep(3000);
		Men.click();
		Thread.sleep(2000);
		Tees.click();
		Thread.sleep(2000);
		Strike_Endurance_Tee_In_Tees.click();
		Thread.sleep(2000);
		Strike_Endurance_Tee_Size.click();
		Strike_Endurance_Tee_Color.click();
		Strike_Endurance_Tee_Quantity.clear();
		Strike_Endurance_Tee_Quantity.sendKeys("2");
		Thread.sleep(2000);
		Details_Button_In_Products.click();
		Thread.sleep(2000);
		String description = Description_About_The_Product.getText();
		Reporter.log("***********************************************",true);
		Reporter.log("Details of the Products---> "+description,true);
		More_Information_About_Products.click();
		Thread.sleep(2000);
		Reporter.log("***********************************************",true);
		String details = Details_About_The_Products.getText();
		Reporter.log("Details of the Products---> "+details,true);
		Reporter.log("***********************************************",true);
		Add_To_Cart_In_Strike_Endurance_Tee.click();
		Thread.sleep(5000);
		Basket_Icon_In_Strike_Endurance_Tee.click();
		Thread.sleep(2000);
		String Before_Price = Price_Before_Adding_Quantity_In_Basket_Icon_In_Strike_Endurance_Tee.getText();
		Reporter.log("Before Price---> " + Before_Price, true);
		Thread.sleep(2000);
		String After_Price = Price_After_Adding_Quantity_In_Basket_Icon_In_Strike_Endurance_Tee.getText();
		Reporter.log("After Price---> " + After_Price, true);
		Thread.sleep(2000);
		View_And_Edit_Cart_In_Strike_Endurance_Tee.click();
		Thread.sleep(2000);
		Proceed_To_CheckOut_In_Basket_Icon_In_Strike_Endurance_Tee.click();
	}

	public void TestCase_055() throws InterruptedException {
		Sign_In_Button_In_Home_Page.click();
		Thread.sleep(2000);
		Email_In_Login_Page.sendKeys("d47783602@gmail.com");
		Thread.sleep(2000);
		Password_In_Login_Page.sendKeys("Demoaccount@30");
		Thread.sleep(2000);
		Login_Button.click();
		Thread.sleep(3000);
		Basket_Icon_In_Strike_Endurance_Tee.click();
		Thread.sleep(2000);
		Bin_Button_In_Hero_Hoodie.click();
		Thread.sleep(2000);
		Ok_Button_In_Hero_Hoodie.click();
		Thread.sleep(5000);
	}

	public void TestCase_056() throws InterruptedException {
		Sign_In_Button_In_Home_Page.click();
		Thread.sleep(2000);
		Email_In_Login_Page.sendKeys("d47783602@gmail.com");
		Thread.sleep(2000);
		Password_In_Login_Page.sendKeys("Demoaccount@30");
		Thread.sleep(2000);
		Login_Button.click();
		Thread.sleep(3000);
		Men.click();
		Thread.sleep(2000);
		Tees.click();
		Thread.sleep(2000);
		Atomic_Endurance_Running_In_Tees.click();
		Atomic_Endurance_Running_Size.click();
		Atomic_Endurance_Running_Color.click();
		Atomic_Endurance_Running_Quantity.clear();
		Atomic_Endurance_Running_Quantity.sendKeys("2");
		Add_To_Cart_In_Atomic_Endurance_Running.click();
		Thread.sleep(3000);
		Basket_Icon_In_Atomic_Endurance_Running.click();
		String Before_Price = Price_Before_Adding_Quantity_In_Basket_Icon_In_Atomic_Endurance_Running.getText();
		Reporter.log("Before Price---> " + Before_Price, true);
		String After_Price = Price_After_Adding_Quantity_In_Basket_Icon_In_Atomic_Endurance_Running.getText();
		Reporter.log("After Price---> " + After_Price, true);
		Thread.sleep(2000);
		View_And_Edit_Cart_In_Atomic_Endurance_Running.click();
		Thread.sleep(2000);
		Delet_Icon_In_Atomic_Endurance_Running.click();
		Thread.sleep(2000);
		Click_Here_Link_In_Atomic_Endurance_Running.click();
		Thread.sleep(5000);
		Demo_Account_Drop_Down.click();
		Thread.sleep(2000);
		Sign_Out.click();
		Thread.sleep(3000);
	}

	public void TestCase_057() throws InterruptedException {
		Sign_In_Button_In_Home_Page.click();
		Thread.sleep(2000);
		Email_In_Login_Page.sendKeys("d47783602@gmail.com");
		Thread.sleep(2000);
		Password_In_Login_Page.sendKeys("Demoaccount@30");
		Thread.sleep(2000);
		Login_Button.click();
		Thread.sleep(3000);
		Men.click();
		Thread.sleep(2000);
		Tanks.click();
		Thread.sleep(2000);
		Argus_All_Weather_In_Tanks.click();
		Thread.sleep(2000);
		Argus_All_Weather_Size.click();
		Argus_All_Weather_Color.click();
		Argus_All_Weather_Quantity.clear();
		Argus_All_Weather_Quantity.sendKeys("5");
		Add_To_Cart_In_Argus_All_Weather.click();
		Thread.sleep(5000);
		Basket_Icon_In_Argus_All_Weather.click();
		Thread.sleep(2000);
		String Before_Price = Price_Before_Adding_Quantity_In_Basket_Icon_In_Argus_All_Weather.getText();
		Reporter.log("Before Price---> " + Before_Price, true);
		Thread.sleep(2000);
		String After_Price = Price_After_Adding_Quantity_In_Basket_Icon_In_Argus_All_Weather.getText();
		Reporter.log("After Price---> " + After_Price, true);
		View_And_Edit_Cart_In_Argus_All_Weather.click();
		Thread.sleep(2000);
		Proceed_To_CheckOut_In_Basket_Icon_In_Argus_All_Weather.click();
	}

	public void TestCase_058() throws InterruptedException {
		Sign_In_Button_In_Home_Page.click();
		Thread.sleep(2000);
		Email_In_Login_Page.sendKeys("d47783602@gmail.com");
		Thread.sleep(2000);
		Password_In_Login_Page.sendKeys("Demoaccount@30");
		Thread.sleep(2000);
		Login_Button.click();
		Thread.sleep(3000);
		Basket_Icon_In_Argus_All_Weather.click();
		Thread.sleep(2000);
		Bin_Button_In_Hero_Hoodie.click();
		Thread.sleep(2000);
		Ok_Button_In_Hero_Hoodie.click();
		Thread.sleep(5000);
	}

	public void TestCase_059() throws InterruptedException {
		Sign_In_Button_In_Home_Page.click();
		Thread.sleep(2000);
		Email_In_Login_Page.sendKeys("d47783602@gmail.com");
		Thread.sleep(2000);
		Password_In_Login_Page.sendKeys("Demoaccount@30");
		Thread.sleep(2000);
		Login_Button.click();
		Thread.sleep(3000);
		Men.click();
		Thread.sleep(2000);
		Tanks.click();
		Thread.sleep(2000);
		Tristan_Endurance_Tank_In_Tanks.click();
		Thread.sleep(2000);
		Tristan_Endurance_Tank_Size.click();
		Tristan_Endurance_Tank_Color.click();
		Tristan_Endurance_Tank_Quantity.clear();
		Tristan_Endurance_Tank_Quantity.sendKeys("5");
		Add_To_Cart_In_Tristan_Endurance_Tank.click();
		Thread.sleep(3000);
		Basket_Icon_In_Tristan_Endurnce_Tank.click();
		Thread.sleep(2000);
		String Before_Price = Price_Before_Adding_Quantity_In_Basket_Icon_In_Tristan_Endurance_Tank.getText();
		Reporter.log("Before Price---> " + Before_Price, true);
		Thread.sleep(2000);
		String After_Price = Price_After_Adding_Quantity_In_Basket_Icon_In_Tristan_Endurance_Tank.getText();
		Reporter.log("After Price---> " + After_Price, true);
		Thread.sleep(2000);
		View_And_Edit_Cart_In_Tristan_Endurance_Tank.click();
		Thread.sleep(2000);
		Delet_Icon_In_Tristan_Endurance_Tank.click();
		Thread.sleep(2000);
		Click_Here_Link_In_Tristan_Endurance_Tank.click();
		Thread.sleep(3000);
		Demo_Account_Drop_Down.click();
		Thread.sleep(2000);
		Sign_Out.click();
		Thread.sleep(3000);
	}

	public void TestCase_060() throws InterruptedException {
		Sign_In_Button_In_Home_Page.click();
		Thread.sleep(2000);
		Email_In_Login_Page.sendKeys("d47783602@gmail.com");
		Thread.sleep(2000);
		Password_In_Login_Page.sendKeys("Demoaccount@30");
		Thread.sleep(2000);
		Login_Button.click();
		Thread.sleep(3000);
		Men.click();
		Thread.sleep(2000);
		Pants.click();
		Thread.sleep(2000);
		Aether_Gym_Pant_In_Pants.click();
		Thread.sleep(2000);
		Aether_Gym_Pant_Size.click();
		Aether_Gym_Pant_Color.click();
		Aether_Gym_Pant_Quantity.clear();
		Aether_Gym_Pant_Quantity.sendKeys("5");
		Add_To_Cart_In_Aether_Gym_Pant.click();
		Thread.sleep(3000);
		Basket_Icon_In_Aether_Gym_Pant.click();
		Thread.sleep(2000);
		String Before_Price = Price_Before_Adding_Quantity_In_Basket_Icon_In_Aether_Gym_Pant.getText();
		Reporter.log("Before Price---> " + Before_Price, true);
		Thread.sleep(2000);
		String After_Price = Price_After_Adding_Quantity_In_Basket_Icon_In_Aether_Gym_Pant.getText();
		Reporter.log("After Price---> " + After_Price, true);
		Thread.sleep(2000);
		View_And_Edit_Cart_In_Aether_Gym_Pant.click();
		Thread.sleep(2000);
		Proceed_To_CheckOut_In_Basket_Icon_In_Aether_Gym_Pant.click();
	}

	public void TestCase_061() throws InterruptedException {
		Sign_In_Button_In_Home_Page.click();
		Thread.sleep(2000);
		Email_In_Login_Page.sendKeys("d47783602@gmail.com");
		Thread.sleep(2000);
		Password_In_Login_Page.sendKeys("Demoaccount@30");
		Thread.sleep(2000);
		Login_Button.click();
		Thread.sleep(3000);
		Basket_Icon_In_Aether_Gym_Pant.click();
		Thread.sleep(2000);
		Bin_Button_In_Hero_Hoodie.click();
		Thread.sleep(2000);
		Ok_Button_In_Hero_Hoodie.click();
		Thread.sleep(5000);
	}

	public void TestCase_062() throws InterruptedException {
		Sign_In_Button_In_Home_Page.click();
		Thread.sleep(2000);
		Email_In_Login_Page.sendKeys("d47783602@gmail.com");
		Thread.sleep(2000);
		Password_In_Login_Page.sendKeys("Demoaccount@30");
		Thread.sleep(2000);
		Login_Button.click();
		Thread.sleep(3000);
		Men.click();
		Thread.sleep(2000);
		Pants.click();
		Thread.sleep(2000);
		Caesar_Warm_Up_Pant_In_Pants.click();
		Thread.sleep(2000);
		Caesar_Warm_Up_Pant_Size.click();
		Caesar_Warm_Up_Pant_Color.click();
		Caesar_Warm_Up_Pant_Quantity.clear();
		Caesar_Warm_Up_Pant_Quantity.sendKeys("10");
		Add_To_Cart_In_Caesar_Warm_Up_Pant.click();
		Thread.sleep(3000);
		Basket_Icon_In_Caesar_Warm_Up_Pant.click();
		String Before_Price = Price_Before_Adding_Quantity_In_Basket_Icon_In_Caesar_Warm_Up_Pant.getText();
		Reporter.log("Before Price---> " + Before_Price, true);
		Thread.sleep(2000);
		String After_Price = Price_After_Adding_Quantity_In_Basket_Icon_In_Caesar_Warm_Up_Pant.getText();
		Reporter.log("After Price---> " + After_Price, true);
		Thread.sleep(2000);
		View_And_Edit_Cart_In_Caesar_Warm_Up_Pant.click();
		Thread.sleep(2000);
		Delet_Icon_In_Caesar_Warm_Up_Pant.click();
		Thread.sleep(2000);
		Click_Here_Link_In_Caesar_Warm_Up_Pant.click();
		Thread.sleep(3000);
		Demo_Account_Drop_Down.click();
		Thread.sleep(2000);
		Sign_Out.click();
		Thread.sleep(3000);
	}

	public void TestCase_063() throws InterruptedException {
		Sign_In_Button_In_Home_Page.click();
		Thread.sleep(2000);
		Email_In_Login_Page.sendKeys("d47783602@gmail.com");
		Thread.sleep(2000);
		Password_In_Login_Page.sendKeys("Demoaccount@30");
		Thread.sleep(2000);
		Login_Button.click();
		Thread.sleep(3000);
		Men.click();
		Thread.sleep(2000);
		Shorts.click();
		Thread.sleep(2000);
		Sol_Active_short_In_Shorts.click();
		Thread.sleep(2000);
		Sol_Active_short_Size.click();
		Sol_Active_Short_Color.click();
		Sol_Active_Short_Quantity.clear();
		Sol_Active_Short_Quantity.sendKeys("12");
		Add_To_Cart_In_Sol_Active_Short.click();
		Thread.sleep(5000);
		Basket_Icon_In_Sol_Active_Short.click();
		Thread.sleep(2000);
		String Before_Price = Price_Before_Adding_Quantity_In_Basket_Icon_In_Sol_Active_Short.getText();
		Reporter.log("Before Price---> " + Before_Price, true);
		String After_Price = Price_After_Adding_Quantity_In_Basket_Icon_In_Sol_Active_Short.getText();
		Reporter.log("After Price---> " + After_Price, true);
		Thread.sleep(2000);
		View_And_Edit_Cart_In_Sol_Active_Short.click();
		Thread.sleep(2000);
		Proceed_To_CheckOut_In_Basket_Icon_In_Sol_Active_Short.click();
		Thread.sleep(2000);
	}

	public void TestCase_064() throws InterruptedException {
		Sign_In_Button_In_Home_Page.click();
		Thread.sleep(2000);
		Email_In_Login_Page.sendKeys("d47783602@gmail.com");
		Thread.sleep(2000);
		Password_In_Login_Page.sendKeys("Demoaccount@30");
		Thread.sleep(2000);
		Login_Button.click();
		Thread.sleep(3000);
		Basket_Icon_In_Sol_Active_Short.click();
		Thread.sleep(2000);
		Bin_Button_In_Hero_Hoodie.click();
		Thread.sleep(2000);
		Ok_Button_In_Hero_Hoodie.click();
		Thread.sleep(5000);
	}

	public void TestCase_065() throws InterruptedException {
		Sign_In_Button_In_Home_Page.click();
		Thread.sleep(2000);
		Email_In_Login_Page.sendKeys("d47783602@gmail.com");
		Thread.sleep(2000);
		Password_In_Login_Page.sendKeys("Demoaccount@30");
		Thread.sleep(2000);
		Login_Button.click();
		Thread.sleep(3000);
		Men.click();
		Thread.sleep(2000);
		Shorts.click();
		Thread.sleep(2000);
		Torque_Power_Short_In_Shorts.click();
		Thread.sleep(2000);
		Torque_Power_Short_Size.click();
		Torque_Power_Short_Color.click();
		Torque_Power_Short_Quantity.clear();
		Torque_Power_Short_Quantity.sendKeys("6");
		Add_To_Cart_In_Torque_Power_Short.click();
		Thread.sleep(5000);
		Basket_Icon_In_Torque_Power_Short.click();
		String Before_Price = Price_Before_Adding_Quantity_In_Basket_Icon_In_Torque_Power_Short.getText();
		Reporter.log("Before Price---> " + Before_Price, true);
		Thread.sleep(2000);
		String After_Price = Price_After_Adding_Quantity_In_Basket_Icon_In_Torque_Power_Short.getText();
		Reporter.log("After Price---> " + After_Price, true);
		Thread.sleep(2000);
		View_And_Edit_Cart_In_Torque_Power_Short.click();
		Thread.sleep(2000);
		Delet_Icon_In_Torque_Power_short.click();
		Thread.sleep(2000);
		Click_Here_Link_In_Torque_Power_Short.click();
		Thread.sleep(3000);
		Demo_Account_Drop_Down.click();
		Thread.sleep(2000);
		Sign_Out.click();
		Thread.sleep(3000);
	}

	/**
	 * Gear Module
	 */

	public void TestCase_066() throws InterruptedException {
		Sign_In_Button_In_Home_Page.click();
		Thread.sleep(2000);
		Email_In_Login_Page.sendKeys("d47783602@gmail.com");
		Thread.sleep(2000);
		Password_In_Login_Page.sendKeys("Demoaccount@30");
		Thread.sleep(2000);
		Login_Button.click();
		Thread.sleep(3000);
		Gear.click();
	}

	public void TestCase_067() throws InterruptedException {
		Sign_In_Button_In_Home_Page.click();
		Thread.sleep(2000);
		Email_In_Login_Page.sendKeys("d47783602@gmail.com");
		Thread.sleep(2000);
		Password_In_Login_Page.sendKeys("Demoaccount@30");
		Thread.sleep(2000);
		Login_Button.click();
		Thread.sleep(3000);
		Gear.click();
		Thread.sleep(2000);
		Bags.click();
		Thread.sleep(2000);
		Crown_Summit_BagPack_In_Bags.click();
		Thread.sleep(2000);
		Crown_Summit_BagPack_Quantity.clear();
		Crown_Summit_BagPack_Quantity.sendKeys("5");
		Add_To_Cart_In_Crown_Summit_BagPack.click();
		Thread.sleep(5000);
		Basket_Icon_In_Crown_Summit_BagPack.click();
		String Before_Price = Price_Before_Adding_Quantity_In_Basket_Icon_In_Crown_Summit_BagPack.getText();
		Reporter.log("Before Price---> " + Before_Price, true);
		Thread.sleep(2000);
		String After_Price = Price_After_Adding_Quantity_In_Basket_Icon_In_Crown_Summit_BagPack.getText();
		Reporter.log("After Price---> " + After_Price, true);
		Thread.sleep(2000);
		View_And_Edit_Cart_In_Crown_Summit_BagPack.click();
		Thread.sleep(2000);
		Proceed_To_CheckOut_In_Basket_Icon_In_Crown_Summit_BagPack.click();
	}

	public void TestCase_068() throws InterruptedException {
		Sign_In_Button_In_Home_Page.click();
		Thread.sleep(2000);
		Email_In_Login_Page.sendKeys("d47783602@gmail.com");
		Thread.sleep(2000);
		Password_In_Login_Page.sendKeys("Demoaccount@30");
		Thread.sleep(2000);
		Login_Button.click();
		Thread.sleep(3000);
		Basket_Icon_In_Crown_Summit_BagPack.click();
		Thread.sleep(2000);
		Bin_Button_In_Hero_Hoodie.click();
		Thread.sleep(2000);
		Ok_Button_In_Hero_Hoodie.click();
		Thread.sleep(5000);
	}

	public void TestCase_069() throws InterruptedException {
		Sign_In_Button_In_Home_Page.click();
		Thread.sleep(2000);
		Email_In_Login_Page.sendKeys("d47783602@gmail.com");
		Thread.sleep(2000);
		Password_In_Login_Page.sendKeys("Demoaccount@30");
		Thread.sleep(2000);
		Login_Button.click();
		Thread.sleep(3000);
		Gear.click();
		Thread.sleep(2000);
		Bags.click();
		Thread.sleep(2000);
		Next_Button_In_Bags_In_Gear_Module.click();
		Thread.sleep(2000);
		Joust_Duffle_Bag_In_Bags.click();
		Thread.sleep(2000);
		Joust_Duffle_Bag_Quantity.sendKeys("10");
		Add_To_Cart_In_Joust_Duffle_Bag.click();
		Thread.sleep(5000);
		Basket_Icon_In_Joust_Duffle_Bag.click();
		String Before_Price = Price_Before_Adding_Quantity_In_Basket_Icon_In_Joust_Duffle_Bag.getText();
		Reporter.log("Before Price---> " + Before_Price, true);
		String After_Price = Price_After_Adding_Quantity_In_Basket_Icon_In_Joust_Duffle_Bag.getText();
		Reporter.log("After Price---> " + After_Price, true);
		Thread.sleep(2000);
		View_And_Edit_Cart_In_Joust_Duffle_Bag.click();
		Thread.sleep(2000);
		Delet_Icon_In_Joust_Duffle_Bag.click();
		Thread.sleep(2000);
		Click_Here_Link_In_Joust_Duffle_Bag.click();
		Thread.sleep(3000);
		Demo_Account_Drop_Down.click();
		Thread.sleep(2000);
		Sign_Out.click();
		Thread.sleep(3000);
	}

	public void TestCase_070() throws InterruptedException {
		Sign_In_Button_In_Home_Page.click();
		Thread.sleep(2000);
		Email_In_Login_Page.sendKeys("d47783602@gmail.com");
		Thread.sleep(2000);
		Password_In_Login_Page.sendKeys("Demoaccount@30");
		Thread.sleep(2000);
		Login_Button.click();
		Thread.sleep(3000);
		Gear.click();
		Thread.sleep(2000);
		Fitness_Equipment.click();
		Thread.sleep(2000);
		Zing_Jump_Rope_In_Fitness_Equipment.click();
		Thread.sleep(2000);
		Zing_Jump_Rope_Quantity.clear();
		Zing_Jump_Rope_Quantity.sendKeys("10");
		Add_To_Cart_In_Zing_Jump_Rope.click();
		Thread.sleep(5000);
		Basket_Icon_In_Zing_Jump_Rope.click();
		String Before_Price = Price_Before_Adding_Quantity_In_Basket_Icon_In_Zing_Jump_Rope.getText();
		Reporter.log("Before Price---> " + Before_Price, true);
		Thread.sleep(2000);
		String After_Price = Price_After_Adding_Quantity_In_Basket_Icon_In_Zing_Jump_Rope.getText();
		Reporter.log("After Price---> " + After_Price, true);
		Thread.sleep(2000);
		View_And_Edit_Cart_In_Zing_Jump_Rope.click();
		Thread.sleep(2000);
		Proceed_To_CheckOut_In_Basket_Icon_In_Zing_Jump_Rope.click();
		Thread.sleep(2000);
	}

	public void TestCase_071() throws InterruptedException {
		Sign_In_Button_In_Home_Page.click();
		Thread.sleep(2000);
		Email_In_Login_Page.sendKeys("d47783602@gmail.com");
		Thread.sleep(2000);
		Password_In_Login_Page.sendKeys("Demoaccount@30");
		Thread.sleep(2000);
		Login_Button.click();
		Thread.sleep(3000);
		Basket_Icon_In_Zing_Jump_Rope.click();
		Thread.sleep(2000);
		Bin_Button_In_Hero_Hoodie.click();
		Thread.sleep(2000);
		Ok_Button_In_Hero_Hoodie.click();
		Thread.sleep(5000);
	}

	public void TestCase_072() throws InterruptedException {
		Sign_In_Button_In_Home_Page.click();
		Thread.sleep(2000);
		Email_In_Login_Page.sendKeys("d47783602@gmail.com");
		Thread.sleep(2000);
		Password_In_Login_Page.sendKeys("Demoaccount@30");
		Thread.sleep(2000);
		Login_Button.click();
		Thread.sleep(3000);
		Gear.click();
		Thread.sleep(2000);
		Fitness_Equipment.click();
		Thread.sleep(2000);
		Affirm_Water_Bottle_In_Fitness_Equipment.click();
		Thread.sleep(2000);
		Affirm_Water_Bottle_Quantity.sendKeys("11");
		Add_To_Cart_In_Affirm_Water_Bottle.click();
		Thread.sleep(5000);
		Basket_Icon_In_Affirm_Water_Bottle.click();
		Thread.sleep(2000);
		String Before_Price = Price_Before_Adding_Quantity_In_Basket_Icon_In_Affirm_Water_Bottle.getText();
		Reporter.log("Before Price---> " + Before_Price, true);
		Thread.sleep(2000);
		String After_Price = Price_After_Adding_Quantity_In_Basket_Icon_In_Affirm_Water_Bottle.getText();
		Reporter.log("After Price---> " + After_Price, true);
		Thread.sleep(2000);
		View_And_Edit_Cart_In_Affirm_Water_Bottle.click();
		Thread.sleep(2000);
		Delet_Icon_In_Affirm_Water_Bottle.click();
		Thread.sleep(2000);
		Click_Here_Link_In_Affirm_Water_Bottle.click();
		Thread.sleep(3000);
		Demo_Account_Drop_Down.click();
		Thread.sleep(2000);
		Sign_Out.click();
		Thread.sleep(3000);
	}

	public void TestCase_073() throws InterruptedException {
		Sign_In_Button_In_Home_Page.click();
		Thread.sleep(2000);
		Email_In_Login_Page.sendKeys("d47783602@gmail.com");
		Thread.sleep(2000);
		Password_In_Login_Page.sendKeys("Demoaccount@30");
		Thread.sleep(2000);
		Login_Button.click();
		Thread.sleep(3000);
		Gear.click();
		Thread.sleep(2000);
		Watches.click();
		Thread.sleep(2000);
		Dash_Digital_Watch_In_Watches.click();
		Thread.sleep(2000);
		Dash_Digital_Watch_Quantity.clear();
		Dash_Digital_Watch_Quantity.sendKeys("12");
		Add_To_Cart_In_Dash_Digital_Watch.click();
		Thread.sleep(5000);
		Basket_Icon_In_Dash_Digital_Watch.click();
		Thread.sleep(2000);
		String Before_Price = Price_Before_Adding_Quantity_In_Basket_Icon_In_Dash_Digital_Watch.getText();
		Reporter.log("Before Price---> " + Before_Price, true);
		Thread.sleep(2000);
		String After_Price = Price_After_Adding_Quantity_In_Basket_Icon_In_Dash_Digital_Watch.getText();
		Reporter.log("After Price---> " + After_Price, true);
		Thread.sleep(2000);
		View_And_Edit_Cart_In_Dash_Digital_Watch.click();
		Thread.sleep(2000);
		Proceed_To_CheckOut_In_Basket_Icon_In_Dash_Digital_Watch.click();
		Thread.sleep(2000);
	}

	public void TestCase_074() throws InterruptedException {
		Sign_In_Button_In_Home_Page.click();
		Thread.sleep(2000);
		Email_In_Login_Page.sendKeys("d47783602@gmail.com");
		Thread.sleep(2000);
		Password_In_Login_Page.sendKeys("Demoaccount@30");
		Thread.sleep(2000);
		Login_Button.click();
		Thread.sleep(3000);
		Basket_Icon_In_Dash_Digital_Watch.click();
		Thread.sleep(2000);
		Bin_Button_In_Hero_Hoodie.click();
		Thread.sleep(2000);
		Ok_Button_In_Hero_Hoodie.click();
		Thread.sleep(5000);
	}

	public void TestCase_075() throws InterruptedException {
		Sign_In_Button_In_Home_Page.click();
		Thread.sleep(2000);
		Email_In_Login_Page.sendKeys("d47783602@gmail.com");
		Thread.sleep(2000);
		Password_In_Login_Page.sendKeys("Demoaccount@30");
		Thread.sleep(2000);
		Login_Button.click();
		Thread.sleep(3000);
		Gear.click();
		Thread.sleep(2000);
		Watches.click();
		Thread.sleep(2000);
		Summit_Watch_In_Watches.click();
		Thread.sleep(2000);
		Summit_Watch_Quantity.sendKeys("50");
		Add_To_Cart_In_Summit_Watch.click();
		Thread.sleep(5000);
		Basket_Icon_In_Summit_Watch.click();
		String Before_Price = Price_Before_Adding_Quantity_In_Basket_Icon_In_Summit_Watch.getText();
		Reporter.log("Before Price---> " + Before_Price, true);
		Thread.sleep(2000);
		String After_Price = Price_After_Adding_Quantity_In_Basket_Icon_In_Summit_Watch.getText();
		Reporter.log("After Price---> " + After_Price, true);
		Thread.sleep(2000);
		View_And_Edit_Cart_In_Summit_Watch.click();
		Thread.sleep(2000);
		Delet_Icon_In_Summit_Watch.click();
		Thread.sleep(2000);
		Click_Here_Link_In_Summit_Watch.click();
		Thread.sleep(3000);
		Demo_Account_Drop_Down.click();
		Thread.sleep(2000);
		Sign_Out.click();
		Thread.sleep(3000);
	}

	public void TestCase_076() throws InterruptedException {
		Sign_In_Button_In_Home_Page.click();
		Thread.sleep(2000);
		Email_In_Login_Page.sendKeys("d47783602@gmail.com");
		Thread.sleep(2000);
		Password_In_Login_Page.sendKeys("Demoaccount@30");
		Thread.sleep(2000);
		Login_Button.click();
		Thread.sleep(3000);
		Demo_Account_Drop_Down.click();
		Thread.sleep(2000);
		My_Account.click();
		Thread.sleep(2000);
		String acc = My_Account_Name.getText();
		Reporter.log("1) " + acc, true);
		int count = My_Account_List.size();
		for (int i = 0, j = 2; i < count; i++) {
			if (i == 3 || i == 7 || i == 9 || i == 10 || i == 11) {
			} else {
				String name = My_Account_List.get(i).getText();
				Reporter.log(j++ + ") " + name, true);
			}
		}
	}

	public void TestCase_077() throws InterruptedException {
		Sign_In_Button_In_Home_Page.click();
		Thread.sleep(2000);
		Email_In_Login_Page.sendKeys("d47783602@gmail.com");
		Thread.sleep(2000);
		Password_In_Login_Page.sendKeys("Demoaccount@30");
		Thread.sleep(2000);
		Login_Button.click();
		Thread.sleep(3000);
		Demo_Account_Drop_Down.click();
		Thread.sleep(2000);
		My_Account.click();
		Thread.sleep(2000);
		String info = My_Account_Information.getText();
		Reporter.log(info, true);
	}

	public void TestCase_078() throws InterruptedException {
		Sign_In_Button_In_Home_Page.click();
		Thread.sleep(2000);
		Email_In_Login_Page.sendKeys("d47783602@gmail.com");
		Thread.sleep(2000);
		Password_In_Login_Page.sendKeys("Demoaccount@30");
		Thread.sleep(2000);
		Login_Button.click();
		Thread.sleep(3000);
		Demo_Account_Drop_Down.click();
		Thread.sleep(2000);
		My_Wish_List.click();
		Thread.sleep(2000);
		String text = My_Wish_List_Caution.getText();
		Reporter.log("Caution---> " + text, true);
	}

	public void TestCase_079() throws InterruptedException {
		Sign_In_Button_In_Home_Page.click();
		Thread.sleep(2000);
		Email_In_Login_Page.sendKeys("d47783602@gmail.com");
		Thread.sleep(2000);
		Password_In_Login_Page.sendKeys("Demoaccount@30");
		Thread.sleep(2000);
		Login_Button.click();
		Thread.sleep(3000);
		String text = Top_Content_In_Home_Page.getText();
		Reporter.log("Top Content is---> " + text, true);

	}

	public void TestCase_080() throws InterruptedException {
		Sign_In_Button_In_Home_Page.click();
		Thread.sleep(2000);
		Email_In_Login_Page.sendKeys("d47783602@gmail.com");
		Thread.sleep(2000);
		Password_In_Login_Page.sendKeys("Demoaccount@30");
		Thread.sleep(2000);
		Login_Button.click();
		Thread.sleep(3000);
		Demo_Account_Drop_Down.click();
		Thread.sleep(2000);
		Sign_Out.click();
		Thread.sleep(2000);
		Reporter.log("Logout Successfully...😊😊😊", true);
	}

}
