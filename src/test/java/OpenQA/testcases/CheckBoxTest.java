package OpenQA.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import qaWebElement.pageobjects.BasePage;
import qaWebElement.pageobjects.CheckBoxPage;
import qaWebElement.pageobjects.ElementsPage;
import qaWebElement.pageobjects.TextBoxPage;

public class CheckBoxTest extends BaseTest {
	@Test
	public void confCheckBoxPage() {						
		ElementsPage elementpage=basepage.clickonElementSection();
		CheckBoxPage chkbox=elementpage.check_Box();
		String actualtext_textbox=chkbox.ConfirmCheckBoxPage();
		basepage.scrollpage();
		Assert.assertTrue(actualtext_textbox.equalsIgnoreCase("Check Box"));			
	}
	
	@Test
	public void clickOnCheckBox() {
		
		ElementsPage elementpage=basepage.clickonElementSection();
		CheckBoxPage chkbox=elementpage.check_Box();
		String actualtext_textbox=chkbox.ConfirmCheckBoxPage();
		String UhaveSelected=chkbox.clickonchkBox();
		basepage.scrollpage();		
		Assert.assertTrue(UhaveSelected.equalsIgnoreCase("home"));		
	}
	@Test
	public void checkAllcheckbox() throws InterruptedException {
		ElementsPage elementpage=basepage.clickonElementSection();
		CheckBoxPage chkbox=elementpage.check_Box();
		String actualtext_textbox=chkbox.ConfirmCheckBoxPage();
		chkbox.clickOnAllBoxes();
		basepage.scrollpage();
		Assert.assertTrue(actualtext_textbox.equalsIgnoreCase("home"));
		
	}
	
	

	}