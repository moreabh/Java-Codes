//method Overloading
class MethodOverloading2
{
	public static void main(String[]args)
	{
		add(10,5.7);
		add('a',13);
		add("");

	}
	public static void add(int a,int b)
	{
		System.out.println("From Add1 "+(a+b));
	}
	public static void add(double d1,double d2)
	{
		System.out.println("From Add2 "+(d1+d2));
	}
	public static void add(char ch1,char ch2)
	{
		System.out.println("From Add3 "+(ch1+ch2));
	}
}
/*
From Add2 15.7
From Add1 110
*/
