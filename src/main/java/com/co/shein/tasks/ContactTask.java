package com.co.shein.tasks;

import com.co.shein.models.DatesContact;
import com.co.shein.userinterfaces.ContactUserInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class ContactTask implements Task {
    DatesContact datesContact;

    public ContactTask(DatesContact datesContact) {
        this.datesContact = datesContact;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ContactUserInterface.BTN_CONTACT));
        actor.attemptsTo(Enter.theValue(datesContact.getEmail_receptor()).into(ContactUserInterface.TXT_EMAIL_DIR));
        actor.attemptsTo(Enter.theValue(datesContact.getDates_user()).into(ContactUserInterface.TXT_NAME_DIR));
        actor.attemptsTo(Enter.theValue(datesContact.getMessagge()).into(ContactUserInterface.TT_MESAGGE));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(Click.on(ContactUserInterface.BTN_SEND));
    }
    public static ContactTask contactTask(DatesContact datesContact){
        return Tasks.instrumented(ContactTask.class,datesContact);
    }
}
