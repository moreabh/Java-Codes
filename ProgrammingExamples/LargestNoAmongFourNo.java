class LargestNoAmongFourNo
{
	public static void main (String[]args)

	{
	int a=50;
	float b=110.5f;
	int c=110;
	int d=600;
    float lar=(a>b && a>b && a>c && a>d)?(a):
		((b>a && b>c && b>d)?(b):
		((c>a&&c>b&&c>d)?(c):
		((d>a&&d>b&&d>c)?(d):(0))));
	 //float small=(a<b)?(a< c ? a : c): (b < c ? b : c);	
		System.out.println("Larger No:- " +lar);
		//System.out.println("Smaller No:-"small);

	}
}