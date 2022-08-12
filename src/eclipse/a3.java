package eclipse;
import java.util.Scanner;
class a3
{
	public static void main(String[] args) 
	{
		char ch;
		System.out.println("Enter Any Charater Here");
		
		Scanner a= new Scanner(System.in);
		ch= a.next().charAt(0);

		if (ch=='a' || ch=='e' || ch== 'i' || ch=='o' || ch=='u')

		{ System.out.println(" It is Vowel " );

		}
		

		else if ( ch>'0' && ch<='9')
		{ System.out.println("It is Digit");
		}

		else if (ch > 'a' && ch<='z' || ch>'A' && ch<='Z')
		{
			System.out.println("It is an alphabat");
		}

		else
		{
		
		System.out.println(" Special Character");
		}
	}
}
