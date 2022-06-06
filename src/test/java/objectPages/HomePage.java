package objectPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Utility;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@autocomplete='off']")
	private WebElement searchbox;

	@FindBy(xpath = "//div[(text()='Redmi 9A Sport (Carbon Black, 32 GB)')]")
	private WebElement Firstitem;

	@FindBy(xpath = "//button[@class='_2KpZ6l _2doB4z']")
	private WebElement dismiss;

	public void Search_product() throws Exception {
		Utility.click_element(dismiss);
		Utility.Send_text(searchbox, "Redmi 9A Sport (Carbon Black, 32 GB)");
	}

	public void Click_FirstElement() {
		Utility.click_element(Firstitem);
	}

}
