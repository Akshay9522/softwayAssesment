package objectPages;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import utils.Utility;

public class CartPage {
	
	public WebDriver driver;
	
	public CartPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		Set<String> wd = driver.getWindowHandles();
		Iterator<String> itr = wd.iterator();
		String Home_Window = itr.next();
		String Addtocart_Window = itr.next();
		driver.switchTo().window(Addtocart_Window);

	}

	@FindBys(@FindBy(xpath = "//button[contains(@class,'FHuj')]"))
	private List <WebElement> itemIncrease;


	public void Increase_Quantity() throws Exception {
		Thread.sleep(2000);
	 itemIncrease.get(1).click();
		
	}

	public void Print_Incrementalprice() throws Exception {
		Thread.sleep(3000);
		List<WebElement> incrementprice=driver.findElements(By.xpath("//span[contains(@class,'WpvJ')]"));
		String incrementalprice2 = incrementprice.get(0).getText().replaceAll("[^(0-9)]", "");
		System.out.println("price after addition of one quantity:-" + incrementalprice2);
	}
	
}
