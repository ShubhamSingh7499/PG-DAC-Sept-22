class Object1
{
	static int area(int l,int b)
	{
	int a =l*b;
	return a;
	}
	int volume (int l)
	{
		int v=l*l*l;
		return v;
	}
	
						public static void main(String[] args)
						{
							Object1 obj1=new Object1();
							int s=obj1.volume(5);
							System.out.println("Volume of rectangle= " +s);
							
							int b=area(40,50);
							System.out.println("Area of rectangle = " +b);
						}
}
			
