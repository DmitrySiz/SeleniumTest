import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SelenuimTest {
    private static WebDriver driver;

    @Before
    public void beforeMethod(){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void wileyTest() {
        MainPage mainPage = new MainPage(driver);
        mainPage.openManePage();
        mainPage.checkTopNavigationMenuLinks();
        mainPage.checkResourcesMenuLinks();
    }

    @After
    public void afterMethod(){
        driver.close();
    }
}
