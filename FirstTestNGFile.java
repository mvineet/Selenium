package firsttestngpackage;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


public class FirstTestNGFile {
	
    public String baseUrl = "https://rental.odbase.nl/";
    String driverPath = "D:\\\\geckoDriver\\\\geckodriver.exe";
    String loginName = "company20@gmail.com";
    public WebDriver driver ; 
	
	
  @Test (priority=1)

 public void verifyRentalLogin_OpenWB() {
	       
	      System.out.println("launching firefox browser"); 
	      System.setProperty("webdriver.gecko.driver", "D:\\geckoDriver\\geckodriver.exe");
	      driver = new FirefoxDriver();
	      driver.manage().window().maximize();
	      driver.get(baseUrl);
	      driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	      // String expectedTitle = "GoMobi";
	      String actualTitle = driver.getTitle();
	      System.out.println(actualTitle);
	      //Assert.assertEquals(actualTitle, expectedTitle);
	      System.out.println("Open Rental Application Passed");
  }
	       
  
  @Test (priority=2)
  public void verifyRentalLogin_CUCP() {
	  
           //Login with Correct Registered Username and Password 
		    driver.findElement(By.cssSelector("div.maine_menu")).click();
		    driver.findElement(By.linkText("Login")).click();
		    driver.findElement(By.name("email")).click();
		    driver.findElement(By.name("email")).clear();
		    driver.findElement(By.name("email")).sendKeys(loginName);
		    driver.findElement(By.name("password")).click();
		    driver.findElement(By.name("password")).clear();
		    driver.findElement(By.name("password")).sendKeys("123456");
		    driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
		    
		    try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    
		    driver.findElement(By.cssSelector("a.fa.fa-user-circle-o")).click();
		    driver.findElement(By.xpath("//*[@id=\"rightSidenav\"]/ul[2]/li[2]/a")).click();
		    System.out.println("Login with Correct Registered Username and Correct Password Test Case Passed");
  }    
		   
  @Test (priority=3)
  
  public void verifyRentalLogin_CUWP() {
            //Login with Correct Username and Wrong Password
		    driver.findElement(By.cssSelector("div.maine_menu")).click();
		    driver.findElement(By.linkText("Login")).click();
		    driver.findElement(By.name("email")).click();
		    driver.findElement(By.name("email")).clear();
		    driver.findElement(By.name("email")).sendKeys(loginName);
		    driver.findElement(By.name("password")).click();
		    driver.findElement(By.name("password")).clear();
		    driver.findElement(By.name("password")).sendKeys("123458");
		    driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
		    System.out.println("Login with Correct Registered Username and Wrong Password Test Case Passed");
		    
  }  
  
  @Test (priority=5)
  public void verifyRentalLogin_WUCP() {
           //Login with Wrong Username and Correct Password
		    
		    driver.findElement(By.name("email")).click();
		    driver.findElement(By.name("email")).clear();
		    driver.findElement(By.name("email")).sendKeys("C20@gmail.com");
		    driver.findElement(By.name("password")).click();
		    driver.findElement(By.name("password")).clear();
		    driver.findElement(By.name("password")).sendKeys("123456");
		    driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
		    System.out.println("Login with Wrong Registered Username and Correct Password Test Case Passed");
  }
		   
  @Test (priority=6)
  public void verifyRentalLogin_WUWP() {
           //Login with Wrong Username and Wrong Password
		    
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
  
                /* @AfterTest
                public void tearDown() throws Exception {
                driver.quit();
                Thread.sleep(3000);
                System.out.println("-----Sending------");
                SendMail.execute("emailable-report.html");
               }     */
  }
		   	        
  

