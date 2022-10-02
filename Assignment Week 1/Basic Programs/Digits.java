import java.util.Scanner;
class Digits{
public static void main(String[] args){
int reverse=0,r;
Scanner sc=new Scanner(System.in);
System.out.println("Enter any number");
int n=sc.nextInt();
while(n!=0){
r=n%10;			
reverse=(reverse*10)+r;		
n=n/10;
}
int print=0;
while(reverse!=0){
	print=reverse%10;	
System.out.println(print);	
	reverse=reverse/10;
	}
	
		




	
