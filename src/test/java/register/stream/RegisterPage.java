package register.stream;

import java.time.Duration;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.BasicData;
import base.BasicWrap;
import io.netty.handler.timeout.TimeoutException;

public class RegisterPage extends BasicWrap {

	public RegisterPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void registerRoll(String Roll, String TypeDocument) throws InterruptedException {
		try {
			Thread.sleep(2000);
			click(LocatorRegister.LOCATOR_X);
			click(LocatorRegister.LOCATOR_INTO);
			click(LocatorRegister.LOCATOR_REGISTER);
			if (BasicData.ROLL_P .equals(Roll)) {
				click(LocatorRegister.LOCATOR_PERSONA);
				type(BasicData.NAME, LocatorRegister.LOCATOR_NAME);
				type(BasicData.EMAIL_NAME_P, LocatorRegister.LOCATOR_EMAIL);
				WebElement emailTab = driver.findElement(LocatorRegister.LOCATOR_EMAIL);
				emailTab.sendKeys(Keys.TAB);
				type(BasicData.PASSWORD, LocatorRegister.LOCATOR_PASSWORD);
				WebElement passwordTab = driver.findElement(LocatorRegister.LOCATOR_PASSWORD);
				passwordTab.sendKeys(Keys.TAB);
				type(BasicData.PASSWORD, LocatorRegister.LOCATOR_CONFIRMPASS);
			}
			if (BasicData.ROLL_A.equals(Roll)) {
				click(LocatorRegister.LOCATOR_AGENTE);
				if (BasicData.TYPE_DOCUMENT_CC.equals(TypeDocument)) {
					click(LocatorRegister.LOCATOR_TYPE_DOCUMENT);
					click(LocatorRegister.LOCATOR_TYPE_DOCUMENT_CC);
					type(BasicData.IDENTIFICATION_CC, LocatorRegister.LOCATOR_IDENTIFICATION);
				}
				if (BasicData.TYPE_DOCUMENT_NIT.equals(TypeDocument)) {
					click(LocatorRegister.LOCATOR_TYPE_DOCUMENT);
					click(LocatorRegister.LOCATOR_TYPE_DOCUMENT_NIT);
					type( BasicData.IDENTIFICATION_NIT, LocatorRegister.LOCATOR_IDENTIFICATION);
				}
				if (BasicData.TYPE_DOCUMENT_NIT.equals(TypeDocument)) {
					type(BasicData.DV, LocatorRegister.LOCATOR_DV);
					type(BasicData.BUSINESS_NAME_A, LocatorRegister.LOCATOR_NAME);
				}else {
					type(BasicData.NAME, LocatorRegister.LOCATOR_NAME);
				}
				type(BasicData.EMAIL_NAME_A, LocatorRegister.LOCATOR_EMAIL);
				WebElement emailTab = driver.findElement(LocatorRegister.LOCATOR_EMAIL);
				emailTab.sendKeys(Keys.TAB);
				type(BasicData.PASSWORD, LocatorRegister.LOCATOR_PASSWORD);
				WebElement passwordTab = driver.findElement(LocatorRegister.LOCATOR_PASSWORD);
				passwordTab.sendKeys(Keys.TAB);
				type(BasicData.PASSWORD, LocatorRegister.LOCATOR_CONFIRMPASS);
			}
			if (BasicData.ROLL_I.equals(Roll)) {
				click(LocatorRegister.LOCATOR_INMOBILIARIA);
				type(BasicData.BUSINESS_NAME_I, LocatorRegister.LOCATOR_NAME);
				type(BasicData.IDENTIFICATION_NIT, LocatorRegister.LOCATOR_IDENTIFICATION);
				type(BasicData.DV, LocatorRegister.LOCATOR_DV);
				type(BasicData.EMAIL_BUSINESS_I, LocatorRegister.LOCATOR_EMAIL);
				WebElement emailTab = driver.findElement(LocatorRegister.LOCATOR_EMAIL);
				emailTab.sendKeys(Keys.TAB);
				type(BasicData.PASSWORD, LocatorRegister.LOCATOR_PASSWORD);
				WebElement passwordTab = driver.findElement(LocatorRegister.LOCATOR_PASSWORD);
				passwordTab.sendKeys(Keys.TAB);
				type(BasicData.PASSWORD, LocatorRegister.LOCATOR_CONFIRMPASS);
			}
			if (BasicData.ROLL_C.equals(Roll)) {
				click(LocatorRegister.LOCATOR_CONSTRUCTORA);
				type(BasicData.BUSINESS_NAME_C, LocatorRegister.LOCATOR_NAME);
				type(BasicData.IDENTIFICATION_NIT, LocatorRegister.LOCATOR_IDENTIFICATION);
				type(BasicData.DV, LocatorRegister.LOCATOR_DV);
				type(BasicData.EMAIL_BUSINESS_C, LocatorRegister.LOCATOR_EMAIL);
				WebElement emailTab = driver.findElement(LocatorRegister.LOCATOR_EMAIL);
				emailTab.sendKeys(Keys.TAB);
				type(BasicData.PASSWORD, LocatorRegister.LOCATOR_PASSWORD);
				WebElement passwordTab = driver.findElement(LocatorRegister.LOCATOR_PASSWORD);
				passwordTab.sendKeys(Keys.TAB);
				type(BasicData.PASSWORD, LocatorRegister.LOCATOR_CONFIRMPASS);
			}
			WebDriverWait ewait = new WebDriverWait(driver, Duration.ofSeconds(30));
			ewait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(LocatorRegister.LOCATOR_RE_CAPCHAT));
			ewait.until(ExpectedConditions.elementToBeClickable(LocatorRegister.LOCATOR_CAPTCHA)).click();
			driver.switchTo().defaultContent();
			Thread.sleep(3000);
			if (BasicData.ROLL_P.equals(Roll)) {
				click(LocatorRegister.LOCATOR_BUTTONREGISTER_PERSON);
			} else {
				click(LocatorRegister.LOCATOR_BUTTON_REGISTER);
			}
		} catch (NoSuchElementException e) {
			System.out.println("Error: " + e);
		} catch (TimeoutException e) {
			System.out.println("Error: " + e);
		} catch (ElementClickInterceptedException e) {
			System.out.println("Error: " + e);
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}

}
