import java.util.Scanner;

class MarrigeLadder
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Age");
		int age = sc.nextInt();
		System.out.println("Enter Your Property :");
		Double property = sc.nextDouble();
		System.out.println("Enter Your sirname :");
		String surname = sc.next().toUpperCase();

		if(age>=21)
		{
			System.out.println("Your Age is " + (age) + " You are Eligible for Marrige. ");
		}
		else if(property>=100000)
		{
			System.out.println("Your Property is " + (property) + "You are Eligible For Marrige");
		}
		else if(surname.equals("AMBANI"))
		{
			System.out.println("Your Surname is " + surname + " You are Eligible for Marrige ");
		}
		else{
			System.out.println("You are not Eligible For Marrige.");
		}
	}
}