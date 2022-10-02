import java.util.Scanner;
class Swap{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of a");
int a=sc.nextInt();
System.out.println("Enter the value of b");
int b =sc.nextInt();
System.out.println("Enter the value of c");
int c =sc.nextInt();
a=b;
b=c;
c=a;
System.out.println("The value of a= " +a);
System.out.println("The value of b= " +b);
System.out.println("The value of c= " +c);
}
}