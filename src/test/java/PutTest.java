import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class PutTest {
    private final static String URL = "https://reqres.in/";

    @Test
    @DisplayName("Update user")
    void updateUserData() {
        Specifications.installSpecification(Specifications.requestSpec(URL), Specifications.responseSpecOK200());
        UserData userData = new UserData("Dima", "McKesson");
        UpdateUserData updateUserData = given()
                .body(userData)
                .when()
                .put("api/users/2")
                .then().log().all()
                .extract().as(UpdateUserData.class);
        Assertions.assertEquals("Dima", updateUserData.getName(), "The name was not updated");
        Assertions.assertEquals("McKesson", updateUserData.getJob(), "Job not updated");
    }
}
