package ru.leroymerlin.tests;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.leroymerlin.base.TestBase;
import ru.leroymerlin.helpers.DriverUtils;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.*;
import static org.assertj.core.api.Assertions.assertThat;

import static io.qameta.allure.Allure.step;

public class StartPageTests extends TestBase {
    @Test
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
    @DisplayName("Page title should have empty header text")
    void titleTest() {
        step("Open url 'https://leroymerlin.ru'", () ->
                open(""));

        step("Page title should have empty text ''", () -> {
            String expectedTitle = "";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @DisplayName("Page should have logo image")
    void logoTest() {
        step("Open start page", () ->
                open(""));

        step("Page should have logo image", () -> {
            $x("//img[@src='/etc/designs/elbrus/images/logo.svg']")
                    .shouldBe(Condition.visible, Duration.ofMillis(WAITING_TIMEOUT));

        });
    }
}
