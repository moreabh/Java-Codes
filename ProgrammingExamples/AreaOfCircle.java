/*Write a program that display the area and perimeter
of a circle that has a radius of 5.5 using the Following
formula:
perimeter=2*3.14*radius
area= 3.14*radius*radius */

class AreaOfCircle
{
	public static void main(String[]args)
	{
	float radius=5.5f;
	double area=3.14*(radius*radius);
	System.out.println("Area Of Circle:-"+area);
	double perimeter=2*(3.14*radius);
	System.out.println("Perimeter Of Circle:-"+perimeter);
	}
}