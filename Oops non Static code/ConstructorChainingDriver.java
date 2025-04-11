//Driver of ConstructorChaining
class ConstructorChainingDriver
{
	public static void main(String[]args)
	{
		ConstructorChaining c1 = new ConstructorChaining("TATA","Nexon",1000000.0,"TOP",20.0);
		c1.displayInfo();

		ConstructorChaining c2 = new ConstructorChaining("Mahindra","Thar 4X4",1200000.0,"MID",15.0,15.5,"Black");
		c2.displayInfo();

		ConstructorChaining c3 = new ConstructorChaining("BMW", "BMW 2GC", 5000000.0, "TOP", 10.0,12.0, "Toronto red",5, "Gear");
		c3.displayInfo();

		
	}
}
/*
Brand: TATA
Nmae: Nexon
Price : 1000000.0
Level: TOP
Fuel Capacity: 0.0
Color: null
Milage: 20.0
Sitting Capacity: 0
Type: null
......................................
Brand: Mahindra
Nmae: Thar 4X4
Price : 1200000.0
Level: MID
Fuel Capacity: 15.5
Color: Black
Milage: 15.0
Sitting Capacity: 0
Type: null
......................................
Brand: BMW
Nmae: BMW 2GC
Price : 5000000.0
Level: TOP
Fuel Capacity: 12.0
Color: Toronto red
Milage: 10.0
Sitting Capacity: 5
Type: Gear
......................................

*/