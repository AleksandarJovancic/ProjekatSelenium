package Test;

import Base.BaseTest;
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

    // textBoxtest - da li radi sa unosom svih validnih podataka u polja

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
       // raddioButtontest - da li su klikabilni dugmici

    public void testacase2() throws InterruptedException {

        ScrollIntoView(homePage.getElementsBox());
        Thread.sleep(2000);
        homePage.clickOnElementsBox();
        ClickabilityWait(sidebar.getRadioButton());
        sidebar.clickOnRadioButton();
        radioButtonPage.clickOnYes();
        radioButtonPage.clickOnImpressive();
        Assert.assertTrue(radioButtonPage.getNotificationYes().isDisplayed());
        Assert.assertTrue(radioButtonPage.getNotificationImpressive().isDisplayed());
       // Assert.assertEquals(radioButtonPage.getNotificationImpressive().getText(),"Do you like the site?");
        clickElementJS(radioButtonPage.getButtonNo());

}
}