import java.util.*;
class StonePaperScissor
{
	public static void main(String[]args)
	{
	Scanner sc= new Scanner(System.in);
	int random_Number = 0;
	for ( ; ; )
	{
		int num = (int)(Math.random()*10);
		if (num>=1 && num<=3)
		{
			random_Number = num;
			System.out.println(num);
		break;
		}
		
		
	}


	}
}