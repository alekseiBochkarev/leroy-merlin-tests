package gr.leroymerlin.config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:${env}.properties",
})
public interface ProjectConfig extends Config {
    @DefaultValue("chrome")
    String browser();
    @DefaultValue("1920x1080")
    String browserSize();
    String browserMobileView();
    String remoteDriverUrl();
    String videoStorage();
    String workingHost();
}
