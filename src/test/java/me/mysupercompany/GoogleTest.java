package me.mysupercompany;

import org.junit.Test;

import static org.openqa.selenium.support.ui.ExpectedConditions.textToBePresentInElementLocated;
import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

public class GoogleTest extends BaseTest{

    GooglePage page = new GooglePage(driver);

    @Test
    public void testSearchText() {
        page.visit();

        page.searchMore("Selenium");

        assertThat(textToBePresentInElementLocated(page.firstResult, "Selenium"));

        page.searchMore(" chemical element");

        assertThat(textToBePresentInElementLocated(page.firstResult, "Selenium"));
    }

    @Test
    public void testFollowFirstResult() throws InterruptedException {
        page.visit();
        page.searchMore("Selenium");
        Thread.sleep(5000);
        page.followFirstResult();

        assertThat(titleIs("Selenium - Web Browser Automation"));
    }
}
