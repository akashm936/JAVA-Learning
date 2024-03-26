import java.util.*;
class PalindromeName
{
	//this program identify the palindrome of The String
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter a Name : ");
	String name = sc.next();  	
     
    String revname =  "";
    for(int i = name.length()-1;i>=0;i--)
    {
    	revname +=name.charAt(i);
    }

    System.out.println((revname.equals(name))?name + " This is palindrome ": name + " This is Not a Palindrome");
	}
}