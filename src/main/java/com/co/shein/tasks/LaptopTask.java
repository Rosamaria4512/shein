package com.co.shein.tasks;

import com.co.shein.userinterfaces.LaptopInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

public class LaptopTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Scroll.to(LaptopInterface.TXT_SROLL));
        actor.attemptsTo(Click.on(LaptopInterface.OP_lAPTOP));
        actor.attemptsTo(Click.on(LaptopInterface.SELECT_PRODUCT));
        actor.attemptsTo(Click.on(LaptopInterface.BUY_PRODUCT));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(Click.on(LaptopInterface.TO_CARRITO));
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
    public static LaptopTask laptopTask(){
        return Tasks.instrumented(LaptopTask.class);
    }
}
