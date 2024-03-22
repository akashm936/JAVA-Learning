import java.util.Scanner;
class WhileProgram2
{

	//this is the while loop program 
	public static void main(String[] args) {
		
    Scanner sc = new Scanner(System.in);

    System.out.println("This program is calculating the length of the value :");
    System.out.print("Enter a Number : ");
    int num = sc.nextInt();
    int length = 0;
    while(num>0)
    {
    	length++;
    	num/=10;
    }
    System.out.println(length);

	}
}