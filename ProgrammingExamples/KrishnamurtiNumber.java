import java.util.Scanner;
class KrishnamurtiNumber
 {
	public static void main(String[] args)
	 {
		Scanner sc = new Scanner(System.in);
		System.out.println("Start");
		int start = sc.nextInt();
		System.out.println("end");
		int end = sc.nextInt();
		
		
		for(;start<=end;start++){
		int dup = start;
		int num = start;
		int sum = 0;
		while (num>0)
		{
			int rem = num%10;
			int fact = 1;
			for (int i =1;i<=rem ;i++ )
			{
				fact*=i;
			}
			sum += fact;
			num/=10;
		}
		if(dup == sum) 
			{	
				System.out.println(dup +" is KrishnaMurtiNumber");
			}
		
		}
	 }
 }