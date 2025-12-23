public class CheckOutTest extends BaseTest{
    public void CheckOut(){
        CheckOutPage checkPage = new CheckOutPage(driver);
        checkPage.CheckOut("Reem","Ayman","12345");
    }

}
