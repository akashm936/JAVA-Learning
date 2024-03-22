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
    	length++; //updating length
    	num/=10;  //by removing 1 by by 1
    }
    System.out.println(length);

	}
}