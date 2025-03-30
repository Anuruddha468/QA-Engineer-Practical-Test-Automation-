package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SearchResultsPage;
import utils.TestBase;

public class SearchTests extends TestBase {

    @Test
    public void testSearchFunctionality() {
        String searchTerm = "shirt";

        HomePage homePage = new HomePage(driver);
        homePage.searchForItem(searchTerm);

        SearchResultsPage searchResultsPage = new SearchResultsPage(driver);
        Assert.assertTrue(searchResultsPage.areAllResultsMatchingSearchTerm(searchTerm),
                "Not all search results match the search term");
    }
}