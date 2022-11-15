import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FirefoxOrangeDemo {
    public static void main(String[] args) {
        //1.set the browser
        String baseurl="https://opensource-demo.orangehrmlive.com/";
        System.setProperty("Webdriver.gecko.driver","drivers/geckodriver.exe");
        WebDriver driver=new FirefoxDriver();

        //2)open the URL
        driver.get(baseurl);
        //we give implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //Get the title of the page
        String title= driver.getTitle();
        System.out.println("Page title is :"+ title);

        //3)print the tilte of the page
        System.out.println("Print the title of the page"+driver.getTitle());

        //4.Print the current url
        System.out.println("Print the current Url"+driver.getCurrentUrl());
        //5.Print the page source
        System.out.println("Page source is"+driver.getPageSource());

        //6.Enter the email to email field
        WebElement emailidField=driver.findElement(By.name("username"));
        //writing the email id to the field
        emailidField.sendKeys("Admin");

        //7.Enter the password to password field
        WebElement passwordField=driver.findElement(By.name("password"));
        //writng the  password to passwrod field
        passwordField.sendKeys("poojarony12354");

        //  8.Close the browser
        //driver.quit();

    }
}


