import java.util.*;
class SwitchVowel
{
	public static void main(String[]main)
	{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter a alphabet: ");
	char alphabet = sc.next().charAt(0);

	if (alphabet>='a' && alphabet<='z' || alphabet>='A' && alphabet<='Z')
	{
		switch (alphabet)
		{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			{
				System.out.println("It is a Lowercase Vowel");
				break;
			}
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			{
				System.out.println("It is a Uppercase Vowel");
				break;
			}
		default :
			{
				System.out.println("it is a consonent");
			}
		}
	}

	else 
		{
			System.out.println("it is not alphabet");
		}

	
	}
}