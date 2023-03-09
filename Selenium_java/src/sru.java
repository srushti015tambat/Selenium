
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sru 
{

	public static void main(String[] args) 
	{
		//WebDriver t=new ChromeDriver();
		
		System.setProperty("webdriver.gecoko.driver", "C:\\Users\\mahagram\\Downloads\\"
				+ "geckodriver-v0.32.0-win64");
		
		WebDriver t=new FirefoxDriver();
		
		
		t.get("https://demoqa.com/browser-windows");
		
		WebElement wa=t.findElement(By.xpath("//button[@id='tabButton']"));
		
		wa.click();
		
				
		String myWindow=t.getWindowHandle();
		
		System.out.println(myWindow);
		
		Set<String> set=t.getWindowHandles();
		
		Iterator<String> iter= set.iterator();
		
		while(iter.hasNext())
		{
		
			String chldWindow=iter.next();
			
			if(!myWindow.equals(chldWindow))
			{
				t.switchTo().window(chldWindow);
				
			    System.out.println(t.getCurrentUrl());
				
			    WebElement wb=t.findElement(By.xpath("//h1[@id='sampleHeading']"));
			   
			    System.out.println(wb.getText());  
			    
			    try 
			    {
					Thread.sleep(1000);
				} 
			    catch (InterruptedException e) 
			    {
					e.printStackTrace();
				}
			   
				t.close();
				
			}
			
		}
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		WebElement wlc=t.findElement(By.xpath("//button[@id='windowButton']"));
		
		wlc.click();
		
				
		String yourWindow=t.getWindowHandle();
		
		System.out.println(yourWindow);
		
		Set<String> sel=t.getWindowHandles();
		
		Iterator<String> itet= sel.iterator();
		
		while(itet.hasNext())
		{
		
			String cldWindow=itet.next();
			
			if(!yourWindow.equals(cldWindow))
			{
				t.switchTo().window(cldWindow);
				
			    System.out.println(t.getCurrentUrl());
				
			    WebElement wd=t.findElement(By.xpath("//h1[@id='sampleHeading']"));
			   
			    System.out.println(wd.getText());  
			    
			    try 
			    {
					Thread.sleep(4000);
				} 
			    catch (InterruptedException e) 
			    {
					e.printStackTrace();
				}
			   
				t.close();
				
			}
			
		}

	}

}
