import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Title2 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecoko.driver","C:\\Users\\mahagram\\Downloads\\"
				+ "geckodriver-v0.32.0-win64" );
		
		WebDriver f=new FirefoxDriver();
		
		f.get("https://www.facebook.com/");
		
		WebElement name=f.findElement(By.id("email"));
		name.sendKeys("9130777583");
		
		WebElement pass=f.findElement(By.name("pass"));
		pass.sendKeys("Srushti@12345");
		
		WebElement login=f.findElement(By.name("login"));
		login.click();
	

	}

}
