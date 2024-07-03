package org.example.pages;

import org.example.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home  extends TestBase {

    @FindBy(id="menu-item-74")
    @CacheLookup //this annotation will store the element in cache, instead of looking from the page, for better performance of framework
    WebElement homeTopList;

    /*@FindBy(xpath="//a[contains(text(),'Contacts')]")
    WebElement contactsLink;

    @FindBy(xpath="//a[contains(text(),'New Contact')]")
    WebElement newContactLink;

    @FindBy(xpath="//a[contains(text(),'Deals')]")
    WebElement dealsLink;

    @FindBy(xpath="//a[contains(text(),'Tasks')]")
    WebElement tasksLink;*/

    public Home(){
        PageFactory.initElements(driver, this);// 'this' means current class objects.
    }

    public String verifyHomePageTitle(){
        return driver.getTitle();
    }

    public boolean verifyHomeTopListButton(){
        return homeTopList.isDisplayed();
    }
}
