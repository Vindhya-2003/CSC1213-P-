import java.util.Scanner;
public class JavaEx
{
	public static void main(String args[])
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=ob.nextInt();
		
		if(num>0)
		{
			System.out.println("Number is Positive");
		}
		else if(num<0)
		{
			System.out.println("Number is Negative");
		}
		else
		{
			System.out.println("Number is Zero");
		}
	}
}	