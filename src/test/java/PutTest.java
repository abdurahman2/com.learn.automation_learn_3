import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class PutTest {

    @Test
    @DisplayName("Update user")
    void updateUserData2() {
        Specifications.installSpecification(Specifications.requestSpec(Constants.BASE_URL), Specifications.responseSpecOK200());
        UserData userData = new UserData("Dima", "McKesson");
        UpdateUserData updateUserData = given()
                .body(userData)
                .when()
                .pathParam("userID", 2)
                .put(Constants.USER_BY_ID)
                .then().log().all()
                .extract().as(UpdateUserData.class);
        Assertions.assertEquals("Dima", updateUserData.getName(), "The name was not updated");
        Assertions.assertEquals("McKesson", updateUserData.getJob(), "Job not updated");
    }
}
