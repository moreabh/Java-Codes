//neon number
import java.util.*;
class NeonNumber
{
    public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int sqr;
		int sum=0;
		sqr = num*num;
		//System.out.println(sqr);

		for (int i=sqr;i>0 ;i/=10 )//8 
		{//81
			int rem=i%10;
              sum = sum+rem;//0+1=1    9
			
		}
	
			 if (sum==num)
			 {
				 System.out.println(num+" is Neon Number");
			 }
			 else 
			 {
		 		System.out.println(num+ "is not Neon Number ");
		   	}
         }
	
}