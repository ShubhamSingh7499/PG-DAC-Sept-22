import java.util.Scanner;

//Pattern Question

//Star Pattern 1-5
import java.util.*;

class P1 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = i; j < 5; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}

	}
}
//

class P2 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = i; j < 5; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(k + " ");
			}
			System.out.println();
		}

	}
}

class P3 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int k = 5; k >= i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}

class P4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int k = 1; k <= n; k++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}
}

// Print the digits of number

class DigitPrint {
	public static void main(String[] a) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number you needto print the digits for");
		int n = sc.nextInt();

		String number = Integer.toString(n);

		for (int i = 0; i < number.length(); i++) {
			System.out.print(number.charAt(i) + " ");
		}

	}
}

// bubble sort

class BubbleSort {
	static void sort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] x = { 5, 25, 1, 2, 65 };
		sort(x);
		for (int a : x) {
			System.out.print("Sorted array is:" + a + " ");
		}
	}
}

// insert the elements in array using Scanner

class InsertArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = sc.nextInt();

		System.out.println("Enter the elements of an array");
		int a[] = new int[n];

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		for (int s : a) {
			System.out.print(s + " ");
		}
	}
}

// Reverse the elements of an array

class ReverseArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = sc.nextInt();

		System.out.println("Enter the elements of an array");
		int a[] = new int[n];

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		System.out.println("The inserted elements are");
		for (int s : a) {
			System.out.print(s + " ");
		}

		System.out.println("The reverse elements are");

		for (int i = 0; i < a.length / 2; i++) // 0-2
		{ // {10,20,30}
			int temp = a[i]; // temp=10;
			a[i] = a[a.length - 1 - i]; // 10=30;
			a[a.length - 1 - i] = temp; // 30=10;
		}
		for (int s1 : a) {
			System.out.print(s1 + " ");
		}
	}
}

// print largest and smallest number in array

class SmallLargeArray {
	public static void main(String[] args) {
		int[] a = { 5, 20, 35, 61, 1 };
		int small = a[0];
		int large = a[0];

		for (int i = 0; i < a.length; i++) {
			if (a[i] > large) {
				large = a[i];
			}
			if (a[i] < small) {
				small = a[i];
			}
		}
		System.out.println("Largest element is:" + large);
		System.out.println("The smallest element is:" + small);
	}
}

// String duplicate

class StringCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		int count = 0;
		char d = 0;

		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					if (d != str.charAt(i)) {
						count++;
						d = str.charAt(i);
						System.out.println("Duplicate characters are:" + d);
						break;
					}
				}
			}
		}
		System.out.println("Count of duplicate characters are:" + count);
	}
}

// StringReversal

class StringReversal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		char a[] = str.toCharArray();

		for (int i = a.length - 1; i >= 0; i--) {
			System.out.println("String Reversal is:" + a[i]);
		}
	}
}

// Collection framework linked list insert element with iterator

class LinkedListCollection {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);

		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		for (int a : list) {
			System.out.println(a);
		}
	}
}

// Left diamond

class LeftDiamond {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k < i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = 5; k >= i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}

// factorial of a given number

class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int s = sc.nextInt();
		int fact = 1;

		for (int i = 1; i <= s; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial os a given number is:" + fact);
	}
}

// factorial with the help of recursion

class FactorialRecursion {

	static double factorial(int n) {
		if (n == 1)
			return 1;
		else {
			return n * factorial(n - 1);

		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int s = sc.nextInt();
		double fact = 1;
		fact = factorial(s);
		System.out.println(fact);

	}
}

// fibonacci with recursion

class FibonacciRecursion {

	static int fibonacii(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1 || n == 2) {
			return 1;
		}
		return fibonacii(n - 2) + fibonacii(n - 1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int s = sc.nextInt();
		for (int i = 0; i <= s; i++) {
			System.out.print(fibonacii(i) + " ");
		}

	}
}

// print positive and negative number from array

class PosNeg {
	public static void main(String[] args) {
		int[] a = { 25, 52, -25, -85 };
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0) {
				System.out.print("Positive numbers are:" + a[i] + " ");
			}

			else {
				System.out.print("Negative numbers are:" + a[i] + " ");
			}
		}
	}
}

// magic number
class MagicNumber {
	public static void main(String[] args) {
		int n, r = 1, num, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number=");
		n = sc.nextInt();
		num = n;
		while (num > 9) {
			while (num > 0) {
				r = num % 10;
				sum = sum + r;
				num = num / 10;
			}
			num = sum;
			sum = 0;
		}
		if (num == 1) {
			System.out.println("Magic Number");
		} else {
			System.out.println("Not Magic Number");
		}
	}
}

// GCD of two numbers

class GCD {
	public static void main(String[] args) {
		int a = 10;
		int b = 5;

		if (a > b) {
			for (int i = b; i > 0; i--) {
				if (a % i == 0 && b % i == 0) {
					System.out.println(i);
					break;
				}
			}
		}
		if (a < b) {
			for (int i = a; i > 0; i--) {
				if (a % i == 0 && b % i == 0) {
					System.out.println(i);
					break;
				}
			}
		}
	}
}

