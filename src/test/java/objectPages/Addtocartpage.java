package objectPages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Utility;

public class Addtocartpage {

	WebDriver driver;

	public Addtocartpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		Set<String> wd = driver.getWindowHandles();
		Iterator<String> itr = wd.iterator();
		String Home_Window = itr.next();
		String Addtocart_Window = itr.next();
		driver.switchTo().window(Addtocart_Window);
	}

	@FindBy(xpath = "//button[@class='_2KpZ6l _2doB4z']")
	private WebElement dismiss;

	
	
	public void Add_cart() {
		WebElement addTocart = driver.findElement(By.xpath("//button[text()='ADD TO CART']"));
		try{Utility.click_element(addTocart);
		
		}catch(Exception e) {
			WebElement addTocart1 = driver.findElement(By.xpath("//button[text()=//button[text()='GO TO CART']"));
			Utility.click_element(addTocart1);
		}
	}

	public void Print_price() {
		WebElement price =driver.findElement(By.xpath("//div[contains(@class,'Jk')]"));
		String initialprice = Utility.Get_text(price);
		System.out.println("initial price of mobile:-" + initialprice);
	}

	
}
