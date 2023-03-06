package mytest;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;

public class LoginScreen extends AbstractPage {
	
	@FindBy(xpath="//button[@aria-label='Sign in']")
	private ExtendedWebElement loginBtn;
	
	@FindBy(xpath="//input[@id='username']")
	private ExtendedWebElement userLoginInput;
	
	@FindBy(xpath="//input[@id='password']")
	private ExtendedWebElement userPasswordInput;
	


	public LoginScreen(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public  boolean isLoginButtonPresent() {
		return loginBtn.isElementPresent();
		
	}
	
	public void fillUserName(String userName) {
		userLoginInput.type(userName);
	}
	
	public void fillUserPassworde(String userPasssword) {
		userPasswordInput.type(userPasssword);
	}
	
	public void clickLogintBtn() {
		loginBtn.click();
	}
	
	

}
