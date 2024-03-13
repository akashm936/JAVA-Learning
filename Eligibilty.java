import java.util.Scanner;

class Eligibilty
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The age: ");
		int age = sc.nextInt();

		System.out.println("Enter property :");
		int proporty = sc.nextInt();

        //next(); // option 1 if the next is not working used the nextLine() for scanning the object
        //Scanner sc1 = new Scanner(System.in); // option 2 if the nextLine() method not work used create new Scanner object 
        //sc.reset(); // option 3 reset the Scanner Object  
		System.out.println("Enter Your Surname :");
		String surname = sc.next().toUpperCase();


		if((age>=21 && proporty >= 1000000)|| (surname.equals("AMBANI"))) 
		{
			System.out.println("The Boy is Eligible to Marrige");
		}
		else
		{
			System.out.println("The boy is Not Eligible to Marrige");
		}

	}
}