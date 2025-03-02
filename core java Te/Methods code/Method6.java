class Method6
{
	public static void main(String[]args)
	{
		System.out.println("main starts");
		add(20,30);
		division(12.5,12.5);
		
		System.out.println("main Ends");
	}

	public static void add(int a, int b)
	{
		System.out.println("Add Starts");
		int ans = a + b;

		System.out.println("ans: "+ans);
		System.out.println("Add ends");
	}

	public static void division(double numerator,double denometer)
	{
		System.out.println("Division Starts");
		
		double ans = numerator/denometer;
		System.out.println("ans: "+ans);
		System.out.println("Division Ends");


	}
}