import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Title3 
{

	public static void main(String[] args) 
	{
		//System.setProperty("webdriver.gecoko.driver", "C:\\Users\\mahagram\\Downloads\\"
				//+ "geckodriver-v0.32.0-win64");
		
		//WebDriver s=new FirefoxDriver();
		WebDriver s=new ChromeDriver();
		s.get("https://www.instagram.com/");
		
		WebElement username=s.findElement(By.cssSelector("input[name='username']"));
		username.sendKeys("srushti_tambat");
		
		WebElement password=s.findElement(By.cssSelector("input[name='password']"));
		password.sendKeys("Srushti@150699");
		
		WebElement login=s.findElement(By.xpath("//div[contains(text(),'Log in')]"));
		login.click();
		
		//WebElement notnow=s.findElement(By.xpath("//button[contains(text(),'Not Now')]"));
		//notnow.click();
		
	
	}

}
