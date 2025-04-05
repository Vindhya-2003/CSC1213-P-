import java.util.Scanner;
public class Ex02
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		char Control=' ';
		int sum=0;
		
		do{
		System.out.println("Enter the number to find the summation");
		int Num=sc.nextInt();
		sum=sum+Num;
		
		System.out.println("Do you want to Continue(Y/N):");
		Control=sc.next().charAt(0);
		
		}while(Control=='Y');
		System.out.println("Summation of Numbers:"+sum);
	}
}