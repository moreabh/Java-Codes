class NarrowingLong
{
	public static void main( String[]args)
	{
		long c=(long)23456789012l;
		System.out.println(c);
		int d=(int)c;
		System.out.println(d);
		short e=(short)c;
		System.out.println(e);
		byte f=(byte)c;
		System.out.println(f);
		char g=(char)c;
		System.out.println(g);

	}

}