package demotc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Openchrome {

public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");

// Initialize browser
WebDriver driver=new ChromeDriver();

// Open google
driver.get("https://rental.odbase.nl/");


// Maximize browser

driver.manage().window().maximize();

System.out.println("Selenium Webdriver Script in Chrome browser");


}

}