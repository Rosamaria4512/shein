package com.co.shein.tasks;

import com.co.shein.userinterfaces.LaptopInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class DeleteProductTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LaptopInterface.TEXT_DELETE));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static DeleteProductTask deleteProductTask(){
        return Tasks.instrumented(DeleteProductTask.class);
    }
}
