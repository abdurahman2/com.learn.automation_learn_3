import io.restassured.http.ContentType;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static io.restassured.RestAssured.given;

class GetTest {
    private final static String URL = "https://reqres.in/";

    @Test
    @DisplayName("Get request for all users")
    void getRequestForAllUsers() {

        List<UserData> users = given()
                .when()
                .contentType(ContentType.JSON)
                .get(URL + "api/users?page=1")
                .then().log().all()
                .extract().body().jsonPath().getList("data", UserData.class);
        users.stream().forEach(x -> Assert.assertTrue(x.getAvatar().contains(x.getId().toString())));
    }

    @Test
    @DisplayName("Sorted years min to max")
    void sortedYears() {
        Specifications.installSpecification(Specifications.requestSpec(URL), Specifications.responseSpecOK200());
        List<Resource> yearsList = given()
                .when()
                .get("api/unknown")
                .then().log().all()
                .extract().body().jsonPath().getList("data", Resource.class);
        List<Integer> years = yearsList.stream().map(Resource::getYear).collect(Collectors.toList());
        List<Integer> sortedYears = years.stream().sorted().collect(Collectors.toList());
        Assertions.assertEquals(sortedYears, years, "Years not sorted");
    }

    @Test
    @DisplayName("Sorted id min to max")
    void sortedID() {
        Specifications.installSpecification(Specifications.requestSpec(URL), Specifications.responseSpecOK200());
        List<Resource> idList = given()
                .when()
                .get("api/unknown")
                .then().log().all()
                .extract().body().jsonPath().getList("data", Resource.class);
        List<Integer> id = idList.stream().map(Resource::getId).collect(Collectors.toList());
        List<Integer> sortedId = id.stream().sorted().collect(Collectors.toList());
        Assertions.assertEquals(sortedId, id, "ID not sorted");
    }
}
