package starter.inbuscap;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.Constants;

import java.io.File;

public class VerificationsAPI {
    public static String USERS = Constants.BASE_URL + "/verifications/users";
    public static String USERS_ID = Constants.BASE_URL + "/verifications/users/{users_id}";
    public static String PROPOSALS_ID = Constants.BASE_URL + "verifications/proposals/{proposals_id}";
    public static String GET_VERIFICATION_USERS = Constants.BASE_URL + "verifications/users?status={status}&page=(page}";
    public static String GET_VERIFICATION_PROPOSALS = Constants.BASE_URL + "verifications/proposal?status={status}&page=(page}";


    @Step("Verifications users by valid multipart data form")
    public void verificationMultipartData(File ktp, File npwp, File avatar){
        SerenityRest.given().log().all()
                .header("Authorization", Constants.TOKEN_USER)
                .contentType("multipart/form-data")
                .multiPart("photo_ktp", ktp)
                .multiPart("photo_npwp", npwp)
                .multiPart("photo_selfie", avatar)
                .put(VerificationsAPI.USERS);
    }
    @Step("Verificaation by id and json body request")
    public void verificationByIdAndReqBody(int id, File json){
        SerenityRest.given()
                .header("Authorization", Constants.TOKEN_USER)
                .pathParam("user_id", id)
                .contentType(ContentType.JSON).body(json);
    }
    @Step("Verification by proposal id and json body request")
    public void verficationByProposalId(int id, File json){
        SerenityRest.given()
                .header("Authorization", Constants.TOKEN_USER)
                .pathParam("proposal_id", id)
                .contentType(ContentType.JSON).body(json);
    }

    @Step("Get verification with valid parameter status and page")
    public void getVerificationValid(int status, int page){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MTQ4NDQ0NTksImlhdCI6MTcxNDgzMzY1OSwiaWQiOiI0IiwiaXNfYWN0aXZlIjoxLCJpc19hZG1pbiI6dHJ1ZX0.9S0x_Yplpa64gUznO-acgrD6jbu6lt-0831FI9ThdDI")
                .pathParam("status", status)
                .pathParam("page", page);
    }

    @Step("Get verification with invalid parameter status and page")
    public void getVerificationInvalid(String status, String page){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MTQ4NTE2NTgsImlhdCI6MTcxNDg0MDg1OCwiaWQiOiI0IiwiaXNfYWN0aXZlIjoxLCJpc19hZG1pbiI6dHJ1ZX0.5JqzMQPu_mqEA74Hyk6v-aiXS8TzWBEWjgIpazgPz0k")
                .pathParam("status", status)
                .pathParam("page", page);
    }

    @Step("Get verification with valid proposal id")
    public void getVerificationValidProposalId(int proposal_id){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MTQ4NDQ0NTksImlhdCI6MTcxNDgzMzY1OSwiaWQiOiI0IiwiaXNfYWN0aXZlIjoxLCJpc19hZG1pbiI6dHJ1ZX0.9S0x_Yplpa64gUznO-acgrD6jbu6lt-0831FI9ThdDI")
                .pathParam("status", proposal_id);
    }

    @Step("Get verification with invalid proposal id")
    public void getVerificationInvalidProposalId(String proposal_id){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MTQ4NDQ0NTksImlhdCI6MTcxNDgzMzY1OSwiaWQiOiI0IiwiaXNfYWN0aXZlIjoxLCJpc19hZG1pbiI6dHJ1ZX0.9S0x_Yplpa64gUznO-acgrD6jbu6lt-0831FI9ThdDI")
                .pathParam("status", proposal_id);
    }

    @Step("Get verification proposal with valid parameter status and page")
    public void getVerificationProposalValid(int status, int page){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MTQ4NDQ0NTksImlhdCI6MTcxNDgzMzY1OSwiaWQiOiI0IiwiaXNfYWN0aXZlIjoxLCJpc19hZG1pbiI6dHJ1ZX0.9S0x_Yplpa64gUznO-acgrD6jbu6lt-0831FI9ThdDI")
                .pathParam("status", status)
                .pathParam("page", page);

    }

    @Step("Get verification proposal with invalid parameter status and page")
    public void getVerificationProposalInvalid(String status, String page){
        SerenityRest.given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE3MTQ4NDQ0NTksImlhdCI6MTcxNDgzMzY1OSwiaWQiOiI0IiwiaXNfYWN0aXZlIjoxLCJpc19hZG1pbiI6dHJ1ZX0.9S0x_Yplpa64gUznO-acgrD6jbu6lt-0831FI9ThdDI")
                .pathParam("status", status)
                .pathParam("page", page);
    }



}