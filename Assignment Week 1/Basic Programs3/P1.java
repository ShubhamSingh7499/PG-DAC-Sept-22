class Student
{
								static int roll;
								static String name;
								static double marks;
								static int b;
								
				static void printDetails()
				{
					System.out.println("The RollNumber of Student is " +roll);
					System.out.println("The Name of Student is " +name);
					System.out.println("The Marks of Student is " +b);
				}
					
					static int changeMarks(int marks)
					{
						return marks;
						
					}
						static void addDetails()
						{
							roll=45;
							name="Shubham";
							marks=85;
							b=changeMarks(90);
							
							printDetails();
						}
						
							public static void main(String[] args)
							{
								
								addDetails();
							}
}
							
				
