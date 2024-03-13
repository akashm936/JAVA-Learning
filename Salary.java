import java.util.Scanner;

class Salary
{
   public static void main(String[] args) {
   		
   		Scanner sc = new Scanner(System.in);

   		System.out.println("Enter the Score of Employee : ");
   	    double s = sc.nextDouble();

        if(s > 90)
        {
        	 s = s/3;
        	System.out.println( s + " 3 % is increases ");
        }
        else
        {
           s =   s/1;
           System.out.println(s + " 1 %  is increases");
        }
   	}	
}