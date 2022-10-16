abstract class Publication
{
	int noOfPages;
	int price;
	String publisherName;
		
		void printDetails()
		{
				System.out.println(noOfPages+" "+price+" "+publisherName);
		}
	
}

class Book extends Publication
{
	Book()
	{
	}
	
	Book()
	{
	}
}

class Journal extends Publication
{
	Journal()
	{
	}
	
	Journal()
	{
	}
	
}


class Library
{
public static void main(String[] args)
{
		String [] str = {"Industry journals","Research publications","Academic publications"};
		
		Book b = new Book();
		
		Journal j = new Journal();
		
}
}