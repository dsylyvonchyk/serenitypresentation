package pages;

import org.openqa.selenium.By;
import net.serenitybdd.core.pages.PageObject;

public class Locators extends PageObject {

    By MainPage_SearchField = By.id("gh-search-input");
    By MainPage_SearchButton = By.xpath("//button[@class='header-search-button']");

    By SearchResults_LegendHeaders = By.xpath("//legend[@class='facet-legend']//h3[@class='facet-title default']//span[@class='c-section-title-text']");
    By SearchResults_SortingDropdown = By.id("sort-by-select");


    By MainPage_CloseButton = By.xpath("//div[@class='modal fade email-submission-modal in']//div[@class='modal-dialog modal-md']//div[@class='modal-content']//div[@class='modal-header']//button");

}
