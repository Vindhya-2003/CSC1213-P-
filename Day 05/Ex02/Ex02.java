import java.util.Scanner;
public class Ex02
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int Numbers[]=new int[10];
		
		for(int i=0;i<10;i++)
		{
			System.out.println("Enter "+i+" th Number");
		    Numbers[i]=sc.nextInt();
		}
		
		
		String Days[]={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		for(String day:Days){
		System.out.println(day);
		
	}
}
}

		
		