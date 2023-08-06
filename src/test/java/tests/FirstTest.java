package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest{

	private Wait<WebDriver> wait = null;
	public WebDriver driver = null;

    @BeforeTest
    public void beforeTest() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        
    }
    
    @AfterTest
    public void afterTest() {

        driver.close();
        
    }
	
	@Test(priority = 1,description="Register as a new user")
	public void Test1(){
		
		wait = new FluentWait<WebDriver>(driver)
			       .withTimeout(Duration.ofSeconds(10))
			       .pollingEvery(Duration.ofSeconds(2))
			       .withMessage("Not Found")
			       .ignoring(NoSuchElementException.class);
		
		WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")));
		element1.click();
		
		WebElement element2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email_create")));
		element2.sendKeys(RandomEmailGenerator());
		
		WebElement element3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("SubmitCreate")));
		element3.click();
		
		WebElement element4 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("id_gender1")));
		element4.click();
		
		WebElement element5 = driver.findElement(By.id("customer_firstname"));
		element5.sendKeys("panduka");
		
		WebElement element6 = driver.findElement(By.id("customer_lastname"));
		element6.sendKeys("wijekoon");
		
		WebElement element7 = driver.findElement(By.id("passwd"));
		element7.sendKeys("hemmathagama");
		
		Select element8 = new Select(driver.findElement(By.id("days")));
		element8.selectByValue("9");
		
		Select element9 = new Select(driver.findElement(By.id("months")));
		element9.selectByValue("11");
		
		Select element10 = new Select(driver.findElement(By.id("years")));
		element10.selectByValue("1996");
		
		WebElement element11 = driver.findElement(By.xpath("//*[@id=\"newsletter\"]"));
		element11.click();
		
		WebElement element12 = driver.findElement(By.id("company"));
		element12.sendKeys("Test Comapny");
		
		WebElement element13 = driver.findElement(By.id("address1"));
		element13.sendKeys("Test Address 1");
		
		WebElement element14 = driver.findElement(By.id("address2"));
		element14.sendKeys("Test Address 2");
		
		WebElement element15 = driver.findElement(By.id("city"));
		element15.sendKeys("Test City");
		
		Select element16 = new Select(driver.findElement(By.id("id_state")));
		element16.selectByValue("1");
		
		WebElement element17 = driver.findElement(By.id("postcode"));
		element17.sendKeys("45676");
		
		WebElement element18 = driver.findElement(By.id("other"));
		element18.sendKeys("Test Other");
		
		WebElement element19 = driver.findElement(By.id("phone"));
		element19.sendKeys("0763533511");
		
		WebElement element20 = driver.findElement(By.id("phone"));
		element20.sendKeys("0352257040");
		
		WebElement element21 = driver.findElement(By.id("phone_mobile"));
		element21.sendKeys("0763533511");
		
		WebElement element22 = driver.findElement(By.id("alias"));
		element22.clear();
		element22.sendKeys("Test Alias");
		
		WebElement element23 = driver.findElement(By.id("submitAccount"));
		element23.click();
		
	}
	
	@Test(priority = 2,description="Checkout products")
	public void Test2() {
		
		wait = new FluentWait<WebDriver>(driver)
			       .withTimeout(Duration.ofSeconds(10))
			       .pollingEvery(Duration.ofSeconds(2))
			       .withMessage("Not Found")
			       .ignoring(NoSuchElementException.class);
		
		WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a")));
		element1.click();
		
		WebElement element2 = driver.findElement(By.className("product_list"));  
	    ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", element2);
		
		Actions actions = new Actions(driver);
    	WebElement element3 = driver.findElement(By.className("ajax_block_product"));
    	actions.moveToElement(element3).perform();
    	
    	WebElement element4 = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]"));
		element4.click();
		
		WebElement element5 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")));
		element5.click();
		
		WebElement element6 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("page-subheading")));
	    ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", element6);
	    
	    WebElement element7 = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span"));
		element7.click();
		
		WebElement element8 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ordermsg")));
	    ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", element8);
	    
	    WebElement element9 = driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button/span"));
		element9.click();
		
		WebElement element10 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("carrier_title")));
	    ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", element10);
		
	    WebElement element11 = driver.findElement(By.id("cgv"));
		element11.click();
		
	    WebElement element12 = driver.findElement(By.xpath("//*[@id=\"form\"]/p/button/span"));
		element12.click();
		
	}
	

	public String RandomEmailGenerator() {

		String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvxyz";
		StringBuilder sb = new StringBuilder(10);

		for (int i = 0; i < 10; i++) {
			int index = (int) (AlphaNumericString.length() * Math.random());

			sb.append(AlphaNumericString.charAt(index));
		}

		sb.append("@gmail.com");		
		return sb.toString();

	}
	
}
