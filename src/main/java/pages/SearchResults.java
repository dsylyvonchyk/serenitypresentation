package pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SearchResults extends PageObject {

    Locators locators;


    public List<WebElementFacade> LegendHeaders(){
        return findAll(locators.SearchResults_LegendHeaders);
    }

    public List<String> LegendHeaders_Expected() {
        return new ArrayList<String>(Arrays.asList("Screen Size", "Refresh Rate", "Price", "Maximum Resolution", "Features", "Brand", "Condition", "Customer Rating", "Inputs Outputs", "Monitor Response Time", "Current Deals", "Color", "Display Type", "Discount", "Number of HDMI Inputs", "Adaptive Sync Technology", "Aspect Ratio", "Collection", "Gift Ideas"));
    }

    public List<WebElement> SortingOptions() {
        Select sortingOptions = new Select(find(locators.SearchResults_SortingDropdown));
        return sortingOptions.getOptions();
    }

    public List<String> SortingOptions_Expected() {
        return new ArrayList<String>(Arrays.asList("Best Match", "Best Selling", "Price Low to High", "Price High to Low", "Customer Rating", "New Arrivals", "Brand A-Z", "Brand Z-A"));
    }

    public boolean ResultItemImageInLine(int line){
        return find(By.xpath("//ol[@class='sku-item-list']//li[@class='sku-item'][" + line + "]//div//div//div//div//a//img")).isDisplayed();
    }
}
