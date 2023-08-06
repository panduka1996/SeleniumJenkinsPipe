package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class LoginPage {
	
	public Wait<WebDriver> wait = null;
	
	public LoginPage(WebDriver driver) {
	
		wait = new FluentWait<WebDriver>(driver)
			       .withTimeout(Duration.ofSeconds(10))
			       .pollingEvery(Duration.ofSeconds(2))
			       .withMessage("Not Found")
			       .ignoring(NoSuchElementException.class);
	}
	
	public void enterUsername(String username) {
		
		WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")));
		element1.sendKeys(username);
		
	}
	
	public void enterPassword(String password) {
		
		WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")));
		element1.sendKeys(password);
	}
	
	public void enterLoginBtn() {
		
		WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")));
		element1.click();
		
	}

}
