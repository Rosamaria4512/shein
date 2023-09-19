package com.co.shein.questions;

import com.co.shein.userinterfaces.LaptopInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.openqa.selenium.WebElement;

import java.sql.Driver;

public class ValidarContenedor implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return LaptopInterface.CONTENEDOR_PRODUCTS.resolveFor(actor).isPresent();
    }

    public static ValidarContenedor validarContenedor(){
        return new ValidarContenedor();
    }

}
