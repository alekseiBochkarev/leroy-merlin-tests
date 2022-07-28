package ru.leroymerlin.tests;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import ru.leroymerlin.base.TestBase;
import ru.leroymerlin.helpers.DriverUtils;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.*;
import static org.assertj.core.api.Assertions.assertThat;

import static io.qameta.allure.Allure.step;

public class StartPageTests extends TestBase {

    @Test
    @Tag("smoke")
    @DisplayName("Page console log should not have errors")
    void consoleShouldNotHaveErrorsTest() {
        step("Open start page", () ->
                open(""));
        step("Console logs should not contain text 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }

    @Test
    @Tag("smoke")
    @DisplayName("Page title should have header text")
    void titleTest() {
        step("Open start page", () ->
                open(""));
        step("Page title should have text 'Leroy Merlin: Τα πάντα για την ανακαίνιση του σπιτιού σου, σε έναν προορισμό!'", () -> {
            String expectedTitle = "Leroy Merlin: Τα πάντα για την ανακαίνιση του σπιτιού σου, σε έναν προορισμό!";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @Tag("smoke")
    @DisplayName("Page should have logo image")
    void logoTest() {
        step("Open start page", () ->
                open(""));
        step("Page should have logo image", () -> {
            $x("//img[@src='/img/logo.svg']")
                    .shouldBe(Condition.visible, Duration.ofMillis(WAITING_TIMEOUT));

        });
    }
}
