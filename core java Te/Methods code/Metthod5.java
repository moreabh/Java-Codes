class Metthod5
{
	public static void main(String[]args)
	{
		add(10,30);
		add(10/2,30/2);
		add('a','b');//widening should be done implicitely but narrwing cannot be done implicitly
		
		//add(1.2,1.2);// incompatible types: possible lossy conversion from double to int
		
	}
	 public static void add(int a, int b)
	{
		int ans = a+b;
		System.out.println("ans: "+ans);
	}
}
