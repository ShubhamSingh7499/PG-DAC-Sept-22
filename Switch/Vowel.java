import java.util.Scanner;
class Main
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any vowel");
	char ch = sc.next().charAt(0);
					switch(ch)
					{
					case 'a'  :
					case 'A' :			
					 System.out.println("The entered vowel is a");
					break;
					case 'e':
					case 'E' :
					System.out.println("The entered vowel is e");
					break;
					case 'i' :
					case 'I' :
					System.out.println("The entered vowel is i");
					break;
					case 'o' :
					case 'O' :
					System.out.println("The entered vowel is o");
					break;
					case 'u' :
					case 'U' :
					System.out.println("The entered vowel is u");
					break;
					default :
					System.out.println("Not a vowel");
					
					}
	}
}
