
class SwapNumber
{
	//in this program we swap the Two Number
	public static void main(String[] args) {
		
		float num1 = 64.5f;
		float num2 = 45.6f;

		System.out.println("-- Before Swapping --");
		System.out.println("First Number = "+ num1);
		System.out.println("Second Number = "+ num2);


		float temp = num1;// we create a temp value for storing data

		num1 = num2;

		num2 = temp;

		System.out.println(" --After Swapping-- ");
		System.out.println(" First Number = "+num1);
		System.out.println(" Second Number = "+num2);
	}
}