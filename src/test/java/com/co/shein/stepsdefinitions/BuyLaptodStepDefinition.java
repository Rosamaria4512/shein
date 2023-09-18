package com.co.shein.stepsdefinitions;

import com.co.shein.models.DataLogin;
import com.co.shein.questions.ValidationBuyLaptod;
import com.co.shein.tasks.GoToCartTasks;
import com.co.shein.tasks.LaptopTask;
import com.co.shein.tasks.LoginTask;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

import java.util.List;

public class BuyLaptodStepDefinition {

    @When("^the user select a product and the agregate a carrito$")
    public void theUserSelectAProductAndTheAgregateACarrito(List<DataLogin>dataLoginList) {
        DataLogin dataLogin;
        dataLogin=dataLoginList.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(LaptopTask.laptopTask());
        OnStage.theActorInTheSpotlight().attemptsTo(LoginTask.login(dataLogin));
        OnStage.theActorInTheSpotlight().attemptsTo(GoToCartTasks.goToCartTasks());
    }


    @Then("^the user see his product$")
    public void theUserSeeHisProduct() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidationBuyLaptod.validationBuyLaptod(),Matchers.is("Delete")));

    }

}
