import java.util.Scanner;

public class Sname1 
{

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter value - ");
		
		double a= sc.nextDouble();
		
		
		if(a%2 ==0)
		{
			System.out.println("Even no");
		}
		else
		{
			System.out.println("Odd no");
		}

	}

}
