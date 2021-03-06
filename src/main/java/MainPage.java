import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
    private String url = "http://www.wiley.com/WileyCDA/";
    private String students = "Students";
    private String authors = "Authors";
    private String intsructors = "Instructors";
    private String librarians = "Librarians";
    private String societies = "Societies";
    private String conferences = "Conferences";
    private String booksellers = "Booksellers";
    private String corporations = "Corporations";
    private String institutions = "Institutions";
    WebDriver driver;
    MainPage(WebDriver driver){
        this.driver = driver;
    }
    public void openManePage(){
        driver.get(url);
    }


    public void checkResourcesMenuLinks(){
        Assert.assertTrue("Students link isn't displayed",driver.findElement(By.linkText(students)).isDisplayed());
        Assert.assertTrue("Authors link isn't displayed",driver.findElement(By.linkText(authors)).isDisplayed());
        Assert.assertTrue("Instructors link isn't displayed",driver.findElement(By.linkText(intsructors)).isDisplayed());
        Assert.assertTrue("Librarians link isn't displayed",driver.findElement(By.linkText(librarians)).isDisplayed());
        Assert.assertTrue("Societies link isn't displayed",driver.findElement(By.linkText(societies)).isDisplayed());
        Assert.assertTrue("Conferences link isn't displayed",driver.findElement(By.linkText(conferences)).isDisplayed());
        Assert.assertTrue("Booksellers link isn't displayed",driver.findElement(By.linkText(booksellers)).isDisplayed());
        Assert.assertTrue("Corporations link isn't displayed",driver.findElement(By.linkText(corporations)).isDisplayed());
        Assert.assertTrue("Institutions link isn't displayed",driver.findElement(By.linkText(institutions)).isDisplayed());
    }

}
