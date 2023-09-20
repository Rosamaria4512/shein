package com.co.shein.stepsdefinitions;

import com.co.shein.questions.ValidarContenedor;
import com.co.shein.questions.ValidationBuyLaptod;
import com.co.shein.tasks.DeleteProductTask;
import com.co.shein.tasks.LaptopTask;
import com.co.shein.tasks.PhoneTask;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

public class BuyPhoneStepsDefinitions {
    @When("^the user select a phone and go to carrito$")
    public void theUserSelectAPhoneAndGoToCarrito() {
        OnStage.theActorInTheSpotlight().attemptsTo(PhoneTask.phoneTask());

    }


    @Then("^the user will see his phone$")
    public void theUserWillSeeHisPhone() {
    OnStage.theActorInTheSpotlight().should();
        GivenWhenThen.seeThat(ValidationBuyLaptod.validationBuyLaptod(), Matchers.is("Delete"));
    }
//---------------------------------------------------------------------------------------------------------------------------------
    @When("^the user select a phone and the agregate a carrito for delete$")
    public void theUserSelectAPhoneAndTheAgregateACarritoForDelete() {
        OnStage.theActorInTheSpotlight().attemptsTo(PhoneTask.phoneTask());
        OnStage.theActorInTheSpotlight().attemptsTo(DeleteProductTask.deleteProductTask());
    }
    @Then("^the user see that not there is the phone$")
    public void theUserSeeThatNotThereIsThePhone() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarContenedor.validarContenedor(),Matchers.equalTo(Boolean.FALSE)));

    }


}
