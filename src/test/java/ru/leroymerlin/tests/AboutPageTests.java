package ru.leroymerlin.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.leroymerlin.base.TestBase;
import ru.leroymerlin.pages.AboutPage;

import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class AboutPageTests extends TestBase {
    /***** Pages *****/
    AboutPage aboutPage = new AboutPage();

    @Test
    @DisplayName("title and desctiption should have text")
    void titleAndDescriptionTest() {
        step("Open about page", () ->
                open("/company"));

        step("check title should have text 'Η Ιστορία μας'", () -> {
            String expectedTitle = "Η Ιστορία μας";
            aboutPage.checkTitleShouldHaveText(expectedTitle);
        });
        step("check description should have description ", () -> {
            String expectedDescription = "Το 1923, ο Adolphe Leroy και η Rose Merlin, σύζυγοι και συνέταιροι, ανοίγουν ένα κατάστημα με αμερικάνικα στοκ. Αυτή η πρώτη επιτυχία τους ενθαρρύνει και αποφασίζουν να πωλούν προϊόντα κατασκευής και έπιπλα σε χαμηλές τιμές.";
            aboutPage.checkDescriptionShouldHaveText(expectedDescription);
        });
    }
}
