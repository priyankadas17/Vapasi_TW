package Tests;

import Requests.AddBookRequest;
import Responses.BookResponseById;
import Responses.GetBookResponseByAuthor;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.BeforeTest;

import static io.restassured.RestAssured.given;

public class ParentTest {
    @BeforeTest
    public void setBaseUrl (){
        RestAssured.baseURI = "http://216.10.245.166";
    }

    public Response addNewBook (String bookName, String isbn, String aisle, String author) {
        AddBookRequest addBookRequest = new AddBookRequest();

        addBookRequest.setName(bookName);
        addBookRequest.setIsbn(isbn);
        addBookRequest.setAisle(aisle);
        addBookRequest.setAuthor(author);

        Response responseAddBook = given().log().all().header("Content-Type", "application/json")
                .body(addBookRequest)
                .when().post("/Library/Addbook.php")
                .then().log().all().assertThat().statusCode(200).extract().response();
        return responseAddBook;
    }


    public String getBookByID(String id) {
            Response responseForGetBook = given().queryParam("ID", id)
                    .header("Content-Type","application/json")
                    .when().get("/Library/GetBook.php")
                    .then().statusCode(200).extract().response();
            return (responseForGetBook.asString());
        }


        public GetBookResponseByAuthor[] getBookByAuthor(String author) {
            Response response = given().queryParams("AuthorName", author)
                    .header("Content-Type", "application/json")
                    .when().get("/Library/GetBook.php")
                    .then().statusCode(200).extract().response();
            GetBookResponseByAuthor[] books = response.as(GetBookResponseByAuthor[].class);
            return books;

        }

        public String deleteByID(String bookId) {
            String delResponse = "{\"ID\" : \""+bookId+"\"}";
            Response response = given()
                    .header("Content-Type", "application/json").body(delResponse)
                    .when().post("/Library/DeleteBook.php")
                    .then().extract().response();

            return (response.asString());
        }

    }


