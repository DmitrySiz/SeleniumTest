import org.junit.Assert;
import org.openqa.selenium.By;

public class HeaderFooter {

    private String home = "Home";
    private String subjects = "Subjects";
    private String aboutWiley = "About Wiley";
    private String contactUs = "Contact Us";
    private String help = "Help";

    public void checkTopNavigationMenuLinks(){
        Assert.assertTrue("Home link isn't displayed",driver.findElement(By.linkText(home)).isDisplayed());
        Assert.assertTrue("Subjects link isn't displayed",driver.findElement(By.linkText(subjects)).isDisplayed());
        Assert.assertTrue("About Wiley link isn't displayed",driver.findElement(By.linkText(aboutWiley)).isDisplayed());
        Assert.assertTrue("Contact Us link isn't displayed",driver.findElement(By.linkText(contactUs)).isDisplayed());
        Assert.assertTrue("Help link isn't displayed",driver.findElement(By.linkText(help)).isDisplayed());
    }
}
