class NewAssignment
{
	public static void main(String[] args) {
		
		int num = 15;
		for (int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--)
			{
				System.out.print(num +" ");
				num--;
			}
			System.out.println();
		}
	}
}

//output
// 15 14 13 12 11
// 10 9 8 7
// 6 5 4
// 3 2
// 1

//option 1

		// for (int i=5;i>=1;i--) {
		// 	for(int j=1;j<=i;j++)