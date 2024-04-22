package StepDefinitions;

//import PageFactory.LoginPageFactory;
import PageFactory.LoginPageFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginStepsDefinition {
    static WebDriver driver;
    LoginPageFactory login ;




    @Given("User is on login page")
    public void user_is_on_login_page() {
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/v1/");
        driver.manage().window().maximize();

    }



    @When("User enters a valid {string} and {string}")
    public void user_enters_a_valid_and(String username, String password) {
     /*driver.findElement(By.name("user-name")).sendKeys(username);
     driver.findElement(By.id("password")).sendKeys(password);
     Thread.sleep(2000);*/
        login = new LoginPageFactory(driver);
       login.enterUsername(username);
        login.enterpassword(password);


    }

    @When("Click on submit button")
    public void click_on_submit_button() {
       //driver.findElement(By.id("login-button")).click();
        login.loginapp();

    }

    @Then("User is navigated to Home page")
    public void user_is_navigated_to_home_page() {

        //driver.findElement(By.xpath("//div[@class='app_logo']")).isDisplayed();
        login.ispageDispalyed();

    }

    @Then("Close the browser")
    public void close_the_browser() {
        driver.quit();

    }



    }


  
