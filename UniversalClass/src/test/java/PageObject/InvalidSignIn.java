package PageObject;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class InvalidSignIn {
WebDriver driver;
	
	//constructor
	public InvalidSignIn(WebDriver driver)
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
	//user enter wrong credential
	public void invalid_data() {
		driver.findElement(By.xpath("//*[@id=\"LoginForm2020\"]/div[1]/span[2]/input")).clear();
		driver.findElement(By.xpath("//*[@id=\"LoginForm2020\"]/div[2]/span[2]/input")).clear();
		//user enter email address
		driver.findElement(By.xpath("//*[@id=\"LoginForm2020\"]/div[1]/span[2]/input")).sendKeys("nd95321@gmail.com");
		//user enter password
		driver.findElement(By.xpath("//*[@id=\"LoginForm2020\"]/div[2]/span[2]/input")).sendKeys("nd9521#");
	}
	@Test(priority=1)
	//click on sigin button
	public void check_sigin() {
		//user click on SignIn button
		driver.findElement(By.xpath("//*[@id=\"LoginForm2020\"]/div[3]/input")).click();
	}
    @Test(priority=1)
    //error message
	public void errormessage() {
		  //String error=driver.findElement(By.xpath("//*[@id='mainbody']/div[1]/div[1]/div/div")).getText();
		  //System.out.println(error);
	}
	@AfterClass
	//Close the browser
	public void close() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();	
	}
	
}
