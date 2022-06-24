package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ButtonsPage {

    WebDriver driver;
    WebDriverWait wdwait;

    WebElement doubleClickMe;
    WebElement rightClickMe;
    WebElement clickMe;

    WebElement doubleClickNote;
    WebElement clickMeNote;





    public ButtonsPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }




    public WebElement getDoubleClickMe() {
        return driver.findElement(By.id("doubleClickBtn"));
    }
    public WebElement getRightClickMe() {
        return driver.findElement(By.id("rightClickBtn"));
    }

    public WebElement getClickMe() {
        return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/button"));
    }

    public WebElement getDoubleClickNote() {
        return driver.findElement(By.id("doubleClickMessage"));
    }

    public WebElement getClickMeNote() {
        return driver.findElement(By.id("dynamicClickMessage"));
    }

    //------------------------------------------------------------------------
    public void clickDoubleClickButton () {
        this.doubleClickMe.click();
        }


        public void clickRightClickButton(){
         this.rightClickMe.click();

        }

        public void clickClickMeButton(){
        this.clickMe.click();
        }
}
