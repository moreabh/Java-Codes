//Constructor chaining
//bluePrint
class ConstructorChaining
{
	String carBrand;
	String carName;
	double price;
	String level;//base / mid / top
	double fuelCapacity;
	String color;
	double milage;
	int sitCapacity;
	String type;//gear / auto 

	ConstructorChaining(String carBrand, String carName, double price, String level,double milage)
	{
		//System.out.println("carBrand =" +this.carBrand); o/p -> null
		
		this.carBrand = carBrand;
		this.carName = carName;
		this.price = price;
		this.level = level;
		this.milage = milage;
	}

	ConstructorChaining(String carBrand, String carName, double price, String level,double milage, double fuelCapacity, String color)
	{
		this( carBrand,  carName,  price,  level, milage);

		this.fuelCapacity = fuelCapacity;
		this.color = color;
	}

	ConstructorChaining(String carBrand, String carName, double price, String level,double milage, double fuelCapacity, String color,int sitCapacity,String type)
	{
		this( carBrand, carName, price, level, milage, fuelCapacity, color);
		
		this.sitCapacity = sitCapacity;
		this.type = type;
	}

	public void displayInfo()
	{
		System.out.println("Brand: "+carBrand);
		System.out.println("Nmae: "+carName);
		System.out.println("Price : "+price);
		System.out.println("Level: "+level);
		System.out.println("Fuel Capacity: "+fuelCapacity);
		System.out.println("Color: "+color);
		System.out.println("Milage: "+milage);
		System.out.println("Sitting Capacity: "+sitCapacity);
		System.out.println("Type: "+type);
		System.out.println("......................................");
	}
}