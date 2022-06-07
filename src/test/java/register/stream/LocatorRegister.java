package register.stream;

import org.openqa.selenium.By;

public class LocatorRegister {

	public static final By LOCATOR_X = By.xpath("//*[@id=\"mat-dialog-0\"]/app-register-code/div/div/button");
	public static final By LOCATOR_INTO = By.xpath("//*[@id=\"headerHome\"]/lib-cc-header/header/nav[2]/button[1]/a");
	public static final By LOCATOR_REGISTER = By.linkText("Regístrate");
	public static final By LOCATOR_PERSONA = By.xpath("//*[@id=\"mat-radio-2\"]/label/div[2]");
	public static final By LOCATOR_AGENTE = By.xpath("//*[@id=\"mat-radio-3\"]/label/div[2]");
	public static final By LOCATOR_INMOBILIARIA = By.xpath("//*[@id=\"mat-radio-4\"]/label/div[2]");
	public static final By LOCATOR_CONSTRUCTORA = By.xpath("//*[@id=\"mat-radio-5\"]/label/div[2]");
	public static final By LOCATOR_NAME = By.cssSelector("input[formcontrolname=\"name\"]");
	public static final By LOCATOR_EMAIL = By.cssSelector("input[formcontrolname=\"email\"] ");
	public static final By LOCATOR_PASSWORD = By.cssSelector("input[formcontrolname=\"password\"]");
	public static final By LOCATOR_CONFIRMPASS = By.cssSelector("input[formcontrolname=\"confirmPass\"]");
	public static final By LOCATOR_IDENTIFICATION = By.cssSelector("input[formcontrolname=\"identification\"]");
	public static final By LOCATOR_TYPE_DOCUMENT = By.cssSelector("mat-select[role=combobox][formcontrolname=\"identificationType\"]");
	public static final By LOCATOR_TYPE_DOCUMENT_NIT = By.cssSelector("mat-option[value=\"2\"]>span[class=\"mat-option-text\"]");
	public static final By LOCATOR_TYPE_DOCUMENT_CC = By.cssSelector("mat-option[value=\"1\"]>span[class=\"mat-option-text\"]");
	public static final By LOCATOR_DV = By.cssSelector("input[formcontrolname=\"checkDigit\"]");
	public static final By LOCATOR_BUTTON_REGISTER = By.xpath("//*[@id=\"mat-dialog-2\"]/lib-cc-register/div/div/div[3]/form/button/span");
	public static final By LOCATOR_BUTTONREGISTER_PERSON = By.xpath("//*[@id=\"mat-dialog-2\"]/lib-cc-register/div/div/div[4]/form/button");
	public static final By LOCATOR_RE_CAPCHAT = By.xpath("//iframe[starts-with(@name, 'a-') and starts-with(@src, 'https://www.google.com/recaptcha')]");
	public static final By LOCATOR_CAPTCHA = By.cssSelector("div[class=\"recaptcha-checkbox-border\"]");
	
}
