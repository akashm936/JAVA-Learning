import java.util.Scanner;

class NoCheck
{
	public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

		System.out.println("Enter No  : ");
        int no = sc.nextInt();

        if(no > 0)
        {
        	System.out.println(no + " is positive number");
        }
        else if(no < 0)
        {
        	System.out.println(no + " is the negetive Number");
        }
        else
        {
         System.out.println(no + " the number is NATURAL");
        }


	}
}