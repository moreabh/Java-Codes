//BluePrint of Bike
class Bike
{
	String brand;
	double price;
	String name;
	int cc;

	public void displayBike()
	{
		String name = "Z9";//This is Local datatype Which is local for its method only
		System.out.println("Brand: "+brand);
		System.out.println("Price: "+price);
		System.out.println("Name1: "+name);
		System.out.println("Name2: "+this.name);//This take the refernce of a non-static variable
	}
}
