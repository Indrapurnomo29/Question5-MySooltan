package Login;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.ArrayList;


public class StepLoginSuccess {
    WebDriver driver;

    @Given("^Open the chrome and launch Demo Midtrans site$")
    public void Open_the_chrome_and_launch_Demo_Midtrans_site() throws Throwable {
//        System.out.println("This step user open the chrome and launch Demo Midtrans site for buy pillow");
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.midtrans.com/");
        Thread.sleep(10000);
        driver.findElement(By.xpath("//a[contains(text(),'SIGN UP  →')]")).click();
        ArrayList tabs = new ArrayList (driver.getWindowHandles());
        System.out.println(tabs.size());
        driver.switchTo().window((String) tabs.get(0));
        driver.get("https://dashboard.midtrans.com/register");
        Thread.sleep(7000);
    }

    @When("^User input email address and password for login in Demo Midtrans site$")
    public void User_input_email_address_and_password_for_login_in_Demo_Midtrans_site() throws Throwable {
//        System.out.println("This step user input email address and password");
        driver.findElement(By.linkText("Login")).click();
        Thread.sleep(10000);
        driver.findElement(By.id("user_email")).sendKeys("indpurno@gmail.com");
        Thread.sleep(10000);
        driver.findElement(By.id("user_password")).sendKeys("Nusantara123#");
        Thread.sleep(5000);
    }

    @Then("^User successfully login$")
    public void User_successfully_login() throws Throwable {
//        System.out.println("This step user successfully login");
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        Thread.sleep(1000);
    }
}
