interface Hello
{
	int a=0;  			// default access modifier of variable is final and initialization is must.(if this will not be declared then also it will work)
	void cal();  		// default access specifier of methid in interface is public,static,final.
	
	
}

class Bye implements Hello		//class can only implements intefaces not extends.
{
	int a,b,c;				  //redeclare a as in interface it is final.
		Bye()
		{
		}
		
		Bye(int b , int c)
		{
			this.b=b;
			this.c=c;
		}
		
			public void cal()		/*make this method public because method present inside interface is by default public and it can because
								be only accessed by public method.*/
			{
				a=b+c;
				System.out.println("The value of a is :" +a);
			}
			
}

class Nano implements Hello
{
	int a,b,c;
	Nano()
	{
	}
		
		Nano(int b , int c)
		{
			this.b=b;
			this.c=c;
		}
		
		public void cal()
			{
				a=b-c;
				System.out.println("The value of a is : " +a);
			}
			
}

class Main
{
public static void main(String[] args)
{
		Bye b=new Bye(6,5);
		b.cal();
		
		Nano n=new Nano(6,5);
		n.cal();
		
		
}
}
