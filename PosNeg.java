import java.util.Scanner;
class PosNeg
{
	//this number is identify the number is positive , negetive or Zero
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        System.out.println("Input Number : ");
        int input = sc.nextInt();

        if (input > 0)
        {
        	System.out.println("Number is Positive. ");
        }
        else if (input < 0)
        {
        	System.out.println("Number is Negetive ");
        }
        else{
        	System.out.println("Number is zero ");
        }
	}
}