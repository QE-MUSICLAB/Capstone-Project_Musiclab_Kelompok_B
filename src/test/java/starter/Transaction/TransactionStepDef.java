package starter.Transaction;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import org.checkerframework.checker.units.qual.C;
import starter.Utils.MusiclabResponses;
import starter.Utils.Constants;

import java.io.File;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.matchesPattern;

public class TransactionStepDef {

    @Steps
    TransactionAPI transactionAPI;

    @When("Post make transaction with valid request body")
    public void postmaketransactionvaliddata(){
        File json = new File(Constants.REQ_BODY_TRANSACTION+"/POSTmaketransactionwithvaliddata.json");
        transactionAPI.postmaketransaction(json);
    }

    @And("send request body for transaction")
    public void sendRequestBodyForTransaction() {SerenityRest.when().post(TransactionAPI.POST_MAKE_TRANSACTION);
    }

    @And("Validate response body message make transaction {string}")
    public void validateResponseBodyMessageMakeTransaction(String message) {SerenityRest.and().body(MusiclabResponses.MESSAGE,equalTo(message));
    }

    @And("Validate JSON Schema make transaction")
    public void validateJSONSchemaMakeTransaction() {File json = new File(Constants.JSON_SCHEMA_TRANSACTION+"POSTmaketransactionwithvaliddataJSONSchema.json");
        SerenityRest.and().body(JsonSchemaValidator.matchesJsonSchema(json));
    }
    // empty class_id
    @When("Post make transaction with empty class id request body")
    public void postMakeTransactionWithEmptyClassIdRequestBody() {File json = new File(Constants.REQ_BODY_TRANSACTION+"/POSTmaketransactionwithemptyclass_id.json");
        transactionAPI.postmaketransaction(json);
    }

    @And("send request body for transaction empty class id")
    public void sendRequestBodyForTransactionEmptyClassId() {SerenityRest.when().post(TransactionAPI.POST_MAKE_TRANSACTION);
    }

    @And("Validate response body message empty class id make transaction {string}")
    public void validateResponseBodyMessageEmptyClassIdMakeTransaction(String message) {SerenityRest.and().body(MusiclabResponses.MESSAGE,equalTo(message));
    }

    @And("Validate JSON Schema make transaction empty class id")
    public void validateJSONSchemaMakeTransactionEmptyClassId() {File json = new File(Constants.JSON_SCHEMA_TRANSACTION+"POSTmaketransactionwithemptyclass_idJSONSchema.json");
        SerenityRest.and().body(JsonSchemaValidator.matchesJsonSchema(json));
    }
    // empty schedule id
    @When("Post make transaction with schedule id request body")
    public void postMakeTransactionWithScheduleIdRequestBody() {File json = new File(Constants.REQ_BODY_TRANSACTION+"/POSTmaketransactionwithemptyschedule_id.json");
        transactionAPI.postmaketransaction(json);
    }

    @And("send request body for transaction schedule id")
    public void sendRequestBodyForTransactionScheduleId() {SerenityRest.when().post(TransactionAPI.POST_MAKE_TRANSACTION);
    }

    @And("Validate JSON Schema make transaction empty schedule id")
    public void validateJSONSchemaMakeTransactionEmptyScheduleId() {File json = new File(Constants.JSON_SCHEMA_TRANSACTION+"POSTmaketransactionwithemptyclass_idJSONSchema.json");
        SerenityRest.and().body(JsonSchemaValidator.matchesJsonSchema(json));
    }
    // invalid start date
    @When("Post make transaction with invalid start date request body")
    public void postMakeTransactionWithInvalidStartDateRequestBody() {File json = new File(Constants.REQ_BODY_TRANSACTION+"/POSTmaketransactionwithinvalidstart_date.json");
        transactionAPI.postmaketransaction(json);
    }

    @And("send request body for transaction invalid start date")
    public void sendRequestBodyForTransactionInvalidStartDate() {SerenityRest.when().post(TransactionAPI.POST_MAKE_TRANSACTION);
    }

    @And("Validate JSON Schema make transaction invalid start date")
    public void validateJSONSchemaMakeTransactionInvalidStartDate() {
        File json = new File(Constants.JSON_SCHEMA_TRANSACTION + "POSTmaketransactionwithemptyclass_idJSONSchema.json");
        SerenityRest.and().body(JsonSchemaValidator.matchesJsonSchema(json));
    }
// invalid parameter
    @When("Post make transaction with invalid paramter")
    public void postMakeTransactionWithInvalidParamter() {File json = new File(Constants.REQ_BODY_TRANSACTION+"/POSTmaketransactionwithvaliddata.json");
        transactionAPI.postmaketransaction(json);
    }

    @And("send request body for transaction with invalid parameter")
    public void sendRequestBodyForTransactionWithInvalidParameter() {SerenityRest.when().post(TransactionAPI.POST_MAKE_TRANSACTION_INVALID_PARAMS);
    }

    @And("Validate JSON Schema make transaction with invalid parameter")
    public void validateJSONSchemaMakeTransactionWithInvalidParameter() {File json = new File(Constants.JSON_SCHEMA_TRANSACTION+"POSTmaketransactioninvalidparamJSONSchema.json");
        SerenityRest.and().body(JsonSchemaValidator.matchesJsonSchema(json));
    }
// empty body request
    @When("Post make transaction with empty body request")
    public void postMakeTransactionWithEmptyBodyRequest() {File json = new File(Constants.REQ_BODY_TRANSACTION+"/POSTmaketransactionwithemptybody.json");
        transactionAPI.postmaketransaction(json);
    }

    @And("send request body for transaction with empty body request")
    public void sendRequestBodyForTransactionWithEmptyBodyRequest() {SerenityRest.when().post(TransactionAPI.POST_MAKE_TRANSACTION);
    }
    // Get show mentors transaction
    @And("Get mentor transactions with valid parameter {} {}")
    public void getMentorTransactionsWithValidParameterPageLimit(int page, int limit) {
        transactionAPI.getmentorstransaction(page, limit);
    }

    @When("Send GET request for mentor transactions")
    public void sendGETRequestForMentorTransactions() {SerenityRest.when().get(TransactionAPI.GET_TRANSACTIONS_MENTOR);
    }


    @And("Get mentor transactions with invalid parameter {} {}")
    public void getMentorTransactionsWithInvalidParameterPageLimit(String page, String limit) {transactionAPI.getmentorstransaction2(page, limit);
    }
// mentor empty value
    @And("Get mentor transactions with empty value parameter {} {}")
    public void getMentorTransactionsWithEmptyValueParameterPageLimit(String page, String limit){transactionAPI.getmentorstransaction2(page, limit);
    }
// student with valid params
    @And("Get students transactions with valid parameter {} {}")
    public void getStudentsTransactionsWithValidParameterPageLimit(int page, int limit) {transactionAPI.getstudentstransactionint(page, limit);
    }

    @When("Send GET request for students transactions")
    public void sendGETRequestForStudentsTransactions() {SerenityRest.when().get(TransactionAPI.GET_TRANSACTIONS_STUDENTS);
    }

    @And("Get students transactions with invalid parameter {} {}")
    public void getStudentsTransactionsWithInvalidParameterPageLimit(String page, String limit) {transactionAPI.getstudentstransactionstring(page, limit);
    }

    @And("Get students transactions with empty value params {} {}")
    public void getStudentsTransactionsWithEmptyValueParamsPageLimit(String page, String limit) {transactionAPI.getstudentstransactionstring(page, limit);
    }
}