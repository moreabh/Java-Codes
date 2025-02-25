import java.util.*;
class VowelFromTheName
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Name: ");

		String name  = sc.next().toLowerCase();
	
		for(int i=0; i<name.length(); i++)
		{
			char ch = name.charAt(i);
			if(ch =='a'|| ch =='e'|| ch =='i'|| ch =='o'|| ch =='u')
			{

				System.out.println(ch+" "+i+" " );
			}
		}	
	}
}
