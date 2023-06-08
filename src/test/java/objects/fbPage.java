package objects;



import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fbPage {

	WebDriver driver;

	public fbPage(WebDriver driver) {
		this.driver = driver;
		 PageFactory.initElements(driver,this);
		}
	
	@FindBy(css = "#email")WebElement email;
	@FindBy(xpath="//input[@id='pass']")WebElement pswd;
	@FindBy(name="login")WebElement login;

	public void EnterUsername() {
		email.clear();
		email.sendKeys("satyanaryanao991@gmail.com");
	}

	public void EnterPassword() {
		pswd.clear();
		pswd.sendKeys("qyhbdegd");
	}

	public void VerifyLogin() {
		login.click();
		String title = driver.getTitle();
		assertEquals(title, "Log in to Facebook");

	}
	}


