import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import pages.MainPage;
import steps.MainPageSteps;
import steps.SearchResultsSteps;

import static java.util.concurrent.TimeUnit.SECONDS;
@RunWith(SerenityRunner.class)
public class MainPageTests {

    MainPage page;

    @Steps
    MainPageSteps steps;

    @Steps
    SearchResultsSteps searchSteps;

    @Managed(driver = "Chrome")
    WebDriver driver;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "/Users/Dmytro/Documents/Tools/chrome/80/chromedriver");
        driver.manage().timeouts().implicitlyWait(15, SECONDS);
    }

    @Title("TS-T12 Search form is presented on Main Page")
    @Test
    public void SearchFormVisibility() {
        steps.OpenMainPage();
        steps.VerifySearchFormDisplayed();
    }

    @Ignore
    @Title("TS-T33 Search legend for Monitor query")
    @Test
    public void SearchResultsLegendHeaders_Monitor() {
        steps.OpenMainPage();
        page.CloseSignUpWindow();
        steps.SearchFor("monitor");
        searchSteps.VerifyLegendHeaders();
    }

    @Title("TS-T34 Search legend for Laptop query")
    @Test
    public void SearchResultsLegendHeaders_Laptop() {
        steps.OpenMainPage();
        page.CloseSignUpWindow();
        steps.SearchFor("laptop");
        searchSteps.VerifyLegendHeaders();
    }

    @Title("TS-T58 Verify search results page has correct sorting options")
    @Test
    public void SearchResultsSortingOptions() {
        steps.OpenMainPage();
        page.CloseSignUpWindow();
        steps.SearchFor("laptop");
        searchSteps.VerifySortingOptions();
    }

    @Title("TS-T112 Each search result has image")
    @Test
    public void SearchResultsHasImages() {
        steps.OpenMainPage();
        page.CloseSignUpWindow();
        steps.SearchFor("monitor");
        for (int i = 1; i < 25; i++) {
            searchSteps.VerifyResultHasImage(i);
        }
    }

}
