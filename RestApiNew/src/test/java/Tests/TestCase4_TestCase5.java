package Tests;

/**    4. [Get Book By Author Name]
 1. Add  book1 with Author name 'boxom' [book name should be unique for all]
 2. Add  book2 with Author name 'boxom'
 3. Add  book3 with Author name 'boxom'
 4. Get Book By Author Name
 5. Validate no. of Books returned (in this case 3)
 6. Print Book name of all the 3 books added
 5. [Get Book By Author Name/ Delete]
 1. Add  book1 with Author name 'boxom' [book name should be unique for all]
 2. Add  book2 with Author name 'boxom'
 3. Add  book3 with Author name 'boxom'
 4. Get Book By Author Name
 5. Delete one Book with author name 'boom'
 6. Validate no. of Books returned (in this case 3)
 7. Print Book name of all the 3 books added   **/

import Responses.AddBookResponse;
import Responses.GetBookResponseByAuthor;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestCase4_TestCase5 extends ParentTest{


    //Add 3 books with same author name
    @DataProvider(name = "AddBook")
    public static Object[][] AddBooks() {
        return new Object[][]{{"VMwareBasics", "P31124", "436259", "Rick Crisci5"}, {"VMwareBeginners", "P13367", "450447","Rick Crisci5"},
                {"VmwareAdvanced", "P51843", "53919", "Rick Crisci5" }};
    }

    @Test
            (dataProvider = "AddBook")
    public void performAddBooks(String bookName,  String isbn, String aisle, String author ) {
        Response responseAddBook = addNewBook(bookName, isbn, aisle, author);
        AddBookResponse addBook = responseAddBook.body().as(AddBookResponse.class);
        Assert.assertEquals(addBook.getId(), isbn + aisle);
    }

    //Get Books by the same author and Validate no. of Books returned
    @DataProvider(name = "GetBook")
    public static Object[][] GetBooks() {
        return new Object[][]{{"Rick Crisci5", 3}};
    }

    @Test(dataProvider = "GetBook")
    public void validateBooksAddedByAuthor(String authorName, int noOfBooks) {
        GetBookResponseByAuthor[] getBooks = getBookByAuthor(authorName);
        Assert.assertEquals(getBooks.length, noOfBooks);
        System.out.println("The name of three books added are: ");
        for (GetBookResponseByAuthor book : getBooks)
            System.out.println(book.getBookName());
            System.out.println("*****************************");
    }

    //Get Books by another author
    @DataProvider(name = "GetBook2")
    public static Object[][] getBookByAnotherAuthor() {
        return new Object[][]{{"Boom5"}};
    }

    //Delete book by another author
    @Test(dataProvider = "GetBook2")
    public void deleteBookByAuthor(String authorName) {
        String bookId;
        GetBookResponseByAuthor[] getBooks = getBookByAuthor(authorName);
        bookId = getBooks[0].getIsbn() + getBooks[0].getAisle();

        String deleteResponse = deleteByID(bookId);
        Assert.assertEquals(deleteResponse, "{\"msg\":\"book is successfully deleted\"}");
    }

    //Validate no. of Books returned (in this case 3) and print the name of 3 books
    @Test(dataProvider = "GetBook")
    public void validateAgainBooksByAuthor(String authorName, int noOfBooks) {
        GetBookResponseByAuthor[] getBooks = getBookByAuthor(authorName);
        Assert.assertEquals(getBooks.length, noOfBooks);
        System.out.println("The name of three books added are: ");
        for (GetBookResponseByAuthor book : getBooks)
            System.out.println(book.getBookName());
            System.out.println("*****************************");
    }

}
