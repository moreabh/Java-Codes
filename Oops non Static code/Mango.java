//Method Chaining 
//blueprint
class Mango
{
	String origin;
	String type;
	double price;

	public Mango displayOrigin()
	{
		System.out.println("Origin: "+origin);
		return this;
	}
	public Mango displayType()
	{
		System.out.println("Type: "+type);
		return this;
	}
	public Mango displayPrice()
	{
		System.out.println("Price: "+price);
		return this;
	}
}



