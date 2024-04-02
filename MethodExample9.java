class MethodExample9
{

	//in this program we are calling the main method 
	// becouse of calling main method this will create a recurtion
	public static void main(String[] args) {
		
		System.out.println("HELLO FROM main() ");
		m1();
		System.out.println("BYE FROM main() ");

	}
	public static void m1()
	{ 
		System.out.println("HII FROM m1() ");
		String [] persons = {"ramesh", "suresh"};
		main(persons);
		System.out.println("BYE From m1() ");

	}
}