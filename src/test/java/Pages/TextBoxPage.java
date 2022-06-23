package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TextBoxPage {

    WebDriver driver;
    WebDriverWait wdwait;

    WebElement fullName;
    WebElement email;
    WebElement currentAddress;
    WebElement permanentAddress;
    WebElement submitButton;
    WebElement nameResault;
    WebElement pageTitleName;
//--------------------------------------------------------------------
    public TextBoxPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getFullName() {
        return driver.findElement(By.id("userName"));
    }

    public WebElement getEmail() {
        return driver.findElement(By.id("userEmail"));
    }

    public WebElement getCurrentAddress() {
        return driver.findElement(By.id("currentAddress"));
    }

    public WebElement getPermanentAddress() {
        return driver.findElement(By.id("permanentAddress"));
    }

    public WebElement getSubmitButton() {
        return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[5]/div/button"));
    }

    public WebElement getNameResault() {
        return driver.findElement(By.id("name"));
    }

    public WebElement getPageTitleName() {
        return driver.findElement(By.className("pattern-backgound playgound-header"));
    }
//---------------------------------------------------------------

public void insertFullName(String fullName){
        this.getFullName().clear();
        this.getFullName().sendKeys(fullName);
}
    public void insertEmail(String email){
        this.getEmail().clear();
        this.getEmail().sendKeys(email);
    }
   public void insertCurrentAddress(String addressC){
        this.getCurrentAddress().clear();
        this.getCurrentAddress().sendKeys(addressC);
    }
    public void insertPermanentAddress(String addressP){
        this.getPermanentAddress().clear();
        this.getPermanentAddress().sendKeys(addressP);
    }

    public void clickSubmitButton(){
        this.getSubmitButton().click();
    }


}