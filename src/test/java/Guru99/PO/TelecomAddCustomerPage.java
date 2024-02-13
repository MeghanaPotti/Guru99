package Guru99.PO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Guru99.utils.WebActions;

public class TelecomAddCustomerPage {
	public WebDriver driver;
	public final WebActions app;
  
	public TelecomAddCustomerPage(WebDriver driver) {
		this.driver = driver;
	    this.app = new WebActions(driver);
	}
	
	By telecomProjectOption = By.xpath("//*[contains(text(),'Telecom Project')]");
	By addCustomerOption = By.xpath("//*[@class='flex-item left']//*[contains(text(),'Add Customer')]");
	By doneRadioButton = By.xpath("//*[@for='done']");
	By firstNameInput = By.xpath("//*[@id='fname']");
	By lastNameInput = By.xpath("//*[@id='lname']");
	By emailInput = By.xpath("//*[@id='email']");
	By addressInput = By.xpath("//*[@id='email']/parent::div/following-sibling::div//*[@id='message']");
	By mobileNumInput = By.xpath("//*[@id='telephoneno']");
	By submitButton = By.xpath("//*[@name='submit']");
	
	public void navigateToLoginPage() {
        System.out.println("Navigating to the login page: https://demo.guru99.com/test/newtours/");
        driver.get("https://demo.guru99.com/test/newtours/");
        app.waitForSeconds(10);
	  }
		
	 public void login(String userName, String password) {
	        navigateToLoginPage();
	        app.waitForSeconds(2);
	  }  
	
	public void addNewCustomer(String firstName, String lastName, String email, String address, String mobileNum) {
		
	app.click(telecomProjectOption);
	app.waitForSeconds(2);
	app.click(addCustomerOption);
	app.waitForSeconds(2);
	app.click(doneRadioButton);
	app.waitForSeconds(2);
	app.sendKeys(firstNameInput, firstName);
	app.waitForSeconds(2);
	app.sendKeys(lastNameInput, lastName);
	app.waitForSeconds(2);
	app.sendKeys(emailInput, email);
	app.waitForSeconds(2);
	app.sendKeys(addressInput, address);
	app.waitForSeconds(2);;
	app.sendKeys(mobileNumInput, mobileNum);
	app.waitForSeconds(2);
	app.click(submitButton);
	
	}
}
