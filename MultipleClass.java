class MultipleClass
{
	public static void main(String[] args) {
		
		System.out.println("Hello From the MultipleClass and main() Method");
	    ramesh();
	    NewClass1.suresh();

	}

	public static void ramesh()
	{
		System.out.println("Hello This is Suresh Method From MultipleClass");
	}
}

class NewClass1{
	public static void newm1()
	{
		System.out.println("Hello From the NewClass And newm1() method ");
	}
	public static void suresh()
	{
		System.out.println("Hello this is suresh method from NewClass1 ");
	}
}
