import java.util.Scanner;
class Leap{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the year");
		int a=sc.nextInt();
			if(((a%4 == 0) && (a%100!= 0)) || (a%400 == 0))
			{
				System.out.println("the given year is a leap year");
			}
			else
			{
				System.out.println("the given year is not a leap year");
			}
		
		
	}
}