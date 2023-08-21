package starter.Chat;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.Utils.Constants;

import java.io.File;

public class ChatAPI {
    public static String CHAT_PATH = Constants.URL + "chats";
    public static String GET_CHAT_BY_ID = CHAT_PATH + "?mentor={mentor}&student={student}";
    public static String INBOX_PATH = Constants.URL + "inbox?page={page}&limit={limit}";

    @Step("Post mentor send message")
    public void postMentorSendMessage(File json){
        SerenityRest.given()
                .headers("Authorization", "Bearer " + Constants.BEARER_TOKEN_MENTOR)
                .contentType(ContentType.JSON)
                .body(json);
    }

    @Step("Post student send message")
    public void posStudentSendMessage(File json){
        SerenityRest.given()
                .headers("Authorization", "Bearer " + Constants.BEARER_TOKEN_STUDENT)
                .contentType(ContentType.JSON)
                .body(json);
    }

    @Step("Get chat by id")
    public void getChatById(Object mentor_id, Object student_id){
        SerenityRest.given()
                .headers("Authorization", "Bearer " + Constants.BEARER_TOKEN_MENTOR)
                .pathParam("mentor", mentor_id)
                .pathParam("student", student_id);
    }

    @Step("Get inbox")
    public void getInbox(Object page, Object limit){
        SerenityRest.given()
                .headers("Authorization", "Bearer " + Constants.BEARER_TOKEN_STUDENT)
                .pathParam("page", page)
                .pathParam("limit", limit);
    }
}
