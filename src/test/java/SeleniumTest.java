import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by savenok_a on 20.03.2017.
 */
public class SeleniumTest {
    @Test
    public  void  openOnlinerTest () throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "C:\\webDriver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.onliner.by/");

        Thread.sleep(5000);

        driver.quit();
    }



}


