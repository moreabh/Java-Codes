//logic 2 : Convert Binary To number 
import java.util.*;
class ConvertNumbertoBinary2
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		String bin = Integer.toBinaryString(num);
		System.out.println(num+":" +bin);

	}
}