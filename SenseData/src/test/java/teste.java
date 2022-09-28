import java.io.IOException;
import java.util.concurrent.TimeUnit;
//import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class teste {

	WebDriver driver;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com");
	}

	//@After
	//public void tearDown() throws Exception {
		//driver.quit();
	//}

	@Test
	public void test() throws IOException, InterruptedException {

		driver.findElement(By.id("user-name")).clear();
		driver.findElement(By.id("user-name")).sendKeys("performance_glitch_user");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("secret_sauce");

		TimeUnit.SECONDS.sleep(05);

		driver.findElement(By.id("login-button")).click();

		driver.findElement(By.xpath("//select[@class='product_sort_container']")).click();
		driver.findElement(By.xpath("//option[@value='lohi']")).click();
		TimeUnit.SECONDS.sleep(05);

		driver.findElement(By.name("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		TimeUnit.SECONDS.sleep(05);

		driver.findElement(By.id("checkout")).click();
		TimeUnit.SECONDS.sleep(05);

		driver.findElement(By.id("first-name")).clear();
		driver.findElement(By.id("first-name")).sendKeys("Erick");
		driver.findElement(By.id("last-name")).clear();
		driver.findElement(By.id("last-name")).sendKeys("Nascimento");
		driver.findElement(By.id("postal-code")).clear();
		driver.findElement(By.id("postal-code")).sendKeys("04511111");
		driver.findElement(By.id("continue")).click();
		TimeUnit.SECONDS.sleep(05);

		driver.findElement(By.id("finish")).click();

		driver.findElement(By.id("back-to-products")).click();

	}

}