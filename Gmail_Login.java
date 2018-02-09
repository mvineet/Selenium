package demotc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_Login {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");

		
		WebDriver driver=new ChromeDriver();

		
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");

	    driver.manage().window().maximize();

		System.out.println("Selenium Webdriver Script in Chrome browser");

		String expectedTitle = " Sign in - Google Accounts ";
		 String actualTitle = driver.getTitle();
		
		 if (expectedTitle.equals(actualTitle))
		 {
			  System.out.println("Verification Successful - The correct title is displayed on the web page.");
			  
	     }
		 
	  else
	  {
		  
		  System.out.println("Verification Failed - An incorrect title is displayed on the web page.");
		  
		  
	   }
		 
		  WebElement username = driver.findElement(By.id("identifierId"));
			
		  username.clear();
		  username.sendKeys("TestSelenium");
		  
		  WebElement SignInButton = driver.findElement(By.cssSelector("span.RveJvd.snByac"));
		  SignInButton.click();
		 
		 // WebDriverWait wait=new WebDriverWait(driver, 20); 
		  		  
		  WebElement password = driver.findElement(By.id("Passwd"));
		                password.clear();
		                password.sendKeys("password123");

	
		}

}
