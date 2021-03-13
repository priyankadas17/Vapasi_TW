package Tests;

import Requests.AddBookRequest;
import Responses.AddBookResponse;
import Responses.BookResponseById;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class AddBookGetIDSearchByAuthor {
    @Test

    public void addBookAndGetId(){
        //Add a book with details

        RestAssured.baseURI = "http://216.10.245.166";
        AddBookRequest addBookRequest = new AddBookRequest();
        addBookRequest.setName("Learn API Testing");
        addBookRequest.setIsbn("P65059");
        addBookRequest.setAisle("82490");
        addBookRequest.setAuthor("Rahul Shetty");

        //The Response

        Response response  = given().log().all().header("Content-Type","application/json")
                .body(addBookRequest)
                .when().post("/Library/Addbook.php")
                .then().log().all().assertThat().statusCode(200).extract().response();

        //Store the response
        System.out.println(response.asString());
        AddBookResponse addBookResponse = response.body().as(AddBookResponse.class);
        System.out.println("Add Book response Id is " + addBookResponse.getId());

        //Get Book with the ID obtained

       Response responseForGetBook = given().queryParam("ID", addBookResponse.getId())
                .header("Content-Type","application/json")
                .when().get("/Library/GetBook.php")
                .then().statusCode(200).extract().response();

        //Store the response

        BookResponseById book[] = responseForGetBook.getBody().as(BookResponseById[].class);
        System.out.println("The book author is "+ book[0].getAuthor());
        Assert.assertEquals(response.getStatusCode(), 200);
    }
}
