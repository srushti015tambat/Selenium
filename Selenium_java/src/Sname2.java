import java.util.Scanner;

public class Sname2 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Before Swap"+ "\n");
		System.out.print("Enter no A - ");
		int a= sc.nextInt();
		
		System.out.print("Enter no B - ");
		int b= sc.nextInt();
		
		System.out.println("\n\n" +"After Swap"+ "\n");
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("Print Swap value of A - "+ a);
		System.out.println("Print Swap value of B - "+ b);

	}

}
