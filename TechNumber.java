class TechNumber
{

	//this is program for find the tech Number (ex:  2025)
	public static void main(String[] args) {
		
		int num = 2025;
		int dup = num;
		int length = 0;

		while(num!=0)
		{
			length++;
			num/=10;
		}
		if(length%2==0)
		{
			int div = 1;
			for(int i=1;i<=length/2;i++)
			{
				div = div * 10;
			}
			int firstHalf = dup/div;
			int lastHalf = dup%div;
			int sum = firstHalf + lastHalf;
			int sqr = sum*sum;
			System.out.println(dup==sqr? dup + " tech Number ":dup + "Not a tech Number");
		}else{
			System.out.println("Not a tech Number");
		}
	}
}