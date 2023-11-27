package Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testing.annotations.Test;
public class test1 {
	Webdriver driver;
	@Test
	public void add_to_cart() {
		System.out.println("add to cart to test");
		Webdriver driver = new FirefoxDriver();
		driver.manager().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://amazon.in");
		WebElement searchbox = driver,findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("Iphone13");
		searchbox.submit();
		driver.get("some url");
		WebElement addcart =driver,findElement(By.id("add-to-cart-button"));
	}
}
