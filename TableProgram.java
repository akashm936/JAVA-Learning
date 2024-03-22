import java.util.*;

class TableProgram
{
	//this program is made for create a 19 pahada(table)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

	    System.out.println("Enter a Number : ");
	    int num = sc.nextInt();

	    for(int i=1;i<=10;i++)
	    {
		    System.out.println(num + "*" + i + "*" + (num*i));
	    }
	}
}