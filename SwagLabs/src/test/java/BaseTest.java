import driver_factory.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import utils.ExcelFileManager;
import utils.JSONFileManager;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class BaseTest {
    public WebDriver driver;
   // public JSONFileManager jsonFileManager;
    public ExcelFileManager excelFileManager;
    @BeforeMethod
    public void Setup(){
         excelFileManager = new ExcelFileManager("src/Book1.xlsx","Sheet1");
      //  jsonFileManager =new JSONFileManager("src/Cridantial.json");
      driver= DriverFactory.getWebDriver("edge");
      driver.get("https://www.saucedemo.com/");
    }}
//    @AfterMethod
//    public void TearDown(){
//        driver.close();
//    }
//}

