package com.co.shein.stepsdefinitions;

import com.co.shein.models.DatesContact;
import com.co.shein.tasks.ContactTask;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;

public class ContactStepsDefinitions {
    @When("^the user select the option Contact and complete the form$")
    public void theUserSelectTheOptionContactAndCompleteTheForm(List<DatesContact> datesContactList) {
        DatesContact datesContact;
        datesContact = datesContactList.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(ContactTask.contactTask(datesContact));
    }


    @Then("^the use will send the message$")
    public void theUseWillSendTheMessage() {

    }
}
