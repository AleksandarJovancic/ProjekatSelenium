package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sidebar {

    WebDriver driver;
    WebDriverWait wdwait;

//padajuca polja iz Sidebara za Elements
    WebElement elements;
    WebElement textBox;
    WebElement checkBox;
    WebElement radioButton;
    WebElement webTables;
    WebElement buttons;
    WebElement links;
    WebElement brokenLinksImages;
    WebElement uploadDownload;
    WebElement dynamicProperties;


//----------------------------------------------------------------

    public Sidebar(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

 //------------------------------------------------------------------


    public WebElement getElements() {
        return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[1]/span/div"));
    }

    public WebElement getTextBox() {
        return driver.findElement(By.id("item-0"));


    }

    public WebElement getRadioButton() {
        return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div/ul/li[3]"));
    }

    public WebElement getButtons() {
        return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div/ul/li[5]"));
    }

    public WebElement getLinks() {
        return driver.findElement(By.id("item-5"));
    }

    //--------------------------------------------------------------------


     //  metode za izbor elemenata iz padajuceg menija u sidebaru

    public void clickOnTextBox(){
        this.getTextBox().click();

    }

    public void clickOnRadioButton(){
        this.getRadioButton().click();

    }
    public void clickOnButtons(){
        this.getButtons().click();

    }

    public void clickOnLinks(){
        this.getLinks().click();

    }





}
