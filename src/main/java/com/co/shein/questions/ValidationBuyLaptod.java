package com.co.shein.questions;

import com.co.shein.userinterfaces.LaptopInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidationBuyLaptod implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(LaptopInterface.VERYFY_BUY).viewedBy(actor).asString();
    }
    public static ValidationBuyLaptod validationBuyLaptod(){
        return new ValidationBuyLaptod();
    }
}
