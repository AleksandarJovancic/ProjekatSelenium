package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RadioButtonPage {

    WebDriver driver;
    WebDriverWait wdwait;

    WebElement buttonYes;
    WebElement buttonImpressive;
    WebElement buttonNo;
    WebElement question;
    WebElement notificationYes;
    WebElement notificationImpressive;
    WebElement notificationNo;
    public RadioButtonPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getButtonYes() {
        return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/label"));
    }
    public WebElement getButtonImpressive() {
        return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/label"));
    }

    public WebElement getButtonNo() {
        return driver.findElement(By.xpath ("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[4]/label"));
    }

    public WebElement getQuestion() {
        return driver.findElement(By.linkText("Do you like the site?"));
    }

    public WebElement getNotificationYes() {
        return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/p/span"));
    }
    public WebElement getNotificationImpressive() {
        return driver.findElement(By.className("mt-3"));
    }
    public WebElement getNotificationNo() {
        return notificationNo;
    }

    public void clickOnYes() {
        this.getButtonYes().click();
    }

    public void clickOnImpressive() {
        this.getButtonImpressive().click();
    }

    public void clickOnNo() {
        this.getButtonNo().click();
    }

}