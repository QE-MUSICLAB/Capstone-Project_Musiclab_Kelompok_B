package starter.Utils;
import io.cucumber.java.en.Then;
import net.serenitybdd.rest.SerenityRest;

public class StatusCode {
    @Then("Status code should be {int} OK")
    public void statusCodeShouldBeOK(int OK) {SerenityRest.then().statusCode(OK);}

    @Then("Status code should be {int} Bad Request")
    public void statusCodeShouldBeBadRequest(int badRequest) {
        SerenityRest.then().statusCode(badRequest);
    }

    @Then("Status code should be {int} Not Found")
    public void statusCodeShouldBeNotFound(int notFound) {
        SerenityRest.then().statusCode(notFound);
    }

    @Then("Status code is {int} No Content")
    public void statusCodeIsNoContent(int NoContent) {
        SerenityRest.then().statusCode(NoContent);

    }
    @Then("Status code should be {int} Method Not Allowed")
    public void statusCodeShouldBeMethodNotAllowed(int NotAllowed) {
        SerenityRest.then().statusCode(NotAllowed);
    }
    @Then("Status code should be {int} Created")
    public void statusCodeshouldbeCreated(int Created){
        SerenityRest.then().statusCode(Created);
    }

}
