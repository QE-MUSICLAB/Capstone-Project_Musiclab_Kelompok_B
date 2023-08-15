package starter.Transaction;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.Utils.Constants;

import java.io.File;

import static starter.Utils.Constants.URL;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.Utils.Constants;
import starter.Utils.MusiclabResponses;

import java.io.File;

import static starter.Utils.Constants.URL;

public class TransactionAPI {
    public static String POST_MAKE_TRANSACTION = URL + "transactions";
    public static String POST_MAKE_TRANSACTION_INVALID_PARAMS = URL + "transaction";
    public static String GET_TRANSACTIONS_MENTOR = URL + "mentors/transactions?page={page}&limit={limit}";

    public static String GET_TRANSACTIONS_STUDENTS = URL + "students/transactions?page={page}&limit={limit}";


    @Step("POST make transaction")
    public void postmaketransaction(File json) {
        SerenityRest.given().headers("Authorization", "Bearer " + Constants.BEARER_TOKEN_STUDENT)
                .contentType(ContentType.JSON).body(json);
    }

    @Step("GET mentors transaction int")
    public void getmentorstransaction(int page, int limit) {
        SerenityRest.given()
                .headers("Authorization", "Bearer" + Constants.BEARER_TOKEN_MENTOR)
                .pathParam(MusiclabResponses.PAGE, page)
                .pathParam(MusiclabResponses.LIMIT, limit);
    }

    @Step("GET mentors transaction string")
    public void getmentorstransaction2(String page, String limit) {
        SerenityRest.given()
                .headers("Authorization", "Bearer" + Constants.BEARER_TOKEN_MENTOR)
                .pathParam(MusiclabResponses.PAGE, page)
                .pathParam(MusiclabResponses.LIMIT, limit);
    }

    @Step("GET students transaction int")
    public void getstudentstransactionint(int page, int limit) {
        SerenityRest.given()
                .header("Authorization", "Bearer" + Constants.BEARER_TOKEN_STUDENT)
                .pathParam(MusiclabResponses.PAGE, page)
                .pathParam(MusiclabResponses.LIMIT, limit);
    }

    @Step("GET students transaction string")
    public void getstudentstransactionstring(String page, String limit) {
        SerenityRest.given()
                .header("Authorization", "Bearer" + Constants.BEARER_TOKEN_STUDENT)
                .pathParam(MusiclabResponses.PAGE, page)
                .pathParam(MusiclabResponses.LIMIT, limit);
    }
}
