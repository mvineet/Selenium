package demotc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class Account_Client {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "D:\\geckoDriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://rental.odbase.nl/");
		
		driver.findElement(By.cssSelector("div.maine_menu")).click();
	    driver.findElement(By.linkText("Login")).click();
	    driver.findElement(By.name("email")).click();
	    driver.findElement(By.name("email")).clear();
	    driver.findElement(By.name("email")).sendKeys("client20@gmail.com");
	    driver.findElement(By.id("password")).click();
	    driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("123456");
	    driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
	    driver.findElement(By.linkText("Account information")).click();
	    driver.findElement(By.cssSelector("img.img-arrow.pull-left")).click();
	    driver.findElement(By.cssSelector("a.fa.fa-user-circle-o")).click();
	    driver.findElement(By.linkText("Account Settings")).click();
	    driver.findElement(By.linkText("Edit Profile")).click();
	    System.out.println("Start of Account Edit Profile");
	    
	    driver.findElement(By.xpath("//div[@id='personalData']/div/div/div/label")).click();
	    driver.findElement(By.xpath("//div[@id='personalData']/div/div/div/label[2]")).click();
	    driver.findElement(By.xpath("//div[@id='personalData']/div/div/div/label")).click();
	    
	    driver.findElement(By.name("first_name")).click();
	    driver.findElement(By.name("first_name")).clear();
	    driver.findElement(By.name("first_name")).sendKeys("client");
	    driver.findElement(By.name("last_name")).click();
	    driver.findElement(By.name("last_name")).clear();
	    driver.findElement(By.name("last_name")).sendKeys("twenty");
	    
	    new Select(driver.findElement(By.name("nationality"))).selectByIndex(1);
	    driver.findElement(By.name("id_number")).click();
	    driver.findElement(By.name("id_number")).clear();
	    driver.findElement(By.name("id_number")).sendKeys("AROP34DC");
	    String idNumber = "name=id_number";
	    
	    driver.findElement(By.id("selectMonth")).click();
	    new Select(driver.findElement(By.id("selectMonth"))).selectByVisibleText("11");
	    driver.findElement(By.id("selectDate")).click();
	    new Select(driver.findElement(By.id("selectDate"))).selectByVisibleText("27");
	    driver.findElement(By.id("selectYear")).click();
	    new Select(driver.findElement(By.id("selectYear"))).selectByVisibleText("1987");
	    new Select(driver.findElement(By.id("defaultlanguage"))).selectByIndex(1);
	    
	    driver.findElement(By.name("address")).click();
	    driver.findElement(By.name("address")).clear();
	    driver.findElement(By.name("address")).sendKeys("client 20 Address Line 1");
	    driver.findElement(By.id("country")).click();
	    new Select(driver.findElement(By.id("country"))).selectByIndex(1);
	    driver.findElement(By.id("city")).click();
	    new Select(driver.findElement(By.id("city"))).selectByIndex(1);
	    
	    driver.findElement(By.name("phonecode")).click();
	    driver.findElement(By.name("phonecode")).clear();
	    driver.findElement(By.name("phonecode")).sendKeys("011");
	    driver.findElement(By.name("phone")).click();
	    driver.findElement(By.name("phone")).clear();
	    driver.findElement(By.name("phone")).sendKeys("98654253357");
	    driver.findElement(By.cssSelector("li.sms-details > div.checkbox > label")).click();
	    driver.findElement(By.cssSelector("div.checkbox > label")).click();
	    
	    //Add Driver
	    
	    //driver.findElement(By.linkText("Connected Drivers")).click();
	    driver.findElement(By.linkText("Add Driver")).click();
	    driver.findElement(By.name("gender")).click();
	    new Select(driver.findElement(By.name("gender"))).selectByIndex(1);
	    driver.findElement(By.name("first_name")).click();
	    driver.findElement(By.name("first_name")).clear();
	    driver.findElement(By.name("first_name")).sendKeys("driver");
	    driver.findElement(By.name("last_name")).click();
	    driver.findElement(By.name("last_name")).clear();
	    driver.findElement(By.name("last_name")).sendKeys("twenty");
	    driver.findElement(By.name("nationality")).click();
	    new Select(driver.findElement(By.name("nationality"))).selectByIndex(2);
	    driver.findElement(By.name("id_type")).click();
	    new Select(driver.findElement(By.name("id_type"))).selectByIndex(1);
	    driver.findElement(By.name("id_number")).click();
	    driver.findElement(By.name("id_number")).clear();
	    driver.findElement(By.name("id_number")).sendKeys("AWER14578224");
	    String dateTime ="2006-06-12";
	    driver.findElement(By.xpath("//*[@id=\"collapseConnectedDrivers\"]/form/div/ul/li[7]/span[2]/input")).click();
	    driver.findElement(By.xpath("//*[@id=\"collapseConnectedDrivers\"]/form/div/ul/li[7]/span[2]/input")).sendKeys(dateTime);
	    //driver.findElement(By.name("dob")).click();
	    //driver.findElement(By.name("dob")).sendKeys("07101989");
	    driver.findElement(By.name("email")).click();
	    driver.findElement(By.name("email")).clear();
	    driver.findElement(By.name("email")).sendKeys("driver_twenty@gmail.com");
	    driver.findElement(By.name("phone_no")).click();
	    driver.findElement(By.name("phone_no")).clear();
	    driver.findElement(By.name("phone_no")).sendKeys("478598654122");
	    driver.findElement(By.cssSelector("button.save-btn")).click();
	    
	    //Add Credit Card
	    
	    //driver.findElement(By.linkText("My Credit Card List")).click();
	    driver.findElement(By.linkText("Add Credit Card")).click();
	    driver.findElement(By.cssSelector("div.col-xs-12.card-details > div.row > div.col-xs-6 > a > img")).click();
	    driver.findElement(By.name("card_number_1")).click();
	    driver.findElement(By.name("card_number_1")).clear();
	    driver.findElement(By.name("card_number_1")).sendKeys("1234");
	    driver.findElement(By.name("card_number_2")).click();
	    driver.findElement(By.name("card_number_2")).clear();
	    driver.findElement(By.name("card_number_2")).sendKeys("5678");
	    driver.findElement(By.name("card_number_3")).click();
	    driver.findElement(By.name("card_number_3")).clear();
	    driver.findElement(By.name("card_number_3")).sendKeys("9012");
	    driver.findElement(By.name("card_number_4")).click();
	    driver.findElement(By.name("card_number_4")).clear();
	    driver.findElement(By.name("card_number_4")).sendKeys("3456");
	    driver.findElement(By.name("name_on_card")).click();
	    driver.findElement(By.name("name_on_card")).clear();
	    driver.findElement(By.name("name_on_card")).sendKeys("client twenty");
	    driver.findElement(By.name("card_month")).click();
	    new Select(driver.findElement(By.name("card_month"))).selectByVisibleText("6");
	    driver.findElement(By.name("card_month")).click();
	    driver.findElement(By.name("card_year")).click();
	    new Select(driver.findElement(By.name("card_year"))).selectByVisibleText("2023");
	    driver.findElement(By.name("card_year")).click();
	    driver.findElement(By.name("ccw")).click();
	    driver.findElement(By.name("ccw")).clear();
	    driver.findElement(By.name("ccw")).sendKeys("342");
	    driver.findElement(By.name("Save")).click();
	    
	    //Back to Account Setting Page
	    driver.findElement(By.name("Save")).click();
	    driver.findElement(By.cssSelector("a.fa.fa-user-circle-o")).click();
	    driver.findElement(By.linkText("Logout")).click();
	    
	    
	}

}
