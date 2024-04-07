import java.util.Scanner;
class PrimeNumberR
{
	static int num ;
	static int i = 2;
	static boolean flag = true;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		num = sc.nextInt();

		primeNumber();

		System.out.println(flag?"Prime":"Not A Prime");
	}

	public static void primeNumber()
	{
		if(i==num)
			return;

		if(num%i==0)
		{
			flag = false;
			return;
		}
		i++;
		primeNumber();

		// for(int i=1;i<num;i++)
		// 	{
		// 		System.out.println(i);
		//     if(num%i==0)
		//     {
		//     	System.out.println(num);
		//     	flag = false;
		//     	return;
		//     }
		//     System.out.println(flag?num + "is a Prime Number":num + "is Not a Prime Number");
		// 	}
		    
    
	}
}