//Driver file of Form
class FormDriver
{
	public static void main(String[]args)
	{
		Form f1 = new Form();
		f1.displayForms();

		Form f2 = new Form("Raju",9822456790l,'M',"4/7/2025");
		f2.displayForms();
		
		Form f3 = new Form("Rani",67676767667l,'F',"4/7/2025",312323,"O+","rani@gmail.com");
		f3.displayForms();
	}
}
/*
Name: null
Phone No: 0
Gender:
Date Of Birth: null
Telephone: 0
Blood: null
E-mail: null
...........................
Name: Raju
Phone No: 9822456790
Gender: M
Date Of Birth: 4/7/2025
Telephone: 0
Blood: null
E-mail: null
...........................
Name: Rani
Phone No: 67676767667
Gender: F
Date Of Birth: 4/7/2025
Telephone: 312323
Blood: O+
E-mail: rani@gmail.com
...........................
*/