package com.magento.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.magento.libraries.BaseClass;

import lombok.Data;

public class LoginPage extends BaseClass
{
	
	public LoginPage()
    {
		PageFactory.initElements(driver, this);
    }
	
    @FindBy(id="email")
    private WebElement txtbox_emailID;

    @FindBy(id="pass")
    private WebElement txtbox_Password;

    @FindBy(id="send2")
    private WebElement btn_SignIn;

	public DashboardPage login(String username, String password) {
		txtbox_emailID.sendKeys(username);
		txtbox_Password.sendKeys(password);
		btn_SignIn.click();
		return new DashboardPage();
	}
}
