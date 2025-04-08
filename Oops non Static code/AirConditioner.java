//BluePrint Of Air Conditioner
class AirConditioner
{
	String brand;
	double price;
	double weight;
	double maxTemp;
	double minTemp;
	double avgTemp;

	public void displayMaxTemp()
	{
		System.out.println("Max Temperature: "+maxTemp);
	}
	public void displayMinTemp()
	{
		System.out.println("Min Temprature: "+minTemp);
	}
	public void avgTemp()
	{
		System.out.println("Avrage Temperatur: "+avgTemp);
	}
	public void displayInfo()
	{
		System.out.println("Brand: "+brand);
		System.out.println("Price: "+price);
		System.out.println("Weight: "+weight+" kg");
	}
}

