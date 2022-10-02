import java.util.Scanner;
class P1
{
	static boolean a;
				static boolean year(int y)
				{
				if (y%4==0 && y%100!=0  || y%400==0)
					a=true;
					return a;
				}
								public static void main(String[] args)
								{
								Scanner sc=new Scanner(System.in);
								System.out.println("Enter the year");
								int s = sc.nextInt();
								System.out.println(year(s));
								}
}