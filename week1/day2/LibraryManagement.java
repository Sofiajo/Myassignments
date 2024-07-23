package week1.day2;

public class LibraryManagement {
	
	public static void main(String[] args) {
		
Library lm = new Library();
	
	String book = lm.addBook("Secret");
	System.out.println(book);
	lm.issueBook();
			
}
}