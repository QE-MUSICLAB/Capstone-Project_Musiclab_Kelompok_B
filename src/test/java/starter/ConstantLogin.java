package starter;

import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import starter.Auth.AuthAPI;
import starter.Utils.Constants;

import java.io.File;

public class ConstantLogin {


    //    Student Normal Account
    @Given("User login student with account")
    public void userLoginStudentNormal() {
        File json = new File(Constants.REQ_BODY_AUTH + "/LoginStudentWithValidData.json");
        Response response = SerenityRest.given()
                .contentType(ContentType.JSON)
                .body(json)
                .post(AuthAPI.POST_LOGIN_STUDENT);

        JsonPath jsonPath = response.jsonPath();
        String accessToken = jsonPath.getString("data.token");
        Constants.BEARER_TOKEN_STUDENT = accessToken;
    }




    //    Mentor Normal Account
    @Given("User login mentor with account")
    public void userLoginMentorNormal() {
        File json = new File(Constants.REQ_BODY_AUTH + "/LoginMentorWithValidData.json");
        Response response = SerenityRest.given()
                .contentType(ContentType.JSON)
                .body(json)
                .post(AuthAPI.POST_LOGIN_MENTOR);

        JsonPath jsonPath = response.jsonPath();
        String accessToken = jsonPath.getString("data.token");
        Constants.BEARER_TOKEN_MENTOR = accessToken;
    }
}


//}
//}
