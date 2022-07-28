package ru.leroymerlin.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import ru.leroymerlin.base.TestBase;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.*;

public class StartPage extends TestBase {

    public String addItemToCart() {
        SelenideElement item = $$x("//article[@aria-hidden='false']").get(0);
        String itemName = item.getAttribute("data-name");
        item.scrollIntoView(false).click();
        $x("//button[@data-button-action='add-to-cart']")
                .shouldBe(Condition.visible, Duration.ofMillis(WAITING_TIMEOUT)).click();
        $x("//a[@href='//www.leroymerlin.gr/gr/cart?action=show']")
                .shouldBe(Condition.visible, Duration.ofMillis(WAITING_TIMEOUT))
                .click();
        return itemName;
    }
}
