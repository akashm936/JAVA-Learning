import java.util.Scanner;

class Marrige
{
  public static void main(String[] args) {
  		
  		Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the age of the boy :");
        int age = sc.nextInt();
        System.out.println("Enter the property of the boy");
        int property = sc.nextInt();

        System.out.println("Enter the surname of boy");

         String surname = sc.nextLine().toUpperCase();

        if((age >=21 && property >=100000)||(surname.equals("AMBANI")))
        {
        	System.out.println("The boy is Eligible for marrige to his girlfriend.");
        }
        else{
        	System.out.println("The boy is not Eligible to marrige his girlfrined.");
        }


  	}	
}