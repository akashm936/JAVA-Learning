import java.util.*;

class SunnyNumber
{
	// this is a Sunny Number Program
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a Number : ");
        int num = sc.nextInt();

        double sqrrt , d;

        sqrrt=Math.sqrt(num+1);
        //d=sqrrt.Math.floor(sqrrt);
        if(d==0.0)
        {
        	System.out.println(num + " is a Sunny Number");
        }
        else{
        	System.out.println(num + " is Not a Sunny Number ");
        }
	}
}
