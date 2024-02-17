package Guru99.Tests;

import org.testng.annotations.Test;

import Guru99.PO.NewToursPage;
import Guru99.utils.WebActions;

public class NewToursTest extends BaseClass{

	@Test
	public void newTours() {
		System.out.println(" validating Flight booking page method in new tours");
		NewToursPage newToursObject = new NewToursPage(driver);
		newToursObject.login("mngr551929", "ErUrAte");
		newToursObject.findingFlights();
		WebActions.waitForPageToLoad(driver);
		captureScreenshot("newTours");
		System.out.println(" validating Flight booking page method in new tours");
	}
}
