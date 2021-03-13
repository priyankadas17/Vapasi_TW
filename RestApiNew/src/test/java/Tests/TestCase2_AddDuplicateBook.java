package Tests;

import Requests.AddBookRequest;
import Responses.AddBookResponse;
import Responses.AddDupBookResponse;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class TestCase2_AddDuplicateBook {
    @Test

    public void addBookAgain(){
        //Add a book with details


        RestAssured.baseURI = "http://216.10.245.166";
        AddBookRequest addBookRequest = new AddBookRequest();
        addBookRequest.setName("Learn API Testing");
        addBookRequest.setIsbn("P22090");
        addBookRequest.setAisle("85838");
        addBookRequest.setAuthor("Rahul Shetty");

        //Add the book for first time

        Response response = given().log().all().header("Content-Type", "application/json")
                .body(addBookRequest)
                .when().post("/Library/Addbook.php")
                .then().log().all().assertThat().statusCode(200).extract().response();

        //Store the Response after adding first time
        System.out.println(response.asString());
        AddBookResponse addBookResponse = response.body().as(AddBookResponse.class);
        System.out.println("Add Book response Id is " + addBookResponse.getId());


      //AddBooKAgain
        Response addBookAgain = given().log().all().header("Content-Type", "application/json")
                .body(addBookRequest)
                .when().post("/Library/Addbook.php")
                .then().log().all().assertThat().statusCode(404).extract().response();

        //Store the Response after adding second time
       System.out.println(addBookAgain.asString());
        AddDupBookResponse addDuplicateBook = addBookAgain.body().as(AddDupBookResponse.class);
       System.out.println("Add Book response is " + addDuplicateBook.getMsg());

    }

}
