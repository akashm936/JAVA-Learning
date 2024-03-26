//this prgram is used to find the value is AutoMorphic or Not AutoMorphic

class AutoMorphic
{
	public static void main(String[] args) {
		
	int num = 56;
	int dup = num;
	int sqr = num*num;
	int div = 1;
	while(num!=0)
	{
		div *=10;
		num /=10;
	}
	int Id = sqr%div;
	System.out.println(dup==Id?dup + "AutoMorphic ":dup + "Not a AutoMorphic" );
	}
}