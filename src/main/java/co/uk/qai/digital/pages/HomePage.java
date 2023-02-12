package co.uk.qai.digital.pages;

import co.uk.qai.digital.utility.Utilities;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utilities {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @CacheLookup
    @FindBy(linkText = "Services")
    WebElement service;

    @CacheLookup
    @FindBy(linkText = "Enterprise Solutions")
    WebElement entSer;

    public void clickOnServiceLink() {
        clickOnElement(service);
        log.info("Clicking on Service link" + service.toString());
    }

    public void refreshingPage() {
        new Actions(driver).sendKeys(Keys.F5).perform();
        log.info("Clicking on Service link");

    }

    public boolean verifyEnterpriseLinkIsVisible() {
        elementIsVisible(entSer);
        log.info("Checking link is available" + entSer.toString());
        return true;
    }
}
