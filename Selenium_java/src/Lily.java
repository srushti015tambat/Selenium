import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Lily 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\mahagram\\Downloads\\" 
				+ "geckodriver-v0.32.0-win-aarch64");
		
			WebDriver driver= new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		String title= "Online Shopping site in India: "
				+ "Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		String acttitle=driver.getTitle();
		
		System.out.println(acttitle);
		
		if(title.equals(acttitle))
		{
		  System.out.println("PASSED");
		
		}
		else
		{
			System.out.println("FAILED");
		}
		
		String CurrentURL=driver.getCurrentUrl();
		System.out.println(CurrentURL);

	}

}
