class Main
{
		public static void main(String args[])
		{
		int large,small,i;
		int array[] = new int[]{8,10,9,5,45};
		int n = array.length;
		large=small=array[0];
					for(i=1;i<n;i++)
					{
					if(array[i]>large)
					large=array[i];

					if(array[i]<small)
					small=array[i];
					}

								System.out.println("The smallest element is = " + small);
								System.out.println("The largest element is = "+ large);
					}
					}