// LinkedList insert at begining

class InsertBeg {
	static Node head;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}
	}

	static void insertBeg(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}

	static void display() {
		Node n = head;
		while (n != null) {
			System.out.print(n.data + "---->");
			n = n.next;
		}
	}

	public static void main(String[] args) {
		InsertBeg ins = new InsertBeg();
		ins.insertBeg(10);
		ins.insertBeg(20);
		ins.display();
	}
}

// insertend singly linked list

class InsertEnd {
	static Node head;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}
	}

	static void insertEnd(int new_data) {
		Node new_node = new Node(new_data);
		if (head == null) {
			head = new_node;
			return;
		} else {
			Node trav = head;
			while (trav.next != null) {
				trav = trav.next;
			}
			trav.next = new_node;
		}

	}

	static void display() {
		Node n = head;
		while (n != null) {
			System.out.print(n.data + "---->");
			n = n.next;
		}
	}

	public static void main(String[] args) {
		InsertEnd ins = new InsertEnd();
		ins.insertEnd(10);
		ins.insertEnd(20);
		ins.display();
	}
}

// insert Between Singly Linked List

class InsertBet {
	static Node head;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}
	}

	static void insertEnd(int new_data) {
		Node new_node = new Node(new_data);

		if (head == null)
			head = new_node;
		else {
			Node trav = head;
			while (trav.next != null) {
				trav = trav.next;
			}
			trav.next = new_node;
		}
	}

	static void insertBet(int new_data) {
		Node new_node = new Node(new_data);

		if (head == null) {
			head = new_node;
			return;
		} else {
			Node trav = head;
			while (trav.next != null) {
				trav = trav.next;
			}
			head.next = new_node;
			new_node.next = trav;
		}
	}

	static void display() {
		Node n = head;
		while (n != null) {
			System.out.print(n.data + "---->");
			n = n.next;
		}
	}

	public static void main(String[] args) {
		InsertBet ins = new InsertBet();

		ins.insertEnd(27);

		ins.insertEnd(89);
		ins.insertBet(85);

		ins.display();
	}
}

// insert at specified poistion using singly linked list

class InsertAtPosition {
	static Node head;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}
	}

	static void insertEnd(int new_data) {
		Node new_node = new Node(new_data);

		if (head == null)
			head = new_node;
		else {
			Node trav = head;
			while (trav.next != null) {
				trav = trav.next;
			}
			trav.next = new_node;
		}
	}

	static void display() {
		Node n = head;
		while (n != null) {
			System.out.print(n.data + "---->");
			n = n.next;
		}
	}

	public static void main(String[] args) {
		InsertAtPosition ins = new InsertAtPosition();

		ins.insertEnd(27);
		ins.insertEnd(89);

		ins.display();
	}
}
//

class Args {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = a + b;
		System.out.println(c);
	}
}

//
interface A {
	void show();
}

interface B {
	void display();
}

class C implements A, B {
	public void show() {
		System.out.println("Show called");
	}

	public void display() {
		System.out.println("Display called");
	}

}

class Main {
	public static void main(String[] args) {
		C c = new C();
		c.show();
		c.display();
	}
}

class VowelUsingSwitch {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		char ch = sc.next().charAt(0);

		switch (ch) {
			case 'A':
			case 'a':
				System.out.println("Vowel");
				break;

			case 'E':
			case 'e':
				System.out.println("Vowel");
				break;

			case 'I':
			case 'i':
				System.out.println("Vowel");
				break;

			default:
				System.out.println("Not vowel");
		}
	}
}

class StringContainVowels {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();

		char ch[] = s.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == 'A' || ch[i] == 'E') {
				System.out.println("Vowel");
				break;
			} else {
				System.out.println("Not vowel");
				break;
			}
		}
		sc.close();
	}
}


class Anagram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s1 = sc.nextLine();
		String s2 = sc.nextLine();

		char[] ch1 = s1.toLowerCase().toCharArray();
		char[] ch2 = s2.toLowerCase().toCharArray();

		Arrays.sort(ch1);
		Arrays.sort(ch2);

		if (Arrays.equals(ch1, ch2)) {
			System.out.println("Anagram");
		} else {
			System.out.println("Not Anagram");
		}

	}
}

class FrequencyCharacter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();

		s = s.toLowerCase();

		for (char ch = 'a'; ch <= 'z'; ch++) {
			int c = 0;

			for (int i = 0; i < s.length(); i++) {
				if (ch == s.charAt(i)) {
					c++;
				}
			}
			if (c != 0) {
				System.out.println(ch + "\t" + c);
			}

		}
		sc.close();
	}
}

class RemoveBlankSpacesWithoutRemoveAllMethod
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		char ch [] = s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i] == ' ')
			{
				continue;
			}
			System.out.print(ch[i]);
		}	
		sc.close();
	}
}
