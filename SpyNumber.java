import java.util.*;
class  SpyNumber
{
	public static void main(String[] args) {
		
		//this program is usd to find the spy Number

	    int num = 123;
	    int dup = num;
	    int sum = 0;
	    int prdt = 1;
	    while(num!=0)
	    {
	    	int rem = num%10;
	    	sum +=rem;
	    	prdt *=rem;
	    	num/=10;
	    }
	    System.out.println((prdt==sum)?dup + " is a Spy Number ": dup + " Is Not a Spy Number");


	}
}