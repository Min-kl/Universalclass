package PageObject;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class SignIn {

	WebDriver driver;
	
	//constructor
	public SignIn(WebDriver driver)
	{
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
	//click on sign in button
	public void click_on_SignIn() {
		//user has clicked the button
		driver.findElement(By.id("clssicon")).click();
		//user click on sign in button
		driver.findElement(By.xpath("//*[@id='clssmnucontent']/div/a[1]")).click();
	}
    @Test(priority=1)
	//enter email and password
	public void enter_detail() throws InterruptedException {
		//user enter email address
		driver.findElement(By.xpath("//*[@id='LoginForm2020']/div[1]/span[2]/input")).sendKeys("nd95321@gmail.com");
		Thread.sleep(200);
		//user enter password
		driver.findElement(By.xpath("//*[@id=\"LoginForm2020\"]/div[2]/span[2]/input")).sendKeys("Janki95321@");
	}
	@Test(priority=1)
	//click on sign in
	public void Sign_in() {
		//user click on SignIn button
		driver.findElement(By.xpath("//*[@id=\"LoginForm2020\"]/div[3]/input")).click();
	}
	@AfterClass
	//Close the browser
	public void close() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
	}
	
}
