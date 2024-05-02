package starter.investments;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.rest.SerenityRest;

public class ResponseStepDef {

    @Then("Status code should be {int}")
    public void statusCodeShouldBe(int statusCode) {
        SerenityRest.and()
                .statusCode(statusCode);
    }


}
