import java.util.Scanner;
class Bank
{
			static int MinimumBalance(int d)
			{
			int m= d;
			return m; 
			}
								public static void main(String[] args)
								{
								Scanner sc=new Scanner(System.in);
								System.out.println(" _______Welcome to Banking_______");
								System.out.println(" 1: Withdrawl ");
								System.out.println(" 2: Deposit ");
								System.out.println(" 3: Minimum Account Balance to be maintained ");
								System.out.println(" 4: Exit ");
								System.out.println("Choose the  number from above");
								int n=sc.nextInt();
											switch(n)
											{
												case 1: 
															System.out.println("Enter the amount ");
															int p=sc.nextInt();
																	if(p<=20000)
																		System.out.println("*Amount Withdrawn*");
																	else
																		System.out.println("*Insufficient funds*");
												break;
												case 2 :
															System.out.println("Enter the amount");
															int x=sc.nextInt();
																	if(x<=100000)
																		System.out.println("*Deposited*");
																	else
																		System.out.println("*Cannot deposit more than 100000*");
												break;
												case 3 :
															int a = MinimumBalance(1000);
															System.out.println("Minimum Balance to be maintained = " +a);
												break;
												case 4 :
															System.out.println("Thankyou , Have a wonderful day");
												break;
												default :
															System.out.println("Wrong Input");
											}
					}
}