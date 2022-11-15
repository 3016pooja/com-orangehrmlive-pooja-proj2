import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultibrowserOrangDemo {
    static String browser = "chrome";
    static String baseurl = "https://opensource-demo.orangehrmlive.com/";
    static WebDriver driver;

    public static void main(String[] args) {
        //1)set up the browser
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("Webdriver.chrome.driver", "drivers/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("Webdriver.gheko.driver","drivers/geckodriver.exe");
            driver=new FirefoxDriver();

        } else if (browser.equalsIgnoreCase("edge")) {
            System.setProperty("Webdriver.edge.driver","drivers/msedgedriver.exe");
            driver=new EdgeDriver();
        }else {
            System.out.println("Enter valid browser name.");
        }
        //2)open url
        driver.get(baseurl);
        //we give implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //3)print the tiltle of the pages
        System.out.println("Title of the page is "+driver.getTitle());
        //4)print the current url
        System.out.println("Current url is "+ driver.getCurrentUrl());
        //5)print the page source
        System.out.println("page source is "+driver.getPageSource());

        //6)enter the email id to email id field
        WebElement usernamefield = driver.findElement(By.name("username"));   //Found Email field
        usernamefield.sendKeys("Admin");

        //7)Enter the passweord to password field
        WebElement passwordfield=driver.findElement(By.name("password"));
        //found the password field
        passwordfield.sendKeys("rp30162cfg");

        //8)close the browser
        // driver.qui
    }
}

