package demotc;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Rental_Regitration {
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver", "D:\\geckoDriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://rental.odbase.nl/");
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		    //Registration of Client
		
		    driver.findElement(By.cssSelector("div.maine_menu")).click();
		    driver.findElement(By.linkText("Register")).click();
		    driver.findElement(By.linkText("I am looking for bikes")).click();
		    String clientName = "clientC@gmail.com";
		    driver.findElement(By.id("email")).click();
		    driver.findElement(By.id("email")).sendKeys(clientName);
		    String clientpassWord = "123456";
		    driver.findElement(By.id("password")).click();
		    driver.findElement(By.id("password")).clear();
		    driver.findElement(By.id("password")).sendKeys(clientpassWord);
		    driver.findElement(By.id("password-confirm")).click();
		    driver.findElement(By.id("password-confirm")).clear();
		    driver.findElement(By.id("password-confirm")).sendKeys(clientpassWord);
		    driver.findElement(By.id("defaultlanguage")).click();
		    new Select(driver.findElement(By.id("defaultlanguage"))).selectByVisibleText("English UK");
		    driver.findElement(By.xpath("//button[@type='submit']")).click();
		    System.out.println("User Registered Successfully");
		    driver.findElement(By.cssSelector("a.fa.fa-user-circle-o")).click();
		    driver.findElement(By.linkText("Logout")).click();
		    
		    //Login with Registered Client
		    driver.findElement(By.cssSelector("div.maine_menu")).click();
		    driver.findElement(By.linkText("Login")).click();
		    driver.findElement(By.name("email")).click();
		    driver.findElement(By.name("email")).clear();
		    driver.findElement(By.name("email")).sendKeys(clientName);
		    driver.findElement(By.id("password")).click();
		    driver.findElement(By.id("password")).clear();
		    driver.findElement(By.id("password")).sendKeys(clientpassWord);
		    driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
		    driver.findElement(By.cssSelector("a.fa.fa-user-circle-o")).click();
		    driver.findElement(By.linkText("Logout")).click();
		    System.out.println("Cleint Login Successfull");
		
		    //Registration of Company

		    driver.findElement(By.cssSelector("div.maine_menu")).click();
		    driver.findElement(By.linkText("Register")).click();
		    driver.findElement(By.linkText("I am a Company, want to list my bikes")).click();
		    String companyName = "companyC@gmail.com";
		    driver.findElement(By.id("email")).click();
		    driver.findElement(By.id("email")).sendKeys(companyName);
		    String companyPassWord = "123456";
		    driver.findElement(By.id("password")).click();
		    driver.findElement(By.id("password")).clear();
		    driver.findElement(By.id("password")).sendKeys(companyPassWord);
		    driver.findElement(By.id("password-confirm")).click();
		    driver.findElement(By.id("password-confirm")).clear();
		    driver.findElement(By.id("password-confirm")).sendKeys(companyPassWord);
		    driver.findElement(By.id("defaultlanguage")).click();
		    new Select(driver.findElement(By.id("defaultlanguage"))).selectByVisibleText("English UK");
		    driver.findElement(By.xpath("//button[@type='submit']")).click();
		    System.out.println("Company Registered Successfully");
		    driver.findElement(By.cssSelector("a.fa.fa-user-circle-o")).click();
		    driver.findElement(By.linkText("Logout")).click();
		    
		    //Login with Registered Company
		    driver.findElement(By.cssSelector("div.maine_menu")).click();
		    driver.findElement(By.linkText("Login")).click();
		    driver.findElement(By.name("email")).click();
		    driver.findElement(By.name("email")).clear();
		    driver.findElement(By.name("email")).sendKeys(companyName);
		    driver.findElement(By.id("password")).click();
		    driver.findElement(By.id("password")).clear();
		    driver.findElement(By.id("password")).sendKeys(companyPassWord);
		    driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
		    driver.findElement(By.cssSelector("a.fa.fa-user-circle-o")).click();
		    driver.findElement(By.linkText("Logout")).click();
		    System.out.println("Company Login Successfull");
		    System.out.println("Test Case Passed");
		   		   
		
	}
}
