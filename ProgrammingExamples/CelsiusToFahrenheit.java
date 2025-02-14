/*Write a program that reads a celsius degree in a double
value from the console, then converts it to fahrenhiet and 
display the result.
The formula for the conversion is as follows:
Fahrenheit= (9/5)*celsius+32
Hint: In Java,9/5 is 1, but 9.0/5 is 1.8*/

import java.util.*;
class CelsiusToFahrenheit
{
	public static void main(String[]args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a degree in celsius:");

		float celsius=sc.nextFloat();

		//double Fahrenheit=(9.0/5)*celsius+32;
		double Fahrenheit=(9.0/5)*celsius+32;
		System.out.print(+celsius+"Celsius is "+Fahrenheit+"Fahrenheit");
	}



}