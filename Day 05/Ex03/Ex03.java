import java.util.Scanner;
public class Ex03
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int numbers[]=new int[5];
		
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter"+i+"number");
			numbers[i]=sc.nextInt();
		}
			
			int min=numbers[0];
			int max=numbers[0];
			
			
			for(int i=0;i<5;i++)
			{
			if(numbers[i]<min ){
			  min=numbers[i];
		  }
		  
		  if(numbers[i]>max){
			  max=numbers[i];
	
			}}
			System.out.println("minimum value:"+min);
			System.out.println("Maximum value:"+max);
			
}		}