class P10{
public static void main(String[] args){
int alphabet=65;
	for(int i=4;i>=0;i--)	
	{
		int c=i;
		for(int j=0;j<i;j++)		
		{
			System.out.print(" ");
		}
			for(int j=4;j>=i;j--)	
			{
			System.out.print((char)(alphabet+c) +" ");
			c++;
			}
	System.out.println();
	}
}
}

		/*	Output:   	 E
						D E
					   C D E
					  B C D E
					 A B C D E
									*/
				
  