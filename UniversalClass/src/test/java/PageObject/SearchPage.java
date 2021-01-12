package PageObject;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class SearchPage {
	WebDriver driver;
	private  By click_search_field= By.xpath("//*[@id=\"SearchString\"]");
	private By search_button= By.xpath("//*[@id=\"searchicon\"]/img");
    private By browse_button= By.xpath("//*[@id=\"mnhdrhmlnk\"]/button");
    private By browse_serach= By.xpath("//*[@id=\"searchwidgetstring\"]");
    private By browse_search_click= By.xpath("//*[@id=\"searchwidgeticon\"]/img");
    
    //Constructor for SearchPage
    public SearchPage(WebDriver driver)
    {
	   this.driver = driver;
    }
    @BeforeClass
    //Loading the browser
    public void load_browser()
   {
	   System.setProperty("webdriver.chrome.driver","./driver\\\\chromedriver.exe" );
	  driver= new ChromeDriver();
      driver.get("https://www.universalclass.com/");
      driver.manage().deleteAllCookies();
      driver.manage().window().maximize();
      System.out.println("Title is: "+driver.getTitle());
   }
    @Test(priority=3)
    //searching courses through search box
    public void searchBox() throws InterruptedException 
    {   
    	driver.findElement(click_search_field).sendKeys("Career Training");
    	Thread.sleep(2000);
    	driver.findElement(search_button).click();
    	Thread.sleep(2000);
    	driver.manage().deleteAllCookies();
    }
    @Test
    //Searching courses through browse course
    public void browse_course() throws InterruptedException
    {   
    	driver.findElement(browse_button).click();
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	driver.findElement(browse_serach).sendKeys("Business Management");
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	driver.findElement(browse_search_click).click();
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	driver.manage().deleteAllCookies();
    }
    @Test(priority=3)
    //for unavailable courses or random data
    public void uvavailable_Course() throws InterruptedException
    {
    	driver.findElement(click_search_field).sendKeys("23456");
    	Thread.sleep(2000);
    	driver.findElement(search_button).click();
    	driver.manage().deleteAllCookies();
    }
    @Test(priority=3)
    //displaying message for unmatched data
    public void unmatched_record()
    {
        System.out.println("No Record Found");
        
    }
    @AfterClass
	//Close the browser
	public void close() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
    }
    
}
