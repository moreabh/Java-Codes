class Division
{
	static public void main(String[]args)
	{
		byte num1=50;
		byte num2=5;
		int div1= num1 / num2;
		//byte sum1=num1 / num2; incompatible types: possible lossy conversion from int to byte
		System.out.println(div1);

		short num3=500;
		short num4=50;
		int div2= num3 / num4;
		//byte sum2=num3 / num4;incompatible types: possible lossy conversion from int to byte
		System.out.println(div2);

		char num5='a';
		char num6='b';
		int div3= num5 / num6;
		float div4= num5 / num6;
		double div5= num5 / num6; 
		//char div3= num5 / num6; incompatible types: possible lossy conversion from int to char
		System.out.println("Char op in int, float, double");
		System.out.println(div3);
		System.out.println(div4);
		System.out.println(div5);

		int num7=10000;
		int num8=1000;
		int div7=num7 / num8;
		float div8= num7 / num8;
		double div9= num7 / num8;
		System.out.println("int op in int,float,double op");
		System.out.println(div7);
		System.out.println(div8);
		System.out.println(div9);

		long num9= 25000l;
		long num10= 250l;
		long div10= num9 / num10;
		float div11= num9 / num10;
		double div12= num9 / num10;
		//int div10= num9 / num10;incompatible types: possible lossy conversion from long to int
		System.out.println("Long op in long, float, double");
		System.out.println(div10);
		System.out.println(div11);
		System.out.println(div12);

		float num11=8.8f;
		float num12=2.2f;
		float div13= num11 / num12;
		System.out.println("Flaot op");
		System.out.println(div13);

		double num13=8.8;
		double num14=2.2;
		double div14= num13 / num14;
		//float div14= num13 / num14; incompatible types: possible lossy conversion from double to float
		System.out.println("Double op");
		System.out.println(div14);

		String num15="Qspider";
		String num16="Jspider";
		//String div15= num15 / num16;bad operand types for binary operator '/'
		//System.out.println(div15);

		boolean num17=true;
		boolean num18=false;
		//boolean div16=num17 / num18; bad operand types for binary operator '/'
		//System.out.println(div16);


	}





}