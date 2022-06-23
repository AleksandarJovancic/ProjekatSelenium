package Base;

import Pages.HomePage;
import Pages.RadioButtonPage;
import Pages.Sidebar;
import Pages.TextBoxPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.time.Duration;

public class BaseTest {

    public WebDriver driver;
    public WebDriverWait wdwait;

    //dodavanje stranica

    public HomePage homePage;
    public ExcelReader excelReader;
    public Sidebar sidebar;
    public TextBoxPage textBoxPage;
    public RadioButtonPage radioButtonPage;


    //-------------------------------------

    public String homePageURL;


    @BeforeClass

    public void setUp () throws IOException {

        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        wdwait= new WebDriverWait(driver, Duration.ofSeconds(10));

        //----------stranice----------------------------------------------------------

        homePage= new HomePage(driver,wdwait);
        sidebar = new Sidebar(driver, wdwait);
        textBoxPage = new TextBoxPage(driver, wdwait);
        radioButtonPage= new RadioButtonPage(driver,wdwait);

        //-----------------------------------------------------------------------------

        excelReader= new ExcelReader( "C:\\Users\\Tijana\\Desktop\\ProjekatSelenium.xlsx");
        homePageURL = excelReader.getStringData("projekat1", 1,0);


    }

    public void VisibilityWait(WebElement element){
        wdwait.until(ExpectedConditions.visibilityOf(element));

    }

    public void ClickabilityWait(WebElement element){
        wdwait.until(ExpectedConditions.elementToBeClickable(element));

    }

    public void ScrollIntoView(WebElement element){
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("arguments [0].scrollIntoView(true);",element);

    }

    public void clickElementJS (WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click()", element);
    }





    @AfterClass

    public void tearDown (){
        // driver.quit();
        //  driver.close();
    }





}
