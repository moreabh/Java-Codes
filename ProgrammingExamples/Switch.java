import java.util.*;
class Switch
{
	public static void main(String[]args)
	{
	 Scanner sc = new Scanner(System.in);
	 System.out.println();
	 System.out.println("*******WELCOME********");
	 System.out.println("--------Options-------");
	 System.out.println("1.Marathi");
	 System.out.println("2.Hindi");
	 System.out.println("3.kannada");
	 System.out.println("4.English");
	 System.out.println("5.Telagu");
	 System.out.println();
	 
	 System.out.println("Enter the option: ");
	 int opt = sc.nextInt();
	 
	 switch (opt)
	 {
	 case 1:
		 {
			System.out.println("Namastee! I am from Maharashtra");
			break;
		 }
	case 2:
		 {
			System.out.println("Namaste! I am from Rajasthan");
		 break;
		 }
	case 3:
		 {
			System.out.println("Namaskara! I am from Karnataka");
		break;
		 }
	case 4:
		 {
			System.out.println("Hello! I am form U.K.");
		 break;
		 }
	case 5:
		 {
			System.out.println("Namaskaram! I am from Tamil");
			break;
		 }
	default :
		 {
			System.out.println("Enter Valid Option");
		 break;
		 }

		 
	    }
	
	}
}