class Array
{
		public static void main(String[] args)
		{
		int a[ ] = {1,2,3,4,5,6};
		int b[ ] = {2,4,6,8};
		int c[ ] = {1,3,5};
		
		int a1 [ ] [ ] = new int[3] [ ] ;
		int a2 [ ] [ ] = new int [3] [ ] ;
		int a3 [ ] [ ] = new int [3] [ ] ;
		
		a1[0]=a;
		a1[1] =b;
		a1[2]=c;
		
		a2[0]=c;
		a2[1]=b;
		a2[2]=a;
		
		a3[0]=b;
		a3[1]=c;
		a3[2]=a;
		
	for(int i=0;i<a1.length;i++)//Rows
		{
			for(int j=0;j<a1[i].length;j++)//cols
		{
				System.out.print(" "+a1[i][j]);
		}
		System.out.println();
		}
		
		for(int i=0;i<a2.length;i++)//Rows
		{
			for(int j=0;j<a2[i].length;j++)//cols
		{
				System.out.print(" "+a2[i][j]);
		}
		System.out.println();
		}
		
		for(int i=0;i<a3.length;i++)//Rows
		{
			for(int j=0;j<a3[i].length;j++)//cols
		{
				System.out.print(" "+a3[i][j]);
		}
		System.out.println();
		}
	}	
}
