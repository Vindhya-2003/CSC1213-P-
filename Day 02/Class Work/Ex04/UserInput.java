import java.util.Scanner;

class UserInput
{
	public static void main(String[] args)
	{
		String fname;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter your First Name:");
		fname=sc.nextLine();
		
		System.out.print("Enter your Last Name:");
		String lname=sc.next();
		
		System.out.print("Enter your Marks:");
		int marks=sc.nextInt();
		
		System.out.print("Full Name:"+fname+" "+lname+"\n"+"Marks is:"+marks);
	}
}
		
		
		