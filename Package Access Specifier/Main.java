class Main
{
	public static void main(String args[])
	{
		First f = new First();
		System.out.println(f.a);		//OK
		//System.out.println(f.b);		//Complation Error:  b has private access in First
		f.display();
		
		Fourth f = new Fourth();
		f.display();
	}
}