package PageObject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Forgotpassword {
	WebDriver driver;
	private By sel1=By.xpath("//img[@src='https://cdn.4uc.org/20/hmbrgr27x22.png']");
    private By signin=By.xpath("//a[@href='https://members.universalclass.com/login.htm']");
    private By pass=By.xpath("//a[text()='Forgot your password?']");
    private By pass1=By.name("Email");
    private By reset=By.name("SubmitButton");
   
	public Forgotpassword(WebDriver driver) {
		this.driver = driver;
	}
	@BeforeClass()
	public void launch()
	{
		System.setProperty("webdriver.chrome.driver","./driver\\\\chromedriver.exe" );
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.universalclass.com/");
	}
	 @Test(priority=2)
	public void gettitle() throws InterruptedException
	{
		String actual1=driver.getTitle();
		String expected="Universal Class: Online Courses and Continuing Education";
		//compare the title
		Assert.assertEquals(expected,actual1);
		  Thread.sleep(900);
		System.out.println(actual1);
		
	}
	 @Test(priority=2)
	public void select() throws InterruptedException
	{
		driver.findElement(sel1).click();
	    driver.findElement(signin).click();
		Thread.sleep(500);
		driver.findElement(pass).click();
	}
	 @Test(priority=2)
	public void validmailid() throws InterruptedException 
	{
		Thread.sleep(200);
		driver.findElement(pass1).sendKeys("nd95321@gmail.com");
		driver.findElement(reset).click();
		
	}
	 @Test(priority=2)
	public void gettitle1() throws InterruptedException
	{
		String ng=driver.getTitle();
		System.out.println("Title :" +ng);
	}
	 @Test(priority=2)
	public void invalidmail() throws InterruptedException
	{
		Thread.sleep(200);
		driver.findElement(pass1).sendKeys("mk.com");
		driver.findElement(reset).click();
		
	}
	 @Test(priority=2)
	public void errormsg()
	{
		String str=driver.findElement(By.xpath("//*[@id=\"mainbody\"]/div/div[2]/div/div/div")).getText();
		System.out.println("Error message:" +str);
		
	}
	@AfterClass
	//Close the browser
	public void close() throws InterruptedException {
		driver.close();
	}    
}
