import java.util.Scanner;
class Ex03
{
	public static void main(String[] args)
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the character");
		char vowel=ob.next().charAt(0);
		switch(vowel){
		
		case 'A':case 'a':
		System.out.println("vowel");
		break;
		case 'E':case 'e':
		System.out.println("vowel");
		break;
		case 'I':case 'i':
		System.out.println("vowel");
		break;
		case 'O':case 'o':
		System.out.println("vowel");
		break;
		case 'U':case 'u':
		System.out.println("vowel");
		break;
		default:
		System.out.println("Consonant");
		break;
		}
	}
}	