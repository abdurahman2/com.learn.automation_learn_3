import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

class PostTest {

    @Test
    @DisplayName("Register a new user")
    void registerNewUserSuccess() {
        Specifications.installSpecification(Specifications.requestSpec(Constants.BASE_URL), Specifications.responseSpecOK200());
        Integer id = 4;
        String token = "QpwL5tke4Pnpja7X4";
        DataForRegisterUser user = new DataForRegisterUser("eve.holt@reqres.in", "pistol");
        RegisterSuccess registerSuccess = given()
                .body(user)
                .when()
                .post(Constants.REGISTER)
                .then().log().all()
                .extract().as(RegisterSuccess.class);
        Assertions.assertNotNull(registerSuccess.getId());
        Assertions.assertNotNull(registerSuccess.getToken());
        Assertions.assertEquals(id, registerSuccess.getId(), "ID is not correct");
        Assertions.assertEquals(token, registerSuccess.getToken(), "Token is not correct");
    }

    @Test
    @DisplayName("Register a new user Hamcrest")
    void registerNewUserSuccessHamcrest() {
        Specifications.installSpecification(Specifications.requestSpec(Constants.BASE_URL), Specifications.responseSpecOK200());
        Map<String, String> user = new HashMap<>();
        user.put("email", "eve.holt@reqres.in");
        user.put("password", "pistol");
        Response response = given()
                .body(user)
                .when()
                .post(Constants.REGISTER)
                .then().log().all()
                .body("id", equalTo(4))
                .body("token", equalTo("QpwL5tke4Pnpja7X4"))
                .extract().response();
        JsonPath jsonPath = response.jsonPath();
        int id = jsonPath.getInt("id");
        String token = jsonPath.get("token");
        Assertions.assertEquals(4, id, "ID is not correct");
        Assertions.assertEquals("QpwL5tke4Pnpja7X4", token, "Token is not correct");
    }

    @Test
    @DisplayName("Unsuccessful register a new user")
    void registerNewUserSuccessUnSuccess() {
        Specifications.installSpecification(Specifications.requestSpec(Constants.BASE_URL), Specifications.responseSpecError400());
        DataForRegisterUser user = new DataForRegisterUser("sydney@fife", "");
        RegisterUnsuccess registerUnsuccess = given()
                .when()
                .post(Constants.REGISTER)
                .then().log().all()
                .extract().as(RegisterUnsuccess.class);
        Assertions.assertEquals("Missing email or username", registerUnsuccess.getError(), "Did not receive an error message");
    }
}
