package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));  // 10-second timeout
        PageFactory.initElements(driver, this);
    }

    // Correct locators based on current OrangeHRM login page

    @FindBy(how = How.NAME, using = "username")
    public WebElement txtUserName;

    @FindBy(how = How.NAME, using = "password")
    public WebElement txtPassword;

    @FindBy(how = How.CSS, using = "button[type='submit']")
    public WebElement btnLogin;

    public void Login(String userName, String password) {
        txtUserName.sendKeys(userName);
        txtPassword.sendKeys(password);
    }

    public void ClickLogin() {
        btnLogin.click();
    }
}
