package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LinksPage {

    WebDriver driver;
    WebDriverWait wdwait;

    WebElement linkHome;
    WebElement linkHomewHnH2;





    public LinksPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getLinkHome() {
        return driver.findElement(By.id("simpleLink"));



    }

    public WebElement getLinkHomewHnH2() {
        return driver.findElement(By.id("dynamicLink"));
    }

    public void clickHome(){
    this.getLinkHome().click();
    }

    public void clickHomewHnH2(){
        this.getLinkHomewHnH2().click();
    }
}



