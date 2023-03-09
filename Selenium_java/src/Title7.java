import java.util.Scanner;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Title7 
{

	public static void main(String[] args) 
	{
		//WebDriver p=new ChromeDriver();
		System.setProperty("webdriver.gecoko.driver", "C:\\Users\\mahagram\\Downloads\\"
				+ "geckodriver-v0.32.0-win64");
		
		WebDriver p=new FirefoxDriver();
		
		p.get("https://demoqa.com/alerts");
		
		WebElement enter=p.findElement(By.xpath("//button[@id='promtButton']"));
		enter.click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
		Alert alr1=p.switchTo().alert();
		alr1.sendKeys("Srushti");
		alr1.accept();
		
		WebElement button=p.findElement(By.xpath("//button[@id='alertButton']"));
		button.click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
		Alert alt=p.switchTo().alert();
		alt.accept();
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
		WebElement timebut=p.findElement(By.xpath("//button[@id='timerAlertButton']"));
		timebut.click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
		Alert alrt=p.switchTo().alert();
		alrt.accept();
		
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter_value- ");
		int s =sc.nextInt();
			if(s==1)
			{
				WebElement cnfbox=p.findElement(By.xpath("//button[@id='confirmButton']"));
				cnfbox.click();
		
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) 
				{
					e.printStackTrace();
				}
		
					Alert alr=p.switchTo().alert();
					alr.accept();
			}
			
			else
			{
				WebElement cfbox=p.findElement(By.xpath("//button[@id='confirmButton']"));
				cfbox.click();
		
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) 
				{
					e.printStackTrace();
				}
		
				Alert at=p.switchTo().alert();
				at.dismiss();
			}
			
			
		

	}

}
