package CreditCard;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepCreditCardSuccess {
    WebDriver driver;

    @Given("^User open chrome and launch Demo Midtrans site$")
    public void User_open_chrome_and_launch_Demo_Midtrans_site() throws Throwable {
//        System.out.println("This step user open chrome to buy pillow");
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.midtrans.com/");
        Thread.sleep(1000);
        driver.findElement(By.linkText("BUY NOW")).click();
    }

    @When("^User input valid data to buy pillow in Demo Midtrans site$")
    public void User_input_valid_data_to_buy_pillow_in_Demo_Midtrans_site() throws Throwable {
//        System.out.println("This step user input valid data to buy pillow");
        driver.findElement(By.className("cart-checkout")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"application\"]/div/a[1]/div[1]/div[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"application\"]/div/div[2]/div[2]/input")).sendKeys("4811111111111114");
        Thread.sleep(1000);
        driver.findElement(By.id("card-expiry")).sendKeys("0125");
        Thread.sleep(1000);
        driver.findElement(By.id("card-cvv")).sendKeys("123");
        Thread.sleep(1000);
        driver.findElement(By.linkText("Pay now")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("PaRes")).sendKeys("112233");
        Thread.sleep(1000);
    }

    @Then("^User successfully buy pillow$")
    public void User_successfully_buy_pillow() throws Throwable {
//        System.out.println("This step user successfully buy pillow in Demo Midtrans site");
        driver.findElement(By.linkText("OK")).click();
        Thread.sleep(5000);
    }
}
