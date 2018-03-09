package me.mysupercompany;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GooglePage extends BasePage{

    By firstResult = by(".rc .r");

    public GooglePage(WebDriver driver) {
        super(driver);
    }

    public void searchMore(String text) {
        $(By.id("lst-ib")).sendKeys(text, Keys.ENTER);
    }

    public void visit() {
        open("https://www.google.com/ncr");
    }

    public void followFirstResult() {
        $(firstResult).findElement(by("a")).click();
    }
}
