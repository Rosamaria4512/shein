package com.co.shein.tasks;

import com.co.shein.models.DataLogin;
import com.co.shein.userinterfaces.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;


public class LoginTask implements Task {

    DataLogin dataLogin;
// constructor de la clase Datalogin para poder instanciar en los stepdefinitons
    public LoginTask(DataLogin dataLogin) {
        this.dataLogin = dataLogin;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        //actor.attemptsTo(Click.on(LoginPage.BTN_ALERT));

        //actor.attemptsTo(Click.on(LoginPage.BTN_ICON));
        actor.attemptsTo(Enter.theValue(dataLogin.getEmail()).into(LoginPage.TXT_EMAIL));
        actor.attemptsTo(Click.on(LoginPage.BTN_CONTINUED));

        actor.attemptsTo(Enter.theValue(dataLogin.getPassword()).into(LoginPage.TXT_PASSWORD));
        actor.attemptsTo(Click.on(LoginPage.BTN_ID));

        //actor.attemptsTo(Click.on(LoginPage.BTN_ACCEPT));
        actor.attemptsTo(Click.on(LoginPage.BTN_HOP));
       /* actor.attemptsTo(Click.on(LoginPage.BTN_GAMIL));
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/


    }

    public static LoginTask login(DataLogin dataLogin)
    {
        return Tasks.instrumented(LoginTask.class,dataLogin );
    }
}
//
