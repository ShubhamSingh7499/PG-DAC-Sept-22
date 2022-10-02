class Test
{
	public static void main(String[] args)
	{

        int[] a = {0, 1, 2};
        int[] b = {3, 4, 5};
        int[] c = new int[a.length];
		int k=0;
		System.out.print("{");
			for (int i = 0 ; i < a.length;i++) 
		{
			c[k++] = a[i] + b[i];
			System.out.print(c[k-1]);
			if(i==2)
				continue;
			System.out.print(",");
		}
				System.out.print("}");
				System.out.println();
	}
}
				
		
			 
				