class automorphic1
{
	public static void main(String[] args) {
		
		int num = 89;
		int dup = num;
		int sqr = num*num;
		int div = 1;
		while(num!=0)
		{
			div *=10;
			num /=10;
		}
		int id = sqr%div;
		System.out.println(dup==id?dup+" is automorphic ":dup +" Not a automorphic");
	}
}