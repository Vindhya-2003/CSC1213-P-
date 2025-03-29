import java.util.Scanner;
public class Maxi
{
	public static void main(String args[])
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the number1");
		int num1=ob.nextInt();
		System.out.println("Enter the number2");
		int num2=ob.nextInt();
		System.out.println("Enter the number3");
		int num3=ob.nextInt();
		
		if(num1>num2 && num1>num3)
		{
			System.out.println("Maximum number is:"+num1);
		}
		else if(num2>num1 && num2>num3)
		{
			System.out.println("Maximum number is:"+num2);
		}
		else
		{
			System.out.println("Maximum number is:"+num3);
		}
	}
}	