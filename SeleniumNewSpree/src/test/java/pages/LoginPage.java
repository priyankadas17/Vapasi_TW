package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoginPage extends HomePage{

        @FindBy(id = "spree_user_email")
        WebElement username;
        @FindBy(css = "#spree_user_password")
        WebElement password;
        @FindBy(xpath = "//input[@value='Login']")
        WebElement loginButton;
        @FindBy(xpath = "//div[@class='alert alert-notice']")
        WebElement signOutAlert;
        @FindBy(xpath = "//div[@id='content']/div")
        WebElement successMessage;
        @FindBy(xpath ="//a[@href='/logout']")
        WebElement logOut;
        @FindBy(xpath = "//span[@title='Ruby on Rails Mug']")
        WebElement selectProduct;
        @FindBy(css = "button[id='add-to-cart-button']")
        WebElement addToCart;
        @FindBy(xpath = "//span[@class='amount']")
        WebElement cartAmount;
        @FindBy(xpath = "//input[@value='Empty Cart']")
        WebElement emptyCart;
        @FindBy(xpath ="//div[@class='alert alert-info']" )
        WebElement emptyAlert;

        public LoginPage(WebDriver driver) {
            super(driver);
        }

        public void logInSpree(String eMail,String pWord) {
            username.sendKeys(eMail);
            password.sendKeys(pWord);
            loginButton.click();

        }
        public boolean verifyLogInSpree(){
            String success = successMessage.getText();
            boolean loginMessage = success.equals("Logged in successfully");
            return loginMessage;

        }
        public void logOutSpree() {
            logOut.click();
            String logOut = signOutAlert.getText();

        }

        public boolean verifyLogout() {
            String logOut = signOutAlert.getText();
            boolean logOutMessage = logOut.equals("Signed out successfully.");
            return logOutMessage;

        }

        public void addToCart() {
            selectProduct.click();
            addToCart.click();

        }
        public boolean verifyAddToCart() {
            String amount = cartAmount.getText();
            Boolean amountInCart = amount.isBlank();
            return amountInCart;
        }
        public void deleteProductInCart() {
            emptyCart.click();
        }
        public void verifyDeleteProduct() {
            String delete = emptyAlert.getText();
            System.out.println(delete);
            Assert.assertEquals("Your cart is empty", delete);

        }
}
