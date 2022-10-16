import java.util.Scanner;
class MathOperation
{
		static int a;
		static int b;
		static int c;
		static double d;
	
		static void add(int a,int b)
		{
			c=a+b;
			System.out.println("Sum of two number : " +c);
		}
		
		static void subtract(int a,int b)
		{
			c=a-b;
			System.out.println("Difference of two number : " +c);
		}
		
		static void multiply(int a,int b)
		{
			c=a*b;
			System.out.println("Multiplication of two number : " +c);
		}
		
		static void power(int a,int b)
		{
			d=Math.pow(a,b);
			System.out.printf("%.2f",d);
		}
		
}

	class Demo
	{
		public static void main(String[] args)
		{
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter first number");
			int a=sc.nextInt();
			System.out.println("Enter second number");
			int b=sc.nextInt();
			MathOperation.add(a,b);
			MathOperation.subtract(a,b);
			MathOperation.multiply(a,b);
			MathOperation.power(a,b);
		}
	}
			
	