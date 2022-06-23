package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    WebDriver driver;
    WebDriverWait wdwait;

//------------------------------------------
    WebElement elementsBox;
    WebElement forms;
    WebElement alertFrameWindows;
    WebElement interactions;
    WebElement bookStoreApplication;
//----------------------------------------------

    public HomePage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

   // ------------------------------------------

    public WebElement getElementsBox() {
        return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div[1]"));
        ///html/body/div[2]/div/div/div[2]/div/div[2]
       ///html/body/div[2]/div/div/div[2]/div/div[3]

    }


    public WebElement getForms() {
      return driver.findElement(By.cssSelector(".card.mt-4.top-card"));
    }



    public WebElement getAlertFrameWindows() {
        return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div[3]"));
    }

    public WebElement getWidgets() {
        return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div[4]"));
    }

    public WebElement getInteractions() {
        return interactions;
    }

    public WebElement getBookStoreApplication() {
        return bookStoreApplication;
    }
    //-----------------------------------------------------------


    public void clickOnElementsBox(){
        this.getElementsBox().click();
}

    public void clickOnFormsBox(){
        this.getForms().click();
    }







}
