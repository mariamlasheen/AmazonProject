import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
public class BasePage {

        public static WebDriver driver;
        SoftAssert softAssert = new SoftAssert();
        public BasePage(WebDriver driver) {
            this.driver = driver;
        }

        public WebElement find(By locator) {
            return driver.findElement(locator);
        }
        public void waitElement(By locator) throws IllegalArgumentException{
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        }
        public void click(By locator) throws InterruptedException {
            waitElement(locator);
            find(locator).click();
        }

        public void setText(By locator, String data)throws InterruptedException {
            waitElement(locator);
            find(locator).isEnabled();
            find(locator).clear();
            find(locator).sendKeys(data);
        }
        public String getContent(By locator) throws InterruptedException{
            waitElement(locator);
            return find(locator).getText();
        }
        public void selectByVisibleText(By locator, String role) {
            Select select;
            select = new Select(find(locator));
            select.selectByVisibleText(role);
        }
        public String setXpathByText(String source) {
            return "//*[text()='" + source + "']";
        }

         public void scroll(){
            Actions action = new Actions(driver);
            action.sendKeys(Keys.PAGE_DOWN).build().perform();
    }
        public void ScrolltoElement(WebElement element){
            JavascriptExecutor jsExec = (JavascriptExecutor) driver;
            jsExec.executeScript("document.getElementById('id').scrollDown += 100");
        }

    }


