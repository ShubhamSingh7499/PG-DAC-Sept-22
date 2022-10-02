import java.util.Scanner;
class Test11{
public static void main(String args[]){
	int sum=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int n=sc.nextInt();
int i=1;
do{
sum=sum+i;
i++;
}
while(i<=n);{
System.out.println(sum);
}

}
}
