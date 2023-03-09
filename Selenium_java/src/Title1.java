import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Title1 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecoko.driver", "C:\\Users\\mahagram\\Downloads\\"
				+  "geckodriver-v0.32.0-win-aarch64");
		
		WebDriver a=new FirefoxDriver();
	
		a.get("https://www.myglamm.com/");
		
		WebElement wel=a.findElement(By.linkText("Lipstick"));
		
		wel.click();
		
		System.out.println();
		
		


	}

}
