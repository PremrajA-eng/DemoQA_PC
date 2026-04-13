package OpenQA.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import qaWebElement.pageobjects.BasePage;
import qaWebElement.pageobjects.ElementsPage;
import qaWebElement.pageobjects.TextBoxPage;

public class TextBoxTest2 extends BaseTest {
	@Test
	public void confJumponTextBoxPage() throws InterruptedException {
		
		//LaunchApplication();		
		ElementsPage elementpage=basepage.clickonElementSection();		
		TextBoxPage textboxpage=elementpage.checkTextBoxElement();
	    String actualtext_textbox=textboxpage.confirmTextBoxPage();
	    
	    textboxpage.fillUserDetail();
	 
	    Thread.sleep(5000);
	    
	    Assert.assertTrue(textboxpage.confirmFillDetailSubmitted());	    	    	    
	}
	@Test
	public void showsWrongsubmittedDetail() throws InterruptedException {
		ElementsPage elementpage=basepage.clickonElementSection();
		TextBoxPage textboxpage=elementpage.checkTextBoxElement();
	    String actualtext_textbox=textboxpage.confirmTextBoxPage();		  
	    textboxpage.fillUserDetail();	  
	    Thread.sleep(5000);
	    
	    Assert.assertFalse(textboxpage.confirmFillDetailSubmitted());
		
	}

}
