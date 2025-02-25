class Example
{
	public static void main(String[]args)
	{
		System.out.println("Digits 0 to 9");
		for (int i=0;i<=9 ;i++ )
		{
			System.out.println(i);
		}
		System.out.println("Alphabets A to Z");

		for (char  chr='A';chr<='Z' ;chr++ )
		{
			System.out.println(chr);
		}
		System.out.println("Numbers 1 to 10");
		for (int i=1;i<=10 ;i++ )
		{
			System.out.println(i);
		}
		System.out.println("ASCII VALUES 1 to 127");
		int a=1;
		for (char ch=1;ch<=127; ch++ )
		{
			System.out.println("     "+a+"       " +ch);
			a++;
		}
		
	}
}