package com.co.shein.stepsdefinitions;

import com.co.shein.questions.ValidarContenedor;
import com.co.shein.questions.ValidationBuyLaptod;
import com.co.shein.tasks.DeleteProductTask;
import com.co.shein.tasks.MonitorTask;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

public class BuyMonitorStepsDefinition {

    @When("^the user select a Monitor and go to carrito$")
    public void theUserSelectAMonitorAndGoToCarrito() {
        OnStage.theActorInTheSpotlight().attemptsTo(MonitorTask.monitorTask());
    }
    @Then("^the user will see his monitor$")
    public void theUserWillSeeHisMonitor() {
        GivenWhenThen.seeThat(ValidationBuyLaptod.validationBuyLaptod(), Matchers.is("Delete"));

    }
//----------------------------------------------------------------------------------------------------------------

    @When("^the user select a monitor and the agregate a carrito for delete$")
    public void theUserSelectAMonitorAndTheAgregateACarritoForDelete() {
        OnStage.theActorInTheSpotlight().attemptsTo(MonitorTask.monitorTask());
        OnStage.theActorInTheSpotlight().attemptsTo(DeleteProductTask.deleteProductTask());
    }

    @Then("^the user see that not there is the Monitor$")
    public void theUserSeeThatNotThereIsTheMonitor() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarContenedor.validarContenedor(),Matchers.equalTo(Boolean.FALSE)));

    }

}
