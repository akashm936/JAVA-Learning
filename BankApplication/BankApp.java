import java.util.*;

class BankApp
{
	private static String accountHolderName;
	private static String address;
	private static long aadharNumber;
	private static String panNumber;
	private static int upiPin;
	private static double balance;
	private static long phoneNumber;  
    

    public static void main(String args [])
    {
    	//this is main method

    	Scanner sc = new Scanner(System.in);
        
    	System.out.println("**********   This is Simple bank Application ***************");
    	System.out.println();

    	System.out.println("************  Select Option  ************  \n1. Create New Account. \n2. Existing Account. \n3. Log Out (exit)");
        
        int option = sc.nextInt();

        switch(option){
        case 1: {

        	createAccount();
        	break;
        }
        case 2: {
        	existingAccount();
        	break;
        }
        case 3:{
        	System.out.println("Log out From Bank");
        	System.exit(0);
        }
        default:{
        	System.out.println("Invalid Input from option");
        }
        }

    } 

    public static void createAccount() 
    {
    	Scanner sc = new Scanner(System.in);

    	System.out.println("********** Create New Customer Account ****************");
    	// this.accountHolderName=accountHolderName;
    	// this.address=address;
    	// this.aadharNumber=aadharNumber;
    	// this.panNumber=panNumber;
    	// this.upiPin=upiPin;

    	System.out.print("Enter Your Name : ");
    	accountHolderName=sc.nextLine();
    	System.out.print("Enter Your Address : ");
    	address=sc.nextLine();
    	System.out.print("Enter Your Aadhar Number : ");
    	aadharNumber=sc.nextLong();
    	System.out.print("Enter Your Pan Number : ");
    	panNumber=sc.nextLine();
        System.out.print("Enter Your upiPin : ");
        upiPin=sc.nextInt();
        System.out.print("Enter a deposit amount : ");
        balance=sc.nextDouble();
        System.out.println("Enter Your Phone Number : ");
        phoneNumber=sc.nextLong();

    }
    public static void existingAccount()
    {

    }

    public static void getaccountHolderName()
    {

    }

    
}



