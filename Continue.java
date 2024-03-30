class Continue
{
	//this program show unreacheble statement error
	public static void main(String[] args) {
		
		for(int i = 1;i<=100;i++)
		{
			continue; //becouse the continue keyword skip the print statement
			
			System.out.print(i + " ");
		}
	}
}