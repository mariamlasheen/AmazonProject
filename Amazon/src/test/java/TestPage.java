
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
public class TestPage {
        public WebDriver driver;
        public WebDriverWait wait;
        public DataPage dataPage;


        @BeforeMethod
        public void setup(){
            ChromeOptions co = new ChromeOptions();
            co.addArguments("--remote-allow-origins=*");
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(co);
            driver.manage().window().maximize();
            wait = new WebDriverWait(driver,30);
            dataPage = new DataPage(driver);
            String url = "https://www.amazon.com/";
            driver.navigate().to(url);
        }

//    @AfterMethod
//    public void quitWebDriver(){
//        driver.quit();
//    }
    }


