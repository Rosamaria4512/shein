package com.co.shein.tasks;

import com.co.shein.userinterfaces.LaptopInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class BuyProduct implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LaptopInterface.BTN_BUY));
    }
    public static BuyProduct buyProduct(){
        return Tasks.instrumented(BuyProduct.class);
    }
}
