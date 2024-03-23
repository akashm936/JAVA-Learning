import java.util.*;
class FindSum
{
	// 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("Enter a Number : ");
		int num = sc.nextInt();

		while(num>0)
		{
			int rem = num%10;
			sum += rem;
			num/=10;
		}
		System.out.println(sum);
	}
}