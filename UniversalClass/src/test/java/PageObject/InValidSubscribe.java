package PageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class InValidSubscribe {


	WebDriver driver;
	
	//Constructor
	public InValidSubscribe(WebDriver driver) {
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
	 @Test(priority=1)
	//click on desired course
	public void choose_course() {
		  //user has clicked on start now	
		  driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[1]/div[5]/div[1]/div[5]/a")).click();
	}
	 @Test(priority=1)
	//enter firstname
	public void  fname() {
		//user has enter first name
		driver.findElement(By.xpath("//*[@id=\"givenname\"]")).sendKeys(" ");
		//user has enter last name
		driver.findElement(By.xpath("//*[@id=\"sn\"]")).sendKeys("Dubey");
		//user has enter email id
	    driver.findElement(By.xpath("//*[@id=\"mail\"]")).sendKeys("nd95321@gmail.com");
	    //user has enter password
	   driver.findElement(By.xpath("//*[@id=\"userpassword\"]")).sendKeys("nd95321#");
	   //user click on checkbox
	    WebElement option1 = driver.findElement(By.xpath("//*[@id=\"PubRegisterForm\"]/div[5]/input"));							
	    // This will Toggle the Check box 		
	    option1.click();
	  //user click on Signup button
	    driver.findElement(By.xpath("//*[@id=\"PubRegisterForm\"]/div[6]/input")).click();
	    //print error message
	    String error=driver.findElement(By.xpath("//*[@id='popbdy']/div[1]/div/ul/li")).getText();
	    System.out.println("Please correct the following:");
	    System.out.println(error);
	}
	 @Test(priority=1)
	//enter lastname
	public void  lname() {
		//user has enter first name
		driver.findElement(By.xpath("//*[@id=\"givenname\"]")).sendKeys("Neha");
	    //user has enter last name
		driver.findElement(By.xpath("//*[@id=\"sn\"]")).sendKeys("");
		//user has enter email id
	    driver.findElement(By.xpath("//*[@id=\"mail\"]")).sendKeys("nd95321@gmail.com");
	    //user has enter password
	    driver.findElement(By.xpath("//*[@id=\"userpassword\"]")).sendKeys("nd95321#");
	    //user click on checkbox
	    WebElement option1 = driver.findElement(By.xpath("//*[@id=\"PubRegisterForm\"]/div[5]/input"));							
	    // This will Toggle the Check box 		
	    option1.click();
	    //user click on Signup button
	    driver.findElement(By.xpath("//*[@id=\"PubRegisterForm\"]/div[6]/input")).click();
	    //print error message
	    String error=driver.findElement(By.xpath("//*[@id='popbdy']/div[1]/div/ul/li")).getText();
	    System.out.println("Please correct the following:");
	    System.out.println(error);
	}
	@Test
	//enter email,password
	public void  email() {
		//user has enter first name
		driver.findElement(By.xpath("//*[@id=\"givenname\"]")).sendKeys("Neha");
	    //user has enter last name
		driver.findElement(By.xpath("//*[@id=\"sn\"]")).sendKeys("Dubey");
		//user has enter email id
		driver.findElement(By.xpath("//*[@id=\"mail\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"mail\"]")).sendKeys("nd95321@gmail.com");
		//user has enter invalid password
		driver.findElement(By.xpath("//*[@id=\"userpassword\"]")).sendKeys("nd9532");
		driver.findElement(By.xpath("//*[@id=\"userpassword\"]")).getText();
		//user click on checkbox
		WebElement option1 = driver.findElement(By.xpath("//*[@id=\"PubRegisterForm\"]/div[5]/input"));							
		// This will Toggle the Check box 		
		option1.click();
		//user click on Signup button
	    driver.findElement(By.xpath("//*[@id=\"PubRegisterForm\"]/div[6]/input")).click();
	    //print error message
	    String error=driver.findElement(By.xpath("//*[@id=\"popbdy\"]/div[1]/div/ul/li")).getText();
		System.out.println(error);
	}
	 @Test(priority=1)
	//check the checkbox
	public void checkbox() {
		//user has enter first name
		driver.findElement(By.xpath("//*[@id=\"givenname\"]")).sendKeys("Neha");
	    //user has enter last name
		driver.findElement(By.xpath("//*[@id='sn']")).sendKeys("Dubey");
		//user has enter email id
		driver.findElement(By.xpath("//*[@id=\"mail\"]")).sendKeys("nd95321@gmail.com");
		//user has enter password
		driver.findElement(By.xpath("//*[@id=\"userpassword\"]")).sendKeys("nd95321#");
	    //user click on checkbox
	    WebElement option1 = driver.findElement(By.xpath("//*[@id=\"PubRegisterForm\"]/div[5]/input"));							
	    // This will Toggle the Check box 	
	    //user click on Signup button
	    driver.findElement(By.xpath("//*[@id=\"PubRegisterForm\"]/div[6]/input")).click();
	    //print error message
	    String error=driver.findElement(By.xpath("//*[@id='popbdy']/div[1]/div/ul/li")).getText();
	    System.out.println("Please correct the following:");
	    System.out.println(error);
	}
	 @Test(priority=1)
	//click on sinup
	public void signup() throws InterruptedException {
		//user click on Signup button
	    driver.findElement(By.xpath("//*[@id=\"PubRegisterForm\"]/div[6]/input")).click();
	    //print error message
	    String error=driver.findElement(By.xpath("//*[@id=\"popbdy\"]/div[1]/div/ul")).getText();
	    System.out.println("Please correct the following:");
	    System.out.println(error);
	    
	}
	@AfterClass
	//Close the browser
	public void close() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();	
		}
}
