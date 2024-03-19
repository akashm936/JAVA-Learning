class NumPattern2{
	public static void main(String[] args) {
		

		//this is the print the continueuly number
        int num = 1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(num++ +" ");

			}
			System.out.println();
		}
	}
}