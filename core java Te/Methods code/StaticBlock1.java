class StaticBlock1
{
	static
	{
		System.out.println("From Static Block 1");
	}
	public static void main(String[]args)
	{
		System.out.println("From Main method");
	}
	static 
	{
		System.out.println("From Static block 2");
	}
	static 
	{
		System.out.println("From Staic block 3");
	}

}
/*
o/p ->							> static initializers get executed at the class loading process
From Static Block 1             > static block executed at the class loading process
From Static block 2             > static block exeute Top to Bottom
From Staic block 3              > class block can't execute without main method
From Main method
*/

