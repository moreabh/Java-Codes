class WideShort
{
	public static void main(String[]args)
	{
		short a=100;
		System.out.println(a);
		int b=a;
		System.out.println(b);
		long c=a;
		System.out.println(c);
		//char d=a;incompatible types: possible lossy conversion from short to char
		//System.out.println(d);
		float e=a; 
		System.out.println(e);
		double f=a;
		System.out.println(f);
		
	}

}