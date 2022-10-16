interface Shape
{
	
	double area=0.0;		//not needed as such because this data member is final and it's of no use .
	void area();
}

class Rectangle implements Shape
{
		double area;
		double length;
		double breadth;
	
		Rectangle()
		{
		}
		
		Rectangle(double length , double breadth)
		{
			this.length=length;
			this.breadth=breadth;
		}
		
		public void area()
		{
			area = length*breadth;
			System.out.println(area);
		}
		
}

class Square implements Shape
{
	double area;
	double side;
	
		Square()
		{
		}
		
		Square(double side)
		{
			this.side=side;	
		}
		
		public void area()
		{
			area = side*side;
			System.out.println(area);
		}
		
	
}

class Main
{
public static void main(String[] args)
{
	Rectangle rect=new Rectangle(54,45);
	rect.area();
	
	Shape sq=new Square(5);
	sq.area();
	
}
}
