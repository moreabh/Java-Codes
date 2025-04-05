class MobileDriver
{
	public static void main(String[]args)
	{
	Mobile m1 = new Mobile();
	m1.brand = "Xaiomi";
	m1.price = 15000.50;
	m1.model = "Redami note 10";
	
	m1.displayMobile();
	System.out.println(".................");

	Mobile m2 = new Mobile();
	m2.brand = "Samsung";
	m2.price = 24000.50;
	m2.model = "S24";

	m2.displayMobile();
  }
}
/*
Brand: Xaiomi
Price: 15000.5
Model: Redami note 10
.................
Brand: Samsung
Price: 24000.5
Model: S24

*/