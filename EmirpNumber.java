import java.util.*;
class EmirpNumber
{
	//this is program for checking the emirp number using the method
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number :");

		int n = sc.nextInt();
		if(isEmirp(n) == true)
			System.out.println(n + " is a Emirp Number");
		else
			System.out.println(n + " is Not a Emirp Number" );
	}

	public static boolean isPrime(int n){
			if(n<=1)
				return false;

			for(int i=2;i<n;i++)
				if(n%i==0)
					return false;
			return true;
	}
   
	public static boolean isEmirp(int n){
			if(isPrime(n)==false)
				return false;
			int rev = 0;

			while(n!=0)
			{
				int digit = n%10;
				rev = rev*10+digit;
				n = n/10;
			}
			return isPrime(rev);
	}
}

