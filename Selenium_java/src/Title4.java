import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Title4 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecoko.driver", "C:\\Users\\mahagram\\Downloads\\"
				+ "geckodriver-v0.32.0-win64");
		
		WebDriver p=new FirefoxDriver();
		
		p.get("https://www.facebook.com/");
		
		WebElement name=p.findElement(By.cssSelector("input[name='email']"));
		name.sendKeys("9130777583");
		
		WebElement pass=p.findElement(By.cssSelector("input[name='pass']"));
		pass.sendKeys("Srushti@12345");
		
		WebElement login=p.findElement(By.cssSelector("button[name='login']"));
		login.click();
		

	}

}
