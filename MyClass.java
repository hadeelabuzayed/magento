
package ltucP1;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class MyClass {

	WebDriver driver = new ChromeDriver();


	@BeforeTest
	public void myBeforeTest() {

		String theuserName = "standard_user";

		String thepassword = "secret_sauce";
		String Url = "https://www.saucedemo.com/";

		driver.get(Url);
		driver.findElement(By.id("user-name")).sendKeys(theuserName);

		driver.findElement(By.name("password")).sendKeys(thepassword);

	}

	@Test()
	public void myTest() throws InterruptedException {

		
		// this the login button 
		driver.findElement(By.className("submit-button")).click();

		// iterate over all elements "Add to cart " 
		
		List<WebElement> myelemnts = driver.findElements(By.className("btn"));

		for (int i = 0; i < myelemnts.size(); i++) {

			myelemnts.get(i).click();

		}
		
		driver.manage().window().maximize();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"remove-sauce-labs-onesie\"]")).click();

	}

	@Test()
	public void ThisIsAnotherTest() throws InterruptedException {
		String myURL = driver.getCurrentUrl();
		String myTitle = driver.getTitle();


		System.out.println(myURL);
		System.out.println(myTitle);


	}

	@AfterTest
	public void myAfterTest() {


	}

}