import java.util.Scanner;
class P3
{
		public static void main(String[] args)
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the score of 5 subjects");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		int e=sc.nextInt();
		
		double percentage = ((a+b+c+d+e)/5);
		System.out.println("percentage marks = " +percentage +"%");
		}
}