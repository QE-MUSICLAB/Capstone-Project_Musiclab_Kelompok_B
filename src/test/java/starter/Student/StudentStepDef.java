package starter.Student;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;

public class StudentStepDef {

    @Steps
    StudentAPI studentAPI;

    @When("show student profile with valid params")
    public void showStudentProfileWithValidParams() {
        studentAPI.setGetAllStudent();
    }

    @And("request for show student profile with valid params")
    public void requestForShowStudentProfileWithValidParams() {
        SerenityRest.when().get(StudentAPI.GET_STUDENT_VALID);
    }
}
