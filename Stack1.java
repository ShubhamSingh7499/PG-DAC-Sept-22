import java.nio.channels.ClosedSelectorException;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Reverse
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int temp =0;
		int num = s;
		while(s!=0)
		{
			int rem = s%10;
			temp = temp*10 + rem;
			s=s/10;
		}
		if(temp == num)
		
			System.out.println("Palindrome");
		
		else
		{
		
			System.out.println("Not Palindrome");
		}
	}
}

//string palindrome or not

class StringPalindrome
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String nstr="";
		char [] c = str.toCharArray();
		
		for(int i=0;i<c.length/2;i++)
		{
			char temp = c[i];
			c[i]=c[c.length-1-i];
			c[c.length-1-i]=temp;
		}
		nstr = new String(c);
		
		 if(nstr.equalsIgnoreCase(str))	
	 	 System.out.println(	str+"		string	is	palindrome	");		
	 	 else	
	 	 System.out.println(str+"	string	is	not	palindrome");	
		
	}
}

//reverse words in string

class ReverseWordSubstring
{
     public static void main(String[] args) 
	 {
        String input = "hello world";
        String s[] = input.split(" ");
        String res = "";
        for (int i = s.length - 1; i >= 0; i--) {
            res += s[i] + " ";
        }

        System.out.println(res.substring(0, res.length() - 1));
    }
}

//

class ReverseWord
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String []s = str.split(" ");
		
		for(int i=s.length-1;i>=0;i--)
		{
			System.out.print(s[i]+" ");
		}
	}
}

//prime number

class Prime
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count == 2)
		{
			System.out.println("Prime Number");
		}
		else
		{
			System.out.println("Non Prime");
		}
	}
}

class GCd
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a>b)
		{
			for(int i=b;i>0;i--)
			{
				if(a%i==0 && b%i==0)
				{
					System.out.println(i);
					break;
				}
			}
		}
		
		if(a<b)
		{
			for(int i=a;i>0;i--)
			{
				if(a%i==0 && b%i==0)
				{
					System.out.println(i);
					break;
				}
			}
		}
	}
}

//string repetetion

class StringRepetetion
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		char [] c = str.toCharArray();
		int count;
		for(int i=0;i<c.length;i++)
		{
			count=0;
			for(int j=i+1;j<c.length;j++)
			{
				
				if(c[i]==c[j])  
				{
					count++;
					c[j] ='_';
				}
				
			}
			if(count>=1 && c[i]!='_')
			{
				System.out.println(c[i]);
			}
		}
		
	}
}

class Exception
{
	public static void main(String[] args) 
	{
		int a=5;
		int b=0;
		try{
			int c= a/b;
		}

		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}

class Stack
{
	static private int top;
	private static int n;
	private static char [] c;

	Stack(int n)
	{
		this.top=-1;
		this.n=n;
		this.c=new char[n];
	}

	boolean isEmpty()
	{
		if(top==-1)
		return true;
		else
		return false;
	}

	boolean isFull()
	{
		if(top==n-1)
		return true;
		else
		return false;
	}

	void push(char element)
	{
		if(!isFull())
		{
			c[++top] = element;
		}
	}

	void pop()
	{
		top--;
	}
}

class BalancedParanthesis
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		Stack s = new Stack(str.length());
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='(')
			s.push(str.charAt(i));
			if(str.charAt(i)==')')
			s.pop();
		}
		System.out.println(s.isEmpty());
	}
}

class Whitespaces {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String s = str.replaceAll("\\s", "");
        System.out.println(str);
    }
}

class StringAtEvenPos
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();

		for(int i=1;i<s.length();i++)
		{
			if(i%2==0)
			{
				System.out.print(s.charAt(i));
			}
		}
	}
}


class StreamAPI
{
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(25);
		list.add(35);

		Stream <Integer> streamOfNumber = list.stream();

		streamOfNumber.forEach(list1-> System.out.print(list1+" "));
	}
}

class ArrayList1
{
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);

		Iterator<Integer> itr = list.iterator();

		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
	}
}

class HashMap1
{
	public static void main(String[] args)
	{
		Map<Integer , String> map = new HashMap<>();
		
		map.put(10,"Shubham");
		map.put(20,"Shivam");
		
		for(Map.Entry m : map.entrySet())
		{
			System.out.print(m.getKey()+" "+m.getValue());
		}
	}
}

class StreamAPIFilterFunction
{
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();

		list.add(25);
		list.add(56);

		List <Integer> stream = list.stream().filter(n -> n%2 == 0).collect(Collectors.toList());

		System.out.println(stream);

	}
}

class StreamAPIMapFunction
{
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();

		list.add("Shubham");
		list.add("Gaju");

		List <Integer> stream = list.stream().map(String::length).collect(Collectors.toList());

		System.out.println(stream);

	}
}

class IndexPos
{
	public static void main(String[] args) {
		String[] arr = {"Shubham","Gaju"};

		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]=="Shubham")
			{
				System.out.println("The index of requested name is :"+i);
				break;
			}
		}
	}
}


		
		
		
		
		