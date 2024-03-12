import java.util.Scanner;

class Alphabet
{
 public static void main(String []args)
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the Alphabet");
  //char ch = sc.next.chartAt(0);
  char ch = sc.next().charAt(0);

 System.out.println(((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z'))?((ch>='A'&&ch<='Z'))?"Uppercase Alphabet":"LowerCase Alphabet":"Not a Number");
 } 
}