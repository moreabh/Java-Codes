//Method Chaining Driver file For Mango
class MangoDriver
{
	public static void main(String[]args)
	{
		Mango m1 = new Mango();

		m1.origin = "Ratnagiri";
		m1.type = "Hapus";
		m1.price = 1000.50;

		m1.displayOrigin().displayType().displayPrice();//method chaining
	}
}
/*
Origin: Ratnagiri
Type: Hapus
Price: 1000.5
*/