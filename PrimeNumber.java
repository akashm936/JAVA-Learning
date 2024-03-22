import java.util.Scanner;

class PrimeNumber
{

	//this is the Prime Number program in java 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Number : ");
		int num = sc.nextInt();
		boolean flag = true;

		for (int i=2;i<num;i++) {
			if(num%i==0)
			{
				flag = false;
				break;
			}
		}
		System.out.println(flag?"prime Number":"Not Prime Number.");
	}
}