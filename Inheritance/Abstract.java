abstract class Shape						// class name should be abstract
{
	double perimeter;					   // no need of initialization as it is of default type.
	abstract void calPer();				  //method should be abstract and without body. Semicolon is neccessary in the last.
	
		void printPerimeter()			//abstract class can contain zero or multiple abstract method.
		{
			System.out.println(perimeter);
		}
}

	class Rectangle extends Shape			
	{
		double length;
		double breadth;
		
		Rectangle()
		{
		}
		Rectangle(double length,double breadth)
		{
			this.length=length;
			this.breadth=breadth;
			calPer();
		
		}
		
		void calPer()
		{
			perimeter = 2*(length+breadth);
		}
		
	}
	
	class Square extends Shape
	{
			double side;
		
		
	Square()
	{
	}
	
		Square(double side)
		{
			this.side=side;
			calPer();
			
		}
		
		void calPer()
		{
			perimeter = 4*side;
		}
	}
	
	class Abstract
	{
		public static void main(String[] args)
		{
			Square s=new Square(4.5);
			s.printPerimeter();
			
			
			Rectangle r=new Rectangle(4.5,5.6);
			r.printPerimeter();
		}
			
	}
			
			
	
	
	