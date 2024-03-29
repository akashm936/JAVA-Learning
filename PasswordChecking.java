import java.util.*;

class PasswordChecking
{
	public static void main(String[] args) throws InterruptedException{
	    Scanner sc = new Scanner(System.in);

		int attempt = 1;
		outerloop:
		for (; ; ) {

			int storedPin = 123;// firststep 
			int count = 3;
			do{
				System.out.print("Enter Your Pin : ");
				int userPin = sc.nextInt();
				if( userPin == storedPin)
				{
					System.out.println("************************************* Welcome Akash **************************************");
					System.out.println();
					break outerloop;
				}else{
					System.out.println("Wrong Pin attempt Left " + (count-1));
					System.out.println(count);
				}
				if(count == 1)
				{
					Thread.sleep(5000);
					System.out.println("TRY TO ENTER PIN AFTER 5 SECOND");

				}
				count--;
			}while(count>=1);
			
			if(attempt++ ==2){
				break;
			}
		}
	}
}