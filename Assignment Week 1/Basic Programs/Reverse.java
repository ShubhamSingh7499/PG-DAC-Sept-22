import java.util.Scanner;
class Test10{
public static void main(String args[]){
int r,reverse=0,temp;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int n=sc.nextInt();
temp=n;
while(n!=0){
	r=n%10;
	reverse=reverse*10+r;
	n=n/10;
	}
System.out.println("The Reverse of a number is=" +reverse);
}

}