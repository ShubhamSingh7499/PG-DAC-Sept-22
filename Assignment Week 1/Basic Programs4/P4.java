class Room
{
	double height;
	double width;
	double breadth;
	double volume;
	
		double volume(double height , double breadth , double width)
		{
			volume=height*breadth*width;
			return volume;
			
		}
}

	class RoomDemo
	{
		public static void main(String[] args)
		{
			Room r1=new Room();
			System.out.println("The dimensions of room1 is : ");
			System.out.println(r1.volume(50.2,65.2,54.8));
			Room r2 = new Room();
			System.out.println("The dimensions of room2 is : ");
			System.out.println(r2.volume(60.4,54.8,54.9));
			Room r3=new Room();
			System.out.println("The dimensions of room3 is : ");
			System.out.println(r3.volume(65.4,45.8,96.5));
			Room r4=new Room();
			System.out.println("The dimensions of room4 is : ");
			System.out.println(r4.volume(89.5,56.2,85.7));
		}
	}
		
		
			