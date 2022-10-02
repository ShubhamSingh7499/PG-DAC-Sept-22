import java.util.Scanner;
class Enum
{
	public enum Days
	{
	MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;
	}
				public static void main(String[] args)
				{
					Scanner sc=new Scanner(System.in);
					System.out.println("Enter the name of day");
					String s=sc.next();
					Days d=Days.valueOf(s);
									switch(d)
									{
									case MONDAY :
									System.out.println("Today we will start with the fresh weekdays");
									break;
									case TUESDAY :
									System.out.println("You will not take eggs on diet today");
									break;
									case WEDNESDAY :
									System.out.println("Fresh Topic and followed by revision");
									break;
									case THURSDAY :
									System.out.println("It's too tiring");
									break;
									case FRIDAY :
									System.out.println("Jaldi weekend aaye");
									break;
									case SATURDAY : 
									System.out.println("Yay! Today the weekend starts");
									break;
									case SUNDAY :
									System.out.println("Alas! Tomorrow , again monday");
									break;
									default :
									System.out.println("Why these week days are made");
									
									}
					}
					
				}
	

