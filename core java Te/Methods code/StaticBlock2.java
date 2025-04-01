class StaticBlock2
{
	static
	{
		System.out.println("Static block");
		test();
	}
	public static void main(String[]args)
	{
		System.out.println("Main Method");
	}
	public static void test()
	{
		System.out.println("From Test Method");
	}

}
/*
Static block
From Test Method
Main Method
*/