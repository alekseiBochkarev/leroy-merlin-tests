package ru.leroymerlin.pages;

import com.codeborne.selenide.Condition;
import ru.leroymerlin.base.TestBase;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$x;

public class BasketPage extends TestBase {
    public void checkItemInBasket(String itemName) {
        $x("//h4[contains(text(),'" + itemName + "')]")
                .shouldBe(Condition.visible, Duration.ofMillis(WAITING_TIMEOUT));
    }

}
