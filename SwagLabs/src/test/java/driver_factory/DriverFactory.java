package driver_factory;

import org.openqa.selenium.WebDriver;

public class DriverFactory {
    private static WebDriver driver=null;
    public static WebDriver getWebDriver(String BrowserName){

      if(driver==null){
          switch (BrowserName.toLowerCase()){
              case "chrome":
                  driver = ChromeDriveObject.getChromeDriver();
                  break;

              case "firefox":
                  driver = FireFoxDriverObject.getFireFoxDriver();
                  break;

              default:
                  driver = EdgeDriverObject.getEdgeDriver();
                  break;


          }
          return driver;

      }
        return driver;
      }

}
