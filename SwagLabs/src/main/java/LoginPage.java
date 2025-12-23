import org.openqa.selenium.By;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{
    private static final By  UserName= By.id("user-name");
    private static final By  Password= By.id("password");
    private static final By  LoginButton= By.id("login-button");

    public LoginPage(WebDriver driver){
        super(driver);
    }

public static void Login(String userName, String password){
        driver.findElement(UserName).clear();
        driver.findElement(Password).clear();
        driver.findElement(UserName).sendKeys(userName);
        driver.findElement(Password).sendKeys(password);
        driver.findElement(LoginButton).click();
}


}
