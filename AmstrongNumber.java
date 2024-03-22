import java.util.Scanner;
class AmstrongNumber
{

	//this is the amstrong value program 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("This program is Checking the Number is amstrong or Not");
		System.out.println("Enter a Number : ");
		int num = sc.nextInt();
		int dup = num;
		int dup1 = num;
		int length = 0;
		int sum = 0;


		while(num!=0)
		{
			length++;
			num/=10;

		}
		while(dup!=0)
		{
			int rem = dup%10;
			int power = 1;

			for(int i=1;i<=length;i++)
			{
				power = power*rem;
			}
			sum += power;
			dup/=10;
		}
		if(sum == dup1)
		{
			System.out.println("this is Amstrong Number.");
		}
		else{
			System.out.println("this is not Amstrong Number.");
		}
	}
}