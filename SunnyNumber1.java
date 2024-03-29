import java.util.*;

class SunnyNumber1
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a Number : ");
		int num = sc.nextInt();
		
		// int add = num+1;
		double srt = num*num;

		boolean sn = (srt -1 ==num);

		
		if(sn)
		{
			System.out.println(num + " is a Sunny Number");
		}
		else{
			System.out.println(num + " is not a Sunny Number ");
		}
		
	}
}



// int srt = 0;
//         boolean a;
//         srt=num*num;
		
// 		if(a=srt-1)
// 		{	
// 			System.out.println(num +" is a Sunny Number ");
// 		}
// 		else
// 		{
// 			System.out.println(num + " is Not a Sunny Number");
// 		}