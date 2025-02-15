class Series2
{
	public static void main(String[]args)
	{               //7<=6   
		for (int i=2;i<=6;i++)//3 4 5 6 7
		{
			int num = 1;
					  //4<=3 	
		for (int pow=1;pow<=3;pow++)//2 3 4 | 2 3 4 | 2 3 4 |2 3 4 |2 3 4
		{		  //36*6 
			num = num*i;//2 4 8 | 3 9 27 | 4 16 64 |5 25 125 |6 36 216
  		}    //216 + 6 =222
		num = num +i;
		System.out.print(num+" ");// o/p-> 10 30 68 130 222
		}
	}
}