class Subtraction
{
	static public void main(String[]args)
	{
		byte num1=20;
		byte num2=10;
		int sub1= num1-num2;
		//byte sub1=num1 - num2;incompatible types: possible lossy conversion from int to byte
		System.out.println(sub1);

		short num3=500;
		short num4=200;
		int sub2= num3 - num4;
		//short sub2=num3-num4; incompatible types: possible lossy conversion from int to short
		System.out.println(sub2);
		
		char num5='a';
		char num6='b';
		int sub3= num5 - num6;
		//char sub3= num5-num6;error: incompatible types: possible lossy conversion from int to char
		System.out.println(sub3);

		int num7= 9000;
		int num8= 2000;
		int sub4=num7-num8;
		//byte sub4=num7-num8;error: incompatible types: possible lossy conversion from int to byte
		System.out.println(sub4);

		long num9=25000l;
		long num10=250l;
		long sub5=num9-num10;
		System.out.println(sub5);

		float num11=2.2f;
		float num12=1.1f;
		float sub6=num11-num12;
		System.out.println(sub6);

		double num13=2.2;
		double num14=1.1;
		double sub7=num13-num14;
		System.out.println(sub7);

		String num15="Qspider";
		String num16="Jspider";
		//String sub8=num15 - num16; bad operand types for binary operator '-'
		//System.out.println(sub8);

		boolean num17=true;
		boolean num18=false;
		//boolean sub9=num17 - num18;bad operand types for binary operator '-'
		//System.out.println(sub9);

	}


}
