//class Restaurant Order 
import java.util.*;
class Restarant
{
	static String name;//null
	static Long contact;//0
	static String address;//null
	static ArrayList<String> basket = new ArrayList<>();

	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		for (; ; )
		{
			System.out.println();
			System.out.println("           JAVA KA DHABA           ");
			System.out.println();
			System.out.println("1.Create Account");
			System.out.println("2.Existig User");
			System.out.println();
			System.out.println("Enter an Option");
			int opt = sc.nextInt();
			System.out.println();

			switch(opt)
			{
				case 1: createAccount(sc);break;
				case 2: login(sc);break;
				default : System.out.println(" INVALID INPUT ");break;

			}
		}
	}
	//Account Creation->
	public static void createAccount(Scanner sc)
	{
		System.out.println("    Registration     ");
		System.out.println();
		System.out.println("Name : ");
		name = sc.next();
		System.out.println("Phone :");
		contact = sc.nextLong();
		System.out.println("Address : ");
		address = sc.nextLine();
		sc.next();
		System.out.println();
		System.out.println("ACCOUNT CREATED SUCCESSFULLY");
	}
	//Login Process when account is created->
	public static void login(Scanner sc)
	{
		if (name == null)
		{
			System.out.println("CREATE YOUR ACCOUNT FIRST");
			return ; //calling method(main)
		}
		System.out.println("     Login     ");
		System.out.println();
		
		//attempt login  
		for (int attempt = 3;attempt>=1 ;attempt-- )
		{
			System.out.println("Username: ");
			String username = sc.next();
			System.out.println("Passward : ");
			Long phone = sc.nextLong();
			System.out.println();

			if (name.equals(username) && contact == phone)
			{
				homePage(sc);
			}
			else
			{
				System.out.println("INVALID CRED");
				System.out.println("ATTEMPT LEFT:"+(attempt-1));
				System.out.println();
			}
		}
		System.out.println("THANK U & NEVER VISIT AGAIN");
		System.exit(0);
	}
	//Home page of restarant
	public static void homePage(Scanner sc)
	{
		for (; ; )
		{
			System.out.println();
			System.out.println("   HOME PAGE  ");
			System.out.println();
			System.out.println("1.Menu");
			System.out.println("2.Order");
			System.out.println("3.Table Booking");
			System.out.println("4.Logout");
			System.out.println();
			System.out.println("Enter an Option : ");
			int opt = sc.nextInt();

			switch (opt)
			{
			case 1: menu(sc);break;
			case 2: order(sc);break;
			case 3: tableBooking();break;
			case 4: System.out.println("THANK U & VISIT AGAIN");
					System.exit(0);
			default : System.out.println("Invalid Input");break;
			
			}
		}
	}

	//Restarant Menu 
	public static void menu(Scanner sc)
	{
		for (; ; )
		{
			System.out.println("   Menue ");
			System.out.println("101 :Panner_chingari = 350/-");
			System.out.println("102 :Panner_makhaan = 400/-");
			System.out.println("103 :Shahi_paneer = 450/-");
			System.out.println("104 :Kaju_kurma = 350/-");
			System.out.println("105 :Roti = 20/-");
			System.out.println("106 :Water_bottle = 15/-");
			System.out.println("107 :  EXIT MENU  ");
			System.out.println();

			System.out.print("Enter Food id : ");
			int id = sc.nextInt();

			switch (id)
			{
			case 101:
				{
					basket.add("101 : Panner_chingari = 350 ");
					System.out.println("Panner_chingari added Inside Basket");
					break;
				}
			case 102:
				{
					basket.add("102 :Panner_makhaan = 400 ");
					System.out.println("102 :Panner_makhaan added Inside Basket");
					break;
				}
			case 103:
				{
					basket.add("Shahi_paneer = 450");
					System.out.println("Shahi_paneer added Inside Basket");
					break;
				}
			case 104:
				{
					basket.add("Kaju_kurma = 350");
					System.out.println("Kaju_kurma added Inside Basket");
					break;
				}
			case 105:
				{
					basket.add("105 :Roti = 20");
					System.out.println("105 :Roti added Inside Basket");
					break;
				}
			case 106:
				{
					basket.add("106 :Water_bottle = 15");
					System.out.println("106 :Water_bottle added Inside Basket");
					break;
				}
			case 107:
				{
					return ; 
				}
			default :
				{
				System.out.println("Invalid Food ID");
				break;
		     	}
			}
		}
		
	}
	// Check Order 
	public static void order(Scanner sc)
	{
		System.out.println();
		System.out.println("    ORDERS  ");
		System.out.println();

		if (basket.size()==0)//checked basket first if empty then add food items8
		{
			System.out.println("BASKET SIZE IS EMPTY ADD FOOD ITEMS");
		}
		for (String foodItem : basket)
		{
			System.out.println(foodItem);
		}
		System.out.println();
		System.out.println("1.Cancel Order");
		System.out.println("2.Remove Food item");
		System.out.println("3.Proceed to Payment");
		System.out.println();
		System.out.println("Enter the option : ");
		int opt = sc.nextInt();
		System.out.println();

		switch (opt)
		{
		case 1 :
			{
				//For order cancelled 
				System.out.println("Order Cancelled");
				basket.clear();
				break;
			}
		case 2 :
			{
				System.out.println("Enter foodID : ");
				int foodId = sc.nextInt();
				removeFoodId(foodId);
				break;
			}
		case 3 :
			{
				System.out.println("Proceed To payment");
				billGenerate();
				break;
			}
		
		}
	}
	//To remove food from the basket
	public static void removeFoodId(int foodID)
	{
		ArrayList<String> dupBasket = new ArrayList<>(basket);
		int indx = 0;
		boolean flag = false;
		for (String foodItem : dupBasket)
		{
			String [] arr = foodItem.split(" ");
			if (arr[0].equals(foodID+""))
			{
				dupBasket.remove(indx);
				flag = true;
				System.out.println("FOOD ITEM REMOVED");
			}
			indx++;
		}
		if (!flag)
			System.out.println("FOOD ITEM DOESN'T EXIST IN BASKET");
			
		basket = dupBasket;

	}
	//Table Booking
	public static void tableBooking()
	{
		System.out.println();
		System.out.println("   Table Booking  ");
		System.out.println();
	}
	//Bill Generation
	public static void billGenerate()
	{
		double totalBill = 0;
		for (String foodItem : basket)
		{
			String [] arr = foodItem.split(" ");
			totalBill += Double.parseDouble(arr[4]);
		}
		System.out.println("Total Bill : "+totalBill+"rs.");
	}

}