class WideFloat
{
	public static void main(String[]args)
	{
		float a=67.90f;
		System.out.println(a);
		//char b=a;  incompatible types: possible lossy conversion from float to char
		//System.out.println(b);
		double c=a;
		System.out.println(c);	
		
	}

}