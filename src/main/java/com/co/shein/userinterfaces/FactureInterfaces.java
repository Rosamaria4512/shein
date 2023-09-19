package com.co.shein.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class FactureInterfaces {

    public static final Target TXT_NAME=Target.the("escribir nombre").locatedBy("//input[@id='name']");
    public static final Target TXT_COUNTRY=Target.the("escribir pais").locatedBy("//input[@id='country']");
    public static final Target TXT_CITY=Target.the("escribir ciudad").locatedBy("//input[@id='city']");
    public static final Target TXT_TARGET=Target.the("escribir n° targeta credito").locatedBy("//input[@id='card']");
    public static final Target TXT_MONTH=Target.the("escribir mes").locatedBy("//input[@id='month']");
    public static final Target TXT_YEAR=Target.the("escribir año").locatedBy("//input[@id='year']");
    public static final Target BTN_ENVIAR=Target.the("boton enviar").locatedBy("(//button[@class='btn btn-primary'])[3]");

    //---------------------------------------------------------------------------------------------------------------------------------------------------------------
    public static final Target TXT_VERIFICAR= Target.the("verificar compra").locatedBy("//h2[text()='Thank you for your purchase!']");

}
