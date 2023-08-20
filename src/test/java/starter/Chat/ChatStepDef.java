package starter.Chat;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.Utils.Constants;

import java.io.File;

public class ChatStepDef {
    @Steps
    ChatAPI chatAPI;

    //POST MENTOR SEND MESSAGE TO STUDENT WITH VALID ID
    @And("Post mentor send message to student with valid json")
    public void postMentorSendMessageToStudentWithValidJson() {
        File json = new File(Constants.REQ_BODY_CHATS + "/MessageToStudentWithValidID.json");
        chatAPI.postMentorSendMessage(json);
    }
    @When("Send request mentor send message to student")
    public void sendRequestMentorSendMessageToStudent() {
        SerenityRest.when().post(ChatAPI.CHAT_PATH);
    }

    //POST MENTOR SEND MESSAGE TO STUDENT WITH INVALID MENTOR ID
    @And("Post mentor send message to student with invalid json and mentor id")
    public void postMentorSendMessageToStudentWithInvalidJsonAndMentorId() {
        File json = new File(Constants.REQ_BODY_CHATS + "/MessageToStudentWithInvalidMentorID.json");
        chatAPI.postMentorSendMessage(json);
    }

    //POST MENTOR SEND MESSAGE TO STUDENT WITH INVALID STUDENT ID
    @And("Post mentor send message to student with invalid json and student id")
    public void postMentorSendMessageToStudentWithInvalidJsonAndStudentId() {
        File json = new File(Constants.REQ_BODY_CHATS + "/MessageToStudentWithInvalidStudentID.json");
        chatAPI.postMentorSendMessage(json);
    }

    //POST MENTOR SEND MESSAGE TO STUDENT WITH INVALID PATH
    @When("Send request mentor send message to student with invalid path")
    public void sendRequestMentorSendMessageToStudentWithInvalidPath() {
        SerenityRest.when().post(ChatAPI.CHAT_PATH + "123");
    }

    //POST STUDENT SEND MESSAGE TO MENTOR WITH VALID ID
    @And("Post student send message to mentor with valid json")
    public void postStudentSendMessageToMentorWithValidJson() {
        File json = new File(Constants.REQ_BODY_CHATS + "/MessageToMentorWithValidID.json");
        chatAPI.posStudentSendMessage(json);
    }
    @When("Send request student send message to mentor")
    public void sendRequestStudentSendMessageToMentor() {
        SerenityRest.when().post(ChatAPI.CHAT_PATH);
    }

    //POST STUDENT SEND MESSAGE TO MENTOR WITH INVALID STUDENT ID
    @And("Post student send message to mentor with invalid json and student id")
    public void postStudentSendMessageToMentorWithInvalidJsonAndStudentId() {
        File json = new File(Constants.REQ_BODY_CHATS + "/MessageToMentorWithInvalidStudentID.json");
        chatAPI.posStudentSendMessage(json);
    }

    //POST STUDENT SEND MESSAGE TO MENTOR WITH INVALID MENTOR ID
    @And("Post student send message to mentor with invalid json and mentor id")
    public void postStudentSendMessageToMentorWithInvalidJsonAndMentorId() {
        File json = new File(Constants.REQ_BODY_CHATS +"/MessageToMentorWithInvalidMentorID.json");
        chatAPI.posStudentSendMessage(json);
    }

    ////POST STUDENT SEND MESSAGE TO MENTOR WITH INVALID PATH
    @When("Send request student send message to mentor with invalid path")
    public void sendRequestStudentSendMessageToMentorWithInvalidPath() {
        SerenityRest.when().post(ChatAPI.CHAT_PATH + "apasaja");
    }

    //GET ALL CHAT WITH VALID ID
    @And("Get all chat with valid {int} as mentor_id and {int} as student_id")
    public void getAllChatWithValid(int mentor_id, int student_id) {
        chatAPI.getChatById(mentor_id,student_id);
    }
    @When("Send request get all chat")
    public void sendRequestGetAllChat() {
        SerenityRest.when().get(ChatAPI.GET_CHAT_BY_ID);
    }

    //GET ALL CHAT WITH INVALID ID
    @And("Get all chat with invalid {string} as mentor_id and {string} as student_id")
    public void getAllChatWithInvalidAsMentor_idAndAsStudent_id(String mentor_id, String student_id) {
        chatAPI.getChatById(mentor_id,student_id);
    }

    //GET ALL CHAT GROUP WITH VALID ID
    @And("Get all chat group with valid {int} as page and {int} as limit")
    public void getAllChatGroupWithValidParam(int page, int limit) {
        chatAPI.getInbox(page,limit);
    }
    @When("Send request get all chat group")
    public void sendRequestGetAllChatGroup() {
        SerenityRest.when().get(ChatAPI.INBOX_PATH);
    }

    //GET ALL CHAT GROUP WITH INVALID ID
    @And("Get all chat group with invalid {string} as page and {string} as limit")
    public void getAllChatGroupWithInvalidAsPageAndAsLimit(String page, String limit) {
        chatAPI.getInbox(page,limit);
    }
}
