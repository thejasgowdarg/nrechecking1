package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class FirstPage extends Base{
	
	@FindBy(xpath = "//button[normalize-space()=\"Double click Here\"]")
	WebElement doubleclick;
	
	public FirstPage () {
		PageFactory.initElements(driver, this);
	}
	
	public SecondPage fisteeeeee() throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", doubleclick);
		Thread.sleep(2000);
        Actions a = new Actions(driver);
		a.doubleClick(doubleclick).perform();
		Thread.sleep(4000);
		driver.switchTo().alert().accept();
		Thread.sleep(4000);
		return new SecondPage();
		
	}

}
