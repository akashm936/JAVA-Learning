import java.util.Scanner;
class LengthofNumber
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int num = 123;
		int length = 0;


		for(int i=num;i>0;i/=10){
			length++;

		}
		System.out.println(length);
	}
}