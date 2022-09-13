import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

class GetTest {

    @Test
    @DisplayName("Get request for all users")
    void getAllUsers() {
        Response response = given()
                .when()
                .contentType(ContentType.JSON)
                .queryParam("page", "1")
                .get(Constants.BASE_URL + Constants.USERS)
                .then().log().all().extract().response();
        List<UserData> users = response.body().jsonPath().getList("data", UserData.class);
        users.stream().forEach(x -> Assert.assertTrue(x.getAvatar().contains(x.getId().toString())));
        String contentType = response.header("Content-Type");
        Assertions.assertEquals("application/json; charset=utf-8", contentType);
    }

    @Test
    @DisplayName("Get user from 2 page")
    void getAllUsersPage2() {
        Specifications.installSpecification(Specifications.requestSpec(Constants.BASE_URL), Specifications.responseSpecOK200());
        given()
                .when()
                .queryParam("page", "2")
                .get(Constants.USERS)
                .then().log().all()
                .body("page", equalTo(2))
                .body("per_page", greaterThan(5))
                .body("total", equalTo(12))
                .body("total_pages", equalTo(2))
                .body("data", notNullValue());
    }

    @Test
    @DisplayName("Get header data")
    void getHeaders() {
        given()
                .when()
                .queryParam("page", "1")
                .get(Constants.BASE_URL + Constants.USERS)
                .then()
                .statusCode(200)
                .assertThat()
                .header("Content-Type", "application/json; charset=utf-8")
                .header("Cache-Control", "max-age=14400");
    }

    @Test
    @DisplayName("Get user 7 Hamcrest")
    void getUserId7Ham() {
        Specifications.installSpecification(Specifications.requestSpec(Constants.BASE_URL), Specifications.responseSpecOK200());
        Response response = given()
                .when()
                .pathParam("userID", 7)
                .get(Constants.USER_BY_ID)
                .then().log().all()
                .body("data.id", equalTo(7))
                .body("data.email", equalTo("michael.lawson@reqres.in"))
                .body("data.first_name", equalTo("Michael"))
                .body("data.last_name", equalTo("Lawson"))
                .body("data.avatar", equalTo("https://reqres.in/img/faces/7-image.jpg"))
                .extract().response();
    }

    @Test
    @DisplayName("Get user 7")
    void getUserID7() {
        Specifications.installSpecification(Specifications.requestSpec(Constants.BASE_URL), Specifications.responseSpecOK200());
        GetSingleUserResponse getUserResponse = given()
                .when()
                .contentType(ContentType.JSON)
                .pathParam("userID", 7)
                .get(Constants.USER_BY_ID)
                .then().log().all()
                .extract().body().as(GetSingleUserResponse.class);
        Assertions.assertEquals("Michael", getUserResponse.userData.getFirst_name(), "First name is not correct");
        Assertions.assertEquals("Lawson", getUserResponse.userData.getLast_name(), "Last name is not correct");
        Assertions.assertEquals("michael.lawson@reqres.in", getUserResponse.userData.getEmail(), "Email is not correct");
        Assertions.assertEquals("To keep ReqRes free, contributions towards server costs are appreciated!",
                getUserResponse.support.getText());
    }

    @Test
    @DisplayName("Sorted years min to max")
    void getAllUsersSortedByYears() {
        Specifications.installSpecification(Specifications.requestSpec(Constants.BASE_URL), Specifications.responseSpecOK200());
        List<Resource> yearsList = given()
                .when()
                .get(Constants.UNKNOWN)
                .then().log().all()
                .extract().body().jsonPath().getList("data", Resource.class);
        List<Integer> years = yearsList.stream().map(Resource::getYear).collect(Collectors.toList());
        List<Integer> sortedYears = years.stream().sorted().collect(Collectors.toList());
        Assertions.assertEquals(sortedYears, years, "Years not sorted");
    }

    @Test
    @DisplayName("Sorted id min to max")
    void getAllUsersSortedByID() {
        Specifications.installSpecification(Specifications.requestSpec(Constants.BASE_URL), Specifications.responseSpecOK200());
        List<Resource> idList = given()
                .when()
                .get(Constants.UNKNOWN)
                .then().log().all()
                .extract().body().jsonPath().getList("data", Resource.class);
        List<Integer> id = idList.stream().map(Resource::getId).collect(Collectors.toList());
        List<Integer> sortedId = id.stream().sorted().collect(Collectors.toList());
        Assertions.assertEquals(sortedId, id, "ID not sorted");
    }
}
