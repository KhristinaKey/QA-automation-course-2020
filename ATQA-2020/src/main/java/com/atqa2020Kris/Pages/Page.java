package com.atqa2020Kris.Pages;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class Page {
    protected RemoteWebDriver driver;
    protected WebDriverWait wait;

    public Page(final RemoteWebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 30);
//TODO please remove redundant empty lines

    }
}
