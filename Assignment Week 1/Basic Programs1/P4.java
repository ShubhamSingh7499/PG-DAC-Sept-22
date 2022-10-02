import java.util.Scanner;
class P4
{
		public static void main(String[] args)
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Let's calculate the Simple Interest");
		System.out.println("Enter the principal in rupees");
		double P=sc.nextDouble();
		System.out.println("Enter the rate in percentage");
		double R=sc.nextDouble();
		System.out.println("Enter the time in hours");
		double T=sc.nextDouble();
			
			double SI=(P*R*T)/100;
		
			System.out.println("Simple Interest = " + "Rs" + " " +SI);
		}
}
		