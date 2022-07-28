package gr.leroymerlin.tests;

import gr.leroymerlin.pages.BasketPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import gr.leroymerlin.base.TestBase;
import gr.leroymerlin.pages.StartPage;

import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class BasketPageTests extends TestBase {
    /***** Pages *****/
    private BasketPage basketPage = new BasketPage();
    private StartPage startPage = new StartPage();

    @Test
    @DisplayName("Add item to cart test")
    void addItemToCartTest() {
        step("Open start page", () -> {
            open("");
        });
        step("add item to cart and check", () -> {
            step("add item to cart", () -> {
                String itemName = startPage.addItemToCart();
                basketPage.checkItemInBasket(itemName);
            });
        });
    }
}
