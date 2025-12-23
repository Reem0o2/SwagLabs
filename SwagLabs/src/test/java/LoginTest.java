import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import jdk.jfr.Description;
import net.bytebuddy.build.Plugin;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{
    @Test(priority = 1)
    @Severity(SeverityLevel.NORMAL)
    public void validLogin(){
        LoginPage loginPage = new LoginPage(driver);
       // LoginPage.Login((String) jsonFileManager.getValue("username"),(String) jsonFileManager.getValue("password"));
        loginPage.Login( excelFileManager. getSpecificalValue(0,1), excelFileManager.getSpecificalValue(1,1));



        //LoginPage.Login( excelFileManager. getSpecificalValue(1,0), excelFileManager. getSpecificalValue(1,1));
     //   logi
//        driver.findElement(By.id("user-name")).sendKeys("standard_user");
//        driver.findElement(By.id("password")).sendKeys("secret_sauce");
//        driver.findElement(By.id("login-button")).click();
//        ProductPage productPage = new ProductPage(driver);
        //productPage.addItems();
    }






//    @Test()
//    public void inValidLogin(){
//
//        driver.findElement(By.id("user-name")).sendKeys("standard_user");
//        driver.findElement(By.id("password")).sendKeys("secret_sauce");
//        driver.findElement(By.id("login-button")).click();
//    }


}
