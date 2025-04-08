//Parameterized Constructor
class Collage_Student
{
	String name;
	int age;
	String collage;
	String degree;
	int roll_No;

	Collage_Student()
	{
		System.out.println("From No Argument Constructor");
		System.out.println(this);
	}
	//Constructor with parameter
	Collage_Student(String name,int age,String collage,String degree,int roll_No)
	{
		this.name = name;
		this.age = age;
		this.collage = collage;
		this.degree = degree;
		this.roll_No = roll_No;
	}
	public void displayStudent()
	{
		System.out.println(name);
		System.out.println(age);
		System.out.println(collage);
		System.out.println(degree);
		System.out.println(roll_No);
	}
}