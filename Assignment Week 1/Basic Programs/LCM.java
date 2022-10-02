import java.util.Scanner;
class Main
{
		public static void main(String[] args)
		{
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt(); 
		int n2=sc.nextInt(); 
		int gcd=0;
		int lcm;
		int a=n1;
		int b=n2;
while(n1!=n2)   
{  
if(n1>n2)  
n1=n1-n2;  
else  
n2=n2-n1;
}
gcd=n2;
System.out.println(gcd);
lcm=(a*b)/gcd;
System.out.println(lcm);

		}
}  


