import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginForm extends PageObject{

    private final String USERNAME = "standard_user";
    private final String PASSWORD = "secret_sauce";

    public LoginForm(WebDriver driver) {
        super(driver);
    }

    @FindBy(id="user-name")
    private WebElement username;

    @FindBy(id="password")
    private WebElement password;

    @FindBy(id="login-button")
    private WebElement loginButton;

    @FindBy(xpath = "//div[contains(@class, 'error-message-container error')]/h3")
    private WebElement loginErrorLabel;

    @FindBy(id = "login-button")
    private WebElement login_button;

    public void enterUsername(){
        this.username.sendKeys(USERNAME);
    }

    public void enterWrongPassword(){
        this.password.sendKeys(USERNAME);
    }

    public void enterPassword(){
        this.password.sendKeys(PASSWORD);
    }

    public void clickLoginButton(){
        this.loginButton.click();
    }

    public String getErrorLabel(){
        return this.loginErrorLabel.getText();
    }

    public void pressLoginButton() {
        this.login_button.click();
    }
}
