import java.util.Scanner;
class Test11{
public static void main(String args[]){
int i,fact=1;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int n=sc.nextInt();
for(i=1;i<=n;i++){
 fact=fact*i;
 }
 System.out.println("The factorial of a givn number =" +fact);
 }

}
