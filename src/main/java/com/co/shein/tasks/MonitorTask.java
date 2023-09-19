package com.co.shein.tasks;

import com.co.shein.userinterfaces.MonitorInterface;
import com.co.shein.userinterfaces.PhoneInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class MonitorTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(MonitorInterface.BTN_MONITOR));
        actor.attemptsTo(Click.on(MonitorInterface.OP_MONITOR));
        actor.attemptsTo(Click.on(MonitorInterface.BUY_MONITOR));
        actor.attemptsTo(Click.on(PhoneInterface.TO_CARRITO));
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static MonitorTask monitorTask(){
        return Tasks.instrumented(MonitorTask.class);
    }
}
