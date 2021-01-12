package PageObject;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Subscribe {

	WebDriver driver;
	
	//Constructor
	public Subscribe(WebDriver driver) {
		this.driver=driver;
	}
	@BeforeClass
	//Open the browser
	public void main() {
		System.setProperty("webdriver.chrome.driver","./driver\\\\chromedriver.exe" );
		driver = new ChromeDriver();
		driver.get("https://www.universalclass.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	 @Test(priority=1)
	//click on subscribe
	public void Sub() {
		//user has clicked the button
		driver.findElement(By.id("clssicon")).click();
	}
	@Test
	//click on desired course
	public void choose_course() {
		//user has clicked the button
		//driver.findElement(By.id("clssicon")).click();
		  //user has clicked on start now	
		 // driver.findElement(By.xpath("//*[@id='sidemenucontent']/div/a[4]")).click();
		driver.get("https://secure.universalclass.com/payment_uc/2020/platinum.htm");
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div[3]/div/div[1]/div[5]/a")).click();
	}
	@Test
	//enter firstname
	public void  fname(String fn) {
		//user has enter first name
		driver.findElement(By.xpath("//*[@id=\"givenname\"]")).sendKeys("Neha");
	}
	@Test(priority=1)
	//enter lastname
	public void  lname(String ln) {
		 //user has enter last name
		driver.findElement(By.xpath("//*[@id=\"sn\"]")).sendKeys(ln);
		//user has enter email id
	    driver.findElement(By.xpath("//*[@id=\"mail\"]")).sendKeys("nd95321@gmail.com");
	    //user has enter password
	    driver.findElement(By.xpath("//*[@id=\"userpassword\"]")).sendKeys("nd95321#");
	}
	//enter email,password
	public void  email(String email,String pass) {
		
	}
	 @Test(priority=1)
	//check the checkbox
	public void checkbox() {
		 //user click on checkbox
	    WebElement option1 = driver.findElement(By.xpath("//*[@id=\"PubRegisterForm\"]/div[5]/input"));							
	    // This will Toggle the Check box 		
	    option1.click();
	}
	 @Test(priority=1)
	//click on sinup
	public void signup() throws InterruptedException {
		//user click on Signup button
	    driver.findElement(By.xpath("//*[@id=\"PubRegisterForm\"]/div[6]/input")).click();
	  
	}
	
	@AfterClass
	//Close the browser
	public void close() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();	
	}
}
