package com.example.sites_ui_tests;

import com.example.webdriver.WebDriverConfig;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FoodHouse extends WebDriverConfig {

    @Test
    public void Test_01() {
        driver.get("https://foodhouse.md");

        String title = driver.getTitle();
        Assert.assertEquals(title, "Доставка еды из ресторанов в Кишиневе | FOODHOUSE");
    }
}
