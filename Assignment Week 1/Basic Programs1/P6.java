import java.util.Scanner;
class P6
{
		public static void main(String[] args)
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the temperature in Farenheit");
		double F=sc.nextDouble();
		double C = 5*(F-32)/9;
		System.out.println("Conversion from Farenheit to Celsius = " +C + " degrees");
		}
}
		
		