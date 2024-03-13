import java.util.Scanner;

class Efelse1
{
	 //this the even odd number program
   public static void main(String[] args) {
   	
   	Scanner sc = new Scanner(System.in);

   	System.out.println("Enter a no : ");
   	int a = sc.nextInt();

    if(a%2==0)
    {
    	System.out.println(a + " This is Even No ");
    }
    else
    {
        System.out.println(a + " This is odd Number ");
    }
   }
}