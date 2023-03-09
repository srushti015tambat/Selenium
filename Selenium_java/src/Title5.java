
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Title5 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecoko.driver", "C:\\Users\\mahagram\\Downloads\\"
				+ "geckodriver-v0.32.0-win64");
		
		WebDriver t=new FirefoxDriver();
		
		//WebDriver t=new ChromeDriver();
		
		t.get("https://trytestingthis.netlify.app/");
		
		WebElement fname=t.findElement(By.name("fname"));
		fname.sendKeys("Srushti");
		
		WebElement lname=t.findElement(By.name("lname"));
		lname.sendKeys("Tambat");
		
		WebElement gender=t.findElement(By.id("female"));
		gender.click();
		
		WebElement option=t.findElement(By.id("option"));
		option.click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Select se=new Select(t.findElement(By.xpath("//select[@id='option']")));
		se.selectByVisibleText("Option 3");
		
		WebElement mopts=t.findElement(By.xpath("//body/div[3]/div[2]/form[1]/fieldset[1]/input[7]"));
		mopts.click();
		
		WebElement mopt=t.findElement(By.xpath("//body/div[3]/div[2]/form[1]/fieldset[1]/input[8]"));
		mopt.click();
		
		WebElement aw=t.findElement(By.xpath("//body/div[3]/div[2]/form[1]/fieldset[1]/input[9]"));
		aw.click();
		
		WebElement ans=t.findElement(By.xpath("//body/div[3]/div[2]/form[1]/fieldset[1]/input[9]"));
		ans.click();
		
		JavascriptExecutor js=(JavascriptExecutor)t;
		
		js.executeScript("document.getElementById('favcolor').value='#AB2B58'");
		
		
		WebElement qt=t.findElement(By.cssSelector("input#quantity"));
		qt.sendKeys("7");
		
		
		WebElement lmsg=t.findElement(By.xpath("//textarea[contains(text(),'The cat was playing in the garden.')]"));
		lmsg.clear();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
		lmsg.sendKeys("I m practicing selenium");
		
		WebElement submit=t.findElement(By.xpath("//button[contains(text(),'Submit')]"));
		submit.click();
	}

}











/*WebElement colr=t.findElement(By.xpath(" //input[@id='favcolor']"));
		colr.click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Select col=new Select(t.findElement(By.xpath("//input[@id='favcolor']")));
		
col.selectByVisibleText("#D76094");

WebElement colu=t.findElement(By.tagName("favcolor"));
String s= colu.getCssValue("colour");*/