//Method Overloading
class MethodOverloading
{
	public static void main(String[]args)
	{
		add(10,20);
		add(5.2,4.8);
		add('a','m');
		add("Abhishek","More");
		
	}
	public static void add(int a,int b)
	{
		System.out.println("addition of Int Type: " + (a+b));
	}
	public static void add(double d1,double d2)
	{
		System.out.println("Addition Of Double Type: "+(d1+d2));
	}
	public static void add(char ch1, char ch2)
	{
		System.out.println("Addition Of Char Type: "+(ch1+ch2));
	}
	public static void add(String st1,String st2)
	{
		System.out.println("Addition Of String Type: "+(st1+st2));
	}

}
/*
addition of Int Type: 30
Addition Of Double Type: 10.0
Addition Of Char Type: 206
Addition Of String Type: AbhishekMore
*/