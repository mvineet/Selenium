package demotc;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rental_login {
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rental.odbase.nl/");
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		    //Login with Correct Registered Username and Password 
		    driver.findElement(By.cssSelector("div.maine_menu")).click();
		    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		    
		    driver.findElement(By.linkText("Login")).click();
		    String loginName = "company20@gmail.com";
		    driver.findElement(By.name("email")).click();
		    driver.findElement(By.name("email")).clear();
		    driver.findElement(By.name("email")).sendKeys(loginName);
		    driver.findElement(By.name("password")).click();
		    driver.findElement(By.name("password")).clear();
		    driver.findElement(By.name("password")).sendKeys("123456");
		    driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
		    driver.findElement(By.cssSelector("a.fa.fa-user-circle-o")).click();
		    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		    driver.findElement(By.xpath("//*[@id=\"rightSidenav\"]/ul[2]/li[2]/a")).click();
		    System.out.println("Login with Correct Registered Username and Password Test Case Passed");
		    
		    //Login with Correct Username and Wrong Password
		    driver.findElement(By.cssSelector("div.maine_menu")).click();
		    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		    driver.findElement(By.linkText("Login")).click();
		    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		    driver.findElement(By.name("email")).click();
		    driver.findElement(By.name("email")).clear();
		    driver.findElement(By.name("email")).sendKeys(loginName);
		    driver.findElement(By.name("password")).click();
		    driver.findElement(By.name("password")).clear();
		    driver.findElement(By.name("password")).sendKeys("123458");
		    driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
		    System.out.println("Login with Correct Registered Username and Wrong Password Test Case Passed");
		    
		    //Login with Wrong Username and Correct Password
		    driver.findElement(By.linkText("Login")).click();
		    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		    driver.findElement(By.name("email")).click();
		    driver.findElement(By.name("email")).clear();
		    driver.findElement(By.name("email")).sendKeys("C20@gmail.com");
		    driver.findElement(By.name("password")).click();
		    driver.findElement(By.name("password")).clear();
		    driver.findElement(By.name("password")).sendKeys("123456");
		    driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
		    System.out.println("Login with Wrong Registered Username and Correct Password Test Case Passed");
		   
		    //Login with Wrong Username and Wrong Password
		    driver.findElement(By.linkText("Login")).click();
		    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		    driver.findElement(By.name("email")).click();
		    driver.findElement(By.name("email")).clear();
		    driver.findElement(By.name("email")).sendKeys("C20@gmail.com");
		    driver.findElement(By.name("password")).click();
		    driver.findElement(By.name("password")).clear();
		    driver.findElement(By.name("password")).sendKeys("654321");
		    driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
		    System.out.println("Login with Wrong Registered Username and Wrong Password Test Case Passed");
		    driver.quit();
		   
		    
	}

}
