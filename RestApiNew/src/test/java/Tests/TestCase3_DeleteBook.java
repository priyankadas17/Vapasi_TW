package Tests;

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
        addBookRequest.setIsbn("R9773");
        addBookRequest.setAisle("5693");
        addBookRequest.setAuthor("Chetan Bhagat");

        //Response for add book

        Response response  = given().log().all().header("Content-Type","application/json")
                .body(addBookRequest)
                .when().post("/Library/Addbook.php")
                .then().log().all().assertThat().statusCode(200).extract().response();

        //Store the response
        System.out.println(response.asString());
        AddBookResponse addBookResponse = response.body().as(AddBookResponse.class);
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
