import java.util.*;
class Calculator
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
                        (opr == '+') ? (num1 + num2) + "" :
                        (opr == '-') ? (num1 - num2) + "" :
                        (opr == '*') ? (num1 * num2) + "" :
                        (opr == '/') ? (num2 != 0 ? (num1 / num2) + "" : "Division by zero") :
                        (opr == '%') ? (num2 != 0 ? (num1 % num2) + "" : "Division by zero") :
                        "Invalid operator";
			
		//double output=(opr=='+')?(num1+num2):(opr=='-')?(num1-num2):(opr=='*')?(num1*num2):(opr=='/')?(num1/num2):(opr=='%')?(num1%num2):(0);
			
		

		System.out.println(num1+" "+opr+" "+num2+"="+output);
	}
}