package com.co.shein.tasks;

import com.co.shein.models.DataRegister;
import com.co.shein.userinterfaces.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class RegisterTask implements Task {

    DataRegister dataRegister;

    public RegisterTask(DataRegister dataRegister) {
        this.dataRegister = dataRegister;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(RegisterPage.BTN_ICON));
        actor.attemptsTo(Enter.theValue(dataRegister.getUser()).into(RegisterPage.TXT_NAME));
        actor.attemptsTo(Enter.theValue(dataRegister.getPassword()).into(RegisterPage.TXT_PASSWORD));
        actor.attemptsTo(Click.on(RegisterPage.BTN_SING_UP));

        System.out.println("User : "+dataRegister.getUser());
        System.out.println("Password : "+dataRegister.getPassword());
    }


    public static RegisterTask register(DataRegister dataRegister){
        return Tasks.instrumented(RegisterTask.class,dataRegister);
    }
}
