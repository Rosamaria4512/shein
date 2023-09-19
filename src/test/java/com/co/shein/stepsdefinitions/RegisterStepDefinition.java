package com.co.shein.stepsdefinitions;

import com.co.shein.models.DataRegister;
import com.co.shein.questions.ValidationRegister;
import com.co.shein.tasks.RegisterTask;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;

public class RegisterStepDefinition {
    @When("^he user register a the website$")
    public void heUserRegisterATheWebsite(List<DataRegister>dataRegisterList) {
        DataRegister dataRegister;
        dataRegister=dataRegisterList.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(RegisterTask.register(dataRegister));


    }


    @Then("^he user registered correctly$")
    public void heUserRegisteredCorrectly() {
     //   OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidationRegister.validationRegister()));

    }
}
