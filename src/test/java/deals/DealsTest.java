package deals;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.DealsPage;

public class DealsTest extends BaseTest {
    public DealsTest(){
    }
    @Test
    public void todayDealsTest(){
        DealsPage dealsPage = homePage.clickTodayDeals();
        dealsPage.selectHeadphnes();
        dealsPage.selectGrocery();
        dealsPage.selectDiscount10();
        dealsPage.goToPage4();
    }
}
