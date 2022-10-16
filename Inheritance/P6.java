import java.util.Scanner;
class Main
{
	String author;
	String title;
	int cost;
	int stockPosition;
	String publisherName;
	
	
	
	Main()
	{
	}
		
void printDetails()
{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the title name of the book");
		title=sc.nextLine();
	
	switch(title)
	{
			case "Twilight" :
			System.out.println("Enter the author name");
			author=sc.nextLine();
					
				switch(author)
				{
					case "Stephenie Meyer" :
					stockPosition=2;
					publisherName="Meyer";
					System.out.println("it is available");
					System.out.println("Details of book is as under : ");
					System.out.println("Publisher name is" 	+publisherName);
					System.out.println("Stock position is " +stockPosition);
					System.out.println("No. of Copies you need ? ");
					int noOfCopies=sc.nextInt();
					switch(noOfCopies)
					{
						case 1: 
						cost = 400;
						System.out.println("Cost of book is Rs " +cost);
						break;
						
						default :
						System.out.println("Required copies are not in stack");
					}
						
					
					break;
					
						default:
						System.out.println("Wrong Input");
				}
			
			break;
		
			case "One indian girl" :
			System.out.println("Enter the author name");
			author=sc.nextLine();
				switch(author)
				{
					case "Chetan Bhagat" :
					
					stockPosition=5;
					publisherName="Chetan Bhagat";
					System.out.println("it is available");
					System.out.println("Details of book is as under : ");
					System.out.println("Publisher name is" +publisherName);
					System.out.println("Stock position is " +stockPosition);
					System.out.println("No. of Copies you need ? ");
					int noOfCopies=sc.nextInt();
					switch(noOfCopies)
					{
						case 1: 
						cost = 500;
						System.out.println("Cost of book is Rs " +cost);
						break;
						
						default :
						System.out.println("Requested copies are not allowed");
					}
					break;
					
					default: 
					System.out.println("Wrong Input");
				}
				break;
				
		case "Making india awesome" :
					System.out.println("Enter the author name");
					author=sc.nextLine();
					
				switch(author)
				{
					case "Chetan Bhagat" :
					
					stockPosition=8;
					publisherName="Chetan Bhagat";
					System.out.println("it is available");
					System.out.println("Details of book is as under : ");
					System.out.println("Publisher name is " +publisherName);
					System.out.println("Stock position is " +stockPosition);
					System.out.println("No. of Copies you need ? ");
					int noOfCopies=sc.nextInt();
					switch(noOfCopies)
					{
						
						case 1: 
						cost = 600;
						System.out.println("Cost of book is Rs " +cost);
						
						break;
						default :
						System.out.println("Requested copies are not allowed");
					}
					
					break;
					
					default: 
					System.out.println("Wrong Input");
				}
			break;
			
			default :
			System.out.println("Not Available");
	}
}
}
		

class Book
{
	public static void main(String[] args)
	{
		
		Main m = new Main();
		m.printDetails();
	}
}
		