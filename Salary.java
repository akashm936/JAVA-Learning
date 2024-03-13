import java.util.Scanner;

class Salary
{   
    //this program is succesfully run
   public static void main(String[] args) {
   		
   		Scanner sc = new Scanner(System.in);
         

         System.out.println("Enter the Salary of Employee : ");
         double b = sc.nextDouble();

   		System.out.println("Enter the Score of Employee : ");
   	    double s = sc.nextDouble();

        if(s > 90)
        {
        	 b = b*3/100;
        	System.out.println( b + " 3 % is increases ");
        }
        else
        {
           b = b*1/100;
           System.out.println(b + " 1 %  is increases");
        }
   	}	
}