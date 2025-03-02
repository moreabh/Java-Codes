//String Concatinating using methods 
class StringConcatinating
{
	public static void main(String[]args)
	{
		System.out.println(mergeName("Abhishek","More"));
	}
	
	public static String mergeName(String fName,String lName)
	{
		String ans  = fName +" "+ lName;
		return ans;
	}
}