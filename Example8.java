class Example8
{
	public static void main(String[] args) {
		
		int  i = 1;
		whileloop:
		while(i<=3)
		{
			System.out.println(i);
			i++;
			if(i==3)
			{
				break whileloop;
			}
		}
	}

}