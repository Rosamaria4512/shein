package com.co.shein.stepsdefinitions;

import com.co.shein.models.DatesFacturation;
import com.co.shein.questions.ValidarContenedor;
import com.co.shein.questions.ValidationBuy;
import com.co.shein.questions.ValidationBuyLaptod;
import com.co.shein.tasks.BuyProduct;
import com.co.shein.tasks.DeleteProductTask;
import com.co.shein.tasks.FactureProduct;
import com.co.shein.tasks.LaptopTask;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

import java.util.List;

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
      OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarContenedor.validarContenedor(),Matchers.equalTo(Boolean.FALSE)));

    }

    //--------------------------------------------- BUY PRODUCT---------------------------------------------------------------------------------------------------------
    @When("^the user select a product and the agregate a carrito for buy an complete the form$")
    public void theUserSelectAProductAndTheAgregateACarritoForBuyAnCompleteTheForm(List<DatesFacturation>datesFacturationList) {
        DatesFacturation datesFacturation;
        datesFacturation=datesFacturationList.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(LaptopTask.laptopTask());
        OnStage.theActorInTheSpotlight().attemptsTo(BuyProduct.buyProduct());
        OnStage.theActorInTheSpotlight().attemptsTo(FactureProduct.factureProduct(datesFacturation));

    }


    @Then("^the user see his dates and his product$")
    public void theUserSeeHisDatesAndHisProduct() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidationBuy.validationBuy(),Matchers.equalTo(Boolean.TRUE)));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

}
