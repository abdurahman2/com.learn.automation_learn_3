import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class DeleteTest {

    @Test
    @DisplayName("Delete user")
    void deleteUser() {
        Specifications.installSpecification(Specifications.requestSpec(Constants.BASE_URL), Specifications.responseSpec(204));
        given()
                .when()
                .pathParam("userID", 12)
                .delete(Constants.USER_BY_ID)
                .then().log().all();
    }
}
