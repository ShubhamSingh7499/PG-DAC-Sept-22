class Student
{
		static String name;
		static int m1;
		static int m2;
		static int m3;
		static double average;
		
		static void assignValues()
		{
			name="Shubham";
			m1=50;
			m2=98;
			m3=85;
			display();
			
		}
		
			static void Average()
			{
				
				average=(m1+m2+m3)/3;
				System.out.println("The average of marks = " +average);
			}
			
				static void display()
				{
					System.out.println("The name of student is : " +name);
					System.out.println("Total Marks = " +(m1+m2+m3));
					Average();
					
				}
				
			public static void main(String[] args)
			{
				assignValues();
				
			}
}
				
		