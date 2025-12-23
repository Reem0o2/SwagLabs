import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPage extends BasePage {
    private final By CheckOutbutton = By.id("checkout");
    private final By FristNameField = By.id("first-name");
    private final By LastNameField = By.id("last-name");
    private final By BostalCode = By.id("postal-code");
    private final By ContinueButton = By.id("continue");
    private final By FinishButton = By.id("continue");
    public CheckOutPage(WebDriver driver) {
        super(driver);
    }
    public void CheckOut(String firstName, String lastName, String bostalCode){
        driver.findElement(CheckOutbutton).click();
        driver.findElement(FristNameField).sendKeys(firstName);
        driver.findElement(LastNameField).sendKeys(lastName);
        driver.findElement(BostalCode).sendKeys(bostalCode);
        driver.findElement(ContinueButton).click();
        driver.findElement(FinishButton).click();
    }
    }








