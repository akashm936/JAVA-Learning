class NumPattern3{
	public static void main(String[] args) {
		

		//this is odd number pattern
        int num = 1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(num +" ");
				num+=2;
			}
			System.out.println();
		}
	}
}