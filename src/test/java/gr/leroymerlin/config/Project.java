package gr.leroymerlin.config;

import org.aeonbits.owner.ConfigFactory;

public class Project {
    public static ProjectConfig config() {
        if (System.getProperty("env") == null)
            System.setProperty("env", "config/remote");
        return ConfigFactory.create(ProjectConfig.class, System.getProperties());
    }

    public static boolean isWebMobile() {
        return !config().browserMobileView().equals("");
    }

    public static boolean isRemoteWebDriver() {
        return !config().remoteDriverUrl().equals("");
    }

    public static boolean isVideoOn() {
        return !config().videoStorage().equals("");
    }
}
