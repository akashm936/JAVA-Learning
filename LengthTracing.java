import java.util.Scanner;
class LengthTracing
{
	//this is the length Program 
	
	//in this program we calculating the length of the Number

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        
        System.out.println("This program is for Tracing the length of number");
		//int num = 123;
		System.out.print("Enter a Number  : ");
		int num = sc.nextInt();
		int length = 0;


		for(int i=num;i>0;i/=10){
			length++;
			System.out.println("how update the length in for loop " + length);

		}
		System.out.println(length);
	}
}