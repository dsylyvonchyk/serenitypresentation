package steps;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.WebElement;
import pages.SearchResults;

import java.util.List;

public class SearchResultsSteps {

    SearchResults page;

    @Step("Verify search results have correct legend headers")
    public void VerifyLegendHeaders(){
        List<WebElementFacade> actual = page.LegendHeaders();
        for (int i = 0; i < actual.size(); i++) {
            Assertions.assertThat(actual.get(i).getText())
                    .as("Legend in section" + i + "is not correct")
                    .isEqualTo(page.LegendHeaders_Expected().get(i));
        }
    }

    @Step("Verify sorting options on search results page")
    public void VerifySortingOptions(){
        List<WebElement> actual = page.SortingOptions();
        System.out.println(actual.size());
        for (int i = 0; i < actual.size(); i++) {
            Assertions.assertThat(actual.get(i).getText())
                    .isEqualTo(page.SortingOptions_Expected().get(i));
        }
    }

    @Step("Verify search result in line {0} on search results page")
    public void VerifyResultHasImage(int line){
        Assertions.assertThat(page.ResultItemImageInLine(line))
                .as("Image is not shown in line " + line)
                .isTrue();

    }
}
