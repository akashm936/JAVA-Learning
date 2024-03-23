class ReverseNumber
{
	//this is reverse program for number
	public static void main(String[] args) {
		
		iny num = 1234;
		int rev = 0;

		while(num>0)
		{
			int rem = num%10;
			rev = rev*10+rem;
			num/=10;
		}
		System.out.println(rev);
	}
}