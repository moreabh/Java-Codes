class StaticBlock3
{
	static double d;

	static 
	{
		d = test(100);
		System.out.println(d);//10000.0
		d = test(d) + demo((int)d);
		System.out.println(d);//1.0001E8
		System.out.println(StaticBlock3.d);//1.0001E8
		
		System.out.println(test(StaticBlock3.d));
		double d = demo((int)test(StaticBlock3.d));


		System.out.println(d);//65535.0
	}
	public static void main(String[]args)
	{
		System.out.println(d);//1.0001E8

		System.out.println(test(d));//1.00020001E16

		System.out.println((int)demo((int)d));//2064
	}

	public static double test(double num)
	{
		return num*num;
	}

	public static char demo(int num)
	{
		return (char)num;
	}
} 