package gr.leroymerlin.base;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import com.google.common.collect.ImmutableMap;
import gr.leroymerlin.config.Project;
import gr.leroymerlin.helpers.AllureAttachments;
import gr.leroymerlin.helpers.DriverSettings;
import gr.leroymerlin.helpers.DriverUtils;
import io.qameta.allure.junit5.AllureJunit5;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;

import static com.github.automatedowl.tools.AllureEnvironmentWriter.allureEnvironmentWriter;

@ExtendWith({AllureJunit5.class})
public class TestBase {
    /**** SETTINGS ****/
    public static final long WAITING_TIMEOUT = 10000;

    @BeforeAll
    static void beforeAll() {
        DriverSettings.configure();
        setAllureEnvironment();
    }

    private static void setAllureEnvironment() {
        allureEnvironmentWriter(
                ImmutableMap.<String, String>builder()
                        .put("Working Host", Configuration.baseUrl)
                        .put("browser", Configuration.browser)
                        .put("browserSize", Configuration.browserSize)
                        .put("global environment", System.getenv().toString())
                        .build(), System.getProperty("user.dir")
                        + "build/allure-results/");
    }

    @BeforeEach
    public void beforeEach() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }

    @AfterEach
    public void afterEach() {
        String sessionId = DriverUtils.getSessionId();

        AllureAttachments.addScreenshotAs("Last screenshot");
        AllureAttachments.addPageSource();
//        AllureAttachments.attachNetwork(); // todo
        AllureAttachments.addBrowserConsoleLogs();

        Selenide.closeWebDriver();

        if (Project.isVideoOn()) {
            AllureAttachments.addVideo(sessionId);
        }
    }
}
