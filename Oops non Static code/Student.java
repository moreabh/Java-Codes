//Constructor
//BluePrint
class Student
{
	String name;
	int age;
	String collage;
	String degree;
	int roll_No;

	Student() //No Argument Constructor
	{
		System.out.println("No Argument Constructor");
		System.out.println(this);
		System.out.println(".................");
	}

	public void displayStudent()
	{
		String name = "Mighty Raju";
		System.out.println("Name1: "+name);
		System.out.println("Name2: "+this.name);
		System.out.println(this);
		System.out.println("Age: "+age);
		System.out.println("Collage Name: "+collage);
		System.out.println("Degree: "+degree);
		System.out.println("Roll NO: "+roll_No);
	}
}
