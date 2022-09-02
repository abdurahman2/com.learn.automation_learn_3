import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class DeleteTest {
    private final static String URL = "https://reqres.in/";

    @Test
    @DisplayName("Delete user")
    void deleteUserTest() {
        Specifications.installSpecification(Specifications.requestSpec(URL), Specifications.responseSpec(204));
        given()
                .when()
                .delete("/api/users/12")
                .then().log().all();
    }
}
