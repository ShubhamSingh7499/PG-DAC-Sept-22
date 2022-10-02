//Wap to check whether the number is plaindrome or not .

import java.util.Scanner;
	class Test5{
		public static void main(String[] args){
	int r,sum=0,temp;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the value of n");
	int n=sc.nextInt();
	System.out.println("N= " +n);
		temp=n;
while(n!=0){
		r=n%10;
		sum=sum*10+r;
		n=n/10;
}
	System.out.println("Sum= " +sum);
if(temp==sum)
{
	System.out.println("Palindrome Number");
}
else
{
	System.out.println("Not a Palindrome");
}

}


}