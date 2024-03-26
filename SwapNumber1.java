import java.util.*;
class SwapNumber1
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        
        System.out.println("-- This is Swaping Number Program. -- ");

        System.out.print("Enter the Number 1 : ");
		int num1 = sc.nextInt();
		System.out.print("Enter the Number 2 : ");
		int num2 = sc.nextInt();

		int temp = num1;

		num1 = num2;

		num2 = temp;
       
        System.out.println("--after Swaping the Number is");

        System.out.println("Number 1 is = " + num1);
        System.out.println("Number 2 is = " + num2); 

	}
}