//Unique Number logic 1:-
class UniqueNo
{
	public static void main(String[]args)
	{
		System.out.println(isUnique(512347546));
	}
	public static boolean isUnique(int num)
	{
		//int dup=num;//123
		//int rem2=0;
		//int rem=0;
		for (int i=num;i>0;num/=10)                  //123
		{    
			//System.out.println("num:"+num);
			int rem = i%10;  //3
			 i/=10;
			// System.out.println("rem:"+rem);//3
			 

			for (int j=i;j>0;j/=10)
			{
				int rem2 = j%10;
				// System.out.println("rem2="+rem2);//2 1 3  
				  if (rem==rem2)                  
				  {
					 System.out.println(rem+":"+rem2+" Not a Unique Number");//
					 return false;
				  }
			}
		}
		System.out.println("It is a unique Number");
		return true ;
	}
}
/*
num:512347546
rem:6
rem2=4
rem2=5
rem2=7
rem2=4
rem2=3
rem2=2
rem2=1
rem2=5
num:51234754
rem:4
rem2=5
rem2=7
rem2=4
4:4 Not a Unique Number
false
*/



/*
num:1237546
rem:6
rem2=4
rem2=5
rem2=7
rem2=3
rem2=2
rem2=1
num:123754
rem:4
rem2=5
rem2=7
rem2=3
rem2=2
rem2=1
num:12375
rem:5
rem2=7
rem2=3
rem2=2
rem2=1
num:1237
rem:7
rem2=3
rem2=2
rem2=1
num:123
rem:3
rem2=2
rem2=1
num:12
rem:2
rem2=1
num:1
rem:1
It is a unique Number
true
*/
