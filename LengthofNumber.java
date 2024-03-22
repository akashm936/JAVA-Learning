import java.util.Scanner;
class LengthofNumber
{
	//this is the length Program 
	
	//in this program we calculating the length of the Number

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		//int num = 123;
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();
		int length = 0;


		for(int i=num;i>0;i/=10){
			length++;
			num/=10;

		}
		System.out.println(length);
	}
}