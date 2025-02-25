import java.util.Scanner;
class EmirpNo 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num= sc.nextInt();
		int den=2;
		int rev=0;
		int dup=num;
		while (den<num)
		{
			if (num%den==0)
			{
				break;
			}
			den++;
		}
		   if (num==den)
		  {
           
		   while (num>0)
		   {
           int rem=num%10;
		   rev= rev*10+rem;
		    num/=10;
		    }
			System.out.println(rev);
			 int den2 = 2;
			 while (den2 < rev)
			 {
				 if (rev%den2 == 0)
				 {
					 break;
				 }
				 den2++;
			 }
			 if (rev==den2 )
			 {
				 System.out.println("It is Emirp");
			 }
			 else 
                System.out.println("it is not Emirp");
			
		  }
		   else
		   {
			System.out.println(num+" is not a prime");
		   }		      
}
}