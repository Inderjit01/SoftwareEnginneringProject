import java.util.Scanner;

public class Library
{
	static String userInput;
	
	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		
		Books book = new Books();
		
		book.library();
		
		do
		{
		System.out.println("Please enter a number that corresponds to the function");
		System.out.println("1: View all books \n"  +
				           "2: Search for a book \n" +
				           "3: Remove a book \n" +
				           "4: Add a book \n" +
				           "5: Checkout a book \n" +
				           "6: Return a book \n" +
				           "7: Exit program \n");
		
		userInput = console.nextLine();
		
		switch(userInput) {
			case "1": 
				book.viewLibrary();
			break;
			case "2":
				book.search();
			break;
			case "3":
				book.remove();
				break;
			case "4":
				book.add();
				break;
			case "5":
				book.checkout();
				break;
			case"6":
				book.returnBook();
				break;
			case "7":
				System.out.println("The program has exited.");
				System.exit(0);
				break;
		}// end switch statement
		} while(!restart().equals("no"));
		
	} // end main method
	
	public static String restart()
	{
		System.out.println("");
		System.out.println("Would you like to return to the main menu? Enter yes/no.");
		userInput = console.nextLine().toLowerCase();		
		System.out.println("");
		if(userInput.equals("no"))
			System.out.println("The program has exited");	
		return (String) userInput;
	} // end restart
	
} // end class
