package Pages;

import Locators.TitlePageLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TitlePage {
    //Declaring a variable
    WebElement element;

   // Creating a method to return Title Logo as an WebElement
    public WebElement titleLogo(WebDriver driver) {

        element = driver.findElement(By.xpath(TitlePageLocators.ALAMAAN_LOGO));

        return element;
    }
    // Creating a method to return Messanger link as an WebElement
    public WebElement messangerLink(WebDriver driver) {

        element = driver.findElement(By.xpath(TitlePageLocators.COMMUNITY_MESSANGER_LINK));

        return element;
    }
    // Creating a method to return Facebook link as an WebElement
    public WebElement facebookLink(WebDriver driver) {

        element = driver.findElement(By.xpath(TitlePageLocators.FACEBOOK_LINK));

        return element;
    }
    // Creating a method to return Instagram link as an WebElement
    public WebElement instagramLink(WebDriver driver) {

        element = driver.findElement(By.xpath(TitlePageLocators.INSTAGRAM_LINK));

        return element;
    }
    // Creating a method to return Twitter link as an WebElement
    public WebElement twitterLink(WebDriver driver) {

        element = driver.findElement(By.xpath(TitlePageLocators.TWITTER_LINK));

        return element;
    }
    // Creating a method to return  Youtube link as an WebElement
    public WebElement youtubeLink(WebDriver driver) {

        element = driver.findElement(By.xpath(TitlePageLocators.YOUTUBE_LINK));

        return element;
    }
    // Creating a method to return Email link as an WebElement
    public WebElement emailLink(WebDriver driver) {

        element = driver.findElement(By.xpath(TitlePageLocators.EMAIL_LINK));

        return element;
    }
    // Creating a method to return Location link as an WebElement
    public WebElement locationLink(WebDriver driver) {

        element = driver.findElement(By.xpath(TitlePageLocators.LOCATION_LINK));

        return element;
    }
    // Creating a method to return Amazon Smile as an WebElement
    public WebElement amazonSmileLink(WebDriver driver) {

        element = driver.findElement(By.xpath(TitlePageLocators.AMAZON_SMILE_LINK));

        return element;
    }
    // Creating a method to return Donate link as an WebElement
    public WebElement donateLink(WebDriver driver) {

        element = driver.findElement(By.xpath(TitlePageLocators.DONATE_LINK));

        return element;
    }

}
