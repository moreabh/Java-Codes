class AlphabetSeries
{
public static void main(String[]args)
	{
	int a=1;
		for (char ch='A';ch<='Z' ; ch = (char)(ch+a))//ch += a compound assignment operator
		{
			System.out.print(ch+" ");

			a++;

		}
	}

}