package register.stream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import base.BasicData;

public class Register_Test {
	
	private WebDriver driver;
	RegisterPage registerPage;
 
	@Before
	public void setUp() throws Exception {
		registerPage = new RegisterPage(driver);
		driver = registerPage.chromeDriverConnection();
		registerPage.visit("https://dev.ciencuadras.com/");
	}
	
	@After
	public void tearDown() throws Exception {
		//driver.quit(); 
	}

	@Test
	public void test() throws InterruptedException {
		registerPage.registerRoll(BasicData.ROLL_A,BasicData.TYPE_DOCUMENT_CC);
	}

}
