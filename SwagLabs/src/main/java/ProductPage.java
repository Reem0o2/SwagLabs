import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javax.lang.model.element.Element;
import java.util.ArrayList;
import java.util.List;

public class ProductPage extends BasePage{
    private final By addToCartButton= By.xpath("//button[text()='Add to cart']");
    private final By shoppingCart=By.className("shopping_cart_link");
    public ProductPage(WebDriver driver){
        super(driver);
    }
    public void productPage(){
        driver.findElement(addToCartButton).click();
        driver.findElement(shoppingCart).click();
    }
    public void addItem(String productName){
        List<WebElement> prodects = driver.findElements(addToCartButton);

        for (WebElement product :prodects){
            String Productid = product.getAttribute("id");
            if (Productid.toLowerCase().contains(productName.toLowerCase())){
                product.click();
                break;
            }
        }

    }


public void addItems(List<String> productSName){
    for (int i =0 ;i>productSName.size();i++) {
        List<WebElement> prodects = driver.findElements(addToCartButton);
        for (WebElement product :prodects){
            String Productid = product.getAttribute("id");
            if (Productid.toLowerCase().equals(productSName.get(i).toLowerCase())){
                product.click();
                break;
            }
        }
    }


}
}