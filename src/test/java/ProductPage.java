import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends PageObject{

    @FindBy(xpath = "//span[contains(text(),'Products')]")
    private WebElement productsLabel;

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    private WebElement addToCart_SauceLabsBackpack;

    @FindBy(id = "shopping_cart_container")
    private WebElement carrito;

    @FindBy(id = "react-burger-menu-btn")
    private WebElement collap_menu;

    @FindBy(id = "logout_sidebar_link")
    private WebElement logout_btn;

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public String getTitle(){
        return this.productsLabel.getText();
    }

    public void addToCartBackpack(){
        this.addToCart_SauceLabsBackpack.click();
    }

    public String getCardBadge(){
        return this.carrito.getText();
    }

    public void open_collap_menu() {
        this.collap_menu.click();
    }

    public void logout() {
        this.logout_btn.click();
    }
}
