import java.util.Scanner;

public class Sname 
{

	public static void main(String[] args) 
	
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter no.");
		
		double a=sc.nextDouble();
		
		System.out.println("Enter no.");
		
		double b=sc.nextDouble();
		
		double c=a*b;
		System.out.println("Multiplication of a & b ="+ c);
		
		double d=a+b;
		System.out.println("Adition of a & b ="+ d);
		
		int e= 19;
		int f= 5;
		
		int s= e/f;
		int p= e%f;
		
		System.out.println("Quetient - "+ s);
		System.out.println("Remainder - "+ p);

	}

}
