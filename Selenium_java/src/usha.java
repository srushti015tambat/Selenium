import java.io.IOException;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class usha 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecoko.driver", "C:\\Users\\mahagram\\Downloads\\"
		+ "geckodriver-v0.32.0-win64");

		WebDriver s=new FirefoxDriver();

		//WebDriver s=new ChromeDriver();

		s.get("https://trytestingthis.netlify.app/");
		
		JavascriptExecutor js=(JavascriptExecutor)s;
		
		js.executeScript("window.scrollBy(0,1450)");
		
		s.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		List<WebElement> tab=s.findElements(By.xpath("//tbody/tr/td[2]"));
		System.out.println(tab.size());
		
		System.out.println(tab.get(3).getText());
		
		

	}

}
