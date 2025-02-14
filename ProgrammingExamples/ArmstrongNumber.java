class ArmstrongNumber
{
	public static void main(String[]args)
	{
		int num =153, length = 0,sum = 0;
		int dup=num;//153
		for (int i=num;i>0 ;i/=10 )//15,1
		{
			length++;//1,2,3
		}

			while (num>0)//153,15,1
			{
				int rem = num%10;//3 | 5 | 1
				int pow=1;//1
                              4<= 3
				for (int i=1;i<=length ;i++ )//i=2,3,4 |2,3,4 | 2,3,4
				{
					pow= pow*rem;//1*3,3*3=9,9*3=27  |1*5=5,5*5=25,25*5=125 | 1*1=1,1*1=1,1*1=1
				}

					sum=sum+pow;//0+27 | 27+125 | 27+125+1 =153
					num=num/10;//15 | 1 |0
			}                  //153==153
			System.out.println (dup==sum? dup+" is armstrong number":
					                 dup+" is not armstrong number" );
		}
}

