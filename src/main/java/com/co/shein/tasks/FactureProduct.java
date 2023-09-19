package com.co.shein.tasks;

import com.co.shein.models.DatesFacturation;
import com.co.shein.userinterfaces.FactureInterfaces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class FactureProduct implements Task {
    DatesFacturation datesFacturation;

    public FactureProduct(DatesFacturation datesFacturation) {
        this.datesFacturation = datesFacturation;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Enter.theValue(datesFacturation.getName()).into(FactureInterfaces.TXT_NAME));
    actor.attemptsTo(Enter.theValue(datesFacturation.getCountry()).into(FactureInterfaces.TXT_COUNTRY));
    actor.attemptsTo(Enter.theValue(datesFacturation.getCity()).into(FactureInterfaces.TXT_CITY));
    actor.attemptsTo(Enter.theValue(datesFacturation.getTarget()).into(FactureInterfaces.TXT_TARGET));
    actor.attemptsTo(Enter.theValue(datesFacturation.getMonth()).into(FactureInterfaces.TXT_MONTH));
    actor.attemptsTo(Enter.theValue(datesFacturation.getYear()).into(FactureInterfaces.TXT_YEAR));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(Click.on(FactureInterfaces.BTN_ENVIAR));
    }
    public static FactureProduct factureProduct(DatesFacturation datesFacturation){
        return Tasks.instrumented(FactureProduct.class,datesFacturation);
    }
}
