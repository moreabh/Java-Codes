/*Ex1:-write a program to display the population for each of the next five years.
Assume the current population is 312,032,486 and one year has 365 days 
one birth every 7 seconds
one death every 13 seconds
one new immigrant every 45 seconds*/
 
class Census
{
	public static void main(String[]args)
	{
		long currPop = 312032486;
		final long seconds= (365*24*60*60)*5;
		long birth=seconds/7;
		long death=seconds/13;
		long imm=seconds/45;

		long newPop = currPop+birth-death+imm;
		System.out.println("Current Population is :-" + currPop);
		System.out.println("New Population is:-" + newPop);


	}




}