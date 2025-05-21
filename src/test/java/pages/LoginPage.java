package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        new WebDriverWait(driver, Duration.ofSeconds(10))
            .until(ExpectedConditions.visibilityOf(txtUserName));
    }

    @FindBy(how = How.NAME, using = "username")
    public WebElement txtUserName;

    @FindBy(how = How.NAME, using = "password")
    public WebElement txtPassword;

    @FindBy(how = How.CLASS_NAME, using = "orangehrm-login-button")
    public WebElement btnLogin;

    public void Login(String userName, String password) {
        txtUserName.clear();
        txtUserName.sendKeys(userName);

        txtPassword.clear();
        txtPassword.sendKeys(password);
    }

    public void ClickLogin() {
        btnLogin.click(); // Changed from .submit() to .click()
    }
}
