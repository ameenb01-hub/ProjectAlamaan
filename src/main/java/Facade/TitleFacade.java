package Facade;

import Pages.TitlePage;
import org.openqa.selenium.WebDriver;

public class TitleFacade {

    TitlePage titlePage = new TitlePage();
    boolean availability;
    WebDriver driver;

    public TitleFacade(WebDriver driver) {

        this.driver = driver;

    }

        public boolean titleLogo_Availability (WebDriver driver){

            availability = titlePage.titleLogo(driver).isDisplayed();

            return availability;
        }

       public boolean messangerLink_Availability (WebDriver driver){

        availability = titlePage.messangerLink(driver).isDisplayed();

        return availability;
        }

       public boolean facebookLink_Availability (WebDriver driver){

        availability = titlePage.facebookLink(driver).isDisplayed();

        return availability;
        }

        public boolean instagramLink_Availability (WebDriver driver){

        availability = titlePage.instagramLink(driver).isDisplayed();

        return availability;
        }

        public boolean twitterLink_Availability (WebDriver driver){

        availability = titlePage.twitterLink(driver).isDisplayed();

        return availability;
        }

        public boolean youtubeLink_Availability (WebDriver driver){

        availability = titlePage.youtubeLink(driver).isDisplayed();

        return availability;
        }

        public boolean locationLink_Availability (WebDriver driver){

        availability = titlePage.locationLink(driver).isDisplayed();

        return availability;
        }

        public boolean amazonsmileLink_Availability (WebDriver driver){

        availability = titlePage.amazonSmileLink(driver).isDisplayed();

        return availability;
        }

        public boolean donateLink_Availability (WebDriver driver){

        availability = titlePage.donateLink(driver).isDisplayed();

        return availability;
        }

}
