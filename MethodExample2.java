class MethodExample2{
	public static void main(String[] args) {
		
		suresh();
		gopal();
		mahesh();
	}

	public static void suresh()
	{
		System.out.println("Suresh Start");
		mahesh();
		System.out.println("Suresh End");
	}

	public static void gopal()
	{
		System.out.println("gopal Start");
		System.out.println("gopal End");
	}

	public static void mahesh()
	{
		System.out.println("Mahesh Start");
		System.out.println("Mahesh End");
	}
}