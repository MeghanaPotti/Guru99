package Guru99.PO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Guru99.utils.WebActions;

public class NewToursPage {

	public WebDriver driver;
	public final WebActions app;
  
	public NewToursPage(WebDriver driver) {
		this.driver = driver;
	    this.app = new WebActions(driver);
	}
	
	By flightsOption = By.xpath("//*[contains(text(),'Flights')]");
	By fromPort = By.xpath("//*[@name='fromPort']");
	By fromMonth = By.xpath("//*[@name='fromMonth']");
	By fromDay = By.xpath("//*[@name='fromDay']");
	By toPort = By.xpath("//*[@name='fromDay']");
	By toMonth = By.xpath("//*[@name='toMonth']");
	By toDay = By.xpath("//*[@name='toDay']");
	By businessClassRadioButton = By.xpath("//*[@value=\'Business\']");
	By airline = By.xpath("//*[@name='airline']");
	By continueButton = By.xpath("//*[@name='findFlights']");
		
	public void navigateToLoginPage() {
        System.out.println("Navigating to the login page: https://demo.guru99.com/test/newtours/");
        driver.get("https://demo.guru99.com/test/newtours/");
        app.waitForSeconds(10);
	  }
		
	 public void login(String userName, String password) {
	        navigateToLoginPage();
	        app.waitForSeconds(2);
	  }  
	
	public void findingFlights() {
		
		app.click(flightsOption);
		
		String departingLocationXpath = "//*[@name=\'fromPort\']//*[contains(text(),'dynamicValue')]"; 
		app.click(fromPort);
		String departingLocationDropdown = "Portland";
		String departingLocation = departingLocationXpath.replace("dynamicValue", departingLocationDropdown);
		app.click(By.xpath(departingLocation));
		
		String monthXpath = "//*[@name=\'fromMonth\']//*[contains(text(),'dynamicValue')]";
		app.click(fromMonth);
		String fromMonthDropdown = "August";
		String fromMonthDropdownSelect = monthXpath.replace("dynamicValue", fromMonthDropdown);
		app.click(By.xpath(fromMonthDropdownSelect));
		
		String dayXpath = "//*[@name='fromDay']//*[contains(text(),'dynamicValue') and @value='dynamicValue']";
		app.click(fromDay);
		String fromDayDropdown = "4";
		String fromDayDropdownSelect = dayXpath.replace("dynamicValue", fromDayDropdown);
		app.click(By.xpath(fromDayDropdownSelect));
		
		String arrivingLocationXpath = "//*[@name=\'toPort\']//*[contains(text(),'dynamicValue')]";
		app.click(toPort);
		String toPortDropdown = "Paris";
		String toPortDropdownSelect = arrivingLocationXpath.replace("dynamicValue", toPortDropdown);
		app.click(By.xpath(toPortDropdownSelect));
		
		String toMonthXpath = "//*[@name='toMonth']//*[contains(text(),'dynamicValue')]";
		app.click(toMonth);
		String toMonthDropdown = "November";
		String toMonthDropdownSelect = toMonthXpath.replace("dynamicValue", toMonthDropdown);
		app.click(By.xpath(toMonthDropdownSelect));
		
		String toDayXpath = "//*[@name='toDay']//*[contains(text(),'dynamicValue') and @value='dynamicValue']";
		app.click(toDay);
		String toDayDropdown = "31";
		String toDayDropdownSelect = toDayXpath.replace("dynamicValue", toDayDropdown);
		app.click(By.xpath(toDayDropdownSelect));
		
		app.click(businessClassRadioButton);
		
		String airlineXpath = "//*[@name='airline']//*[contains(text(),'Blue Skies Airlines')]"; 
		app.click(airline);
		String airlineDropdown = "Blue Skies Airlines";
		String airlineDropdownSelect = airlineXpath.replace("dynamicValue", airlineDropdown);
		app.click(By.xpath(airlineDropdownSelect));
		
		app.click(continueButton);
		
	}	
}
