package com.co.shein.stepsdefinitions;

import com.co.shein.models.DataLogin;
import com.co.shein.tasks.LoginTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class LoginStepDefiniton {

    @Managed
    WebDriver hisBrowser;

    @Before
    public void setUp()
    {
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("Andres");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));

    }
    @Given("^he user enter a the website$")
    public void heUserEnterATheWebsite() {
        OnStage.theActorInTheSpotlight().attemptsTo(Open.url("https://www.demoblaze.com/index.html"));
    }


    @When("^he user enter with credentials$")
    public void heUserEnterWithCredentials(List<DataLogin> dataLoginList) {
        DataLogin dataLogin;
        dataLogin= dataLoginList.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(LoginTask.login(dataLogin));
    }

    @Then("^he could succesfully$")
    public void heCouldSuccesfully() {

    }
}
