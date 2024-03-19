class NumPattern4{
	public static void main(String[] args) {
		
		int num = 1;
		for(int i=1;i<=5; i++)
		{
			int tem = num + i - 1;
			for(int j=1;j<=i;j++)
			{
				System.out.println(tem + " ");
				tem--;
			}
		    System.out.println();
		}

	}
}