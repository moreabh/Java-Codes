import java.util.*;
class SumOfDigitInForLoop
{
	public static void main(String[]args)
	{
		System.out.println("Enter a number: ");
		int num = new Scanner(System.in).nextInt();
		int dup=num;
		int sum=0;
		while(num>0)
		{
			int rem =num%10;
			sum = sum+rem;
			num = num/10;
		}
		System.out.println(sum);
		System.out.println(dup+"<-");

		System.out.println("Even No from the given No: ");

		while (dup>0)
			{
			//System.out.println("check");
			int rem = dup%10;
				if (rem%2==0)
				{
					System.out.print("  "+rem);
				}
				dup =dup / 10;
			}
		}

	}

