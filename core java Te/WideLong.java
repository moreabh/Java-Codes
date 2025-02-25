class WideLong
{
	public static void main(String[]args)
	{
		long a=937340842l;
		System.out.println(a);
		//char b=a; incompatible types: possible lossy conversion from long to char
		//System.out.println(b);
		float c=a;
		System.out.println(c);
		double d=a;
		System.out.println(d);	
		
	}

}