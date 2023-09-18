package com.co.shein.tasks;

import com.co.shein.userinterfaces.LaptopInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class GoToCartTasks implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LaptopInterface.TO_CARRITO));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static GoToCartTasks goToCartTasks(){
        return Tasks.instrumented(GoToCartTasks.class);
    }
}
