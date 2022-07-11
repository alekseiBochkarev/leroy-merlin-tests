package ru.leroymerlin.pages;

import com.codeborne.selenide.Condition;
import ru.leroymerlin.base.TestBase;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$x;

public class AboutPage extends TestBase {
    public void checkTitleShouldHaveText (String titleText) {
        $x("//h1")
                .shouldHave(Condition.text(titleText), Duration.ofMillis(WAITING_TIMEOUT));
    }

    public void checkDescriptionShouldHaveText (String descriptionText) {
        $x("//span/br")
                .shouldHave(Condition.text(descriptionText), Duration.ofMillis(WAITING_TIMEOUT));
    }
}
