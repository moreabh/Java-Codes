//Strontio Number 
class StronitoNo
{
	public static void main(String[]args)
	{
		System.out.println(isStronito(1221));
	}
	public static boolean isStronito(int num)
	{
		int mul=num*2;
		
			if ((mul%100)/10==(mul%1000)/100)
			{
				
				return true;
			}
			return false;	
	}	
}
//true