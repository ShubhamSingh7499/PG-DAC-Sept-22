class Box
{
	double h;
	double w;
	double b;
	double Area;
	double Volume;
				Box(double height , double width , double breadth )
				{
					this.h=height;
					this.w=width;
					this.b=breadth;
				}
						double getArea()
						{
								Area=2*(h*b+b*w+w*h);
								return Area;
						}
						
						double getVolume()
						{
								Volume = h*w*b;
								return Volume;
						}
						
				
				
					public static void main(String[] args)
					{
						Box b = new Box(2.5,5.6,4.5);
						Box b1=new Box(8.6,9.5,10.3);
						System.out.println("The dimensions of first box are : ");
						System.out.println(b.getArea());
						System.out.println(b.getVolume());
						
						System.out.println("The dimensions of Second box are : ");
						System.out.println(b1.getArea());
						System.out.println(b1.getVolume());
						
					}
				
}
						
						
		