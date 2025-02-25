import java.util.*;
class SeasonMonth
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
	
		//String month = sc.nextLine();
		System.out.println();
		System.out.println("*********List of Months***********");
		System.out.println("1.january");
		System.out.println("2.february");
		System.out.println("3.march");
		System.out.println("4.april");
		System.out.println("5.may");
		System.out.println("6.june");
		System.out.println("7.july");
		System.out.println("8.august");
		System.out.println("9.september");
		System.out.println("10.octomber");
		System.out.println("11.november");
		System.out.println("12.december");
		System.out.println();
		System.out.println();
		System.out.println("Enter Month No. to see the season: ");
		int month = sc.nextInt();
		switch (month)
		{
			case 10:
			case 11:
			case 12:
			case 1:
			{
				System.out.println("Winter");
				break;
			}
			case 2:
			case 3:
			case 4:
			case 5:
			{
				System.out.println("Summer");
				break;
			}
			case 6:
			case 7:
			case 8:
			case 9:
			{
				System.out.println("Rainy");
				break;
			}
			default :
			{
				System.out.println("Enter valid option");
				break;
			}

		}
	}

}