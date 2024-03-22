import java.util.Scanner;
class AmstrongNoTracing
{
	//this program is for tracing the amstrong number
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("This is Program for understanding the Tracing of Amstrong Number.");
		System.out.print("Enter a Number : ");

		int num = sc.nextInt();
		int dup = num;
		int dup1 = num;
		int length = 0;
		int sum = 0;

		while(num!=0)
		{
			length++;

			//System.out.println("this length of number : "+length);
			num/=10;
			//System.out.println(num);

		}

		while(dup!=0)
		{
			int rem = dup%10;
			int power = 1;

			for(int i=1;i<=length;i++)
			{
				power = power*rem;
				//System.out.println(power);
			}
			sum += power;
			//System.out.println(sum);
			dup/=10;
			//System.out.println(dup);
		} 
		if(sum == dup1)
		{
			System.out.println("This is Amstrong Number.");
		}
		else{
			System.out.println("This is Not Amstrong Number. ");
		}

	}
}