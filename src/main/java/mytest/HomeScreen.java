package mytest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;

public class HomeScreen extends AbstractPage{
//	@FindBy(xpath="//a[@data-tracking-control-name='guest_homepage-jobseeker_nav-header-signin']")
	@FindBy(xpath="//a[contains(text(), 'Sign in')]")
	
	private ExtendedWebElement signInA;

	public HomeScreen(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		
	}
	
	public LoginScreen clickSignInA() {
		signInA.click();
		return new LoginScreen(getDriver());
	}
	

}
