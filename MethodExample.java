class MethodExample
{
	public static void main(String[] args) {
		
		System.out.println("Execution Start :");
	
        myMethod();
        checkEvenOdd(10);
        

		System.out.println("Execution End :");
	}
	public static void myMethod()
	{
		System.out.println("Hello From myMethod() ");
	}
	public static void checkEvenOdd(int num){
		if (num%2==0) {
			System.out.println(num +" is Even");
		}
		else{
			System.out.println(num + " is Odd");
		}
	}
}