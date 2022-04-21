import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class Books 
{
	LinkedList<Object> bookLocation = new LinkedList<Object>();
	LinkedList<Object> holdReturnBooks = new LinkedList<Object>();
	
	Scanner console = new Scanner(System.in);
	
	Object book1= "Biography-Educated by Tara Westover";
	Object book2= "Biography-The Diary of a Young Girl by Anne Frank";
	Object book3= "Fictional-Lord of the Rings by J.R.R. Tolkien";
	Object book4= "Fictional-Nineteen Eighty-Four by George Orwell";
	Object book5= "NonFictional-In Cold Blood by Truman Capote";
	Object book6= "NonFictional-Unbroken by Laura Hilenbrand";
	
	public void library()
	{
		bookLocation.add(0, book1);
		bookLocation.add(1, book2);
		bookLocation.add(2, book3);
		bookLocation.add(3, book4);
		bookLocation.add(4, book5);
		bookLocation.add(5, book6);
		
	}// end library
	
	
	public void viewLibrary()
	{
		System.out.println("Here are all books in the system:");
		bookLocation.forEach(System.out::println);
	
	} // end viewLibrary
		
	public void search()
	{
		boolean foundBook = false;
		int i = 0;
		
		System.out.println("Enter the book you are looking for by stating book type-book name by author." +
						   " \nExample of how to search: Biography-Educated by Tara Westover ");
		
		Object userSearch = console.nextLine();
		
		do
		{
			if(((String) userSearch).equalsIgnoreCase((String) bookLocation.get(i)))
			{
				System.out.println("The book is in the system. It is number " + (i+1) + " on the list.");
				foundBook = true;
			}// end if statement
			i++;
		} while(!foundBook == true && i < bookLocation.size());
		
		if  (foundBook == false)
			System.out.println("The book is not in the system.");
			
	} // end search
	public void remove()
	{
		
		boolean foundBook = false;
		int i = 0;
		
		System.out.println("Enter the book you would like to remove." +
						   " \nExample of how to enter book: Biography-Educated by Tara Westover ");
		
		Object userSearch = console.nextLine();
		
		do
		{
			if(((String) userSearch).equalsIgnoreCase((String) bookLocation.get(i)))
			{
				bookLocation.remove(i);
				System.out.println("The book " + userSearch + " has been removed.");
				foundBook = true;
			}// end if statement
			i++;
		} while(!foundBook == true && i < bookLocation.size());
		
		if  (foundBook == false)
			System.out.println("The book is not in the system.");
			
	}// end remove
	
	public <T> void add()
	{
		System.out.println("Enter the book you would like to add." +
				           " \nExample of how to enter book: Biography-Educated by Tara Westover ");
		Object userSearch = console.nextLine();
		bookLocation.add(userSearch);
		System.out.println("The book " + userSearch + " has been add to the list.");
		
	} // end add
	
	public void checkout()
	{
		boolean foundBook = false;
		int i = 0;
		
		System.out.println("Enter the book you would like to checkout." +
						   " \nExample of how to enter book: Biography-Educated by Tara Westover ");
		
		Object userSearch = console.nextLine();
		
		do
		{
			if(((String) userSearch).equalsIgnoreCase((String) bookLocation.get(i)))
			{
				holdReturnBooks.add(userSearch);
				bookLocation.remove(i);
				System.out.println("The book " + userSearch + " has been checked out.");
				foundBook = true;
			}// end if statement
			i++;
		} while(!foundBook == true && i < bookLocation.size());
		
		if  (foundBook == false)
			System.out.println("The book is not in the system.");
		
	} // end checkout
	public void returnBook()
	{
		boolean foundBook = false;
		int i = 0;
		
		System.out.println("Enter the book you would like to return");
		
		Object userSearch = console.nextLine();
		
		do
		{
			if(((String) userSearch).equalsIgnoreCase((String) holdReturnBooks.get(i)))
			{
				bookLocation.add(userSearch);
				holdReturnBooks.remove(userSearch);
				System.out.println("The book " + userSearch + " has been returned.");
				foundBook = true;
			}// end if statement
			i++;
		} while(!foundBook == true && i < bookLocation.size());
		
		if  (foundBook == false)
			System.out.println("The book is not in the system.");
	} //end returnBook
} // end class
