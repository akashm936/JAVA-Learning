import java.util.Scanner;
class WhileProgram
{

	//program for calculating the power of the integer value
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Number : ");
		int num = sc.nextInt();
		int dup = num;
		int length = 0;
		int power = 1;
		while(num!=0)
		{
			length++;
			num/=10;
		}
		for(int i=1;i<=length;i++)
			power *= dup;

		System.out.println(power);

	}
}