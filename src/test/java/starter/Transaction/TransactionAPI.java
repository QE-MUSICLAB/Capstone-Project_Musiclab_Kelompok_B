package starter.Transaction;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.Utils.Constants;

import java.io.File;

import static starter.Utils.Constants.URL;

public class TransactionAPI {
    public static String POST_MAKE_TRANSACTION = URL + "transactions";


    @Step("POST make transaction")
    public void postmaketransaction(File json) {
        SerenityRest.given().headers("Authorization", "Bearer " + Constants.BEARER_TOKEN_STUDENT)
                .contentType(ContentType.JSON).body(json);
    }
}
