class yearDays
{
	public static void main(String []args)
	{
	int min=100000000;
	int minYear=365*24*60;//per year min
	int year =min/minYear;//year from min 190
	//System.out.println(+minYear+ " "+year);
	int days = (min%minYear)/(24*60);
	System.out.println(min);
	System.out.println(+year+ "years " +days+"days");
	}
}

 