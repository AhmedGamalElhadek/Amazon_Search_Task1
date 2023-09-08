package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.CartPage;
import pages.HomePage;
import pages.ProductPage;
import pages.SearchResultPage;

public class BaseTest {

    private WebDriver driver;
    protected HomePage homePage;
    protected SearchResultPage searchResultPage;
    protected ProductPage productPage;
    protected CartPage cartPage;
    public BaseTest() {
    }

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        this.driver = new ChromeDriver();
        driver.manage().window().maximize();
        this.driver.get("https://www.amazon.com/");
        this.homePage = new HomePage(this.driver);
        this.searchResultPage = new SearchResultPage(this.driver);
        this.productPage = new ProductPage(this.driver);
        this.cartPage=new CartPage(this.driver);
    }

    @AfterClass
    public void tearDown() {
        this.driver.quit();
    }
}
