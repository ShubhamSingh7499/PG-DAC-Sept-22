import java.util.Scanner;
class P5
{
		public static void main(String[] args)
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of days to convert");
		int d=sc.nextInt();
		float years = d/365F;
		System.out.println("Conversion of days to years = " +years);
		float months = years*12F;
		System.out.println("Conversion of days to months = " +months);
		}
}
		