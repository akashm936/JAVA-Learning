import java.util.*;

class BankApp
{
	private String accountHolderName;
	private String address;
	private long aadharNumber;
	private String panNumber;
	private double balance;
	private long phoneNumber;  
    

    public static void main(String args [])
    {
    	//this is main method

    	Scanner sc = new Scanner(System.in);
        
    	System.out.println("This is Simple bank Application");

    	System.out.println("Select Option \n1. Create New Account. \n2. Existing Account.");
        
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
        default:{
        	System.out.println("Invalid Input from option");
        }
        }

    } 

    public static void createAccount() 
    {

    	System.out.println("********** Create New Customer Account ****************");
    }
    public void existingAccount()
    {

    }

    public void getaccountHolderName()
    {

    }

    
}



