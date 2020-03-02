package pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

@DefaultUrl("https://www.bestbuy.com/")
public class MainPage extends PageObject {

    Locators locators;

    public void sleep(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public boolean SearchFormVisibility (){
        return find(locators.MainPage_SearchField).isDisplayed()&&find(locators.MainPage_SearchButton).isDisplayed();
    }

    public void SearchFor (String query) {
        find(locators.MainPage_SearchField).sendKeys(query);
        sleep(1000);
        find(locators.MainPage_SearchButton).click();
    }

    public void CloseSignUpWindow () {
        sleep(5000);
        find(locators.MainPage_CloseButton).click();
    }


}
