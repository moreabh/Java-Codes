import java.util.*;
class CalculatorUsingif2
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Num1:- ");
		float num1=sc.nextFloat();
		System.out.println("Enter Num2:- ");
		float num2=sc.nextFloat();
		System.out.println("Enter an Operator:- ");
		
		char opr=sc.next().charAt(0);
		
		
		String output= 
                        (opr == '+') ? (num1 + num2):
                        (opr == '-') ? (num1 - num2):
                        (opr == '*') ? (num1 * num2):
                        (opr == '/') ? (num1 / num2):
                        (opr == '%') ? (num1 % num2):0.000001f;
		String result= num1+" "+opr+" "+num2+"="+output;

		if(!(output==0.000001f))

                        
			
		//double output=(opr=='+')?(num1+num2):(opr=='-')?(num1-num2):(opr=='*')?(num1*num2):(opr=='/')?(num1/num2):(opr=='%')?(num1%num2):(0);
			
		System.out.println(result);
	}
}