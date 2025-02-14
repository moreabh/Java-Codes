import java.util.*;
class Vowel
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value:");
		char val=sc.next().charAt(0);

		String op=(val=='a'||val=='e'||val=='i'||val=='o'||val=='u')?("is a vowel"):("is a consonant");
		System.out.println(op);
		}


}