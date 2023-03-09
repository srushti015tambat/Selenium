import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class srush 
{

	public static void main(String[] args) 
	{
		//System.out.println("Srushti");
		
	
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
		String title= "Instagram";
		
		String acttitle=driver.getTitle();
		
		System.out.println(acttitle);
		
		if(title.equals(acttitle))
		{
			System.out.println("Passed");
		}
		else
		{
			System.out.println("Failed");
		}
		
		String CurrentURL=driver.getCurrentUrl();
		System.out.println(CurrentURL);
				
				
	}

}
