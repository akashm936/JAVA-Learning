//KrishnamurthyNumber.java
import java.util.*;

class KrishnamurthyNumber
{
	public static void main(String[] args) {
	
	  Scanner sc = new Scanner(System.in);
	  int n;
	  System.out.print("Enter a Number : ");
	  

	  n = sc.nextInt();

	  if(checkNumeber(n))
	      System.out.println(n+ " is Krishnamurthy Number");	
	  else
	  	System.out.println(n + " is Not Krishnamurthy Number");
	}
	public static int fact(int num){

     int f =1;
     while(num !=0){
     	f = f * num;
     	num--;
     }
     return f;
	}

	public static boolean checkNumeber(int num)
	{
		int sum = 0;
		int tempNumber = num;

		while(tempNumber !=0){
			sum = sum + fact(tempNumber % 10);
			tempNumber = tempNumber /10;
		}

		if(sum == num)
			return true;
		else
			return false;
	}


}