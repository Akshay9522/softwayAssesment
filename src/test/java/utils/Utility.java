package utils;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class  Utility {

	public  static void click_element(WebElement element) {
		element.click();	
	}
	public  static void Send_text(WebElement element, String text) {
		element.click();
		element.clear();
		element.sendKeys(text);
		element.sendKeys(Keys.ENTER);
	}
	
	public static String Get_text(WebElement element) {
	String text=element.getText();
	String price=text.replaceAll("[^(0-9)]", "");
	return price;
	
	}
}
