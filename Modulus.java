class Modulus
{
	 static public void main(String[]args)
	{
		byte num1=50;
		byte num2=10;
		int mod1=num1 % num2;
		//byte mod1=num1 % num2; incompatible types: possible lossy conversion from int to byte
		System.out.println(mod1);

		short num3=500;
		short num4= 50;
		int mod2= num3 % num4;
		//short mod2= num3 % num4;incompatible types: possible lossy conversion from int to short
		System.out.println(mod2);

		char num5='a';
		char num6='b';
		int mod3= num5 % num6;
		//char mod3= num5 % num6; incompatible types: possible lossy conversion from int to char
		System.out.println(mod3);
			
		int num7=10000;
		int num8=1000;
		int mod4= num7 % num8;
		System.out.println(mod4);
		
		long num9=25000l;
		long num10=150l;
		long mod5= num9 % num10;
		System.out.println(mod5);

		float num11=8.8f;
		float num12=2.2f;
		float mod6= num11 % num12;
		System.out.println(mod6);

		double num13=8.8;
		double num14=2.2;
		double mod7= num13 % num14;
		//float mod7= num13 % num14; incompatible types: possible lossy conversion from double to float
		System.out.println(mod7);

		String num15="Qspider";
		String num16="Jspider";
		//String mod8= num15 % num16; bad operand types for binary operator '%'
		//System.out.println(mod8);
		 
		boolean num17=true;
		boolean num18=false;
		//boolean mod9= num17 % num18; bad operand types for binary operator '%'
		//System.out.println(mod9);
		
		

	}



}