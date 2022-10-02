import java.util.Scanner;
public class P2
{
		static double Area(double r)
		{
			double area=3.14*r*r;
			return area;
		}
		static double Circumference(double r )
		{
			double Cir=2*3.14*r;
			return Cir;
		}
		public static void main(String[] args)
				{
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the radius of Circle");
				double r=sc.nextDouble();
				System.out.println(Area(r));
				System.out.println(Circumference(r));
				
				}
}
				
				
