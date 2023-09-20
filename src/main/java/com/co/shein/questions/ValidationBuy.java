package com.co.shein.questions;

import com.co.shein.userinterfaces.FactureInterfaces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidationBuy implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return FactureInterfaces.TXT_VERIFICAR.resolveFor(actor).getText().contains("Thank you for your purchase");
    }
    public static ValidationBuy validationBuy(){
        return new ValidationBuy();
    }
}
