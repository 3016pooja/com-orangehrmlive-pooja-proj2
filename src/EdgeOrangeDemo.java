import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeOrangeDemo {
    public static void main(String[] args) {
        String baseurl="https://opensource-demo.orangehrmlive.com/";
        System.setProperty("Webdriver.edge.driver","drivers/msedgedriver.exe");
        WebDriver driver=new EdgeDriver();

        //2)open the URL
        driver.get(baseurl);
        //we give implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


        //3)print the tilte of the page
        System.out.println("Print the title of the page"+driver.getTitle());

        //4.Print the current url
        System.out.println("Print the current Url"+driver.getCurrentUrl());
        //5.Print the page source
        System.out.println("Page source is"+driver.getPageSource());

        //6.Enter the email to email field
        WebElement usernamefield=driver.findElement(By.name("username"));
        //writing the email id to the field
        usernamefield.sendKeys("Admin");

        //7.Enter the password to password field
        WebElement passwordField=driver.findElement(By.name("password"));
        //writng the  password to passwrod field
        passwordField.sendKeys("admin123fj6");

        //  8.Close the browser
        //  driver.quit();

    }
}
