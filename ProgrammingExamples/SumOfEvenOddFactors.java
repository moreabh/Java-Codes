import java.util.*;
class  SumOfEvenOddFactors
	{
public static void main(String[]args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the digit: ");
	int num = sc.nextInt();
	int evenSum = 0;
	int oddSum=0;
	while (num>0)
	{
	int rem = num%10;
	 if (rem%2==0)
	 {
		System.out.println("Even Factors:"+rem);
		 int evenFact = 1;
		
		 for (int i=rem;i>=1 ;i-- )
		 {
			 evenFact *= i;
		 }
		 evenSum +=evenFact;

	 }
	 else{
		 int oddFact=1;
		 System.out.println("Odd Factors:"+rem);
		
		 for (int j=rem;j>=1 ;j-- )
			  
		 {
		 oddFact *=j;
		  
		 }
		 oddSum += oddFact;
		
	 }

		num/=10;
		
	}
		System.out.println("Sum of Even Factor: "+evenSum);
		System.out.println("Sum of odd  Factor: "+oddSum);
	}
}