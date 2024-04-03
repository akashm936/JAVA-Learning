import java.util.*;

class Example10
{
	//this program is check the number is even or odd using the method
	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("This program is check the Number is Even Or Odd");
       System.out.print("Enter a Numbr : ");		
		int num = sc.nextInt();
		evenOdd(num); 
	}
	public static void evenOdd(int num)
	{
		if(num%2==0)
		{
			System.out.println("Yes It Is Even");
			return;
		}
		else{
			System.out.println("It is Odd");
		}
		System.out.println("Execution End For Even Odd Method");
	}
}