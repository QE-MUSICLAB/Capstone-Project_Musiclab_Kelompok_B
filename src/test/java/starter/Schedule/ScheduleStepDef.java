package starter.Schedule;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.Utils.Constants;

import java.io.File;

public class ScheduleStepDef {

    @Steps
    ScheduleAPI scheduleAPI;

    //POST MENTOR SCHEDULE WITH VALID REQ BODY
    @When("Post mentor schedule with valid request body")
    public void postMentorScheduleWithValidRequestBody() {
        File json = new File(Constants.REQ_BODY_SCHEDULE + "/PostMentorSchedule.json");
        scheduleAPI.setPostMentorSchedule(json);
    }
    @And("Send request body for create mentor schedule")
    public void sendRequestBodyForCreateMentorSchedule() {
        SerenityRest.when().post(ScheduleAPI.POST_MENTOR_SCHEDULE);
    }
    @And("Validate Post make schedule with json schema validator")
    public void validatePostMakeScheduleWithJsonSchemaValidator() {
        File json = new File(Constants.JSON_SCHEMA_SCHEDULE + "/PostScheduleMentorSchema.json");
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }

    //POST MENTOR SCHEDULE WITH INVALID REQ BODY
    @When("Post mentor schedule with invalid request body")
    public void postMentorScheduleWithInvalidRequestBody() {
        File json = new File(Constants.REQ_BODY_SCHEDULE + "/PostMentorScheduleInvalidReq.json");
        scheduleAPI.setPostMentorSchedule(json);
    }

    //POST MENTOR SCHEDULE WITH INVALID PATH
    @When("Post mentor schedule with invalid path")
    public void postMentorScheduleWithInvalidPath() {
        File json = new File(Constants.REQ_BODY_SCHEDULE + "/PostMentorSchedule.json");
        scheduleAPI.setPostMentorScheduleInvalid(json);
    }
    @And("Send request body for create mentor schedule with invalid path")
    public void sendRequestBodyForCreateMentorScheduleWithInvalidPath() {
        SerenityRest.when().post(ScheduleAPI.POST_MENTOR_SCHEDULE_INVALID);
    }

    //POST MENTOR SCHEDULE WITH EMPTY REQ BODY
    @When("Post mentor schedule with empty request body")
    public void postMentorScheduleWithEmptyRequestBody() {
        File json = new File(Constants.REQ_BODY_SCHEDULE + "/PostMentorScheduleEmptyBody.json");
        scheduleAPI.setPostMentorSchedule(json);
    }

    //POST MENTOR SCHEDULE WITH EMPTY VALUE DAY REQ BODY
    @When("Post mentor schedule with empty value day request body")
    public void postMentorScheduleWithEmptyValueDayRequestBody() {
        File json = new File(Constants.REQ_BODY_SCHEDULE + "/PostMentorScheduleEmptyDayReqBody.json");
        scheduleAPI.setPostMentorSchedule(json);}


    //POST MENTOR SCHEDULE WITH EMPTY VALUE START_TIME REQ BODY
    @When("Post mentor schedule with empty value start time request body")
    public void postMentorScheduleWithEmptyValueStartTimeRequestBody() {
    File json = new File(Constants.REQ_BODY_SCHEDULE + "/PostMentorScheduleEmptyStartTime.json");
    scheduleAPI.setPostMentorSchedule(json);}

    //POST MENTOR SCHEDULE WITH EMPTY VALUE END_TIME REQ BODY
    @When("Post mentor schedule with empty value end time request body")
    public void postMentorScheduleWithEmptyValueEndTimeRequestBody() {
        File json = new File(Constants.REQ_BODY_SCHEDULE + "/PostMentorScheduleEmptyEndTime.json");
        scheduleAPI.setPostMentorSchedule(json);}

    //POST MENTOR SCHEDULE CHECK WITH VALID REQ BODY
    @When("Post mentor schedule check with valid request body")
    public void postMentorScheduleCheckWithValidRequestBody() {
        File json = new File(Constants.REQ_BODY_SCHEDULE + "/PostMentorScheduleCheck.json");
        scheduleAPI.setPostMentorScheduleCheck(json);}
    @And("Send request body for create mentor schedule check")
    public void sendRequestBodyForCreateMentorScheduleCheck() {
        SerenityRest.when().post(ScheduleAPI.POST_MENTOR_SCHEDULE_CHECK);
    }

    //POST MENTOR SCHEDULE CHECK WITH INVALID REQ BODY
    @When("Post mentor schedule check with invalid request body")
    public void postMentorScheduleCheckWithInvalidRequestBody() {
        File json = new File(Constants.REQ_BODY_SCHEDULE + "/PostMentorScheduleCheckInvalid.json");
        scheduleAPI.setPostMentorScheduleCheck(json);
    }

