class ProductOfDigit
{
	public static void main(String[]args)
	{
	int num=123;
	
	int product=1;    
	int rem=num%10;
	product =product*rem;
	num=num/10;

	rem=num%10;
	product =product*rem;
	num=num/10;
	
	rem=num%10;
	product =product*rem;
	num=num/10;
	System.out.println(+ product);

	}

	



}