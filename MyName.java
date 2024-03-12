import java.util.Scanner;

class MyName
{
	 public static void main(String [] args)
	 {  
	 	Scanner sc = new Scanner(System.in);
	 	
	 	System.out.println("even odd Number Program: ");
	 	System.out .println("Enter 10 Number : ");

        int no = sc.nextInt();
        for(int i=0; i<=no;i++){
        	if(i%2==0){
        	System.out.println(i + " this is the Even Number");
            }
            else{
        	System.out.println(i + "This is the odd Number");
            }
        }
       
	 	
	 }
}