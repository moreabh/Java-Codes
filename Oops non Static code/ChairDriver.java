//Procedure to create object :-
class ChairDriver
{
	public static void main(String[]args)
	{
		Chair ch1 = new Chair();
		System.out.println(ch1);
		ch1.type = "Wooden";
		ch1.price = 550.50;
		ch1.weight = 10.50;

		ch1.displayChair();
		System.out.println();
 
		Chair ch2 = new Chair();
		System.out.println(ch2);
		ch2.type = "Iorn";
		ch2.price = 1000.50;
		ch2.weight = 30.50;

		ch2.displayChair();
 

	}
}

/*
 
Chair@15db9742
Type: Wooden
Price: 550.5
weight: 10.5

Chair@6d06d69c
Type: Iorn
Price: 1000.5
weight: 30.5
*/