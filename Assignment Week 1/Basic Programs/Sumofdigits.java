//WAP to print the sum of digits of a given number.

import java.util.Scanner;
class Man{
public static void main(String[] args){
int sum=0,num;
Scanner sc=new Scanner(System.in);
System.out.println("Enter any number");
int n=sc.nextInt();
while(n!=0){
num=n%10;		//3 	//2		//1
sum=sum+num;	//3		//3+2	//1
n=n/10;			//12	//1		//0
}
System.out.println("Sum of entered digits= " +sum);
}
}
