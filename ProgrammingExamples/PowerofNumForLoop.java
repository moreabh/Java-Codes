import java.util.*;
class PowerofNumForLoop
{
 public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number: ");
		int num = sc.nextInt();
		System.out.println("Enter The Power: ");
		int pow = sc.nextInt();
		int op = 1;
		for (int i=0;i<=pow ;i++)
		{
			op = op * num;

		}
		System.out.println(num+"^"+pow+"="+op);
	}
}