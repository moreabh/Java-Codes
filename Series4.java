//1 3 9 33 153 873
class Series4
{
	public static void main(String[]args)
	{
		int num = 0;
		int res = 1;
                    //6<=6
		for (int i=1;i<=6 ;i++ )//2 3 4 5 6
		{       //120*6
			res =res*i;//2 6 24 120  720
                 //153+720
			num = num+res;//1 3 9 33 153 873
 			System.out.print(num+" ");//1 3 9 33 153 873-
 		}
	}
}