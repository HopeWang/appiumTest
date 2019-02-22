package pages;
import driver.Driver;
import org.openqa.selenium.By;

public class MainPage {
    By profile = By.id("user_profile_icon");
    By homesearch = By.id("home_search");
    public static MainPage start(){
        Driver.start();
        return new MainPage();

    }

    public ProfilePage gotoProfile(){
        Driver.getCurrentDriver().findElement(profile).click();
        return new ProfilePage();

    }

    public SearchPage gotoSearch(){
        Driver.getCurrentDriver().findElement(homesearch).click();
        return new SearchPage();
    }
}
