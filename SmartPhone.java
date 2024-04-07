import java.util.*;

class SmartPhone
{
	string phone_name;
	double price;
	double budget;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("********** This is Smart phone Store *********");
        
        System.out.println("Enter Your Budget : ");
        budget = sc.nextDouble();

        if(budget<=10000)
        {
        	System.out.println("You can Buy this phones :");
        	System.out.println("1. redmi note 10  \n 2. realme 9 \n 3.Nokia \n 4. JioPhone ");
        }

	}
}