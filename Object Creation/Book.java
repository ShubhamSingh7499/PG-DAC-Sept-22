class Book
{
String AuthorName;
int cost;
int pagenumber;

	public static void main(String[] args)
	{
	Book A1=new Book();
	Book A2=new Book();
	
	A1.AuthorName="Chetan Bhagat";	
	A1.cost=350;
	A1.pagenumber=500;
	
	System.out.println("FOR BOOK A1");
	
	System.out.println("Author Name is  " +A1.AuthorName);
	System.out.println("The Cost of Book is  " +A1.cost);
	System.out.println("Total Page Number is " +A1.pagenumber);
	
	System.out.println("FOR BOOK A2");
	
	A2.AuthorName="J.K Rowling";
	A2.cost=700;
	A2.pagenumber=250;
	
	System.out.println("Author Name is  " +A2.AuthorName);
	System.out.println("The Cost of Book is  " +A2.cost);
	System.out.println("Total Page Number is " +A2.pagenumber);
	}
}
	
	
	