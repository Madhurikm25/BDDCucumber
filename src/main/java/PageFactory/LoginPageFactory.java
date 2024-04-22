package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory {

     static WebDriver driver;

    @FindBy(name ="user-name")
    WebElement txt_username;
    @FindBy(id ="password")
    WebElement txt_password;
    @FindBy(id ="login-button")
    WebElement txt_login;

    @FindBy(xpath="//div[@class='app_logo']")
    WebElement txt_applogo;


    public LoginPageFactory(WebDriver driver)
    {
        LoginPageFactory.driver = driver;
        PageFactory.initElements(driver, this);

    }


    public void enterUsername(String username)
    {
        txt_username.sendKeys(username);

    }
    public void enterpassword(String password)
    {
        txt_password.sendKeys(password);

    }
    public void loginapp()
    {
        txt_login.click();

    }

    public void ispageDispalyed()
    {
        txt_applogo.isDisplayed();
    }




}
