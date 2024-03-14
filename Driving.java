import java.util.Scanner;

class Driving
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Your Age : ");
		int age = sc.nextInt();

		if(age>=18)
		{
			System.out.println("you have pass the RTO test (yes/no) ");
			String test = sc.next().toLowerCase();

			if(test.equals("yes"))
			{
				System.out.println(" Enter your score of RTO test : ");
				int score = sc.nextInt();

				if(score>=60)
				{
					System.out.println("you are eligible for driving licences. ");
				}
			}
			else{
				System.out.println("you are not Eligible Driving Licence, give test first.");
			}
		}
		else{
			System.out.println("you are not Eligible for applying Driving licences. try after " + (18-age) + " year ");
		}
	}
}