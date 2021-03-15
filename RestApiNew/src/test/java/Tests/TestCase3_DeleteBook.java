package Tests;

/**  3. [DELETE]
 1. AddBook: [id=123]
 2. Validate Book recently added getBook(id=123)
 3. Delete the Book Added (id=123)
 4. Validate getBook(id=123)
 5. AddBook(id=123) // User Should be able to add Book  **/

import Requests.AddBookRequest;
import Requests.DeleteBookReq;
import Responses.AddBookResponse;
import Responses.DeleteBookRes;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class TestCase3_DeleteBook {

    @Test

    public void addBookAndGetId(){

        //Add a book with details
        RestAssured.baseURI = "http://216.10.245.166";
        AddBookRequest addBookRequest = new AddBookRequest();
        addBookRequest.setName("Learn API Testing");
        addBookRequest.setIsbn("R94373");
        addBookRequest.setAisle("85693");
        addBookRequest.setAuthor("Chetan Bhagat");

        //Response for add book
        Response responseAddBook  = given().log().all().header("Content-Type","application/json")
                .body(addBookRequest)
                .when().post("/Library/Addbook.php")
                .then().log().all().assertThat().statusCode(200).extract().response();

        //Store the response
        System.out.println(responseAddBook.asString());
        AddBookResponse addBookResponse = responseAddBook.body().as(AddBookResponse.class);
        String searchById = addBookResponse.getId();
        System.out.println("Add Book response Id is " + searchById);

        //Get Book with the ID obtained
        Response responseForGetBook = given().queryParam("ID", addBookResponse.getId())
                .header("Content-Type","application/json")
                .when().get("/Library/GetBook.php")
                .then().statusCode(200).extract().response();

        //Delete the added book
        DeleteBookReq deleteBookReq = new DeleteBookReq();
        deleteBookReq.setId(searchById);
        Response delResponse  = given().log().all().header("Content-Type","application/json")
                .body(deleteBookReq)
                .when().post("/Library/DeleteBook.php")
                .then().log().all().assertThat().statusCode(200).extract().response();

        //Store the deleted response
        System.out.println(delResponse.asString());
        DeleteBookRes deleteBookRes = delResponse.body().as(DeleteBookRes.class);
        System.out.println("Print the message " + deleteBookRes.getMsg());

       //Validate the book with the id again
        Response validateResponse = given().queryParam("ID", searchById)
                .header("Content-Type","application/json")
                .when().get("/Library/GetBook.php")
                .then().statusCode(404).extract().response();

        //Add the book again
        Response addAgain  = given().log().all().header("Content-Type","application/json")
                .body(addBookRequest)
                .when().post("/Library/Addbook.php")
                .then().log().all().assertThat().statusCode(200).extract().response();


    }}
