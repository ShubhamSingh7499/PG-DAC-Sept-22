import java.util.Scanner;
 
class Array2{
	
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the No. of Elements");
		int n = sc.nextInt();
		int a[] = new int[n];
		
		int mul;
		
		for(int i=0;i<n;i++)		
		{
			System.out.println("Enter the Element");
			a[i] = sc.nextInt();
		}
		
		
		for(int i=1;i<=n;i++)		
		{
			mul = 1;
			
			for(int j=1;j<=n;j++)
			{
				if(i!=j)		
				mul=mul*j;
			}
			System.out.print(mul + " ");	
		}
	}
}

// Output :  			24 12 8 6		