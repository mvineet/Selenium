package demotc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Bike {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "D:\\geckoDriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://rental.odbase.nl/");
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		driver.findElement(By.cssSelector("div.maine_menu")).click();
	    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	    driver.findElement(By.linkText("Login")).click();
	    String loginName = "vineet@od-base.com";
	    driver.findElement(By.name("email")).click();
	    driver.findElement(By.name("email")).clear();
	    driver.findElement(By.name("email")).sendKeys(loginName);
	    driver.findElement(By.name("password")).click();
	    driver.findElement(By.name("password")).clear();
	    driver.findElement(By.name("password")).sendKeys("123456");
	    driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
		
	    
	    driver.findElement(By.cssSelector("div.maine_menu")).click();
		driver.findElement(By.linkText("Search")).click();
		
			//Search Start	
  //to find autosugestion
		  WebElement from= driver.findElement(By.id("autocomplete"));
	      from.clear();
	      from.sendKeys("Pato");
	      try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      
	      Actions builder=new Actions(driver);
	      builder.sendKeys(Keys.ARROW_DOWN).click().build().perform();
	      builder.moveToElement( from.findElement(By.xpath("//*[@id=\"longitude\"]"))).click().build().perform();
				
		
		driver.findElement(By.name("start_date")).click();
		driver.findElement(By.name("end_date")).click();
		driver.findElement(By.name("start_time")).click();
		driver.findElement(By.name("end_time")).click();
		driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Search Completed
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		//Select Type of Bike
		driver.findElement((By.xpath("//*[@id=\"search_result\"]/div/div[1]/div[2]/div/div[1]/div[2]/a[1]/img")));
		driver.findElement((By.xpath("//*[@id=\"search_result\"]/div/div[1]/div[2]/div/div[1]/div[2]/a[1]/img"))).click();
		
	
	//Bike Selection  	    
	    driver.findElement(By.cssSelector("a.font-32")).click();
	    driver.findElement(By.cssSelector("i.fa.fa-angle-up.pull-right")).click();
	    driver.findElement(By.cssSelector("div.quantity-button.quantity-up.fa.fa-plus")).click();
	    driver.findElement(By.xpath("//div[@id='mb-normal-bike']/div[3]/div/div/div/div[2]/h4/a/i")).click();
	    
	    try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    //driver.findElement(By.cssSelector("#normaBikeSubB000010 > div.bike-quantity.bg_dark_gray.row > div.col-xs-6 > div.quantity > div.quantity-nav > div.quantity-button.quantity-up.fa.fa-plus")).click();
	    //driver.findElement(By.cssSelector("div.panel-body.bg_dark_gray > div.row > div.col-xs-6 > div.quantity > div.quantity-nav > div.quantity-button.quantity-up.fa.fa-plus")).click();
	    
	    driver.findElement(By.xpath("//div[@id='wrapper']/div[4]/div[3]/div/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/div/div")).click();
	    driver.findElement(By.xpath("//div[@id='wrapper']/div[4]/div[3]/div/div[2]/div[2]/div/div[2]/div[3]/div[2]/div/div/div")).click();
	    
	    try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    driver.findElement(By.cssSelector("input.btn.btn-next-details.btn-secondary.big-btn.m-b20")).click();
	    
	    
	   //Add Drivers Details
	    
	    driver.findElement(By.id("temp_address")).click();
	    driver.findElement(By.id("temp_address")).clear();
	    driver.findElement(By.id("temp_address")).sendKeys("Hotel Roge Villa");
	    driver.findElement(By.id("address_second")).clear();
	    driver.findElement(By.id("address_second")).sendKeys("23/7");
	    driver.findElement(By.id("address_third")).clear();
	    driver.findElement(By.id("address_third")).sendKeys("Hotel Roge Villa Appartment");
	    driver.findElement(By.id("country")).click();
	    new Select(driver.findElement(By.id("country"))).selectByVisibleText("INDIA");
	    driver.findElement(By.id("country")).click();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    driver.findElement(By.id("city")).click();
	    new Select(driver.findElement(By.id("city"))).selectByVisibleText("Hazrat Ganj, Uttar Pradesh, India");
	    driver.findElement(By.id("city")).click();
	    
	    driver.findElement(By.name("phonecode")).click();
	    new Select(driver.findElement(By.name("phonecode"))).selectByVisibleText("+1");
	    driver.findElement(By.name("phonecode")).click();
	    driver.findElement(By.name("phone")).click();
	    driver.findElement(By.name("phone")).clear();
	    driver.findElement(By.name("phone")).sendKeys("9875462145");
	    driver.findElement(By.cssSelector("label")).click();
	    driver.findElement(By.name("landmark")).click();
	    driver.findElement(By.name("landmark")).clear();
	    driver.findElement(By.name("landmark")).sendKeys("Behind SH Plaza");
	    driver.findElement(By.id("delivery_time")).click();
	    driver.findElement(By.id("pickup_time")).click();
	    driver.findElement(By.cssSelector("label > div.clearfix")).click();
	    driver.findElement(By.cssSelector("span.col-xs-3 > select[name=\"phonecode\"]")).click();
	    new Select(driver.findElement(By.cssSelector("span.col-xs-3 > select[name=\"phonecode\"]"))).selectByVisibleText("+1");
	    driver.findElement(By.cssSelector("span.col-xs-3 > select[name=\"phonecode\"]")).click();
	    driver.findElement(By.name("p_no")).click();
	    driver.findElement(By.name("p_no")).clear();
	    driver.findElement(By.name("p_no")).sendKeys("987456645");
	    driver.findElement(By.cssSelector("li.wp-details > div.checkbox > label")).click();
	    driver.findElement(By.name("Save")).click();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    //Add Card Details
	    
	    driver.findElement(By.cssSelector("div.logo_cont > a > img")).click();
	    driver.findElement(By.name("card_number_1")).click();
	    driver.findElement(By.name("card_number_1")).clear();
	    driver.findElement(By.name("card_number_1")).sendKeys("4321");
	    driver.findElement(By.name("card_number_2")).clear();
	    driver.findElement(By.name("card_number_2")).sendKeys("1234");
	    driver.findElement(By.name("card_number_3")).clear();
	    driver.findElement(By.name("card_number_3")).sendKeys("9876");
	    driver.findElement(By.name("card_number_4")).clear();
	    driver.findElement(By.name("card_number_4")).sendKeys("6789");
	    driver.findElement(By.name("card_name")).clear();
	    driver.findElement(By.name("card_name")).sendKeys("cleint twenty");
	    driver.findElement(By.name("card_month")).click();
	    new Select(driver.findElement(By.name("card_month"))).selectByVisibleText("4");
	    driver.findElement(By.name("card_month")).click();
	    driver.findElement(By.name("card_year")).click();
	    new Select(driver.findElement(By.name("card_year"))).selectByVisibleText("2022");
	    driver.findElement(By.name("card_year")).click();
	    driver.findElement(By.name("card_cvv")).click();
	    driver.findElement(By.name("card_cvv")).clear();
	    driver.findElement(By.name("card_cvv")).sendKeys("123");
	    driver.findElement(By.cssSelector("div.checkbox.m-t20 > label")).click();
	    driver.findElement(By.id("make_payment")).click();
	    System.out.println("Booking Successful");
	    System.out.println("Test Case Passed");
	    	    
  }

}
