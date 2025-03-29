import java.util.Scanner;
public class Ex04
{
	public static void main(String args[])
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("Input Letter");
		char Letter=ob.next().charAt(0);
		
		switch(Letter)
		{
			case 'A':
			case 'a':
			case 'E':
			case 'e':
			case 'I':
			case 'i':
			case 'O':
			case 'o':
			case 'U':
			case 'u':
			
			System.out.println("It is Vowel");
			break;
			default:System.out.println("Invalid Vowel Range");
		}	
	}
}	
		