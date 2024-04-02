class Example9
{

	//while loop label program0
	public static void main(String[] args) {
		whileloop:{
			int i = 1;
			while(i<=3)
			{
				System.out.println(i);
				i++;
				if(i==2)
				{
					break whileloop;
				}
			}
		}
	}
}