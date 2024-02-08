package Guru99.Tests;

import org.testng.annotations.Test;

import Guru99.PO.TelecomAddCustomerPage;
import Guru99.utils.WebActions;

public class TelecomAddCustmerTest extends BaseClass{

	@Test
	public void addCustomer() {
	System.out.println("Adding new customer page creation");	
	TelecomAddCustomerPage customerObject = new TelecomAddCustomerPage(driver);
	customerObject.login("mngr551929", "ErUrAte");
	customerObject.addNewCustomer("Satya", "Potti", "Jan_2024", "Jan2024@gmal.com");
	WebActions.waitForPageToLoad(driver);
	captureScreenshot("newTours");
	}
}
