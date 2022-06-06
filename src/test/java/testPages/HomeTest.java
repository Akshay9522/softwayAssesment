package testPages;

import org.testng.annotations.Test;

import objectPages.Addtocartpage;
import objectPages.CartPage;
import objectPages.HomePage;

public class HomeTest extends Base {
	
	@Test
	public void Validate_reasult() throws Exception {
		HomePage hm = new HomePage(driver);
		hm.Search_product();
		hm.Click_FirstElement();
		Addtocartpage ap = new Addtocartpage(driver);
		ap.Print_price();
		ap.Add_cart();
		CartPage cp=new CartPage(driver);
		cp.Increase_Quantity();
		cp.Print_Incrementalprice();

	}
	
	

}
