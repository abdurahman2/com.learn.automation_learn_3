import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

class PostTest {
    private final static String URL = "https://reqres.in/";

    @Test
    @DisplayName("Register a new user")
    void postRegisterSuccessNewUser() {
        Specifications.installSpecification(Specifications.requestSpec(URL), Specifications.responseSpecOK200());
        Integer id = 4;
        String token = "QpwL5tke4Pnpja7X4";
        Register user = new Register("eve.holt@reqres.in", "pistol");
        RegisterSuccess registerSuccess = given()
                .body(user)
                .when()
                .post("api/register")
                .then().log().all()
                .extract().as(RegisterSuccess.class);
        Assertions.assertNotNull(registerSuccess.getId());
        Assertions.assertNotNull(registerSuccess.getToken());
        Assertions.assertEquals(id, registerSuccess.getId(), "ID is not correct");
        Assertions.assertEquals(token, registerSuccess.getToken(), "Token is not correct");
    }

    @Test
    @DisplayName("Unsuccessful register a new user")
    void postRegisterUnSuccessNewUser() {
        Specifications.installSpecification(Specifications.requestSpec(URL), Specifications.responseSpecError400());
        Register user = new Register("sydney@fife", "");
        RegisterUnsuccess registerUnsuccess = given()
                .when()
                .post("api/register")
                .then().log().all()
                .extract().as(RegisterUnsuccess.class);
        Assertions.assertEquals("Missing email or username", registerUnsuccess.getError(), "Did not receive an error message");
    }
}
