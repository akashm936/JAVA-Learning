import java.util.Scanner;

class Interview
{
   public static void main(String[] args) {
   	
   	Scanner sc = new Scanner(System.in);

   	System.out.println("Enter the percentage : ");
   	double p = sc.nextDouble();

    if(p >= 60)
    {
    	System.out.println("The candidate is eligible for the interview");
    }
    else
    {
      System.out.println("The condidate is not eligible for interview");
    }
   }
}