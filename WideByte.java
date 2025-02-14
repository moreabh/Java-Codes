class WideByte
{
	public static void main(String[]args)
	{
		byte a=10;
		System.out.println(a);
		short b=a;
		System.out.println(b);
		int c=a;
		System.out.println(c);
		long d=a;
		System.out.println(d);
		//char e=a; incompatible types: possible lossy conversion from byte to char
		//System.out.println(e);
		float f=a;
		System.out.println(f);
		double g=a;
		System.out.println(g);
	}





}