    //POST MENTOR SCHEDULE CHECK WITH EMPTY REQ BODY
    @When("Post mentor schedule check with empty request body")
    public void postMentorScheduleCheckWithEmptyRequestBody() {
        File json = new File(Constants.REQ_BODY_SCHEDULE + "/PostMentorScheduleCheckEmptyReq.json");
        scheduleAPI.setPostMentorScheduleCheck(json);
    }

    //POST MENTOR SCHEDULE CHECK WITH EMPTY VALUE CLASS_ID REQ BODY
    @When("Post mentor schedule check with empty value class_id request body")
    public void postMentorScheduleCheckWithEmptyValueClass_idRequestBody() {
        File json = new File(Constants.REQ_BODY_SCHEDULE + "/PostMentorScheduleCheckEmptyValueClass.json");
        scheduleAPI.setPostMentorScheduleCheck(json);
    }

    //POST MENTOR SCHEDULE CHECK WITH EMPTY VALUE SCHEDULE_ID REQ BODY
    @When("Post mentor schedule check with empty value schedule_id request body")
    public void postMentorScheduleCheckWithEmptyValueSchedule_idRequestBody() {
        File json = new File(Constants.REQ_BODY_SCHEDULE + "/PostMentorScheduleCheckEmptyValueSchedule.json");
        scheduleAPI.setPostMentorScheduleCheck(json);
    }

    //POST MENTOR SCHEDULE CHECK WITH EMPTY VALUE START_DATE REQ BODY
    @When("Post mentor schedule check with empty value start_date request body")
    public void postMentorScheduleCheckWithEmptyValueStart_dateRequestBody() {
        File json = new File(Constants.REQ_BODY_SCHEDULE + "/PostMentorScheduleCheckEmptyValueStart.json");
        scheduleAPI.setPostMentorScheduleCheck(json);
    }

    //POST MENTOR SCHEDULE CHECK WITH INVALID PATH
    @When("Post mentor schedule check with invalid path")
    public void postMentorScheduleCheckWithInvalidPath() {
        File json = new File(Constants.REQ_BODY_SCHEDULE + "/PostMentorScheduleCheck.json");
        scheduleAPI.setPostMentorScheduleCheck(json);
        }
    @And("Send request body for create mentor schedule check with invalid path")
    public void sendRequestBodyForCreateMentorScheduleCheckWithInvalidPath() {
        SerenityRest.when().post(ScheduleAPI.POST_MENTOR_SCHEDULE_CHECK_INVALID);
    }

    //GET MENTOR SCHEDULE WITH VALID PATH
    @Given("Get mentor schedule with valid path {}")
    public void getMentorScheduleWithValidPath(String id) {
        scheduleAPI.setGetMentorSchedule(id);
    }
    @When("Send request GET for get mentor schedule")
    public void sendRequestGETForGetMentorSchedule() {
        SerenityRest.when().get(ScheduleAPI.GET_MENTOR_SCHEDULE);
    }

    //GET MENTOR SCHEDULE WITH INVALID PATH
    @When("Get mentor schedule with invalid path {}")
    public void getMentorScheduleWithInvalidPath(String id) {
        scheduleAPI.setGetMentorScheduleInvalidPath(id);
    }
    @And("Send request GET for get mentor schedule with invalid path")
    public void sendRequestGETForGetMentorScheduleWithInvalidPath() {
        SerenityRest.when().get(ScheduleAPI.GET_MENTOR_SCHEDULE_INVALID);
    }

    //GET MENTOR SCHEDULE WITH EMPTY ID PATH
    @When("Get mentor schedule with empty id path {}")
    public void getMentorScheduleWithEmptyIdPath(String id) {
        scheduleAPI.setGetMentorSchedule(id);
    }

    //DELETE MENTOR SCHEDULE WITH VALID PATH
    @When("Delete mentor schedule with valid path {}")
    public void deleteMentorScheduleWithValidPath(String id) {
        scheduleAPI.setDeleteMentorScheduleValidPath(id);
    }
    @And("Send DELETE request for delete schedule")
    public void sendDELETERequestForDeleteSchedule() {
        SerenityRest.when().delete(ScheduleAPI.DELETE_MENTOR_SCHEDULE_DELETE);
    }

    //DELETE MENTOR SCHEDULE WITH INVALID PATH
    @When("Delete mentor schedule with invalid path {}")
    public void deleteMentorScheduleWithInvalidPath(String id) {
        scheduleAPI.setDeleteMentorScheduleInvalidPath(id);    }
    @And("Send DELETE request for delete schedule with invalid path")
    public void sendDELETERequestForDeleteScheduleWithInvalidPath() {
        SerenityRest.when().delete(ScheduleAPI.DELETE_MENTOR_SCHEDULE_DELETE_INVALID);
    }

}



