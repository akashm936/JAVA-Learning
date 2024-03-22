import java.util.Scanner;

class PrimeNumber2
{

	//this is a Program that Validate the user Input is
	// Prime Number Or Not a Prime Number 


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Number : ");
		int num = sc.nextInt();

		int count = 0;// we can also use here boolean value

		for (int i=2;i<num;i++) {
			
			if(num%1==0){
				count++;
				break;
			}
		}
		if(count==0)
		{
			System.out.println(num + " is a Prime Number.");
		}
		else{
			System.out.println(num +" is NOT Prime.");
		}
	}
}