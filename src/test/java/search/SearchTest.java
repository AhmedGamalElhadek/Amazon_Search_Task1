
package search;

import base.BaseTest;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.ProductPage;

public class SearchTest extends BaseTest {
    public SearchTest() {
    }

    @Test
    public void testProductAddedToCartSuccessfully() {
        String searchText = readTestData("resources/testdata.json", "searchText");
        homePage.enterSearchText(searchText);
        homePage.clickSearchButton();

        String productText = searchResultPage.getProductName();
        ProductPage productpage =  searchResultPage.clickFirstItem();
        productpage.clickAddToCart();

        String notAddedItemMessage = readTestData("resources/testdata.json", "notAddedItemMessage");
        String expectedAddedToCart = readTestData("resources/testdata.json", "expectedAddedToCart");

        Assert.assertEquals(notAddedItemMessage,expectedAddedToCart ,productpage.getAddedToCartMessage());

        CartPage cartPage = productpage.goToCart();
        String itemName =  cartPage.getAddedItem();
        boolean porductExistInCart = itemName.contains(productText);

        String existInCartMessage = readTestData("resources/testdata.json", "existInCartMessage");
        String notExistInCartMessage = readTestData("resources/testdata.json", "notExistInCartMessage");
        if (porductExistInCart)
            System.out.println(existInCartMessage);
        else
            System.out.println(notExistInCartMessage);
    }

    private String readTestData(String filePath, String key) {
        JSONParser jsonParser = new JSONParser();

        try {
            FileReader reader = new FileReader(filePath);

            String var7;
            try {
                Object obj = jsonParser.parse(reader);
                JSONObject jsonData = (JSONObject)obj;
                var7 = (String)jsonData.get(key);
            } catch (Throwable var9) {
                try {
                    reader.close();
                } catch (Throwable var8) {
                    var9.addSuppressed(var8);
                }

                throw var9;
            }

            reader.close();
            return var7;
        } catch (ParseException | IOException var10) {
            var10.printStackTrace();
            return null;
        }
    }
}
