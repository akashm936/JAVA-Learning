import java.util.*;
class ObjectExample
{

    //String char;
	public static void main(String[] args) {
		
		Scanner ch = new Scanner(System.in);
		String str = "hello";
		String str1 = " ";
		for (int i=0;i<str.length();i++ ) {
			char ch = str.charAt(i);
			if(ch>='a'&&ch<='z'){
				if (ch=='z') {
						str1 =str1+'a';
				}
			     else {
				str1 =str1+(++ch);

			}
	      	}
			else{
				str1 = str1+ch;
			
			}
			String op ="";
			for(int i=0;i<str1.length();i++)
			{
				char ch = str1.charAt(i);
				if(ch=='a'||ch == 'e' ||ch=='i'||ch =='o'||ch=='u'){
					op = op+(char)(ch-32);
				}
				else{
					op = op+ch;
				}
			}
			System.out.println(op);
		}
	}
}