package com.nykaaCucumber.pages;

import com.nykaaCucumber.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//div[@id='headerMenu']/div/child::ul")
    List<WebElement> Topmenu;

    @FindBy(xpath = "//div[@id='category_navigation']/div/div/div[2]/child::ul")
    List<WebElement> SubMenu;

    public void ClickonTopmenu(String tab){
        for (WebElement topmenu:Topmenu){
            if(topmenu.getText().contains(tab)){
                mouseHoverToElementAndClick(topmenu);
                break;
            }
        }
    }

    public void ClickonSubmenu(String tab){
        for (WebElement submenu:SubMenu){
            if(submenu.getText().contains(tab)){
                clickOnElement(submenu);
                break;
            }
        }
    }
}
