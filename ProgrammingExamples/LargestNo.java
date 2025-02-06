class LargestNo
{
	public static void main (String[]args)

	{
	int a=50;
	float b=110.5f;
	int c=110;
    float lar=(a>b)?(a > c ? a : c): (b > c ? b : c);
	 float small=(a<b)?(a< c ? a : c): (b < c ? b : c);	
		System.out.println("Larger No:-"lar);
		System.out.println("Smaller No:-"small);

	}
}