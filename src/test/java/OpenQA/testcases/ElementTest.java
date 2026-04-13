package OpenQA.testcases;

import org.testng.annotations.Test;
import org.testng.Assert;
import qaWebElement.pageobjects.BasePage;
import qaWebElement.pageobjects.ElementsPage;

public class ElementTest extends BaseTest {
	@Test
	public void jumpToElements() {
		BasePage demoqa=LaunchApplication();
	ElementsPage elementspage=demoqa.clickonElementSection();
	String confirmString=elementspage.confirmYouLaunchOnElementPage();
	Assert.assertTrue(confirmString.equalsIgnoreCase("Please select an item from left to start practice."));
	}
}
