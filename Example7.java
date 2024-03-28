import java.util.*;

class Example7
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a Number : ");
		int num =sc.nextInt();
		if((num%7==0) || (num%10==7)){
			System.out.println(num + " it is a Buzz number ");
		}
		else{
			System.out.println(num + " it is not a Buzz number ");
		}
	}
}



// System.out.println("Enter a Number : ");
// 		int num = sc.nextInt();
// 		int length = 0;

// 		for(int i=1;i<=num;i++)
// 		{
// 			if(num%7==0){
// 				System.out.println(num + "this is bus number");
// 			}
// 			else{
// 				int rem = num%10;
// 				length++;
// 				if(rem<=7)
// 				{
// 					System.out.println("this numebr is bus number");
// 				}
                
// 				num/=10;
// 			}
// 		// }