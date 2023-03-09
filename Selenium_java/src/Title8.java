import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Title8 
{

	public static void main(String[] args) 
	{
		
		//WebDriver s=new ChromeDriver();
		System.setProperty("webdriver.gecoko.driver","C:\\Users\\mahagram\\Downloads\\"
				+ "geckodriver-v0.32.0-win64" );
		
		WebDriver s=new FirefoxDriver();
		
		s.get("https://www.redbus.in/");
		
		WebElement webe=s.findElement(By.xpath("//button[@id='search_btn']"));
		
		File src=webe.getScreenshotAs(OutputType.FILE);
		
		try 
		{
			
			FileHandler.copy(src, new File("ElementLevel.jpeg"));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		WebElement webf=s.findElement(By.xpath("//i[@id='i-icon-profile']"));
		webf.click();
		
		File ss=webf.getScreenshotAs(OutputType.FILE);
		
		try {
			FileHandler.copy(ss, new File("icon.jpeg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement webg=s.findElement(By.xpath("//li[@id='signInLink']"));
		
		File srs=webg.getScreenshotAs(OutputType.FILE);
		
		try {
			FileHandler.copy(srs, new File("Webg.jpeg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}

}
