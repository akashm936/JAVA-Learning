import java.util.Scanner;
class PrimeTracing
{   
	//this program is For UnderStanding The Tracing Of Prime Number
	//this is the Prime Number program in java 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A Number : ");
		int num = sc.nextInt();
		boolean flag = true;

		for (int i=2;i<num;i++) {

			System.out.println(i);
			if(num%i==0)
			{
				System.out.println(num);
				flag = false;
				break;
			}
		}
		System.out.println(flag?"prime Number":"Not Prime Number.");
	}
}