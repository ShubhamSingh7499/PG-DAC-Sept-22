class Box
{
double volume;
		double box(double w,double h,double d)
		{
		volume = w*h*d;
		return volume;
		}
		public static void main(String[] args)
		{
		Box b=new Box();
		System.out.println("The Volume of Box = " +b.box(15.6,14.5,65.2));
		}
}
		
		