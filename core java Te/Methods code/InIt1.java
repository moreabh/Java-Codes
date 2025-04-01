class InIt1
{
	static double pi=22.0/7.0;

	public static void main(String[]args)
	{ 
		areaOfCircle(5);
		circumferenceOfCircle(10);
		
	}
	public static void areaOfCircle(int rad)
	{
		double area = pi*(rad*rad);
		System.out.println("Area Of Circle: "+area);
	}
	public static void circumferenceOfCircle(int rad)
	{
		double circ = 2*pi*rad;
		System.out.println("Circumference Of Circle: "+circ);
	}
}..00
/*
Area Of Circle: 78.57142857142857
Circumference Of Circle: 62.857142857142854
*/
