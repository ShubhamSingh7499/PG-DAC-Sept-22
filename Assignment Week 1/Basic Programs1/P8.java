import java.util.Scanner;
class P8
{
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			int basicsalary=sc.nextInt();
			double HRA;
			double DA;
			double GS;
			
			if(basicsalary<10000)
			{
				HRA=0.1*basicsalary;
				DA = 0.9*basicsalary;
				GS=basicsalary+DA+HRA;
				System.out.println("Gross Salary = " +GS);
			}
			else
			{
				HRA=2000;
				DA=0.98*basicsalary;
				GS=basicsalary+DA+HRA;
				System.out.println("Gross Salary = " +GS);
			}
		}
}
			
			