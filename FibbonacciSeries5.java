//Fibbonacci Series 0,1,1,2,3,5,8,13
class FibbonacciSeries5
{
	public static void main(String[]args)
	{
		int a= 0;//1 1 2 3 5 8 13
		int b=1;//1 2 3 5 8 13 21
		System.out.print(a+" ");//0 1 1 2 3 5 8 13
		//System.out.print(b+" ");//1 1 2 3 5 8 13 21
		            //8<=7
		for (int i=1;i<=7 ; i++)//2 3 4 5 6 7 8
		{      //c =8+13
			int c = a+b;//1 2 3 5 8 13 21
	
			a=b;//a=13
			b=c;//b=21
			System.out.print(a+" " );
		}
	}
}
