class P2
{
		public static void main(String[] args)
		{
		int fact=1;
				for(int i=2;i<=Integer.parseInt(args[0]);i++)
				{
					fact=fact*i;
				}
					System.out.println(fact);
		}
}
