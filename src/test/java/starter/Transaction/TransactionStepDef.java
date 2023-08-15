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

    @Steps
    TransactionAPI transactionAPI;

    @When("Post make transaction with valid request body")
    public void postmaketransactionvaliddata() {
        File json = new File(Constants.REQ_BODY_TRANSACTION + "/POSTmaketransactionwithvaliddata.json");
        transactionAPI.postmaketransaction(json);
    }

    @And("send request body for transaction")
    public void sendRequestBodyForTransaction() {
        SerenityRest.when().post(TransactionAPI.POST_MAKE_TRANSACTION);
    }
