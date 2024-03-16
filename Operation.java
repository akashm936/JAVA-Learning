import java.util.Scanner;

class Operation
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Num 1 :");
		double num1 = sc.nextDouble();
		System.out.println(" Enter the Operator : ");
		char op = sc.next().charAt(0);
		System.out.println("Enter Num 2 :");
		double num2 = sc.nextDouble();

		boolean flag = true;
		double output = 0;
		switch(op)
		{
		case '+' : output = num1+num2 ; break;
		case '-' : output = num1-num2 ; break;
		case '*' : output = num1*num2 ; break;
		case '/' : output = num1/num2 ; break;
		case '%' : output = num1%num2 ; break;
		default : System.out.println(" INVALID OPERATION "); flag = false;
		}
		if (flag) {
			System.out.println(num1 + " " + op + " " + num2 + " = " + output);
		}
	}
}