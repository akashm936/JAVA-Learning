import java.util.Scanner;
class SwitchString
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//String levelString = "Expert";
		
		System.out.println("Enter Your Level Out Of(0-3) : ");
		String level = sc.next();

		switch(level)
		{
		case "beginner" :
		    level= 1;
			break;
		case "intermediate" : 
			level=2;
			break;
		case "expert" : 
			level=3;
		default : level=0;
			break;
		}
		System.out.println("Your Level is : " + level);
	}
}