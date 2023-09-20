package com.co.shein.tasks;

import com.co.shein.userinterfaces.PhoneInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class PhoneTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PhoneInterface.BTN_CELULARES));
        actor.attemptsTo(Click.on(PhoneInterface.OP_CELULARES));
        actor.attemptsTo(Click.on(PhoneInterface.BUY_CELULARES));
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(Click.on(PhoneInterface.TO_CARRITO));
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static PhoneTask phoneTask(){
        return Tasks.instrumented(PhoneTask.class);
    }
}
