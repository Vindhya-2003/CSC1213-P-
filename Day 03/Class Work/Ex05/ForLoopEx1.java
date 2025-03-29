import java.util.Scanner;
class ForLoopEx1
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scan.nextInt();
		
		for(int i=0;i<=num;i++)
		{
			System.out.print(i+"\t");
		}
	}
}	