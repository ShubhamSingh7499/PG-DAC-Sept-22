class P9{
	public static void main(String[] args)
	{
		int alphabet=65;
		for(int i=0;i<=5;i++)
		{
			for(int j=5;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int j=0;j<i;j++)
			{
				System.out.print((char)(alphabet+j)+" ");
			}
			System.out.println();	
		}	
	}	
}