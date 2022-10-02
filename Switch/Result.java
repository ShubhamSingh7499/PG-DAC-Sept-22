import java.util.Scanner;
class Result
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Marks");				
	int m = sc.nextInt();
	int result=(m<=100&&m>=60)?1:(m<60&&m>=50)?2:(m<50&&m>=40)?3:4;
					switch(result)
					{
					case 1 :
					System.out.println("First Division");
					break;
					case 2  :
					System.out.println("Second Division");
					break;
					case 3  :
					System.out.println("Third Division");
					break;
					default :
					System.out.println("Fail");
					
					}
	}
}
