import java.util.Scanner;
	class Test13{
		public static void main(String[] args){
	int sum=0;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the value of n");
	int n=sc.nextInt();
	int i=1;
	while(i<=n){
	if(i%2==0)
	{		
	sum=sum+i;
	}
	i++;
	}
	System.out.println("Sum=" +sum);
}
}
		
	