//Procedure to create an Object in heap area
class CarDriver
{
	public static void main(String[]args)
	{
		Car c1 = new Car();
		System.out.println(c1);

		Car c2 = new Car();
		System.out.println(c2);
	
	}
}
/*
this both are the object reference which is 
created inside the heap area 

Car@15db9742
Car@6d06d69c
*/