import java.util.*;
class AreaOfCircle2
{
	public static void main(String[]args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Radius:-");
		float r =sc.nextFloat();
		final float pi=22/7f;		
		float area=pi*(r*r);
		System.out.println("Area Of Circle:-" + area);
	}
}