package Test;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {

    @BeforeMethod

    public void pageSetUp(){

        driver.manage().window().maximize();
        driver.navigate().to(homePageURL);
    }



    @Test

    public void testacase1 () throws InterruptedException {


        // VisibilityWait(homePage.getElementsBox());
        ScrollIntoView(homePage.getElementsBox());
        Thread.sleep(2000);
        homePage.clickOnElementsBox();


    }

    @Test
    public void testacase2 () throws InterruptedException {


        // VisibilityWait(homePage.getElementsBox());
        ScrollIntoView(homePage.getForms());
        Thread.sleep(2000);
        homePage.clickOnFormsBox();
        //Assert
       //Assert.assertTrue(elementsPage.getElementsPageNotification().isDisplayed());

    }



}
