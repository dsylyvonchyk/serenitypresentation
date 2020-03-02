package steps;

import net.thucydides.core.annotations.Step;
import org.assertj.core.api.Assertions;
import pages.MainPage;

public class MainPageSteps {

    MainPage page;

    @Step("Open Main page")
    public void OpenMainPage(){
        page.open();
    }

    @Step("Search for {0}")
    public void SearchFor(String query){
        page.SearchFor(query);
    }

    @Step("Verify Search From is displayed on Main Page")
    public void VerifySearchFormDisplayed(){
        Assertions.assertThat(page.SearchFormVisibility())
                .isTrue();
    }


}
