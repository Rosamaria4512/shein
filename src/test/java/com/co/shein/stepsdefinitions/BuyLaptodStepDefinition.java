package com.co.shein.stepsdefinitions;

import com.co.shein.questions.ValidationBuyLaptod;
import com.co.shein.tasks.DeleteProductTask;
import com.co.shein.tasks.LaptopTask;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

public class BuyLaptodStepDefinition {

    @When("^the user select a product and the agregate a carrito$")
    public void theUserSelectAProductAndTheAgregateACarrito() {
        OnStage.theActorInTheSpotlight().attemptsTo(LaptopTask.laptopTask());
    }

    @Then("^the user see his product$")
    public void theUserSeeHisProduct() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidationBuyLaptod.validationBuyLaptod(),Matchers.is("Delete")));
    }
    //---------------------------------------------------------------------------------------------------------------------------------------------
    @When("^the user select a product and the agregate a carrito for delete$")
    public void theUserSelectAProductAndTheAgregateACarritoForDelete() {
       OnStage.theActorInTheSpotlight().attemptsTo(LaptopTask.laptopTask());
       OnStage.theActorInTheSpotlight().attemptsTo(DeleteProductTask.deleteProductTask());
    }


    @Then("^the user see that not there is products$")
    public void theUserSeeThatNotThereIsProducts() {


    }

}
