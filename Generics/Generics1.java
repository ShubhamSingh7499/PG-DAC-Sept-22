class Demo <T extends Number>
{
		T a;
		T b;
	
	Demo(T a , T b)
	{
	this.a=a;
	this.b=b;
	}
	
	double getData()
	{
	double c = a.doubleValue() + b.doubleValue();
	return c;
	}
	
}

class Demo1
{
public static void main(String[] args)
{
		Demo<Integer> d= new Demo<Integer>(5,6);
		System.out.println(Demo.getData());
		
		Demo<Double> d1 = new Demo<Double>(5.6,6.5);
		System.out.println(Demo.getData());
}
}
