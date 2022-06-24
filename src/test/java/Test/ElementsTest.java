package Test;

import Base.BaseTest;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ElementsTest extends BaseTest {

    @BeforeMethod

    public void pageSetUp() {

        driver.manage().window().maximize();
        driver.navigate().to(homePageURL);



    }

    @Test

    // textBoxTest - da li radi sa unosom svih validnih podataka u polja

    public void testacase1 () throws InterruptedException {

        String validFullName = excelReader.getStringData("textBox",1,0);
        String validEmail = excelReader.getStringData("textBox",1,1);
        String validCurentAddress = excelReader.getStringData("textBox",1,2);
        String validPermanentAddress = excelReader.getStringData("textBox",1,3);

        ScrollIntoView(homePage.getElementsBox());
        Thread.sleep(2000);
        homePage.clickOnElementsBox();
        sidebar.clickOnTextBox();
        textBoxPage.insertFullName(validFullName);
        textBoxPage.insertEmail(validEmail);
        textBoxPage.insertCurrentAddress(validCurentAddress);
        textBoxPage.insertPermanentAddress( validPermanentAddress);
        ClickabilityWait(textBoxPage.getSubmitButton());
        ScrollIntoView(textBoxPage.getSubmitButton());
        textBoxPage.clickSubmitButton();
        Assert.assertTrue(textBoxPage.getSubmitButton().isDisplayed());
        Assert.assertTrue(textBoxPage.getNameResault().isDisplayed());
        Assert.assertEquals(driver.getCurrentUrl(),"https://demoqa.com/text-box");



    }

@Test
       // radioButtonTest - da li su klikabilni dugmici

    public void testacase2() throws InterruptedException {

        ScrollIntoView(homePage.getElementsBox());
        Thread.sleep(2000);
        homePage.clickOnElementsBox();
        ClickabilityWait(sidebar.getRadioButton());
        ScrollIntoView(sidebar.getRadioButton());
        sidebar.clickOnRadioButton();
        clickElementJS(radioButtonPage.getButtonYes());
        radioButtonPage.clickOnImpressive();
       // Assert.assertTrue(radioButtonPage.getNotificationYes().isDisplayed());
        Assert.assertEquals(radioButtonPage.getNotificationImpressive().getText(),"Impressive");
       // Assert.assertEquals(radioButtonPage.getNotificationImpressive().getText(),"Do you like the site?");
        clickElementJS(radioButtonPage.getButtonNo());

}
@Test

      // ButtonTest - da li se double klikom pojavljuje notifikacija
       //           - da li se klikom na clickMe pojavljuje notifikacija
//                  - da li se levim klikom na right click ne pojavljuje notifikacija

    public void testcase3 () throws InterruptedException {
    ScrollIntoView(homePage.getElementsBox());
   // Thread.sleep(2000);
    homePage.clickOnElementsBox();
    ClickabilityWait(sidebar.getButtons());
    ScrollIntoView(sidebar.getButtons());
    sidebar.clickOnButtons();
    Actions act = new Actions(driver);
    act.doubleClick(buttonsPage.getDoubleClickMe()).perform();
    Assert.assertEquals(buttonsPage.getDoubleClickNote().getText(), "You have done a double click");
    clickElementJS(buttonsPage.getRightClickMe());
    Assert.assertTrue(buttonsPage.getRightClickMe().isDisplayed());
    clickElementJS(buttonsPage.getClickMe());
    Assert.assertEquals(buttonsPage.getClickMeNote().getText(), "You have done a dynamic click");



}

@Test


         // LinksTest - da li linkovi otvaraju homepage u novom tabu
         //           -  da li su otvorena dva nova tab-a
    public void testcase4() throws InterruptedException {
    ScrollIntoView(homePage.getElementsBox());
    homePage.clickOnElementsBox();
    Thread.sleep(2000);
    ScrollIntoView(sidebar.getLinks());
    ClickabilityWait(sidebar.getLinks());
    sidebar.clickOnLinks();
    Thread.sleep(4000);
    linksPage.clickHome();
    Assert.assertTrue(homePage.getHomeHeadTitle().isDisplayed());
    linksPage.clickHomewHnH2();
    Assert.assertTrue(homePage.getHomeHeadTitle().isDisplayed());










}


@Test

    // Upload/Download - da li je moguce uploadovati dokument

    public void testcase5(){









}
@Test
    // Upload/Download - da li je moguce downloadovati dokument
    public void testcase6(){


    }

    @Test
 //  practiceForm - successfull student registration
    public void testcase7(){


    }




}