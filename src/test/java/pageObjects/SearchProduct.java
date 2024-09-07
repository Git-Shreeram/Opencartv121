package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class SearchProduct extends BasePage {

	public SearchProduct(WebDriver driver) {
		super(driver);
				
	}

	@FindBy(xpath= "//*[@id=\"search\"]/input")// search box
	WebElement searchbox;
	
	@FindBy(xpath="//button[@class='btn btn-default btn-lg']") //click searchbutton
	WebElement searchbutton;
	
	@FindBy(xpath="//h1[text()='Search - mac']")//cnfmsg
	WebElement cnfmsg;
	
	public void searchbox(String productName)
	{
		searchbox.sendKeys(productName);
	}

	public void searchbutton()
	{
		searchbutton.click();
	}
	
		public String getCnfMsg() {
		try {
			return (cnfmsg.getText());
		} catch (Exception e) {
			return (e.getMessage());
		}
		}
}
		
	

