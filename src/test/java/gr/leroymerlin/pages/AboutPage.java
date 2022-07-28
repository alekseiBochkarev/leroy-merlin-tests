package gr.leroymerlin.pages;

import com.codeborne.selenide.Condition;
import gr.leroymerlin.base.TestBase;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

public class AboutPage extends TestBase {
    public void checkTitleShouldHaveText(String titleText) {
        $("h1").shouldHave(Condition.text(titleText), Duration.ofMillis(WAITING_TIMEOUT));
    }

}
