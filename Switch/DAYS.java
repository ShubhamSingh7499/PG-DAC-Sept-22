import java.util.Scanner;
class Main
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the name of day");
	String Days = sc.next();
					switch(Days)
					{
					case "Monday":
					System.out.println("Today we will start with the fresh weekdays");
					break;
					case "Tuesday":
					System.out.println("You will not take eggs on diet today");
					break;
					case "Wednesday":
					System.out.println("Fresh Topic and followed by revision");
					break;
					case "Thursday":
					System.out.println("It's too tiring");
					break;
					case "Friday" :
					System.out.println("Jaldi weekend aaye");
					break;
					case "Saturday" : 
					System.out.println("Yay! Today the weekend starts");
					break;
					case "Sunday" :
					System.out.println("Alas! Tomorrow , again monday");
					break;
					default :
					System.out.println("Why these week days are made");
					
					}
	}
}
