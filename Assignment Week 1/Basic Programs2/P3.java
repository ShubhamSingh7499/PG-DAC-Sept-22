class Calculator
{
static double c;
static double d;
		static double powerInt(int a,int b)
		{
			c=Math.pow(a,b);
			return c;
		}
			static double powerDouble(double r,int s)
			{
				d=Math.pow(r,s);
				return d;
			}
}
			class Operation
			{
					public static void main(String[] args)
					{
					System.out.println(Calculator.powerInt(12,10));
					System.out.println(Calculator.powerDouble(2.2,4));
					}
			}
		
		