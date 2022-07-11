package ru.leroymerlin.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class StartPage {
    public String addItemToCart () {
        SelenideElement item = $$x("//uc-plp-item-new").get(0);
        String itemName = item.getAttribute("productname");
        $x(item.getSearchCriteria() + "//button").click();
        return itemName;
    }
}
