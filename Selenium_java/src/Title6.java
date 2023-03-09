import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Title6 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecoko.driver", "C:\\Users\\mahagram\\Downloads\\"
				+ "geckodriver-v0.32.0-win64");
		
		WebDriver t=new FirefoxDriver();
		
		t.get("https://trytestingthis.netlify.app/");
		
		WebElement uname=t.findElement(By.xpath("//input[@id='uname']"));
		uname.sendKeys("test");
		
		WebElement pass=t.findElement(By.cssSelector("input[id='pwd']"));
		pass.sendKeys("test");
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
		WebElement login=t.findElement(By.cssSelector("input[type='submit']"));
		login.submit();

	}

}
