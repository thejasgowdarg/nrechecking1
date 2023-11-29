package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Base;
import pages.FirstPage;

public class FirstPageTest extends Base{
	
	public FirstPage frst;
	
	FirstPageTest(){
		super();
	}
	
	@BeforeMethod
	public void SetUp() {
		launchBrowser();
		frst=new FirstPage();
		
	}
	@Test
	public void doubleclick() throws Exception {
		frst.fisteeeeee();
	}
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}
