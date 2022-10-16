class Try
{
public static void main(String[] args)
{
	int a =10;
	int b=0;
	int res=0;
	
	try
	{
		res=a/b;			
	}
	
	catch(ArithmeticException e)			//Child Class
	{
		System.out.println(e.getMessage());
	}
	
	catch(Exception e)						//Parent Class
	{
		System.out.println("Hello");
	}
	
	finally
	{
		System.out.println("hi");
	}
	
	System.out.println("Result is " +res);
}
}
	