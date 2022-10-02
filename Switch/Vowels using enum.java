import java.util.Scanner;
class Main
{
	enum Vowels
	{
	A,E,I,O,U;
	}
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any vowel");
	char ch = sc.next().charAt(0);
	Vowels v=Vowels.valueOf(ch);
					switch(v)
					{
					case A:
					System.out.println("The entered vowel is a");
					break;
					case E:
					System.out.println("The entered vowel is e");
					break;
					case I :
					System.out.println("The entered vowel is i");
					break;
					case O :
					System.out.println("The entered vowel is o");
					break;
					case U:
					System.out.println("The entered vowel is u");
					break;
					default :
					System.out.println("Not a vowel");
					
					}
	}
}
