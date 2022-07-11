package ru.leroymerlin.pages;

import com.codeborne.selenide.Condition;
import ru.leroymerlin.base.TestBase;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class BasketPage extends TestBase {
    public void openBasketPage () {
        open("/cart?action=show");
    }

    public void checkItemInBasket (String itemName) {
        $x("//h4[contains(text(),'"+itemName+"')]")
                .shouldBe(Condition.visible, Duration.ofMillis(WAITING_TIMEOUT));
    }

}
