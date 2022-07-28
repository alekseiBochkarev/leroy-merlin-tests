package ru.leroymerlin.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import ru.leroymerlin.base.TestBase;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.*;

public class StartPage extends TestBase {

    public String addItemToCart() {
        SelenideElement item = $("article[aria-hidden='false']");
        String itemName = item.getAttribute("data-name");
        item.scrollIntoView(false).click();
        $("button[data-button-action='add-to-cart']")
                .shouldBe(Condition.visible, Duration.ofMillis(WAITING_TIMEOUT)).click();
        $("a[href='//www.leroymerlin.gr/gr/cart?action=show']")
                .shouldBe(Condition.visible, Duration.ofMillis(WAITING_TIMEOUT))
                .click();
        return itemName;
    }
}
