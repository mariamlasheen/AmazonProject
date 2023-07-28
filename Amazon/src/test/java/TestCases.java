import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class TestCases extends TestPage{
    public WebDriver driver;
    DataPage dataPage = new DataPage(driver);
    SoftAssert softAssert =new SoftAssert();


    @Test(priority = 0, enabled = true)
    @Description("Check for item to search")
    @Severity(SeverityLevel.BLOCKER)
    public void Run() throws InterruptedException {
        dataPage.Entertext();
        dataPage.SelectFirstOption();
        dataPage.scroll();
        dataPage.ClickOnOption();
        dataPage.ClickOnAddtoCard();
        dataPage.ClickOnCart();
        softAssert.assertEquals(dataPage.item, dataPage.itemincart);
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        dataPage.clickontoday();
        dataPage.item1();

    }
}
