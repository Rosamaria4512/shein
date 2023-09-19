package com.co.shein.questions;

import com.co.shein.userinterfaces.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidationRegister implements Question <String>{

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(RegisterPage.VALIDATION_REGISTER).viewedBy(actor).asString();
    }
    public static ValidationRegister validationRegister(){
        return validationRegister();
    }
}
