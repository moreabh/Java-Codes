import java.util.*;
class SwitchTimeTable
{
	public static void main(String[]args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Day: ");
	String day =sc.next().toLowerCase();

	//System.out.println(day);

	switch (day)
	{
	case "monday":
		{
			System.out.println("Practice Maths Question");
			break;
		}
	case "tuesday":
		{
			System.out.println("Read Marathi Vyakran");
			break;
		}
	case "wednesday":
		{
			System.out.println("Read Science book");
			break;
		}
	case "thursday":
		{
			System.out.println("learn History");
		}
	case "friday":
		{
			System.out.println("Practice to speak in English");
			break;
		}
	case "saturday":
		{
			System.out.println("Do practice of sketches");
			break;
		}
	case "sunday":
		{
			System.out.println("Play Outdoor Games");
			break;
		}
	default :
		{
			System.out.println("Invalid Day");
		}
	
		}
	}
}