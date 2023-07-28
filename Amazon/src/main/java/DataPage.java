import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DataPage extends BasePage{
    public DataPage(WebDriver driver) {
        super(driver);
    }
    By searchbox = By.id("twotabsearchtextbox");
     By firstOption = By.xpath("//div[contains(@class,'s-suggestion s-suggestion-ellipsis-direction')]");

    By item = By.cssSelector("div[class='s-widget-container s-spacing-small s-widget-container-height-small celwidget" +
            " slot=MAIN template=SEARCH_RESULTS widgetId=search-results_1'] span:nth-child(5)");
    By AddToCardBtn = By.id("add-to-cart-button");
   By Cart = By.id("nav-cart-count-container");
   By itemincart = By.xpath("//span[contains(text(),'car accessories')]");
   By Todaysoffers = By.xpath("//a[contains(@href,'/gp/goldbox?ref_=nav_cs_gb')]");
   By textbox1 = By.cssSelector("body > div:nth-child(1) > div:nth-child(71) > div:nth-child(2) > div:nth-child(1) > " +
           "div:nth-child(1) > div:nth-child(4) > div:nth-child(2) > span:nth-child(3) > ul:nth-child(3) > li:nth-child(20) > label:nth-child(1) > span:nth-child(2)");
    public void Entertext() throws InterruptedException {
        setText(searchbox,"car accessories");
    }
    public void SelectFirstOption() throws InterruptedException {
        click(firstOption);
    }
    public void ClickOnOption() throws InterruptedException {
        click(item);

    }
    public void ClickOnAddtoCard() throws InterruptedException {
        click(AddToCardBtn);
    }
    public void ClickOnCart() throws InterruptedException {
        click(Cart);
    }
    public void clickontoday() throws InterruptedException {
        click(Todaysoffers);
    }
    public void item1(){
        ScrolltoElement(driver.findElement(textbox1));
    }
}
