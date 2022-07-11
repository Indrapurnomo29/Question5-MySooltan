package OctoClick;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepOctoClickSuccess {
    WebDriver driver;

    @Given("^User open chrome$")
    public void User_open_chrome() throws Throwable {
//        System.out.println("This step user open chrome to buy pillow");
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.midtrans.com/");
        Thread.sleep(1000);
        driver.findElement(By.linkText("BUY NOW")).click();
    }

    @When("^User input valid data to buy pillow with Octo Click payment method$")
    public void User_input_valid_data_to_buy_pillow_with_Octo_Click_payment_method() throws Throwable {
//        System.out.println("This step user input valid data to buy pillow");
        driver.findElement(By.className("cart-checkout")).click();
        Thread.sleep(1000);
        driver.findElement(By.linkText("OCTO Clicks")).click();
        Thread.sleep(1000);
        driver.findElement(By.linkText("Pay now")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("account")).sendKeys("testuser00");
        Thread.sleep(1000);
    }

    @Then("^User successfully buy pillow with Octo Click payment method$")
    public void User_successfully_buy_pillow_with_Octo_Click_payment_method() throws Throwable {
//        System.out.println("This step user successfully buy pillow in Demo Midtrans site");
        driver.findElement(By.linkText("Bayar")).click();
        Thread.sleep(5000);
    }
}
