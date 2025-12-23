package driver_factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;

public class ChromeDriveObject {
    public static WebDriver getChromeDriver(){
        ChromeOptions option = new ChromeOptions();
        Map<String, Object> prefs =new HashMap<>();
        prefs.put("profile.password_manager_leak_detection", false);
        option.setExperimentalOption("prefs", prefs);
        WebDriver driver=new ChromeDriver(option);
        driver.manage().window().maximize();
        return driver;
    }
}
