import java.util.Scanner;
class NestedForLoop1
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value for Counter01");
		int Counter01=scan.nextInt();
		System.out.println("Enter the value for Counter02");
		int Counter02=scan.nextInt();
		
		for(int i=0;i<=Counter01;i++)
		{
			System.out.println("Value for i "+i);
			
			for(int j=0;j<=Counter02;j++)
		{
			System.out.println("Value for j "+j+" ");
		}
		System.out.println();
		}
	}
}	
		