//public class
//A class which is prefix with public access modifier is known as public class
//In public class The java File name and public class name must be same.
//at compilation time we compile the file using public class name.
public class PublicClass
{
	public static void main(String[]args)
	{
		System.out.println("From Public Class");
	}

}
class Default1
{
	public static void main(String[]args)
	{
		System.out.println("From Defauult1");
	}
}
class Default2
{
	public static void main(String[]args)
	{
		System.out.println("From Default2");
	}
}
/*o/p->
D:\java\Java-Codes\core java Te\Methods code>java PublicClass
From Public Class

D:\java\Java-Codes\core java Te\Methods code>java Default1
From Defauult1

D:\java\Java-Codes\core java Te\Methods code>java Default2
From Default2

D:\java\Java-Codes\core java Te\Methods code>
*/