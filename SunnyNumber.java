import java.util.*;
class SunnyNumber
{
	public static void main(String[] args) 
	{
	  Scanner sc= new Scanner(System.in);
	  System.out.print("Enter a Number : ");
	  int num = sc.nextInt();
	  int sum = num +1;
	  int sqrrt=0;
	  boolean flag=false;
	  
	  for(int i =1;i<=sum/2;i++)
	  {
	  	if(i*i==sum){
				flag = true;
				sqrrt = i;
				break ;
			}
		}
		if(flag) {
			System.out.println (num+" it is a sunny number");
		}
		else{
              System.out.println(num+ " is not a sunny number");
		}
	}
}



	
