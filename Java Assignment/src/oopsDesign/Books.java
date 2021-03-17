package oopsDesign;

import java.util.ArrayList;
import java.util.List;

public class Books {
	String bookISBN;
	String bookAuthor;
	String bookDepartment;
	boolean isBookRented;
	static int countBookRented ;
	static List<Books> booksList;
	
	public Books() {
		
	}
	
	public Books(String bookISBN, String bookAuthor, String bookDepartment, boolean isBookRented) {
		this.bookISBN = bookISBN;
		this.bookAuthor = bookAuthor;
		this.bookDepartment = bookDepartment;
		this.isBookRented = isBookRented;
	}
	

	
	public int getBooksCount() {
		return Books.booksList.size();
	}

	public String getBookISBN() {
		return bookISBN;
	}

	public void setBookISBN(String bookISBN) {
		this.bookISBN = bookISBN;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public String getBookDepartment() {
		return bookDepartment;
	}

	public void setBookDepartment(String bookDepartment) {
		this.bookDepartment = bookDepartment;
	}

	public boolean isBookRented() {
		return isBookRented;
	}

	public void setBookRented(boolean bookRented) {
		isBookRented = bookRented;
	}

	public static int getCountBookRented() {
		return countBookRented;
	}

	public static void setCountBookRented(int countBookRented) {
		Books.countBookRented = countBookRented;
	}

	public static List<Books> getBooksList() {
		return booksList;
	}

	public static void setBooksList(List<Books> booksList) {
		Books.booksList = booksList;
	}
}
